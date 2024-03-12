/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S03_05;

/**
 *
 * @author NEY
 */
public class S03_05_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int [] numeros = new int[5];
        
        numeros[0] = 100;
        numeros[1] = 200;
        numeros[2] = 500;
        numeros[3] = 1000;
        numeros[4] = 1500;
        
        System.out.println(numeros[2]);
        
        int [] numeros2 = {10, 20, 30, 40, 50, 60, 70,80};
        
        System.out.println(numeros2[2]);
        
        for(int numero : numeros2){
            
            System.out.println(numero);
        }
    }
    
}
