package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas3 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            double sks = 3.0;
            double bobotNilai1 = 0;
            double bobotNilai2 = 0;
            double bobotNilai3 = 0;
            double bobotNilai4 = 0;
            double bobotNilai5 = 0;
            double bobotNilai6 = 0;
            double totalSKS = 18;
            double totalNilai;
            double ips;

            System.out.println("Masukkan nilai 1 anda = ");
            String nilai1 = br.readLine();

            if (nilai1.equalsIgnoreCase ("A")){
                bobotNilai1 = 4 * sks;

            } else if ( nilai1.equalsIgnoreCase("B+")) {
                bobotNilai1 = 3.5 * sks;

            } else if (nilai1.equalsIgnoreCase( "B")) {
                bobotNilai1 = 3 * sks;

            } else if (nilai1.equalsIgnoreCase( "C+")) {
                bobotNilai1 = 2.5 * sks;

            } else if (nilai1.equalsIgnoreCase( "C")) {
                bobotNilai1 = 2 * sks;

            } else if (nilai1.equalsIgnoreCase( "D")) {
                bobotNilai1 = 1 * sks;

            } else {
                bobotNilai1 = 0 * sks;
            }
            System.out.println("Bobot Nilai1 Anda = " + bobotNilai1);

            System.out.println("Masukkan nilai 2 anda = ");
            String nilai2 = br.readLine();

            if (nilai2.equalsIgnoreCase ("A")){
                bobotNilai2 = 4 * sks;

            } else if ( nilai2.equalsIgnoreCase("B+")) {
                bobotNilai2 = 3.5 * sks;

            } else if (nilai2.equalsIgnoreCase( "B")) {
                bobotNilai2 = 3 * sks;

            } else if (nilai2.equalsIgnoreCase( "C+")) {
                bobotNilai2 = 2.5 * sks;

            } else if (nilai2.equalsIgnoreCase( "C")) {
                bobotNilai2 = 2 * sks;

            } else if (nilai2.equalsIgnoreCase( "D")) {
                bobotNilai2 = 1 * sks;

            } else {
                bobotNilai2 = 0 * sks;
            }
            System.out.println("Bobot Nilai2 Anda = " + bobotNilai2);

            System.out.println("Masukkan nilai 3 anda = ");
            String nilai3 = br.readLine();

            if (nilai1.equalsIgnoreCase ("A")){
                bobotNilai3 = 4 * sks;

            } else if ( nilai3.equalsIgnoreCase("B+")) {
                bobotNilai3 = 3.5 * sks;

            } else if (nilai3.equalsIgnoreCase( "B")) {
                bobotNilai3 = 3 * sks;

            } else if (nilai3.equalsIgnoreCase( "C+")) {
                bobotNilai3 = 2.5 * sks;

            } else if (nilai3.equalsIgnoreCase( "C")) {
                bobotNilai3 = 2 * sks;

            } else if (nilai3.equalsIgnoreCase( "D")) {
                bobotNilai3 = 1 * sks;

            } else {
                bobotNilai3 = 0 * sks;
            }
            System.out.println("Bobot Nilai3 Anda = " + bobotNilai3);

            System.out.println("Masukkan nilai 4 anda = ");
            String nilai4 = br.readLine();

            if (nilai4.equalsIgnoreCase ("A")){
                bobotNilai4 = 4 * sks;

            } else if ( nilai4.equalsIgnoreCase("B+")) {
                bobotNilai4 = 3.5 * sks;

            } else if (nilai4.equalsIgnoreCase( "B")) {
                bobotNilai4 = 3 * sks;

            } else if (nilai4.equalsIgnoreCase( "C+")) {
                bobotNilai4 = 2.5 * sks;

            } else if (nilai4.equalsIgnoreCase( "C")) {
                bobotNilai4 = 2 * sks;

            } else if (nilai4.equalsIgnoreCase( "D")) {
                bobotNilai4 = 1 * sks;

            } else {
                bobotNilai4 = 0 * sks;
            }
            System.out.println("Bobot Nilai4 Anda = " + bobotNilai4);

            System.out.println("Masukkan nilai 5 anda = ");
            String nilai5 = br.readLine();

            if (nilai5.equalsIgnoreCase ("A")){
                bobotNilai5 = 4 * sks;

            } else if ( nilai5.equalsIgnoreCase("B+")) {
                bobotNilai5 = 3.5 * sks;

            } else if (nilai5.equalsIgnoreCase( "B")) {
                bobotNilai5 = 3 * sks;

            } else if (nilai5.equalsIgnoreCase( "C+")) {
                bobotNilai5 = 2.5 * sks;

            } else if (nilai5.equalsIgnoreCase( "C")) {
                bobotNilai5 = 2 * sks;

            } else if (nilai5.equalsIgnoreCase( "D")) {
                bobotNilai5 = 1 * sks;

            } else {
                bobotNilai5 = 0 * sks;
            }
            System.out.println("Bobot Nilai5 Anda = " + bobotNilai5);

            System.out.println("Masukkan nilai 6 anda = ");
            String nilai6 = br.readLine();

            if (nilai6.equalsIgnoreCase ("A")){
                bobotNilai6 = 4 * sks;

            } else if ( nilai6.equalsIgnoreCase("B+")) {
                bobotNilai6 = 3.5 * sks;

            } else if (nilai6.equalsIgnoreCase( "B")) {
                bobotNilai6 = 3 * sks;

            } else if (nilai6.equalsIgnoreCase( "C+")) {
                bobotNilai6 = 2.5 * sks;

            } else if (nilai6.equalsIgnoreCase( "C")) {
                bobotNilai6 = 2 * sks;

            } else if (nilai6.equalsIgnoreCase( "D")) {
                bobotNilai6 = 1 * sks;

            } else {
                bobotNilai6 = 0 * sks;
            }
            System.out.println("Bobot Nilai6 Anda = " + bobotNilai6);

            totalNilai = bobotNilai1 + bobotNilai2 + bobotNilai3 + bobotNilai4 + bobotNilai5 + bobotNilai6;
            ips = totalNilai / totalSKS;
            System.out.println("IPS anda = " + ips);
            if (ips>=3.50){
                System.out.println("SKS maksimal = 24 ");

            } else if (ips>=3.00 && ips<= 3.49) {
                System.out.println("SKS maksimal = 22");

            } else if (ips>=2.00 && ips<=2.99) {
                System.out.println("SKS maksimal = 20");

            } else {
                System.out.println("SKS maksimal = 18");
            }
        }
}

