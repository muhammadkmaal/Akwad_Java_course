/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.firstsession;

/**
 *
 * @author muham
 */
public class SwitchMultiLabels {

    public static void main(String[] args) {
        int day = 5;

        switch (day) {
            case 6: // Friday
            case 7: // Saturday
                System.out.println("The day is a weekend.");
                break;
            case 1: // Sunday
            case 2: // Monday
            case 3: // Tuesday
            case 4: // Wednesday
            case 5: // Thursday
                System.out.println("The day is a weekday.");
                break;
            default:
                System.out.println("Invalid day number. Please use a number between 1 and 7.");
                break;
        }
    }

}
