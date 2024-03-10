public class CalcUtil {

    public static int calculate(int x, int y, char operation) {

        int result = 0;

        switch(operation) {

            case '+':
                result = Calculator.addition(x, y);
                break;
            case '-':
                result = Calculator.subtraction(x, y);
                break;
            case '/':
                result = Calculator.division(x, y);
                break;
            case '*':
                result = Calculator.multiplication(x, y);
                break;
        }

        return result;
    }
    public static boolean resultOperation(String input) {

        boolean isChoiceEqualSign = false;

        if(input.equals("=")) {

            isChoiceEqualSign = true;
        }

        return isChoiceEqualSign;
    }
    public static boolean isOperation(String input) {

        boolean isChoiceOperation = false;

        if(input.equals("/") || input.equals("*") ||
                input.equals("+") || input.equals("-")) {

            isChoiceOperation = true;
        }

        return isChoiceOperation;
    }
    public static boolean isInputNumber(String input) {

        boolean isNumber = false;

        if(input.equals("1") || input.equals("2") || input.equals("3") ||
                input.equals("4") || input.equals("5") || input.equals("6") ||
                input.equals("7") || input.equals("8") || input.equals("9")) {

            isNumber = true;
        }

        return isNumber;
    }
}
