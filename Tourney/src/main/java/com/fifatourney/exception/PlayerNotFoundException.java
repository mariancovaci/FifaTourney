package com.fifatourney.exception;

public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException(String message){
        super(message);
    }
}
