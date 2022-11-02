/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Bobotnilaihuruf {
    public static void main(String[] args) {
        String huruf;
        Scanner h1 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan Huruf Yang Mau di Konversi = ");
        huruf = h1.nextLine();
    
    switch (huruf){
        case "a" -> System.out.println(  huruf + "adalah 4");
        case "b" -> System.out.println(  huruf + "adalah 3");
        case "c" -> System.out.println(  huruf + "adalah 2");
        case "d" -> System.out.println(  huruf + "adalah 1");
        case "e" -> System.out.println(  huruf + "adalah 0");
        }
    }
}
