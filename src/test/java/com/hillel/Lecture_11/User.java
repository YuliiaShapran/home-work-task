package com.hillel.Lecture_11;

public class User {
    private String name;
    private IEditInterface editInterface;
    private IMessengerInterface messengerInterface;
    private ISearchInterface searchInterface;

    public User(String name, IMessengerInterface messengerInterface) {
        this.name = name;
        this.messengerInterface = messengerInterface;
    }

    public User(String name, IMessengerInterface messengerInterface, ISearchInterface searchInterface) {
        this.name = name;
        this.messengerInterface = messengerInterface;
        this.searchInterface = searchInterface;
    }

    public User(String name, IEditInterface editInterface, IMessengerInterface messengerInterface, ISearchInterface searchInterface) {
        this.name = name;
        this.editInterface = editInterface;
        this.messengerInterface = messengerInterface;
        this.searchInterface = searchInterface;


    }

    public void editSomeInfo(){
        if (editInterface == null){
            System.out.println("Unsupported messenger's option!");
            return;
        }
        System.out.println("User " + name + " edits message...");
        editInterface.edit();
    }

    public void searchForTheContact(){
        if (searchInterface == null){
            System.out.println("Unsupported messenger's option!");
            return;
        }
        System.out.println("User " + name + " search for the contact...");
        searchInterface.search();
    }

    public void sendAudio(){
        if (messengerInterface == null){
            System.out.println("Unsupported messenger's option!");
            return;
        }
        System.out.println("User " + name + " sending audio...");
        messengerInterface.sendAudio();
    }
}
