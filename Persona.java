// Ejercicio 1 Practica 4
// @author Walter Aquino
import java.util.Scanner;
public class Persona {
    private Scanner scanner;
    private String nombre;
    private int edad;

    public void inicializar(){
        scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Digite edad: ");
        edad = scanner.nextInt();
    }
    public void imprimir(){
        System.out.println("Nombre ingresado: " +nombre);
        System.out.println("Edad digitada: " +edad);
    }
    public void buscarMayor(){
        if (edad >=18){
          System.out.println(nombre + " Es mayor de edad");  
        } else {
           System.out.println(nombre + " Es menor de edad");   
        }
    }
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.inicializar();
        persona.imprimir();
        persona.buscarMayor();      
    }
}