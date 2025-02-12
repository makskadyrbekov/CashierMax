import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(" Would you like to buy anything else ? (yes/no)  :");
            String answer = scanner1.nextLine();
            if (answer.equals("yes")) {
                System.out.println(" What is the item's price? : ");
                double price = scanner.nextDouble();
                System.out.println(" How much money do you have? : ");
                double myMoney = scanner.nextDouble();

                if (price > myMoney) {
                    System.out.println(" Sorry!  You don't have enough money !");
                    break;
                }
                if (myMoney > price) {
                    System.out.println(" Thank you for shopping with us! ");
                    System.out.println("Your change is : ");
                    System.out.println(myMoney - price);
                }

            } else if (answer.equals("no")) {
                System.out.println(" Okay,  Thank you ! ");
                break;

            }
        }
    }
}






