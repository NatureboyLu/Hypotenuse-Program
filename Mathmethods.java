package com.mycompany.mathmethods;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
import java.util.Scanner;


/**
 *
 * @author luald
 */
public class Mathmethods {

    public static void main(String[] args) {
      double x;
      double y;
      double z;
      Scanner scanner = new Scanner(System.in);
      
      
      System.out.println("Enter side x: ");
      x = scanner.nextDouble();
      System.out.println("Enter side y: ");
      y = scanner.nextDouble();
      
     z =  Math.sqrt((x*x)+(y*y));
     System.out.println("The Hypotenuse is: " + z);
     
     scanner.close();
      
      
       
    }
}
