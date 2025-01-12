package com.study.humbleobject;

interface CompanyRepository {
    Company findById(long companyId);
    void save(Company company);
}
