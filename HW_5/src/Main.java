import javax.swing.*;
import  java.util.Arrays;

public class Main {

    String catsName[] = new String[10];
    public static void main(String[] args) {

        for (int i = 15; i < 25; i++){
            System.out.println(i);
        }
        for (int i = 33; i >= 15; i--){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        String[] catsName = {
                "Васька",
                "Кузя",
                "Барсик",
                "Мурзик",
                "Леопольд",
                "Бегемот",
                "Рыжик",
                "Матроскин"
        };

        for(int i = 0; i < catsName.length; i++) {
            System.out.print(catsName[i] + ",");
        }

        int [] ar = {};

        for (int i = ar.length-1; i >= 0 ; i --){
            System.out.println(ar[i]);
        }

        int [] ar1 = new int [20];
        for(int i = 0; i < ar1.length; i++){
                ar1[i]=( 2 + (i * 3));
            System.out.println(ar1[i]);
        }

        int [] ar2 = new int [15];
        for (int i = 0 ; i <= ar2.length; i++){
            for(int a = 4; a <= ar2.length; a ++) {
                ar2[i] = (2 * a) - 1;
                System.out.println(ar2[i]);
            }

        }
    }


//    public static void  Vision(String ar[]){
//        for(int i = 0; i < ar.length; i++){
//            System.out.print(ar[i]+ "," );
//        }
//
//    }

}
