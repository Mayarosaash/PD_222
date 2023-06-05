package Tugas10;

import java.util.ArrayDeque;
import java.util.Queue;

public class tugas10_2 {
    public static void main(String[] args) {
        // Membuat objek Queue menggunakan ArrayDeque
        Queue<Integer> stock = new ArrayDeque<>();

        // Menambahkan elemen ke dalam Queue
        stock.add(10);
        stock.add(20);
        stock.add(30);
        stock.add(40);
        stock.add(50);

        System.out.println("Isi awal Queue: " + stock);

        // Menghapus elemen pertama dari Queue
        int removedElement = stock.poll();
        System.out.println("Elemen yang dihapus: " + removedElement);
        System.out.println("Isi Queue setelah menghapus elemen: " + stock);

        // Mendapatkan elemen pertama dari Queue tanpa menghapusnya
        int peekedElement = stock.peek();
        System.out.println("Elemen pertama Queue: " + peekedElement);
        System.out.println("Isi Queue setelah peek: " + stock);
    }
}
