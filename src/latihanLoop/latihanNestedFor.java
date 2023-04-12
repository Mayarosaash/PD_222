package latihanLoop;
import java.io.BufferedReader;
import  java.io.IOException;
import  java.io.InputStreamReader;
public class latihanNestedFor {
    public static void main(String[] s) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        //variabel
//        int minggu, hari;
//
//        //input
//        System.out.print("jumlah minggu: ");
//        minggu = Integer.parseInt(br.readLine());
//        System.out.print("jumlah hari: ");
//        hari = Integer.parseInt(br.readLine());
//
//        //perulangan + output
//        //outer loop : baris
//        for (int i = 1; i <= minggu ; i++) {
//            System.out.println("minggu ke = "+ i);
//            //inner loop : kolom
//            for (int j = 1; j <= hari ; j++) {
//                System.out.println(" hari = "+j);

        //input
        int Row;
        System.out.print("isilah baris : ");
        Row = Integer.parseInt(br.readLine());

        for (int a = Row; a >= 1 ; a--) {
            for (int b = 1; b <= a ; b++) {
                System.out.print(" * ");
            }
            System.out.println();



                }

            }


}





