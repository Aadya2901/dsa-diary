import java.util.*;

public class PracticeQs4_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float bill = pencil + pen + eraser;
        float tax = bill * 0.18f; // 18% tax
        float totalBill = bill + tax;

        System.out.println("Bill (without tax): " + bill);
        System.out.println("Tax (18%): " + tax);
        System.out.println("Total bill (with tax): " + totalBill);

        sc.close();
    }
}
