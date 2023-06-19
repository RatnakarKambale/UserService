package com.icwd.exception;

public class ResourceNotFoundException extends Exception{


//extra properties that you want manage
    public ResourceNotFoundException(){

        super("Resource not found exception....");
    }
    public  ResourceNotFoundException(String message){

        super(message);
    }
}
