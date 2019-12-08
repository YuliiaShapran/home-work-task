package com.hillel.Lecture_11;

public class MainMessenger {

    public static void main(String[] args) {

        System.out.println("All methods for Messenger: " + "\n");

    FacebookIMessenger messengerInterface = new FacebookIMessenger("Messenger", 1);
    User facebookUser = new User("Max", messengerInterface, messengerInterface,messengerInterface);
    facebookUser.sendAudio();
    facebookUser.searchForTheContact();
    facebookUser.editSomeInfo();
    messengerInterface.sendText(Contacts.MOTHER);
    messengerInterface.sendPhoto();
    messengerInterface.sendFiles();
    messengerInterface.blockUser(Contacts.SISTER);
    messengerInterface.status();
    messengerInterface.deleteConversation();
        System.out.println();

        System.out.println("All methods for WhatsApp: " + "\n");
    WhatsApp whatsApp = new WhatsApp("What's up", 2);
    User whatsAppUser = new User("Vlad", whatsApp);
    whatsAppUser.sendAudio();
    whatsAppUser.searchForTheContact();
    whatsAppUser.editSomeInfo();
    whatsApp.sendText(Contacts.SISTER);
    whatsApp.sendPhoto();
    whatsApp.sendFiles();
    whatsApp.blockUser(Contacts.FRIEND);
    whatsApp.status();
    whatsApp.deleteConversation();
        System.out.println();

        System.out.println("All methods for Telegram: " + "\n");
    Telegram telegram = new Telegram("Telegram", 3);
    User telegramUser =  new User("Alex", telegram, telegram);
    telegramUser.sendAudio();
    telegramUser.searchForTheContact();
    telegramUser.editSomeInfo();
    telegram.sendText(Contacts.FATHER);
    telegram.sendPhoto();
    telegram.sendFiles();
    telegram.blockUser(Contacts.MOTHER);
    telegram.status();
    telegram.deleteConversation();
        System.out.println();

        System.out.println("All methods for Viber: " + "\n");
    Viber viber = new Viber("Viber", 4);
    User viberUser = new User("Jul", viber, viber, viber);
    viberUser.editSomeInfo();
    viberUser.searchForTheContact();
    viberUser.sendAudio();
    viber.sendText(Contacts.BROTHER);
    viber.sendPhoto();
    viber.sendFiles();
    viber.blockUser(Contacts.BROTHER);
    viber.status();
    viber.deleteConversation();
        System.out.println();



    }
}
