package com.company;

public class Converters {
    //F to C (temp-32)*5/9
    //C to F (temp*9/5) + 32
    //K to C temp-273.15
    //K to F ((temp-273.15)*9/5)+32




    //Method to convert F to C
    public static double convertFtoC(double temp) {
        return (temp-32)*5/9;
    }

    //Metthod to convert C to F
    public static double convertCtoF(double temp) {
        return temp*9/5 + 32;
    }
    //Method to convert K to C and F
    public static double convertKtoC(double temp) {
        return temp-273.15;
    }


}
