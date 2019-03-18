/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eda2proyecto1eq.g5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
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
            FileReader t0 = new FileReader(this.nombreArchivo);
            BufferedReader bufferF0 = new BufferedReader(t0);
            String number = "";
            int aux;
            while((aux = bufferF0.read()) != -1){
                char temp = (char) aux;
                if(temp != ','){
                    number = number + temp;
                }else{
                    Integer secAx = Integer.parseInt(number);
                    println(secAx);
                    number = "";
                }
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
