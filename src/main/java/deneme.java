import java.util.Random;
import java.util.Scanner;

public class deneme{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Sayi tahmin oyununa hoş geldiniz!");
        System.out.println("Lütfen 1-100 arasinda bir sayi giriniz: ");
        //Kullanıcıdan sayı alıyoruz.

        int tahmin = input.nextInt();
        // Bilgisayardan rastgele sayı alıyoruz.
        int sayi = rnd.nextInt(101);
        while (tahmin != sayi) {
            if (tahmin < 0 || tahmin > 100) {
                System.out.println("1 ile 100 arasinda bir değer giriniz: ");
                tahmin = input.nextInt();
            } else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayi giriniz: ");
                tahmin = input.nextInt();
            } else {
                System.out.println("Daha küçük bir sayi giriniz: ");
                tahmin = input.nextInt();
            }
        }
        // Eğer sayımız ve tahmin edilen sayı  birbirine eşit ise while döngüsüne girmez
        // ve print komutunu yazdırırız.
        System.out.println("Tebrikler! kazandınız :)");
    }

}