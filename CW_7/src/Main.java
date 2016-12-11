public class Main {

    public static void main(String[] args) {
        int day = 5;
        card(2);
        trio(4);
        email("denis.kivalov@gmail.com");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tursday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thurthday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Suturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;





        }
    }

    static void card(int cd){
        switch (cd){
            case 1 :
                System.out.println("Pika");
                break;
            case 2 :
                System.out.println("Trefi");
                break;
            case 3 :
                System.out.println("Bubi");
                break;
            case 4 :
                System.out.println("Chervi");
                break;
        }
    }
    static void trio(int col){
        for(int i= 1; i<=col;i++){
            if(i != 1 && i !=col) System.out.println("*    *");
            else System.out.println("******");
        }


    }
    static  String email(String email){
        System.out.println(email.substring(0, email.indexOf("@")));
     return email;
    }
}
