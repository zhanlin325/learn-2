
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入需要计算的整数（如：1+10）:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        long result = 0;
        // System.out.println(input);
       
        /*
        10+1
        10-1 
        10*1
        10/0  (除数不为 0)
         */
        if (input.contains("+")) {
            // System.out.println("+");
             result = Add.add(input);

        } else if (input.contains("-")) {
             result = Sub.sub(input);

        } else if (input.contains("*")) {
             result = Mul.mul(input);

        } else if (input.contains("/")) {
             result = Div.div(input);
        }
        System.out.println(result);
    }
}
