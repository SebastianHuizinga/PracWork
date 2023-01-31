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
public class lettergoup {

    public static void main(String[] args) {
        String phrase = "";
        String word = JOptionPane.showInputDialog("Put in da woooooooooooord");

        for (int i = 0; i <= word.length(); i++) {

            int letter = word.charAt(i);
            letter += 1;
            phrase += (char) letter;

        }
        System.out.println(phrase);
    }
}
