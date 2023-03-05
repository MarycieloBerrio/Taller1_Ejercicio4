/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller1.ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        int edjuan, edalberto, edana, edmama;
        Scanner N = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan: ");
        edjuan = N.nextInt();
        
        edalberto = 2 * (edjuan/3);
        edana = 4 * (edjuan/3);
        edmama = edjuan + edalberto + edana;
        
        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalberto);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de la mamá de Juan es: " + edmama);
        
    }
}
