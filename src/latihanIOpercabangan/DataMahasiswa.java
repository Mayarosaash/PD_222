package latihanIOpercabangan;

//step 1 import lib
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class DataMahasiswa {
    public static void main(String[] args){
        //step 3 deklaras class bufferedreader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // step 4 deklarasi variabel
        String nim, nama, prodi;
        int semester, sksAmbil;


        //step 2 error handling
        //try.catch
        try{
            //step 5 pengerjaan logika program
            System.out.println("-----Data Mahasiswa-----"); //header
            //input
            System.out.print("NIM: ");
            nim = br.readLine();
            System.out.print("Nama: ");
            nama = br.readLine();
            System.out.print("Prodi: ");
            prodi = br.readLine();
            System.out.print("Semester: ");
            semester = Integer.parseInt(br.readLine());
            System.out.print("Jumlah SKS yang diambil: ");
            sksAmbil = Integer.parseInt(br.readLine());


            //output
            System.out.println("-----Cetak Data Mahasiswa-----");
            System.out.println("NIM Mahasiswa : "+nim);
            System.out.println("Nama Mahasiswa : "+nama);
            System.out.println("Prodi Mahasiswa : "+prodi);
            System.out.println("Semester Mahasiswa : "+semester);
            System.out.println("Jumlah SKS mahasiswa : "+sksAmbil);

    }catch (Exception exp){
            //kondisi ada error, apa yg ditampilkan
            System.out.println(exp.getMessage());
            System.out.println("Isian semester dan sks harus angka");
        }
    }
}
