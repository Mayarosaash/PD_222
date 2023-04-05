package tugas4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class nestedloop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        {
            //input
            int Row;
            System.out.print("isilah baris : ");
            Row = Integer.parseInt(br.readLine());

            for (
                    int a = Row;
                    a >= 1; a--) {
                for (int b = 1; b <= a; b++) {
                    System.out.print(" * ");
                }
                System.out.println();

            }
        }
    }
}
