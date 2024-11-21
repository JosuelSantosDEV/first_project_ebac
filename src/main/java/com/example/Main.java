package com.example;

public class Main {
    public static void main(String[] args) {
        String arg1 = args[0];
        System.out.println("Hello teacher :)");
        if(arg1.equals("DEV")) System.out.println("Developer");
        else System.out.println("No developer");
    }
}