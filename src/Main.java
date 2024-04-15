import java.util.Scanner;
public class Main {
    static int power(int sub, int pow) {
        if (pow == 0) {
            return 1;
        }
        return sub * power(sub , pow -1);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sub,pow,result;
        System.out.print("Taban değeri giriniz : ");
        sub = inp.nextInt();
        System.out.print("Üs değeri giriniz : ");
        pow = inp.nextInt();
        result = power(sub,pow);
        System.out.println("Sonuc : "+ result);

    }
}