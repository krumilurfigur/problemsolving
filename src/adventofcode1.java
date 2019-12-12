import java.io.*;
import java.util.Scanner;

public class adventofcode1 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("./src/test.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            in = new Scanner(System.in);
        }
        double m;
        double sum = 0;

        while (in.hasNextLine()) {
            m = Double.parseDouble(in.nextLine());
            m = m/3;
            m = Math.floor(m);
            m =- 2;
            sum += m;
        }
        System.out.println(sum);
    }
}
