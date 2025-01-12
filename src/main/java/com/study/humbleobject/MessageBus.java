package com.study.humbleobject;

interface MessageBus {
    void sendEmailChangedMessage(int userId, String newEmail);
}
