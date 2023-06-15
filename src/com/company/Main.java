//Owen Riske

package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        //Comments
        //sout = System.out.print();




        System.out.println();
        //Title Info
        System.out.println();
        System.out.print("Welcome to the");
        System.out.print("Temperature Converter");
        System.out.println("\nWe use fahrenheit so you don't have to...");
        System.out.println("\nPlease enter a temperature. \nIf you are using Fahrenheit put an F after.");

        //Get User input
        Scanner INPUT = new Scanner(System.in);
        String userTemp =INPUT.nextLine();//take input from the user
        double temp = 0;

        //F to C (-40°F − 32) × 5/9 = -40°C

        if (userTemp.toLowerCase().contains("f")){
            //Remove the F

            userTemp=userTemp.replace("f","");

            //Built in method inside Java Strings to replace characters

            //Convert string to double
            temp=Double.parseDouble(userTemp);
            //convert F to C
            System.out.println(Converters.convertFtoC(temp) + "C");
        }
        else if(userTemp.toLowerCase().contains("k")){
            //remove k
            userTemp=userTemp.replace("k","");
            //convert string to double
            temp=Double.parseDouble(userTemp);
            // convert K to C
            System.out.println(Converters.convertKtoC(temp) + "C");
            System.out.println(Converters.convertCtoF(Converters.convertKtoC(temp)) + "F");



        }

        else {

            if(userTemp.toLowerCase().contains("c")){
            //Remove the c
                userTemp=userTemp.replace("c", "");
            }

            //convert string to double
            temp=Double.parseDouble(userTemp);
            //convert C to F
            System.out.println(Converters.convertCtoF(temp)+ "F");

        }





    }
}

