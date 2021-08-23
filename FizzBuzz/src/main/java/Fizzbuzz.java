import java.util.Arrays;

public class Fizzbuzz {

    public String generate(Integer upto) {
        String[] numbers = new String[upto];
        for (int i = 0; i < upto; ++i) {
            String number = numbers[i];
            if ( (i+1) % 3 == 0  && (i+1) % 5 == 0) {
                numbers[i] = "FizzBuzz";
            } else if ( (i+1) % 3 == 0) {
                numbers[i] = "Fizz";
            } else if ( (i+1) % 5 == 0) {
                numbers[i] = "Buzz";
            } else {
                numbers[i] = String.valueOf(i + 1);
            }
        }
        String message = String.join(", ", numbers);

    return message;
    }
}
