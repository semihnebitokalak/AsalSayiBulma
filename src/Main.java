import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int sayi = 1;
//        int remainder = sayi % 2;
        // System.out.println(remainder);
        // Bir sayının başka bir sayıya bölümünden kalan operatöre remainder deriz.

        System.out.printf("Lütfen asallık durumunu kontrol etmek istediğiniz sayıyı giriniz >");
        int sayi = scanner.nextInt();

        boolean isAsal = true;
        if (sayi < 2){
            System.out.println("Geçersiz sayı girdiniz. En küçük asal sayi 2 dir.\n");
        }
        for (int i = 2; i < sayi; i++ ) {
            if (sayi % i == 0){
                isAsal = false;
            }
        }
        if (isAsal){
            System.out.println("The number is asal");
        }else{
            System.out.println("The number is not asal");
        }
    }
}