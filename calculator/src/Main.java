import java.util.Scanner;

public class Main {
    public static float addition(float x,float y){
        return x + y;
    }
    public static float substraction(float x,float y){
        return x - y;
    }
    public static float multiplicatin (float x, float y){
        return x * y;
    }
    public static float division (float x, float y){
        if (y == 0) {
            throw new ArithmeticException("Sayı sıfıra bölünemez");
        };
        return x / y;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("merhabalar hesap makinesine hoşgeldiniz");
        while (true) {
            System.out.println("toplama için 1 basın çıkartma için 2 çarpma için 3 bölme için 4 programdan çıkmak için 5e basın");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                System.out.println("1. sayıyı giriniz");
                float x = input.nextFloat();
                System.out.println("2. sayıyı giriniz");
                float y = input.nextFloat();
                float sonuc = addition(x, y);
                System.out.println(sonuc);
            } else if (userChoice == 2) {
                System.out.println("1. sayıyı giriniz");
                float x = input.nextFloat();
                System.out.println("2. sayıyı giriniz");
                float y = input.nextFloat();
                float sonuc = substraction(x, y);
                System.out.println(sonuc);
            } else if (userChoice == 3) {
                System.out.println("1. sayıyı giriniz");
                float x = input.nextFloat();
                System.out.println("2. sayıyı giriniz");
                float y = input.nextFloat();
                float sonuc = multiplicatin(x, y);
                System.out.println(sonuc);

            } else if (userChoice == 4) {
                System.out.println("1. sayıyı giriniz");
                float x = input.nextFloat();
                System.out.println("2. sayıyı giriniz");
                float y = input.nextFloat();
                float sonuc = division(x, y);
                System.out.println(sonuc);

            } else if (userChoice == 5) {
                System.out.println("Hoşçakalın");
                break;

            }else {
                System.out.println("geçersiz bir seçim yaptınız");
            }
        }


    }
}