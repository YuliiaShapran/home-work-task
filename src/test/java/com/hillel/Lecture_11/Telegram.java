package com.hillel.Lecture_11;

public class Telegram implements IMessengerInterface, ISearchInterface {
    public String name;
    public int userId;

    public Telegram(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public void sendText(Contacts contacts) {
        if (contacts.getName() == ""){
            throw new AssertionError ("Can't get contact's name!");
        }
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
        if (contacts.getPhoneNumber().contains("+565600000000")){
            throw new UserIsBlocked("User with such number is in the blacklist of terrorists!");
        } else
        System.out.println("User with id " + this.userId + " and with the name " + contacts.getName() + " is blocked in the " + this.name + " because of her age " + contacts.getAge());
    }

    @Override
    public void status() {
        System.out.println("Status is set for user with id " + this.userId + " in the " + this.name);
    }

    @Override
    public void deleteConversation() {
        System.out.println("Conversation with user with id " + this.userId + " is deleted for " + this.name);
    }

    @Override
    public void search() {
        System.out.println("Search is done for " + this.name);
    }
}
