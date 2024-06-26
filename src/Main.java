import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        primitive types
        int age = 27;
        age = 30;
//        System.out.println(age);
        byte myNumber = 40;
        int viewCount = 1_234_423_435; // up to two billion
        long moreThanIntNumber = 4_565_456_456L; // for big numbers
//        System.out.println(moreThanIntNumber);
        float price = 10.99F; // adding f at the end will tell java it's float and not a double in which it considers by default.
        double morePrecisePrice = 10.899; // use this over float on more precise number representations.
        char latter = '!'; // always with single quote and only one character. but if we need to have more than one character we use string another data type with double quote.
        boolean isWatched = false;



//        reference types
//        date class
        Date today = new Date();
//        System.out.println(today.getTime());
//        System.out.println(today.toString());

//        strings
        String myName = "Samson";
//        System.out.println(myName.replace("S","s"));
//        System.out.println(myName.toLowerCase());
//        System.out.println(myName.toUpperCase());
//        System.out.println(myName.length());
//        System.out.println(myName.startsWith(("S")));
//        System.out.println(myName.endsWith(("S")));
//        System.out.println(myName.indexOf("S"));
//        System.out.println(myName.trim());
        // scape  sequences
//        System.out.println("Samson said \" ...\""); // for aome qoutes
//        System.out.println("c:\\Windows\\ ..."); // for representing paths
//        System.out.println("today is \n Saturday"); // for adding new line
//        System.out.println("\t is a Dog"); // for using tabs

//        arrays
//        String [] myArrays = {"one","two","three"};
//        Arrays.sort(myArrays);
//        System.out.println(Arrays.toString(myArrays));
//        System.out.println(myArrays.length); // arrays in java have a fixed length
//        // multi-dimensional array
//        int [][] twoDimeArray = {{1,2}, {3,4}};
//        System.out.println(Arrays.deepToString((twoDimeArray)));


        // constants
        final float pi = 3.24f; // we can't change the pi, because final will make then constants.

        // Artimatic ---> uses basic principle of maths
        int intResult = 10 / 3; // this will return 3, and don't include the decimals.
//        double result = (double) 10 / (double) 3; // to get the decimal result of the operation
        int x = 1;
        x = x+2;
        x += 2; // compound

        // Casting, Conversions (only happens for compatible types)
        // Implicit casting
        // byte > short > int > long > float > double
        double y = 1.1;
        double r = y + 2; // ---> 3.1 (double)
        // explicit casting
        double z = 1.1;
        int d = (int)z + 2; // double z is now converted to integer
        String numString = "1";
//        int covStringToInt = Integer.parseInt(numString); // only for string int
        double covStringToDouble = Double.parseDouble(numString); // for string int and double
//        System.out.println(covStringToInt);
        System.out.println(covStringToDouble);

        // Maths Class
        double rounded = Math.ceil(1.34f);
        double random = Math.random() * 100;
        System.out.println(random);
        System.out.println(rounded);

        // Number formating classes
        String percentFormat = NumberFormat.getPercentInstance().format(0.1);
        String currencyFormat = NumberFormat.getCurrencyInstance().format(1_342_234.34);
        System.out.println(currencyFormat);
        System.out.println(percentFormat);

        // reading imputes
//        Scanner geussTheNumber = new Scanner(System.in); // terminal source
//        System.out.print("enter your number:");
//        String enteredValue = geussTheNumber.next(); // only takes one word
//        String enteredValue = geussTheNumber.nextLine(); // takes the entire line
//        int enteredValue = geussTheNumber.nextInt(); // to takes the integers
//        byte enteredValue = geussTheNumber.nextByte(); // to takes the bytes

//        System.out.println("your lucky number is : " + enteredValue); // printing on the terminal


        // Project One (small)
        // Mortgage Calculator

//        double result = Math.pow(2,3);
//        System.out.println(result);
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in); // the amount of the loan
//        System.out.print("Principal : ");
//        double principalValue = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate : ");
//        double monthlyInterestRate = (scanner.nextDouble() / PERCENT) / MONTHS_IN_YEAR;
//
//        System.out.print("Period (Years) : ");
//        int periodValue = scanner.nextInt();
//
//        double monthlyMortgageNominator = principalValue * (monthlyInterestRate * Math.pow((1+monthlyInterestRate),(periodValue *MONTHS_IN_YEAR) ));
//        double monthlyMortgageDenominator =  Math.pow((1.0+monthlyInterestRate),(periodValue * MONTHS_IN_YEAR) ) - 1;
//
//        double monthlyMortgage = monthlyMortgageNominator / monthlyMortgageDenominator;
//
//        System.out.print("Mortgage: " + NumberFormat.getCurrencyInstance().format(monthlyMortgage));


        // Control flow
        // if statements in java
//        int temprature = 32;
//        if(temprature > 30){
//            System.out.println("It's a hot day");
//            System.out.println("Drink water");
//        }else if(temprature > 20 && temprature <=30){
//            System.out.println("Beautiful day");
//        }else {
//            System.out.println("Cold day");
//        }

        // simplified boolean value
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);

        // ternary operator
        int income = 100_000;
        String className = income>100_00 ? "First Class" : "Economy";

        // switch case / flow
//        String role = "Admin";
//        switch (role){
//            case "Admin":
//                System.out.println("You're an Admin");
//                break;
//            case "Moderator":
//                System.out.println("You're a Moderator");
//                break;
//            default:
//                System.out.println("You're a Guest");
//        }

        // Fizz Buzz
        // 5 -- fizz, 3 -- buzz, 3&5 --- fizzbuzz
//        System.out.print("Enter Number : ");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        if(num % 5 == 0 && num % 3 == 0){
//            System.out.println("FizzBuzz");
//        }else if(num % 5 == 0){
//            System.out.println("Fizz");
//        }else if(num % 3 == 0){
//            System.out.println("Buzz");
//        }else{
//            System.out.println(num);
//        }







//     Loops
//        For Loop
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        // While Loop
        // terminate with quite (project)
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){  // since string is reference type, "quite" != "quite"
            System.out.println("Command >>");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}