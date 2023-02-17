/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e1p1_javierreyes;
import java.util.Scanner;
/**
 *
 * @author Javier Reyes
 */
public class E1P1_JavierReyes {
static Scanner lea = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        boolean salir = false;
        
        while (!salir){
            System.out.println("menu del laboratorio 5");
            System.out.println("1. Numero Valido");
            System.out.println("2. Reordenado de cadenas");
            System.out.println("3. Trigonometria");
            System.out.println("4. Salir");
            
            System.out.println("ingrese su opcion");
            opcion= lea.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("");
                    Numero_valido();
                    
                case 2:
                    System.out.println("");
                    Reordenado_de_cadenas();
                    
                case 3:
                    System.out.println("");
                    Trigonometria();
                    
                case 4:
                   salir = true;
                   break;
                    
                    
            }  
            }         
    }
    public static void Numero_valido(){
        System.out.println("Selecciono numero valido");
          
        
    }
    
    public static void Reordenado_de_cadenas(){
        System.out.println("selecciono Reordenado de cadenas");
        
    }
    
    
    public static void Trigonometria(){
        System.out.println("selecciono Trigonometria");
        
    }
    
    
    
    
}
