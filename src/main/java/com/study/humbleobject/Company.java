package com.study.humbleobject;

public class Company {
    private String domainName;
    private int noOfEmployees;

    public String domainName() {
        return this.domainName;
    }

    public int noOfEmployees() {
        return this.noOfEmployees;
    }

    public void noOfEmployees(int newNumbers) {
        this.noOfEmployees = newNumbers;
    }

    boolean isEmailCorporate(String newEmail) {
        String emailDomain = newEmail.split("@")[1];
        return emailDomain.equals(domainName());
    }

    void updateNoOfEmployees(int noOfEmployees, int delta) {
        int newNumbers = noOfEmployees + delta;
        noOfEmployees(newNumbers);
    }
}
