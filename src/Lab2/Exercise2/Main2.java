package Lab2.Exercise2;

import Lab2.Exercise1.*;

public class Main2 {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Guru Java"};
        eBook b = new eBook(array);
        int k = 2;
        System.out.println("The title of Chapter " + k + " is " + b.getChapter(k-1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " + anotherArray.length + " chapters.");
        System.out.println(java.util.Arrays.toString(anotherArray));

        /* for exercise2: Add the following */
        Computer a = new MobileComputer();
        for (int i = 0; i < 10; i++)
            a.work();
        Charger c = new Charger();
        Phone p = new Phone();
        MobileComputer m = new MobileComputer();

        c.charge(p);
        /* c.charge(m); */
    }
}
