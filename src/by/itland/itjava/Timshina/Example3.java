package by.itland.itjava.Timshina;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double res = (Math.pow((x+1)/(x-1), x) + 18*x*Math.pow(y, 2))/ (Math.abs(Math.pow(x, 2)-Math.pow(x, 3))- 7*x/(Math.pow(x, 3)-15*x));

        System.out.println(res);

    }
}
