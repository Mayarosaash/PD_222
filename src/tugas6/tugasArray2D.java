package tugas6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tugasArray2D {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] barang = new  String[5][4];
        Integer harga, jumlah, total, grandTotal = 0, uangDibayarkan = 0, kembalian;

        try {
            System.out.print("Masukkan nama : ");
            String nama = br.readLine();

            for (int i = 0; i < barang.length; i++) {
                System.out.print("Masukkan nama barang : ");
                barang[i][0] = br.readLine();
                System.out.print("Masukkan jumlah barang : ");
                barang [i][1] = br.readLine();
                jumlah =Integer.parseInt(barang[i][1]);
                System.out.print("Harga : ");
                barang [i][2] = br.readLine();
                harga = Integer.parseInt(barang [i][2]);


                total = jumlah * harga;

                barang [i][3] = String.valueOf(total);
                System.out.println("total = "+ barang [i][3]);

                grandTotal = grandTotal + total;
                System.out.println("================================");


            }
            System.out.println("grandTotal  (jumlah * harga) = " +grandTotal );
            System.out.println("Uang yang dibayarkan = " );
            uangDibayarkan = Integer.parseInt(br.readLine());
            uangDibayarkan = uangDibayarkan - grandTotal;
            System.out.println("Kembalian anda = Rp " + uangDibayarkan);

        }catch (Exception e){

        }
    }
}
