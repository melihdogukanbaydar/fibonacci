import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner   input = new Scanner(System.in);
       int n,a= 0, b=1,sum;
        do {
            System.out.println("Eleman Sayısını Giriniz");
            n = input.nextInt();

        }while ( n<0);
        System.out.print(a + " " + b);
        sum = a+b;
        for (int i =0;i<(n-2); i++){
            System.out.print( " " + sum);
            a = b;
            b= sum;
            sum = a+b;
        }


    }
}