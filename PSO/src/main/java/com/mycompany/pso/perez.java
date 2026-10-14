/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pso;

import java.util.Scanner;

/**
 *
 * @author CL2-PC
 */
public class perez {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Hello World!");
        System.out.println("Templonuevo, Joseph B.");
        
        System.out.println("Enter a number");
        int x = input.nextInt();
        System.out.println("Enter a number");
        int y = input.nextInt();
        
        int sum = x + y;
        int diff = x - y;
        int quo = x / y;
        int pro = x * y;
        System.out.println("sum: " + sum);
        System.out.println("difference: " + diff);
        System.out.println("quotient:" + quo );
        System.out.println("product:" + pro);
        
        
    }
}

