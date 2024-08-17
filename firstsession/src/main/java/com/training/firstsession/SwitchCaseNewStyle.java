/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.firstsession;

/**
 *
 * @author muham
 */
public class SwitchCaseNewStyle {
    
    public static void main(String[] args) {
        
        int day = 5; // Change this value to test different days (1 for Sunday, 2 for Monday, etc.)

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("The day is a weekday."); // Sunday (1), Monday (2), Tuesday (3), Wednesday (4), Thursday (5)
            case 6, 7 -> System.out.println("The day is a weekend."); // Friday (6) and Saturday (7)
            default -> System.out.println("Invalid day number. Please use a number between 1 and 7.");
        }
    }
}
