import java.util.Random;

/**
 * Created by сергей on 08.12.2016.
 */
public class Student {
    String name = "Ron";
    String sName = "Weasley";
    int age = 24;
    Lang lang;
    Faculty fac ;


    @Override
    public String toString() {

        if(lang  == Lang.EN) System.out.print(name + " "  + sName + " "  + "is" + " " +age + " "  + "years old and studying at " + Faculty.GRYFFINDOR.nameEn + " "+ "faculty");
        else if (lang  == Lang.RU) System.out.println(name + " "  + sName + " " +age + " "  + "лет, студент факультета"+ " " +Faculty.GRYFFINDOR.nameRu);

        return "";
    }


}
