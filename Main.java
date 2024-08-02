import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);
        System.out.println("x + a = b");
        int a, b, x;
        System.out.print("Введите а: ");
        a = reader.nextInt();
        System.out.print("Введите b: ");
        b = reader.nextInt();
        x = b - a ;
        System.out.println("Решение нашего уровнения:");
        System.out.println("x + a = b если а="+a+",  b="+b+" тогда" );

        System.out.println("x="+b+"-"+a);
        System.out.println("x="+x);

    }
}