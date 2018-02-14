import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Formula op = new Formula();
        String exp =  "{(A+B)-3}*5+[{cos(x+y)+7}-1]*4";
        if(op.testPair(exp)) System.out.println("수식이 올바릅니다");
        else System.out.println("수식이 올바르지 않습니다");
    }
}

class Formula {
    private String expression;
    private char testCh, openPair;

    public boolean testPair(String expression) {
        this.expression = expression;
        LinkedStack stack = new LinkedStack();
        for (int i = 0; i < expression.length(); i++) {
            testCh = expression.charAt(i);

            switch (testCh) {
                case '(':
                case '[':
                case '{':
                    stack.push(testCh);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) return false;
                    else {
                        openPair = stack.pop();
                        if ((openPair == ')') && (testCh != '(') ||
                                (openPair == ']') && (testCh != '[') ||
                                (openPair == '}') && (testCh != '{')) {
                            return false;
                        }
                        else break;
                    }
            }
        }
        return stack.isEmpty();
    }
}
