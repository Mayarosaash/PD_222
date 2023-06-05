package Tugas10;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class tugas10 {
    public static void main(String[] args) throws IOException {
        Queue<String> parkir = new LinkedList<>();

        parkir.add("Mobil 1");
        parkir.add("Mobil 2");
        parkir.add("Mobil 3");
        parkir.add("Mobil 4");
        parkir.add("Mobil 5");

        System.out.println("Isi awal Queue: " + parkir);

        String removedElement = parkir.poll();
        System.out.println("Mobil yang dihapus: " + removedElement);
        System.out.println("Isi Queue setelah menghapus elemen: " + parkir);

        String peekedElement = parkir.peek();
        System.out.println("Mobil pertama Queue: " + peekedElement);
        System.out.println("Isi Queue setelah peek: " + parkir);

    }
}
