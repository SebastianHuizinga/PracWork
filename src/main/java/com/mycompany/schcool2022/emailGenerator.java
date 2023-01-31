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
public class emailGenerator {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Please enter your name and surname seperated via a space");

        String firstname = name.substring(0, 3);
        int surnameNum = name.lastIndexOf(" ");

        String surname = name.substring(surnameNum + 1, surnameNum + 4);

        int Rand = (int) (Math.random() * 90) + 10;

        System.out.println(surname.toLowerCase() + firstname.toLowerCase() + Rand + "@reddam.house");

    }

}

//   [0, 1)
//   [10,99]
//  [10,100)
