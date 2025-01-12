package com.study.humbleobject;

public class ChangeEmailService {
    private final MessageBus messageBus;
    private final CompanyRepository companyRepository;
    private final UserRepository userRepository;

    public ChangeEmailService(MessageBus messageBus, CompanyRepository companyRepository, UserRepository userRepository) {
        this.messageBus = messageBus;
        this.companyRepository = companyRepository;
        this.userRepository = userRepository;
    }

    public void changeEmail(int userId, String newEmail) {
        User user = userRepository.findById(userId);
        Company company = companyRepository.findById(user.companyId());
        changeEmail(newEmail, user, company);

        companyRepository.save(company);
        userRepository.save(user);
        messageBus.sendEmailChangedMessage(userId, newEmail);
    }

    private void changeEmail(String newEmail, User user, Company company) {
        if (user.email().equals(newEmail)) {
            return;
        }

        int noOfEmployees = company.noOfEmployees();

        UserType newUserType = company.isEmailCorporate(newEmail) ? UserType.Employee : UserType.Customer;
        if (user.userType() != newUserType) {
            int delta = newUserType == UserType.Employee ? 1 : -1;
            company.updateNoOfEmployees(noOfEmployees, delta);
        }

        user.email(newEmail);
        user.userType(newUserType);
    }
}