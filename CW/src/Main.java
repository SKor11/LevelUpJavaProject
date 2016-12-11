public class Main {

    public static void main(String[] args) {
        isMons(6);
        isScore(3);
        witchIsGrater(15);
        wGrater(2,3);
        wlower(7,5);
        luck(123321);
    }


    void isEven(int x) {
        if (x % 2 == 0) System.out.println("Chetnoe");
        else System.out.println("ne chet");
    }

    public static void isMons(int x) {
        if (x == 9) System.out.println("hollyday");
        else System.out.println("work!!!!");
    }

    static void isScore(int score) {
        if (score == 3) {
            System.out.println("win");
        } else if (score == 1) {
            System.out.println("draw");
        } else if (score == 0) {
            System.out.println("loose");
        }
    }

    static String witchIsGrater(int num) {
        String res;
        if (num % 10 > num / 10) {
            System.out.println(res = "second grater");
        } else if (num % 10 == num / 10) {
            System.out.println(res = "equally");
        } else System.out.println(res = "firstmore");
        return res;
    }

    static String wGrater(double num1, double num2) {
        String res;
        if (num1 > num2) {
            System.out.println(res = "first grater");
        } else System.out.println(res = "second grater");
        return res;
    }

    static String wlower(double num1, double num2) {
        String res;
        if (num1 < num2) {
            System.out.println(res = "second grater");
        } else System.out.println(res = "first grater");
        return res;
    }
    static String luck(int num) {
        String res;
        int num1 = num / 10000;
        int num2 = num / 10000 % 10;
        int num3 = num / 1000 % 10;
        int num4 = num / 100 % 10;
        int num5 = num / 10 % 10;
        int num6 = num % 10000;

        if (num1 + num2 + num3 == num4 + num5 + num6) {
            System.out.println(res = "luck");
        } else System.out.println(res = "no luck");
        return res;
    }

}

