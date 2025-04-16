package com.akshay.user.service.UserService.exceptions;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(){
        super("User Not Found On Server !!");
    }

    public UserNotFoundException(String message){
        super(message);
    }
}
