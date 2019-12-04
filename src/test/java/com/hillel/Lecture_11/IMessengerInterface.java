package com.hillel.Lecture_11;

public interface IMessengerInterface {
    void sendText(Contacts contacts);
    void sendPhoto();
    void sendFiles();
    void sendAudio();

    void blockUser(Contacts contacts);

    void status();

    void deleteConversation();




}
