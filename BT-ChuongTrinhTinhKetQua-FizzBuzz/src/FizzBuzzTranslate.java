public class FizzBuzzTranslate {
    public static String traslate(int number) {
        if (number < 0) {
            return "ko hop le";
        } else {
            if (number % 3 == 0) {
                return "fizz";
            } else if (number % 5 == 0) {
                return "Buzz";
            } else if (number % 3 == 0 && number % 5 == 0) {
                return "FizzBuzz";
            } else {
                return "number : " +number;
            }
        }
        if()
    }
}
