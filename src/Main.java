import java.util.Arrays;
import java.util.Date;

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
        String [] myArrays = {"one","two","three"};
        Arrays.sort(myArrays);
        System.out.println(Arrays.toString(myArrays));
        System.out.println(myArrays.length); // arrays in java have a fixed length
        // multi-dimensional array
        int [][] twoDimeArray = {{1,2}, {3,4}};
        System.out.println(Arrays.deepToString((twoDimeArray)));




//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }
}