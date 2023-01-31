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
public class datecheck {

    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("enter your date as dd/mm/yy");

        String date = " ";
        String month = " ";
        String year = " ";
        date = word.substring(0, 0) + "";
        month = word.charAt(3) + word.charAt(4) + "";
        year = word.charAt(6) + word.charAt(7) + "";

        System.out.println(year + "-" + month + "-" + date);
    }
}
