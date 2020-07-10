import java.util.Scanner;

/**
 * Created by KPS on 7/10/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your sentence");
        String ss = scanner.nextLine();
        System.out.println("the converted message is : "+ convertorr(ss));

    }

    private static String convertorr(String ss) {
        String convert = "";
        Scanner lineScan = new Scanner(ss);
        while (lineScan.hasNext()){
            String word = lineScan.next();
            convert+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
       
        return convert;
    }
}
