/**
 * Created by lenovo on 2017-01-08.
 */
public class Zad3 {

    public static void main(String[] args){

        double [] numbers2 = new double[100];

        int i = 0;
        double value = 0;
        while (value <= 3.0) {
            numbers2[i] = value;
            System.out.println(numbers2[i]);
            i++;
            value = value + 0.1;
        }
    }
}
