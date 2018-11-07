import java.util.Scanner;

import static java.lang.Math.*;

public class Zadanie10 {
    public static void main (String [] args ){
        System.out.println("Введите значение x");
        Scanner sc = new Scanner(System.in);
        Double x = sc.nextDouble();
        double result;
        result=(pow((x+1),2)+3*(x+1));
        System.out.println(result);
    }
}
