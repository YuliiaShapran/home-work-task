package com.hillel.Lecture_11;

public class MainMessenger {

    public static void main(String[] args) {

        System.out.println("All methods for Messenger: " + "\n");

    FacebookIMessenger messengerInterface = new FacebookIMessenger("Messenger", 1);
    messengerInterface.sendText(Contacts.MOTHER);
    messengerInterface.sendPhoto();
    messengerInterface.sendFiles();
    messengerInterface.sendAudio();
    messengerInterface.search();
    messengerInterface.blockUser(Contacts.SISTER);
    messengerInterface.status();
    messengerInterface.deleteConversation();
    messengerInterface.edit();
        System.out.println();

        System.out.println("All methods for WhatsApp: " + "\n");
    WhatsApp whatsApp = new WhatsApp("What's up", 2);
    whatsApp.sendText(Contacts.SISTER);
    whatsApp.sendPhoto();
    whatsApp.sendFiles();
    whatsApp.sendAudio();
    whatsApp.blockUser(Contacts.FRIEND);
    whatsApp.status();
    whatsApp.deleteConversation();
        System.out.println();

        System.out.println("All methods for Telegram: " + "\n");
    Telegram telegram = new Telegram("Telegram", 3);
    telegram.sendText(Contacts.FATHER);
    telegram.sendPhoto();
    telegram.sendFiles();
    telegram.sendAudio();
    telegram.blockUser(Contacts.MOTHER);
    telegram.status();
    telegram.deleteConversation();
    telegram.search();
        System.out.println();

        System.out.println("All methods for Viber: " + "\n");
    Viber viber = new Viber("Viber", 4);
    viber.sendText(Contacts.BROTHER);
    viber.sendPhoto();
    viber.sendFiles();
    viber.sendAudio();
    viber.search();
    viber.blockUser(Contacts.BROTHER);
    viber.status();
    viber.deleteConversation();
    viber.edit();
        System.out.println();

    }
}
