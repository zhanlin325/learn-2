import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入需要计算的整数（如：1+10）:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // System.out.println(input);
       
        /*
        10+1
        10-1
        10*1
        10/0  (除数不为 0)
         */
        if (input.contains("+")) {
            // System.out.println("+");
            long result = Add.add(input);
            System.out.println(result);

        } else if (input.contains("-")) {
            long result = Sub.sub(input);
            System.out.println(result);

        } else if (input.contains("*")) {
            long result = Mul.mul(input);
            System.out.println(result);

        } else if (input.contains("/")) {
            System.out.println("/");
        }


    }
}
