package escobar_kellyan_prueba1p2;

import java.util.Scanner;
public class Escobar_Kellyan_Prueba1P2 {

    public static void main(String[] args) {
        Scanner lea =new Scanner(System.in);
        
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
         
           
        System.out.println("Mostrar el Listado");

        for (int Fila=0; Fila < ListaNombre.length; Fila++) {
            System.out.println("Nombre: " + ListaNombre[Fila]);
        }
        int Fila=0;
     
            String palabra=ListaNombre[Fila];
            System.out.print("Palabra #" + (Fila + 1) + ": " + palabra + " - ");

            boolean EsPalindromo=true;
            int inicio=0;
            int fin = palabra.length() - 1;

            while (inicio < fin) {
                if (palabra.charAt(inicio) !=palabra.charAt(fin)) {
                    EsPalindromo=false;
                    break;
                }
                inicio++;
                fin--;
            }

            if (EsPalindromo) {
                System.out.println("Es una palabra palindroma.");
            } else {
                System.out.println("No es una palabra palindroma.");
            }
        }
    }

    
    
        
    
