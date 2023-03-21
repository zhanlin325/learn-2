public class Sub {

    public static long sub(String input) {
        // 10+1
        input = input.trim();
        // "+"
        String[] strings = input.split("-");
        // System.out.println(Arrays.toString(strings));

        Integer number1 = Integer.valueOf(strings[0]);
        Integer number2 = Integer.valueOf(strings[1]);

        return number1 - number2;
    }
}
