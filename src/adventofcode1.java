import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

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
        int[] opcode;
         int n = 0;
        double sum = 0;

        while (in.hasNextLine()) {
            opcode[n] = Integer.parseInt(in.nextLine());
            n++;
        }
        System.out.println(opcode[1]);
    }
}


class day1part2 {
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
            m -= 2;
            sum += m;
        }
        System.out.println(sum);
    }
}

class day2part1 {
    public static void main(String[] args) {
        Scanner in = null;
        try {
            in = new Scanner(new File("./src/test.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            in = new Scanner(System.in);
        }
        int[] opcode = new int[];
        int n = 0;

        while (in.hasNextLine()) {
            opcode[n] = Integer.parseInt(in.nextLine());
            n++;
        }
        System.out.println(opcode[0]);
    }
}
