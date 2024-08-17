/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.firstsession;

/**
 *
 * @author muham
 */
public class IfConditions {

    public static void main(String[] args) {
        int x = 5;
        // first type of if 
        if (x == 5) {
            System.out.println("Correct");
        }
        // second type of if 
        if (x > 6) {
            System.out.println("Wrong");
        } else {
            System.out.println("Correct");
        }
        // third type of if
        if (x > 6) {
            System.out.println("Wrong");
        } else if (x < 6) {
            System.out.println("Correct");
        } else {
            System.out.println("Something else");
        }
    }

}
