/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;
import java.util.Scanner;

/**
 *
 * @author SİMA SERENLİOĞLU
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner value = new Scanner(System.in);
       double x,y,z,average;
       System.out.println("x sayısı:");
       x=value.nextInt();
       System.out.println("y sayısı:");
       y=value.nextInt();
       System.out.println("z sayısı:");
       z=value.nextInt();
       average=(x+y+z)/3;
       System.out.println("ort deger="+average);
    }
    
}
