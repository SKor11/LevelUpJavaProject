public class Main {

    public static void main(String[] args) {

       // star("Longer");
//        colum("dne");
//        summP(50);
//        bank(1000, 5);
//        letter(4,8,7,7);
//        weght(10);
//        culc(25.5);
//        am();
       // mark();
    }

/*1. Дано слово. Добавить к нему в начале и конце столько звездочек, сколько букв в этом слове.*/

    static String star(String name){
        String res = "result";
        String [] s = new String[name.length()];
        for(int i = 0; i<= s.length; i++){
            s[i] = "*";
            System.out.print(s[i]);
        }
        System.out.print(name);
        for(int i = 0; i<= s.length; i++){
            s[i] = "*";
            System.out.print(s[i]);
        }
        return(res);
    }
    /*  2.  Дано название футбольного клуба. Напечатать его на экране "столбиком".*/
    static void colum(String club){
        for (int i =1; i <= club.length();i++){
            System.out.println(club);
        }
    }

    /*3. Найти сумму положительных нечетных чисел, меньших 50.*/
    static void summP(int ch){
        int res = 0;
        int [] j = new int[ch];
        for (int i = 0; i <= ch; i++){
            if (i>0 && ((i%2!=0)) ) j[i] = i;
        }

        for(int i=0; i<j.length; i++) {
            res= res+j[i];
        }
        System.out.println(res);

    }

    /*4. Вася открыл счет в банке 1 марта, вложив 1000 грн. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
    а) прирост суммы вклада за каждый месяц с 1-го марта до конца года;
    б) сумму вклада через: полгода, 2 года, 5 лет.*/

    static void bank (double sum, double time){

        for (int i = 0; i<= time*12;i++ ){
            sum =sum + ((sum * 2)/100);
        }
        System.out.println(sum);
    }

    /* 5.Определить, войдет ли в конверт с внутренними размерами a и b мм прямоугольная открытка размером с и d мм.
    Для размещения открытки в конверте необходим зазор в 1 мм с каждой стороны*/

    static void letter (int a,int b,int c, int d){
        if(a <(c-1) && b < (d-1)) System.out.println("Posted");
        else System.out.println("not posted");

    }

    /*  6. Даны два различных вещественных числа. Определить наибольшее из них применив один неполный условный оператор.*/

    static void grater(double a, double b ){
        String res;
        res = (a < b ) ? "a < b": "b < a";
        System.out.println(res);
    }

   /* Записать условие, которое является истинным, когда:
    a) только одно из чисел А и В четное;
    б) хотя бы одно из чисел А и В положительно;*/

    static void chet(int a,int b){
        if( a % 2 <= 0 | b % 2 <= 0 ) System.out.println("True");
    }
    static void pol (int a, int b){
        if (a>= 0 || b >= 0 ) System.out.println("True");
    }

   /* Напечатать таблицу соответствия между весом в фунтах и весом в килограммах для
    значений 1, 2, ..., 10 фунтов (1 фунт = 453 г). */
    static void weght(int w){
        int res;
        for (int i = 1; i <=w;i++){
            res = i * 453;
            System.out.println(i+"Фунт = "+ res+"г");
        }
    }

   /* Напечатать таблицу перевода 1, 2, ... 20 долларов США в гривны по текущему курсу
   (значение курса вводится с клавиатуры). */
    static void culc (double curse){
        double res;
        for (int i= 1; i <=20; i ++ ){
            res = i * curse;
            System.out.println(i +" USD = " + res+ " UAH" );
        }
    }

    /*Одноклеточная амеба каждые 3 часа делится на 2 клетки.
     Определить, сколько клеток будет через 3, 6, 9, ..., 24 часа, если первоначально была одна амеба.
      */
    static void am(){
        int am = 1;
        for (int i  = 3; i<= 24; i+=3){
            am = am *2;
            System.out.println(i +" hour = " + am);
        }

    }


    /*В массиве записаны оценки по информатике 22 учеников класса.
      Определить количество учеников, оценка которых меньше средней оценки по классу,
      и вывести номера элементов массива, соответствующих таким ученикам.
     */

    static void mark(){
        int [] mark = new int [22];
        int sum = 0;
        int mid;
        int res;
        int j = 0;
        for (int a= 0; a<=mark.length; a++){
            if (a%2 == 0) mark[a] = 4;
            else if (a % 3 == 0) mark[a] = 5;
            else mark[a] = 2;
        }

        for(int i = 0; i<= mark.length; i++){
            sum = sum + mark[i];
            mid = sum / mark.length;
            if (mark[i]< mid) {
                res = j++;
                System.out.println(j);
                System.out.println(mark[i - 1]);
            }
        }


    }

    /*
    Дан массив целых чисел. Определить количество четных элементов и количество элементов, оканчивающихся на цифру 5.
     */
    static void count(int[]ar){
        int res = 0;
        int j= 0;
        int g=0;
        for (int i =0; i<= ar.length; i++){
            if (ar[i]%2 != 0) j++;
            if (((ar[i]%10) + 5) == 5) g++;
        }

    }
}


