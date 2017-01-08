import java.util.Scanner;

/**
 * Created by lenovo on 2017-01-08.
 */
public class Zad4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);


            System.out.println("podaj punkt x ");
            int x = scan.nextInt();

            System.out.println("podaj punkt y ");
            int y = scan.nextInt();

            //System.out.println(x + "," + y);
            if (x > 0 && y > 0) {
                System.out.println("1-wsza cwiartka");
            } else if (x < 0 && y > 0) {
                System.out.println("2-ga cwiartka");
            } else if (x < 0 && y < 0) {
                System.out.println("3-cia cwiartka");
            }else if (x >00 && y < 0){
                System.out.println("4-ta cwiartka");
            } else
            System.out.println("pocztek ukladu wspolrzednych");


        }
}