package latihanIOpercabangan;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class percabangan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //if else
        //cek syarat pembuatan ktp

       /* int usia=0;
        System.out.println("Masukkan usia anda : ");
        usia = Integer.parseInt(br.readLine());
        if (usia >= 17 ) {
            System.out.println("Sudah memenuhi syarat");
        }*/
        //if else if
        //cek status kelulusan MK berdasarkan nim dan nilai uas
//
//        String nim;
//        int nilaiUAS;
//        System.out.print("Masukkan NIM anda : ");
//        nim = br.readLine();
//        System.out.print("Masukkan nilai UAS anda : ");
//        nilaiUAS = Integer.parseInt(br.readLine());
//
//        //jika nilai 80,76,65 = lulus, dibawah 65 tidak lulus
//        if (nim.equalsIgnoreCase( "22410100027")
//                && nilaiUAS == 80) {
//            System.out.println("LULUS");
//        } else if (nim.equalsIgnoreCase("22410100027")
//                        && nilaiUAS == 70) {
//            System.out.println("LULUS");
//        } else if (nim.equalsIgnoreCase("22410100027")
//                        && nilaiUAS == 65) {
//            System.out.println("LULUS");
//        } else if (nim.equalsIgnoreCase("22410100027")
//                        && nilaiUAS < 65) {
//            System.out.println("LULUS");
//        } else {
//            System.out.println("NILAI TIDAK DITEMUKAN");
//        }
        String menu, jenis;

        System.out.print("Masukkan menu (makanan/minuman) : ");
        menu = br.readLine();
        System.out.print("Masukkan jenis menu \n makanan: snack, nasi bungkus, nasi lele \n" +
                "minuman: kopi, teh, air mineral. pilih : ");
        jenis = br.readLine();

        if (menu.equalsIgnoreCase("Makanan")){
            if (jenis.equalsIgnoreCase("Snack")) {
                System.out.println("harga 2000");
            } else if (jenis.equalsIgnoreCase("nasi bungkus")){
                System.out.println("harga 5000");
            }else if (jenis.equalsIgnoreCase("nasi lele")){
                System.out.println("50000");
            }else {
                System.out.println("tidak ada");
            }
        } else if (menu.equalsIgnoreCase("minuman")){
            if (jenis.equalsIgnoreCase("kopi")){
                System.out.println("harga 20000");
            } else if (jenis.equalsIgnoreCase("air mineral")){
                System.out.println("harga 25000");
            }else{
                System.out.println("harga 10000");
            }


        }
        }
    }

