/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.schcool2022;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastianh
 */
public class passwordStrengthChecker {

    public static void main(String[] args) {

        int passStrength = 0;
        boolean lower = false;
        boolean upper = false;
        boolean number = false;
        boolean other = false;
        boolean lengthEight = false;
        String userPass = JOptionPane.showInputDialog("Please enter password");

        for (int i = 0; i < userPass.length(); i++) {

            if (Character.isDigit(userPass.charAt(i))) {

                number = true;

            }
            if (Character.isUpperCase(userPass.charAt(i))) {

                upper = true;

            }
            if (Character.isLowerCase(userPass.charAt(i))) {

                lower = true;

            }
            if (!Character.isLetter(userPass.charAt(i)) && !Character.isDigit(userPass.charAt(i))) {

                other = true;

            }

        }

        if (userPass.length() >= 8) {

            lengthEight = true;

        }

        if (number == true && lower == true && upper == true && other == true && lengthEight == true && lengthEight == true) {
            System.out.println("Strong pass");

        } else {
            System.out.println("weak pass");
        }
    }

}
