package stack;

public class Helper {

    public static boolean isOperator(char x) {
        return switch (x) {
            case '+', '-', '*', '/', '^', '%' -> true;
            default -> false;
        };
    }

    public static boolean isOpeningBracket(char x) {
        return switch (x) {
            case '(', '{', '[', '/' -> true;
            default -> false;
        };
    }
}
