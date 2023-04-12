package whileDoWhile;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class latihanDoWhile {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //letakkan variabel sebelum blok try agar terbaca di dalam blok try-catch
//        int NIM, i = 0;
//        String nama;
//        try {
//            do {
//                System.out.print("entri NIM = ");
//                NIM = Integer.parseInt(br.readLine());
//                System.out.print("entri nama = ");
//                nama = br.readLine();
//                i++;
//            } while (i < 5);
//        } catch (Exception e) {

            //deklarasikan variabel

//        }
        try {
            /*membuat program dengan menu
            1. entri mahasiswa (nim, nama, prodi, mk)
            2. hitung nilai mahasiswa (uts, uas, tugas)
            3.lihat rapor mahasiswa
            4.keluar program
             */
            String nimMhs = null, namaMhs = "", prodi = null, mk = "", cari = "";
            int uts, uas, tugas, menu, nilaiAkhir =0;
            do {
                System.out.println("=== program akademik mahasiswa ===");
                System.out.println("1. entri mahasiswa ");
                System.out.println("2. hitung nilai mk mahasiswa ");
                System.out.println("3. lihat rapor mahasiswa ");
                System.out.println("4. keluar program");
                System.out.println("masukkan pilihan anda");
                menu = Integer.parseInt(br.readLine());
                //mengisi logika setiap menu (percabangan: if, switch-case)

                switch (menu){
                    /*
                    if (menu == 1 ){
                    }else if (menu == 2 ){
                    }else { (else dalam if-else if == deafault)
                    }
                     */
                    case 1:
                        System.out.println("=== menu entri mahasiswa ===");
                        System.out.println("entri nim : ");
                        nimMhs = br.readLine();
                        System.out.println("entri nama : ");
                        namaMhs = br.readLine();
                        System.out.println("entri program studi : ");
                        prodi = br.readLine();
                        System.out.println("entri nama mata kuliah : ");
                        mk = br.readLine();
                        System.out.println();

                        break; //artinya berhenti proses case 1 dan mengembalikan ke perulangan awal atau menu diawal
                    case  2:
                        System.out.println("=== menu hitung nilai mahasiswa ===");
                        //hitung nilai akhir (30% * uts +30% * uas + 40% * tugas)
                        System.out.print("cari bedasarkan nim : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                            //jika sesuai, entri nilai. jika tidak, ada pesan "data tidak ditemukan"

                            System.out.println(" entri nilai uts : ");
                            uts = Integer.parseInt(br.readLine());
                            System.out.println("entri nilai uas : ");
                            uas = Integer.parseInt(br.readLine());
                            System.out.println("entri nilai tugas : ");
                            tugas = Integer.parseInt(br.readLine());

                            nilaiAkhir = (uts * 30/100) + (uas * 30/100) + (tugas * 40/100);

                            //cetak nilaiAkhir
                            System.out.println(" nilai akhir = "+ nilaiAkhir);
                            System.out.println();

                        }

                        break;
                    case  3:
                        System.out.println("=== menu lihat rapor ===");
                        //menampilkan semua data (termasuk nilai akhir dan nilai huruf)
                        System.out.println(nimMhs);
                        System.out.println(namaMhs);
                        System.out.println("nilai akhir mk "+ mk + ":"+ nilaiAkhir);
                        System.out.print("cari bedasarkan nim : ");
                        cari = br.readLine();
                        if (cari.equalsIgnoreCase(nimMhs)){
                            if (nilaiAkhir >= 80 && nilaiAkhir <= 100){
                                System.out.println("Nilai huruf : A ");
                            }else if (nilaiAkhir >= 75 && nilaiAkhir <= 79){
                                System.out.println("Nilai huruf : B+ ");
                            }else if (nilaiAkhir >= 65 && nilaiAkhir <= 74 ) {
                                System.out.println("Nilai huruf : B ");
                            } else if (nilaiAkhir >= 60 && nilaiAkhir <= 64 ) {
                                System.out.println("Nilai huruf : C+ ");
                            } else if (nilaiAkhir >= 55 && nilaiAkhir <= 59 ) {
                                System.out.println("Nilai huruf : C+ ");
                            }else {
                                System.out.println("Nilai akhir : E/D ");
                        }
                        /*
                        A = 80 -100
                        B+ = 75 - 79
                        B = 65 - 74
                        C+ = 60 - 64
                        C = 55- 59
                        nilai kurang dari 55 == D/E
                         */


                }
                        break;
                    default: // jika yang dipilih di luar 1-3, maka menjalankan apa
                        System.out.println("berhasil keluar program");
                        System.exit(0);
                }
            }
            while (menu < 4); //boleh diisi "true"
        } catch (Exception e) {
            System.out.println("terdapat kesalahan --> "+ e.getMessage());
        }
    }
}
