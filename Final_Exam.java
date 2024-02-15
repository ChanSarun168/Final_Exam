/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.final_exam;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Final_Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of elements in the list
        System.out.print("Enter the number of elements: ");
        int numElements = scanner.nextInt();
        
        // Create an array to store the numbers
        int[] numbers = new int[numElements];
        
        // Prompt the user to enter each number
        System.out.println("Enter the numbers:");
        for (int i = 0; i < numElements; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // Display all the input numbers
        System.out.println("Input numbers:");
        for (int i = 0; i < numElements; i++) {
            System.out.println(numbers[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}

