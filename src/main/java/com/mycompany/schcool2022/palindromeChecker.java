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
public class palindromeChecker {

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Enter");
        String drow = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            drow += word.charAt(i);

        }
        System.out.println(drow);

    }
}
