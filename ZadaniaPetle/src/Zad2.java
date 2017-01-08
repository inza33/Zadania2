/**
 * Created by lenovo on 2017-01-08.
 */
public class Zad2 {
    public static void main(String[] args){

        int [] numbers = new int[5];
        numbers[0] = 2;
        numbers[1] = 4;
        numbers[2] = 6;
        numbers[3] = 7;
        numbers[4] = 8;

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
            i++;
        }
    }
}
