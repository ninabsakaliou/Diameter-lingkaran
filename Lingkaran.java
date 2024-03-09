/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lingkaran;

/**
 *
 * @author asus
 */
public class Lingkaran {
    // Atribut untuk penyimpanan nilai radius
    private double radius;
    
    // Konstruktor untuk menginisialisasi objek Lingkaran dengan radius tertentu
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Metode untuk menghitung diameter lingkaran
    public double hitungDiameter() {
        return 2 * this.radius;
    }

    // Metode getter untuk radius (opsional, berguna jika perlu mengakses radius dari luar kelas)
    public double getRadius() {
        return this.radius;
    }

    // Metode setter untuk radius (opsional, berguna jika ingin mengubah radius dari luar kelas)
    public void setRadius(double radius) {
        this.radius = radius;
    }
}