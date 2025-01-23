package com.gabriel.conversortemperatura;

import java.util.Scanner;



public class Main {

    public Double celsiusConverter(double value, String target) {
        double temp = 0;
        if(target.equalsIgnoreCase("F")) {
            temp = (value * 1.8) + 32;
        } else if(target.equalsIgnoreCase("K")) {
            temp = value + 273.15;
        }
        return temp;
    }

    public double fahrenheitConverter(double value, String target) {
        double temp = 0;
        if(target.equalsIgnoreCase("C")) {
            temp = (value - 32) / 1.8;
        } else if(target.equalsIgnoreCase("K")) {
            temp = ((value - 32) / 1.8) + 273.15;
        }
        return temp;
    }

    public double kelvinConverter(double value, String target) {
        double temp = 0;
        if(target.equalsIgnoreCase("C")) {
            temp = value - 273.15 ;
        } else if (target.equalsIgnoreCase("F")) {
            temp = ((value - 273.15) * 1.8 ) + 32;
        }
        return temp;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double value;
        String type, selected;

        System.out.println("*****************************************************");
        System.out.println("*                                                   *");
        System.out.println("*             CONVERSOR DE TEMPERATURA              *");
        System.out.println("*                                                   *");
        System.out.println("*     [F] Fahrenheit                                *");
        System.out.println("*     [C] Celsius                                   *");
        System.out.println("*     [K] Kelvin                                    *");
        System.out.println("*                                                   *");
        System.out.println("*****************************************************");

        System.out.print("Selecione para qual temperatura sera convertida >>>> ");
        type = scanner.nextLine();

        System.out.print("Seleciona qual tipo de temperatura esta sendo convertida >>>> ");
        selected = scanner.nextLine();


        System.out.print("Indique o valor que sera convertido >>>> ");
        value = scanner.nextDouble();



        Main main = new Main();

        switch (selected.toLowerCase()) {
            case "f":
                System.out.printf("Resultado: %s", main.fahrenheitConverter(value, type));
                break;
            case "c":
                System.out.printf("Resultado: %s", main.celsiusConverter(value, type));
                break;
            case "k":
                System.out.printf("Resultado: %s", main.kelvinConverter(value, type));

        }

    }

}