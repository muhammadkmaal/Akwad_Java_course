/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.firstsession;

/**
 *
 * @author muham
 */
public class DatatypesAndCasting {

    public static void main(String[] args) {
        byte b = 1; // -128 --> 127 //8 bots
        short s = 5; // 16 bits
        int i = 70; // 32 bit
        long l = 255; // 64 bit
        float f = 25.5f; //32 bit 
        double d = 25.5; //64 bit
        char c = 'A'; // 16bit
        boolean bool = true; // true || false

        double z = i; // up casting || widening || assign int to double
        int k = (int) d;  // down casting || lossy casting }} narrowing }} assign double to int

        int x = c; // up casting || widening || assign char to int , return ASCII code for 'A' charachter
        char ca = (char) i;  // down casting || lossy casting }} narrowing }} assign int to char, return 'F'
    }

}
