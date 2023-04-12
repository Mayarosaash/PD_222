package whileDoWhile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan {
    public static void main(String[] s) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //while
        //menjumlahkan setiap angka yang di entrikan
        //kondisi = pengulangan penjumlahan akan dilakukan apabila angka yang diinputkan >= 0
        //output = angka hasil jumlah
//        int number = 0;
//        int jumlah = 0;
//        while (number >= 0){
//            jumlah += number; //untuk penjumlahan tiap angka yg diinputkan
//            System.out.print(" Entri angka :");
//            number = Integer.parseInt(br.readLine());
//        }
//        System.out.println("jumlah = "+ jumlah);
        //mengentrikan nim dan nama apabila kondisinya true (dua data diisi dengan benar,dimana tipe datanya sesuai)
        boolean b;
        int i = 0;
        while (i < 5 ){
            System.out.print("entri NIM = ");
            int NIM = Integer.parseInt(br.readLine());
            System.out.print("entri nama = ");
            String nama = br.readLine();
            i++;
        }
    }
}
