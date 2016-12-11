import java.util.Random;

/**
 * Created by сергей on 08.12.2016.
 */
public enum Faculty {
    GRYFFINDOR("Grifindor", "Грифиндор"), SLYTHERIN("Slytherin", "Слизерин"), HUFFLEPUFF("Hufflepuff", "Хафлпаф"), RAVENCLAW("Ravenclaw", "Рейвенкло") ;



    String nameEn;
    String nameRu;

    Faculty(String nameEn, String nameRu) {
        nameEn = this.nameEn;
        nameRu = this.nameRu;
    }
    static Faculty facul() {

        Faculty[] facul = Faculty.values();
        Faculty f = Faculty.RAVENCLAW;
        Random random = new Random();
        switch (random.nextInt(facul.length)) {
            case 0:
                return  Faculty.GRYFFINDOR;

            case 1:
                return  Faculty.SLYTHERIN;

            case 2:
                return  Faculty.HUFFLEPUFF;

            case 3:
                return Faculty.RAVENCLAW;

        }

        return f;
    }
}

