package escobar_kellyan_prueba1p2;

import java.util.Scanner;
import java.util.Random;
public class Escobar_Kellyan_Prueba1P2 {

    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        Random ran=new Random();
        
         String ListaNombre[];
         ListaNombre=new String[20];
         ListaNombre[0]="radar";
         ListaNombre[1]="level";
         ListaNombre[2]="worl";
         ListaNombre[3]="civic";
         ListaNombre[4]="java";
         ListaNombre[5]="deified";
         ListaNombre[6]="python";
         ListaNombre[7]="rotor";
         ListaNombre[8]="language";
         ListaNombre[9]="madam";
         ListaNombre[10]="refer";
         ListaNombre[11]="stats";
         ListaNombre[12]="noon";
         ListaNombre[13]="hello";
         ListaNombre[14]="moon";
         ListaNombre[15]="wow";
         ListaNombre[16]="racecar";
         ListaNombre[17]="kayak";
         ListaNombre[18]="apple";
         ListaNombre[19]="deed";
         
           
        System.out.println("Mostrar el Listado de Palbras");

        for (int Columna=0; Columna < ListaNombre.length; Columna++) {
            System.out.println("Nombre: " + ListaNombre[Columna]);
        }
        
        System.out.println("Ingrese la cantidad de palabras que desea ingresar: ");
        int Cantidad=lea.nextInt();
       
        String[] ArregloA=new String[Cantidad];
        String[] ArregloB=new String[Cantidad];
        
        for(int Columna=0; Columna<Cantidad;Columna++){
            ArregloA[Columna]=ListaNombre[ran.nextInt(ListaNombre.length)];
            ArregloB[Columna]=ListaNombre[ran.nextInt(ListaNombre.length)];
        }
        
        System.out.println("Lista palabras palindorma Arreglo A:");
        for(int Columna=0;Columna<Cantidad;Columna++){
            System.out.println("["+Columna+"]:"+ArregloA[Columna]);
        }
        
        System.out.println("Lista palabras palindorma Arreglo B:");
        for(int Columna=0;Columna<Cantidad;Columna++){
            System.out.println("["+Columna+"]:"+ArregloB[Columna]);
        }
        
        System.out.println("Palabras del Arreglo A no estan en el Arreglo B son:");
        for (int Columna=0; Columna<Cantidad; Columna++) {
            boolean Encontrado = false;
            for (int Palabras=0; Palabras<Cantidad; Palabras++) {
                if (ArregloA[Columna].equals(ArregloB[Palabras])) {
                    Encontrado = true;
                }
                System.out.println(ArregloA[Columna]);
            }
        }
      }
  }
