package com.hillel.Lecture_11;

class UserIsBlocked extends RuntimeException {
    public UserIsBlocked(String message){
        super(message);
    }
}
