/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4HapusNode;

/**
 *
 * @author zack
 */
public class ListTest3middle {
    
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();
        
        // 2. Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        list.addTail(2);
        list.addTail(6);
        list.addTail(3);
        list.addTail(5);
        list.addTail(1);
        
        // 3. Tampilkan elemen list
        list.displayElement();
        
        // 4. Hapus elemen 3 di tengah list
        list.removeMid(3);
        
        // 5. Tampilkan elemen list setelah penghapusan
        System.out.println("");
        list.displayElement();
        
        // Tes
        // Hapus elemen list di tengah sehingga output elemen list menjadi: 2 1
        list.removeMid(6);
        System.out.println("");
        list.displayElement();
    }
    
}
