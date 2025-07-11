import java.util.Scanner;

public class BinToDec {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int originalBin = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum /= 10;
        }

        System.out.println("Decimal of " + originalBin + " = " + decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binNum = sc.nextInt();

        binToDec(binNum);

        sc.close();
    }
}
