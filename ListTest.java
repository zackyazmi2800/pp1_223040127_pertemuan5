/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4HapusNode;

/**
 *
 * @author zack
 */
public class ListTest {
    
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); // Langkah 1: Membuat list baru
        
        // Langkah 2-4: Menambahkan elemen di awal list
        list.addHead(2);
        list.addHead(9);
        list.addHead(7);
        
        // Langkah 5: Menampilkan elemen list
        list.displayElement();
        System.out.println();
        
        // Langkah 6: Menghapus elemen di awal list
        list.removedHead();
        
        // Langkah 7: Menampilkan elemen list setelah penghapusan
        list.displayElement();
        System.out.println();
        
        // Langkah 8: Menghapus elemen di awal list sebanyak 2 kali lagi
        for (int i = 0; i < 2; i++) {
            list.removedHead();
        }
        
        // Menampilkan elemen list setelah penghapusan kedua kali
        list.displayElement();
        System.out.println(" ");
    }
    
}
