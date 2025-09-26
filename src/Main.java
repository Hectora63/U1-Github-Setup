import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Total Spent:");
        double totalAmount= scan.nextDouble();
        System.out.println("$" + totalAmount);

        scan.nextLine();

        System.out.print("Tip %:");
        double tipPercent = (scan.nextDouble() * 0.01);
        scan.nextLine();
        System.out.println((int)(tipPercent*100) + "%");

        System.out.print("Party size:");
        int partySize = scan.nextInt();
        scan.nextLine();
        System.out.println(partySize + " People");

        double tipPer = (totalAmount * tipPercent)/ partySize;
        System.out.println("Tip per person:");
        System.out.printf("$" + "%.2f", tipPer);
        System.out.println();


        double amtPer = (totalAmount/partySize) + tipPer;
        System.out.println("Amount Per Person:");
        System.out.printf("$" + "%.2f", amtPer);


        scan.close();
    }
}
