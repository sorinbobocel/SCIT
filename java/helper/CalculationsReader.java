package helper;

import exceptions.NoInputException;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculationsReader {

    public static void main(String[] args) {
        try {
            evaluateExpression();
        }catch (NoInputException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Nothing inserted, try again!");
        }
    }

       private static void evaluateExpression() throws NoInputException {

           Scanner scanner = new Scanner(System.in);

           String expression = scanner.nextLine();

           final String regex = "\\([^()]*\\)|[A-Z][a-z]+|[A-Z]";

           Pattern pattern = Pattern.compile(regex);
           Matcher matcher = pattern.matcher(expression);

           while (matcher.find()) {
               System.out.println("Match: " + matcher.group(0));
               for (int i = 1; i <= matcher.groupCount(); i++) {
                   System.out.println("Group " + i + ": " + matcher.group(i));
               }
           }
       }
    }


