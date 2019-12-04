package com.hillel.Lecture_11;

public interface IMessengerInterface {
    void sendText();
    void sendPhoto();
    void sendFiles();
    void sendAudio();

    void blockUser();

    void status();

    void deleteConversation();




}
