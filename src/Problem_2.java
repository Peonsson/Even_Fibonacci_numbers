/**
 * Created by Peonsson on 2015-09-11.
 */
public class Problem_2 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 2;
        int memory;
        int total = 0;
        int sum = 2;

        //whose values do not exceed four million
        while(total < 4000000) {
            total = number1 + number2;
            //find the sum of the even-valued terms
            if((number1 + number2) % 2 == 0) {
                sum = sum + number1 + number2;
            }

            //reassign number1 and number2
                memory = number1;
                number1 = number2;
                number2 = memory + number1;
        }
        System.out.println(sum);
    }
}
