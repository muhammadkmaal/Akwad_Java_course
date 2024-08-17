/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.firstsession;

/**
 *
 * @author muham
 */
public class IfConditionsLogicalOperators {

    public static void main(String[] args) {
        int x = 5;
        // AND operator
        if (x > 5 && x < 10) {
            System.out.println("Correct && operaton");
        } else {
            System.out.println("Wrong && operaton");
        }
        // OR operator
        if (x > 5 || x < 10) {
            System.out.println("Correct || operaton");
        } else {
            System.out.println("Wrong || operaton");
        }

    }
}
