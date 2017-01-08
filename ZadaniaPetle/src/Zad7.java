import java.util.Scanner;

/**
 * Created by lenovo on 2017-01-08.
 */
public class Zad7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String [] namesTable = new String[5];

        int i = 0;
        while (i < namesTable.length){
            System.out.println("podaj imie");
            //String userInputname = scan.nextLine();
           //namesTable[i] = userInputname;
            namesTable[i] = scan.nextLine();
            i++;
        }
        int j = namesTable.length - 1;
        while (j > 0) {
            System.out.println("czesc" + " " + namesTable[j]);
            j--;
        }



    }
}
