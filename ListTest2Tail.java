/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4HapusNode;

/**
 *
 * @author zack
 */
public class ListTest2Tail {
    public static void main(String[] args) {
        StrukturList list = new StrukturList(); 
// Langkah 1: Membuat list baru
        
        // Langkah 2: Menambahkan elemen sehingga list berisi (2, 6, 3, 5, 1)
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);
        
        // Langkah 3: Menampilkan elemen list
        list.displayElement();
        System.out.println();
        
        // Langkah 4: Menghapus elemen di akhir list
        list.removeTail();
        
        // Langkah 5: Menampilkan elemen list setelah penghapusan di akhir list
        list.displayElement();
        System.out.println();
        
        // Langkah 6: Menghapus elemen di awal list
        list.removedHead();
        
        // Langkah 7: Menampilkan elemen list setelah penghapusan di awal list
        list.displayElement();
        System.out.println();
        
        // Tambahkan instruksi untuk menghapus elemen list di akhir sekali lagi
        list.removeTail();
        
        // Menampilkan elemen list setelah penghapusan di akhir list sekali lagi
        list.displayElement();
        System.out.println();
    }

    
}
