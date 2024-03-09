/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lingkaran;

/**
 *
 * @author asus
 */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan radius
        System.out.print("Masukkan radius lingkaran: ");
        double radius = scanner.nextDouble();

        // Membuat objek Lingkaran
        Lingkaran lingkaran = new Lingkaran(radius);

        // Menghitung dan menampilkan diameter
        double diameter = lingkaran.hitungDiameter();
        System.out.println("Diameter lingkaran dengan radius " + radius + " adalah: " + diameter);
    }
}