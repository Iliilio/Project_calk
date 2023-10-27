import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите выражение с двумя переменными, разделяя операнды и оператор пробелами (избегая дублирования пробелов)");
        String input = in.nextLine();
        String finalResult = calc(input);
        System.out.println("Результат "+ finalResult);
    }
    public static String calc(String input) throws Exception {
        String[] variables = input.split(" ");
        if (variables.length != 3) {
            System.out.println("Возможно только 2 операнда");
            throw new Exception();
        }
        int finalResult;
        int op1 = Integer.parseInt(variables[0]);
        int op2 = Integer.parseInt(variables[2]);
        String od = variables[1];

        if(op1 > 10 || op2 > 10 || op1 < 1 || op2 < 1) {
            System.out.println("Операнды должны быть в диапазоне от 1 до 10");
            throw new Exception();
        } else {

            switch (od) {
                case "+":
                    finalResult = op1 + op2;
                    break;
                case "-":
                    finalResult = op1 - op2;
                    break;
                case "*":
                    finalResult = op1 * op2;
                    break;
                case "/":
                    finalResult = op1 / op2;
                    break;
                default:
                    System.out.println ("Возможны только операции с операторами '+','-',','*','/'");
                    throw new Exception();

            }
            return String.valueOf(finalResult);
        }


    }
}
