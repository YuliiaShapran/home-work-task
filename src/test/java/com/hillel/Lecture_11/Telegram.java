package com.hillel.Lecture_11;

public class Telegram implements IMessengerInterface, ISearchInterface {
    public String name;
    public int userId;

    public Telegram(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    @Override
    public void sendText() {
        System.out.println("Text is send by " + this.name);
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
    public void blockUser() {
        System.out.println("User with id " + this.userId + " is blocked in the " + this.name);
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
