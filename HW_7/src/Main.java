public class Main {

    public static void main(String[] args) {
//        dayOfMonth("Не высокосный", 15);
//        card(5, 16);
        calendar(8);
//        calendar2(9,6) ;
//        revers("butter" );
//        emailCheck("ser4@qw.com");
//        arrayStr2(new String[]{"ar", "atynd", "shdjasd", "aa", "anjas", "a"});
    }

    /* Составить программу, которая в зависимости от порядкового номера месяца (1, 2, ..., 12) выводит на экран количество дней в этом месяце.
    Рассмотреть два случая:
1) год не является високосным;
2) год может быть високосным (информация об этом вводится в аргументы при запуске программы).*/
    static int dayOfMonth(boolean year, int month) {
        int bigmonth = 31;
        int littlemonth = 30;

            switch (month) {
                case 1:case 3: case 5: case 7: case 8: case 10: case 12: return  bigmonth;

                case 2: return Visokosniy(year);

                case 4: case 6:case 9:case 11:return littlemonth;

                default:
                    return 0000;

            }

    }
    static  int Visokosniy (boolean year){
        int feb = 0;
        if (year = true) feb = 29;
        else  feb = 28;
       return feb;
    }
/*Мастям игральных карт условно присвоены следующие порядковые номера:
 масти "пики" — 1, масти "трефы" — 2, масти "бубны" — 3, масти "червы" — 4,
 а достоинству карт: "валету" — 11, "даме" — 12, "королю" — 13, "тузу" — 14
 (порядковые номера карт остальных достоинств соответствуют их названиям: "шестерка", "девятка" и т. п.).
  По заданным номеру масти m (1 <= m <=  4) и номеру достоинства карты k (6 <= k <= 14)
   определить полное название (масть и достоинство) соответствующей карты в виде "Дама пик", "Шестерка бубен" и т. п.
*/

    static String card(int m, int k) {
        String mast = "";
        if (m == 1) {
            mast = "пик";
        } else if (m == 2) {
            mast = "треф";
        } else if (m == 3) {
            mast = "бубны";
        } else if (m == 4) {
            mast = "червы";
        } else return ("Нет такой масти");

        switch (k) {
            case 6:
                return ("Шестерка " + mast);
            case 7:
                return ("Семерка " + mast);
            case 8:
                return ("Восьмерка " + mast);
            case 9:
                return ("Девятка " + mast);
            case 10:
                return ("Десятка " + mast);
            case 11:
                return ("Валет " + mast);
            case 12:
                return ("Дама " + mast);
            case 13:
                return ("Король " + mast);
            case 14:
                return ("Туз " + mast);
            default:
                return (" Нет такой карты " + mast);
        }


    }

    /*Дано целое число k (1 <= k <= 365). Определить, каким днем недели (понедельником, вторником, ..., субботой или воскресеньем)
    является k-й день невисокосного года, в котором 1 января:
    а) понедельник;
    б) i-й день недели (если 1 января — понедельник, то d=1 , если вторник — d=2, ..., если воскресенье —  d= 7).
    */
    static String calendar(int k) {
        int rez = k % 7;
        switch (rez) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 0:
                return "Воскресение";
        }
        return  "noone";
    }

    static void calendar2 (int k, int d){
        int result =0;
        if(d == 1){
            result = k%7;
        }
        else if(d == 2){
            result = k%7 + 1;
        }
        else if(d == 3){
            result = k%7 + 2;
        }
        else if(d == 4){
            result = k%7 + 3;
        }
        else if(d == 5){
            result = k%7 + 4;
        }
        else if(d == 6){
            result = k%7 + 5;
        }
        else if(d == 7){
            result = k%7 + 6;
        }
        else System.out.println("нет такого дня");

        switch (result){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 0:
                System.out.println("Воскресение");
                break;
            case 7:
                System.out.println("Воскресение");
                break;
            case 8:
                System.out.println("Понедельник");
                break;
            case 9:
                System.out.println("Вторник");
                break;
            case 10:
                System.out.println("Среда");
                break;
            case 11:
                System.out.println("Четверг");
                break;
            case 12:
                System.out.println("Пятница");
                break;

            default:
                System.out.println(" not correct");

        }

    }

   /*Напишите программу для перевода чисел от 1 до 10 в строковое значение. Например, для числа 1 результатом будет строка “one”.*/

    static String numToStr (int d){
        switch (d){
            case 1 :
                return("one");
            case 2 :
                return ("two");

            case 3 :
                return ("three");

            case 4 :
                return ("four");

            case 5 :
                return ("five");

            case 6 :
                return ("six");

            case 7 :
                return ("seven");

            case 8 :
                return ("eight");

            case 9 :
                return ("nine");

            case 10 :
                return ("ten");

        }
        return ("No match");
    }

    /*Дана строка. Написать программу, которая возвращает строку, написанную в обратном порядке.*/
    static char revers (String str){
        char [] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--){
            return (arr[i]);
        }
        return 'n';
    }


    /*Дан email в виде строки. Написать программу для проверки email на валидность.
        email должен соответствовать условию (пример - emailaddr@domain.zone)
        1)	emailaddr > 4 символов
        2)	1 < domain < 10
        3)	2 <= zone < 5
        При любом несовпадении с условием выводим в консоль сообщение с указанием на конкретную ошибку.*/

    static void emailCheck(String email){
        char [] e = email.toCharArray();
        int j = 0;
        int a = 0;
        int all = 0;
        int ver = 0;
        for (int b = 0; b<= e.length; b++ ){
            all = all+1;
        }
        for (int i = 0; i <= email.indexOf("@"); i++){
            j= j + 1;
        }
        for (int q = 0; q <= email.indexOf("."); q++){
            a= a + 1;
        }

        String name = email.substring(0, j-1);
        String domain = email.substring(j , a-1);
        String zone = email.substring(a , all-1);



        if(name.length()<4){
            System.out.printf("Not enough. name simbols <4");;
        }
        if ((domain.length()-1)<1 || domain.length()>=10){
            System.out.println("domain is not correct");
        }
        else if (zone.length()<2 || zone.length()>+5){
            System.out.println("zone is not correct");
        }
        else System.out.println("email is correct");
    }

    /*Дан массив строк. Написать программу, которая:
а) выводит на экран значение всех строк через запятую, длина которых больше n.
б) выводит на экран значение всех неповторяющихся строк через запятую.*/
    static void arrayStr1(String [] arr, int n){
        StringBuilder builder = new StringBuilder();
        for(int i =0; i<= arr.length; i ++){
            if(arr[i].length()>n) builder.append(arr[i]+",");
        }
        String res = builder.toString();
        System.out.println(res);
    }
    static void arrayStr2(String [] arr){
        for(int i =0; i<= arr.length; i ++){
            if(arr[i].equalsIgnoreCase(arr[i+1])) System.out.print(arr[i]+",");
        }
    }


}



