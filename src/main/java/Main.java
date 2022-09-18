import java.util.Scanner;

public class Main {
    static RomanToArabCon romanToArab = new RomanToArabCon();
    static Calculater calc = new Calculater();
    static Convert convert = new Convert();
    static Scanner scanner = new Scanner(System.in);
    static int num1, num2;
    static char operation;
    static int result;

    public static void main (String[] args) throws Exception {
        System.out.println("Enter your action like: 2+2 or I+I than press Enter");
        String scan = scanner.nextLine();
        char[] under_char = new char[10];
        for (int i = 0; i < scan.length(); i++) {
            under_char[i] = scan.charAt(i);

            switch (under_char[i]){
                case '+'-> operation = '+';
                case '-'-> operation = '-';
                case '*'-> operation = '*';
                case '/'-> operation = '/';
            }


        }
        String under_charString = String.valueOf(under_char);
        String[] blacks = under_charString.split("[+-/*]");
        String stable00 = blacks[0];
        String stable01 = blacks[1];
        String string03 = stable01.trim();
        num1 = convert.romanToNumber(stable00);
        num2 = convert.romanToNumber(string03);
        if (num1 < 0 && num2 < 0) {
            result = 0;
        } else {
            result = calc.calculated(num1, num2, operation);
            System.out.println("Romanian numbers");
            String resultRoman = romanToArab.convertIntegerToRoman(result);
            System.out.println(stable00 + " " + operation + " " + string03 + " = " + resultRoman);
        }
        num1 = Integer.parseInt(stable00);
        num2 = Integer.parseInt(string03);
        result = calc.calculated(num1, num2, operation);
        System.out.println("Arabian numbers");
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}

