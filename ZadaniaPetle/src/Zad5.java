/**
 * Created by lenovo on 2017-01-08.
 */
public class Zad5 {
    public static void main(String[] args){

        int [] liczbyParzyste = new int[101];//dlaczego az 101 komorek musi miec tablica skoro zapisuje w niej tylko parzyste??

     int i = 0;
     int sum = 0;
     while (i < 101){
         if (i%2==0) {
             liczbyParzyste[i] = i;
             sum = sum + liczbyParzyste[i];
             System.out.println(i);
             i++;
         }else i++;
     }
        System.out.println(sum);

    }

}
