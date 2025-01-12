package com.study.humbleobject;

enum UserType {
    Customer(1), Employee(2);

    private int typeCode;

    UserType(int typeCode) {
        this.typeCode = typeCode;
    }
}
