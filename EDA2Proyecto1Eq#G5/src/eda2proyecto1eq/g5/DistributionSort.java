/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda2proyecto1eq.g5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author scoop
 */
public class DistributionSort {
    String nombreArchivo;
    
    public DistributionSort(String nombreArchivo){
        this.nombreArchivo = nombreArchivo;
    }
    
    public void sort(){
        try {
            try (FileReader f0Read = new FileReader(this.nombreArchivo)) {
                BufferedReader bufferF0 = new BufferedReader(f0Read);
                FileWriter f0Write = new FileWriter(this.nombreArchivo);
                FileWriter f1Write = new FileWriter("f1.txt");
                String str = "";
                int aux;
                //search the max number
                while((aux = bufferF0.read()) != -1){
                    char temp = (char) aux;
                    if(temp != ','){
                        str = str + temp;
                    }else{
                        println(str);
                        str = "";
                    }
                }
                //f0 for a
                bufferF0.close();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DistributionSort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DistributionSort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void print(Object argumento){
        System.out.print(argumento);
    }
    
    private void println(Object argumento){
        System.out.println(argumento);
    }
}
