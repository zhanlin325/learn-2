public class Div {
    public static long div(String input) {
        // 10+1
        input = input.trim();
        // "+"
        String[] strings = input.split("/");
        // System.out.println(Arrays.toString(strings));

        int number1 = Integer.parseInt(strings[0]);
        int number2 = Integer.parseInt(strings[1]);

        if (number2 == 0) {
            throw new RuntimeException("can not divide by zero");
        }
        return (long) number1 / number2;

    }
}
