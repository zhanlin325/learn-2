public class Mul {
    public static long mul(String input) {
        // 10+1
        input = input.trim();
        // "+"
        String[] strings = input.split("\\*");
        // System.out.println(Arrays.toString(strings));

        int number1 = Integer.parseInt(strings[0]);
        int number2 = Integer.parseInt(strings[1]);

        return (long) number1 * number2;
    }

}
