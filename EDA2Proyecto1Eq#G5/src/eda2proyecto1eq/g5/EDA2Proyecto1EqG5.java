/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda2proyecto1eq.g5;

import java.util.Scanner;

/**
 *
 * @author scoop
 */
public class EDA2Proyecto1EqG5{
    public static void main(String[] args) {
        @SuppressWarnings("UnusedAssignment")
        Scanner input = new Scanner(System.in);
        Scanner fileNameInput = new Scanner(System.in);
        String fileName = "";
        int option;
        boolean isFinal = false;
        do{
            println("########################################################################");
            println("####                      MENU DEL PROGRMA                          ####");
            println("########################################################################");
            println("#### 1: Polifase                                                    ####");
            println("#### 2: Mezcla Equilibrada                                          ####");
            println("#### 3: Ditribucion                                                 ####");
            println("#### 4: Finalizar el programa                                       ####");
            println("########################################################################");
            print("Que deseas realizar?: ");
            input = new Scanner(System.in);
            option = input.nextInt();
            fileNameInput = new Scanner(System.in);
            switch(option){
                case 1:
                   println("Digita el nombre del archivo: ");
                   fileName = fileNameInput.next();
                   //call Polifase
                   fileName = "";
                   break;
                case 2:
                    println("Digita el nombre del archivo: ");
                    fileName = fileNameInput.next();
                    //
                    fileName = "";
                    break;
                case 3:
                    println("Digita el nombre del archivo: ");
                    fileName = fileNameInput.next();
                    //
                    DistributionSort distributionSort = new DistributionSort(fileName);
                    distributionSort.sort();
                    fileName = "";
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while(!isFinal);
    }

    
    
    private static void print(Object arg){
        System.out.println(arg);
    }
    
    private static void println(Object arg){
        System.out.println(arg);
    }
}