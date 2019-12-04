package com.hillel.Lecture_11;

public class WhatsApp implements IMessengerInterface {
    public String name;
    public int userId;

    public WhatsApp(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public void sendText(Contacts contacts) {
        System.out.println("Text is send by " + this.name + " to the contact " + contacts.getName() + " with phone number " + contacts.getPhoneNumber());
    }

    @Override
    public void sendPhoto() {
        System.out.println("Photo is send by " + this.name);
    }

    @Override
    public void sendFiles() {
        System.out.println("File is send by " + this.name);
    }

    @Override
    public void sendAudio() {
        System.out.println("Audio is send by " + this.name);
    }

    @Override
    public void blockUser(Contacts contacts) {
        System.out.println("User with id " + this.userId + " and with the name " + contacts.getName() + " is blocked in the " + this.name + " because of his age " + contacts.getAge());
    }

    @Override
    public void status() {
        System.out.println("Status is set for user with id " + this.userId + " in the " + this.name);
    }

    @Override
    public void deleteConversation() {
        System.out.println("Conversation with user with id " + this.userId + " is deleted for " + this.name);
    }
}
