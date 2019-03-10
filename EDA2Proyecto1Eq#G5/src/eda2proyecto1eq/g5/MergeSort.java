package eda2proyecto1eq.g5;

//Utilizamos como algoritmo interno Merge sort sacada de la practica 3
//Repoillo

public class MergeSort {

    private void print(String arg){
        System.out.print(arg);
    }
    
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    }

    private void printSubArray(int array[],int begin,int finish){
        for (int index = begin ; index < finish; index++ ){
            print(array[index] + " ");
        }
        System.out.println();
    }
    
    void merge(int arreglo[], int izquierda, int medio, int derecha) 
    { 
        int tamanio_arreglo_izquierda = medio - izquierda + 1; 
        int tamanio_arreglo_derecha = derecha - medio; 
  
        int arreglo_izquierda[] = new int [tamanio_arreglo_izquierda]; 
        int arreglo_derecha[] = new int [tamanio_arreglo_derecha]; 
  
        for (int indice = 0; indice < tamanio_arreglo_izquierda; ++indice){
          arreglo_izquierda[indice] = arreglo[izquierda + indice];  
        }  
        for (int indice_secundario = 0; indice_secundario < tamanio_arreglo_derecha; ++indice_secundario) {
          arreglo_derecha[indice_secundario] = arreglo[medio + 1 + indice_secundario];  
        } 
        int indice_arreglo_izquierda = 0, indice_arreglo_derecha = 0; 
  
        int indice_arreglo_mezcla = izquierda; 
        while (indice_arreglo_izquierda < tamanio_arreglo_izquierda && indice_arreglo_derecha < tamanio_arreglo_derecha) 
        { 
            if (arreglo_izquierda[indice_arreglo_izquierda] <= arreglo_derecha[indice_arreglo_derecha]) 
            { 
                arreglo[indice_arreglo_mezcla] = arreglo_izquierda[indice_arreglo_izquierda]; 
                indice_arreglo_izquierda++; 
            } 
            else
            { 
                arreglo[indice_arreglo_mezcla] = arreglo_derecha[indice_arreglo_derecha]; 
                indice_arreglo_derecha++; 
            } 
            indice_arreglo_mezcla++; 
        } 
  
        while (indice_arreglo_izquierda < tamanio_arreglo_izquierda) { 
            arreglo[indice_arreglo_mezcla] = arreglo_izquierda[indice_arreglo_izquierda]; 
            indice_arreglo_izquierda++; 
            indice_arreglo_mezcla++; 
        } 
  
        while (indice_arreglo_derecha < tamanio_arreglo_derecha) { 
            arreglo[indice_arreglo_mezcla] = arreglo_derecha[indice_arreglo_derecha]; 
            indice_arreglo_derecha++; 
            indice_arreglo_mezcla++; 
        } 
    } 
  
    void sort(int arreglo[], int izquierda, int derecha) { 
        if (izquierda < derecha) { 
            int medio = (izquierda + derecha) / 2;

            sort(arreglo, izquierda, medio); 
            sort(arreglo , medio + 1 , derecha); 
  
            merge(arreglo, izquierda, medio, derecha);
            
        } 
    }
}
