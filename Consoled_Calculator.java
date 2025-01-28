
import java.util.Scanner;

public class Consoled_Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SHADOW FOX's ENHANCED CONSOLE BASED CALCULATOR");
        while (true) { 
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println();
            System.out.println("------------------------------------");
            System.out.println("Select your required operation:");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            System.out.println("5.SQUARE ROOT");
            System.out.println("6.POWER");
            System.out.println("7.TEMPERATURE CONVERTER");
            System.out.println("8.CURRENCY CONVERTER");
            System.out.println("9.EXIT");
            System.out.println("------------------------------------");
            System.out.println();
            System.out.print("Enter your Choice:");
            int choice = sc.nextInt();

            switch(choice){
                case 1 -> Add(sc);
                case 2 -> Difference(sc);
                case 3 -> Multiplication(sc);
                case 4 -> Division(sc);
                case 5 -> SquareRoot(sc);
                case 6 -> Power(sc);
                case 7 -> TempConverter(sc);
                case 8 -> CurrencyConverter(sc);
                case 9 -> {
                    System.out.println("Exiting. Thankyou!");
                    sc.close();
                    return;
                }
                default -> {
                    System.out.println("INVALID CHOICE!");
                }
            }
        }

        
    }

    public static void Add(Scanner sc){
        System.out.print("Number of integers you are willing to add? ");
        int time = sc.nextInt();
        double sum = 0;
        for (int i =1;i<=time;i++){
            System.out.print("Enter number ["+i+"]:");
            sum += sc.nextDouble();
        }
        System.out.println(sum);
    }


    public static void Difference(Scanner sc){
        System.out.print("Number of integers you are willing to subtract?");
        int time = sc.nextInt();
        System.out.println("Enter number 1:");
        double result = sc.nextDouble();
        for (int i =2;i<=time;i++){
            System.out.print("\nEnter number ["+i+"]:");
            result -= sc.nextDouble();
        }
        System.out.println(result);
    }

    public static void Multiplication(Scanner sc){
        System.out.print("Number of integers you are willing to Multiply?");
        int time = sc.nextInt();
        double product = 1;
        for (int i =1;i<=time;i++){
            System.out.print("\nEnter number ["+i+"]:");
            product *= sc.nextDouble();
        }
        System.out.println(product);
    }

    public static void Division(Scanner sc){
        System.out.println("Enter number 1:");
        double x = sc.nextDouble();
        System.out.println("Enter number 2");
        double y = sc.nextDouble();
        if (y != 0){
            System.out.println("The result is "+x/y);
        }else{
            System.out.println("Division by 0 isn't allowed.");
            return;
        }
    }

    public static void SquareRoot(Scanner sc){
        System.out.print("Enter the number: ");
        double num = sc.nextDouble();
        if (num >= 0) {
            System.out.println("Result: " + Math.sqrt(num));
        } else {
            System.out.println("Square root of a negative number is not real.");
        }
    }

    public static void Power(Scanner sc){
        System.out.print("Enter the base number:");
        double base = sc.nextDouble();
        System.out.print("Enter the Exponent number:");
        double pow = sc.nextDouble();
        System.out.println("Result is:"+Math.pow(base, pow));
    }

    public static void TempConverter(Scanner sc){
        System.out.println("1.Celcius to Farenhiet");
        System.out.println("2.Farenheit to Celcius");
        System.out.println("Enter option 1 or 2 (1-2)");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.print("Enter temperature in c:");
            double c = sc.nextDouble();
            double f = (c * 9/5)+32;
            System.out.println(c+" Celcius in farenhiet is "+f+"f");
        }else if(choice ==2){
            System.out.print("Enter temperature in f:");
            double f = sc.nextDouble();
            double c = (f-32)* 5/9;
            System.out.println(f+" Farenhiet in Celcius is "+c+"c");
        }else{
            System.out.println("INVALID CHOICE!");
            return;
        }
    }

    public static void CurrencyConverter(Scanner sc){
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to AUS");
        System.out.println("4. AUS to INR");
        System.out.print("Enter your Choice of Conversion(1-4)");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter amount in INR");
                double inr = sc.nextDouble();
                double usd = inr * 0.012;
                System.out.print("INR " + inr + "/- in USD is $"+ usd);
            }
            case 2 -> {
                System.out.println("Enter amount in USD");
                double usd = sc.nextDouble();
                double inr = usd * 84.569;
                System.out.print("USD $" +usd + " in INR is Rs." + inr);
            }
            case 3 -> {
                System.out.println("Enter amount in INR");
                double inr = sc.nextDouble();
                double aus = inr * 0.018;
                System.out.print("INR " + inr+ "/- in AUS is " +aus);
            }
            case 4 -> {
                System.out.println("Enter amount in AUS");
                double aus = sc.nextDouble();
                double inr = aus * 55.957;
                System.out.print("AUS " +aus + " in INR is Rs." + inr);
            }
            default -> System.out.println("INVALID CHOICE!");
        }
        
    }
}