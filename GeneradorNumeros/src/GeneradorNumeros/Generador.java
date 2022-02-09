package GeneradorNumeros;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Kevin Martinez
 */
public class Generador {

public static void main(String [] arg) {
     
        
      Random dado = new Random();
      int numeros []= new int[1000000];
      ManejadorArchivos archivo = new ManejadorArchivos();
      int opcion = 0;
      int numero;
      String nombreArchivo = "";
      do{
          System.out.println("-----------------------------------------");
          System.out.println("GENERADOR DE NUMEROS ALEATORIOS UMG");
          System.out.println("-----------------------------------------");
          System.out.println("1. Generar un millon de numeros aleatorios");
          System.out.println("2. Leer y ordenar los numeros de un archivo");
          System.out.println("3. Salir");
          System.out.print("seleccione una opcion: ");
         Scanner entrada=new Scanner(System.in);
         opcion = entrada.nextInt();
          switch(opcion){
              case 1:
               for(int i=0; i<1000000;i++){
                  do{
                   numero=dado.nextInt();
                     }while(numero<-10000000||numero>10000000);
                numeros[i]=numero;
                }
                  System.out.print("Nombre del archivo: ");
        nombreArchivo =entrada.next();
      archivo.grabar(nombreArchivo+".txt", numeros);
      
                  break;
                  
              case 2:
                     System.out.print("Nombre del archivo: ");
                     nombreArchivo =entrada.next();
                     archivo.lectura(nombreArchivo+".txt");
                  break;
                  
              case 3:
                  System.out.println("****** PROGRAMA FINALIZADO *********");
                  break;
          }
      }while(opcion!=3);
     
            }
    
}


    

