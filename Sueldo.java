//  Ejercicio 2 Practica 4
import java.util.Scanner;

public class Sueldo {

    private Scanner scanner;
    private int[] sueldos;
    
    // constructor
    public Sueldo(){
        scanner = new Scanner (System.in);
        sueldos = new int[5];

    }
    private void capturar(){
        for (int i = 0; i< 5; i++) {
            System.out.print("Ingrese sueldo  "+ (i + 1) +": ");
            sueldos[i] = scanner.nextInt();
        }    
    }
    private void imprimir(){
        for (int i = 0; i< 5; i++) {
        System.out.println("Sueldo ingresado en la posición "+ (i + 1) +": "+sueldos[i]);
        }
    }
    public static void main(String[] args) {
        Sueldo sueldo= new Sueldo();
        sueldo.capturar();
        sueldo.imprimir();
    }
}