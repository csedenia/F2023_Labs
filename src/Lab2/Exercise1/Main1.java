/* package Lab2.Exercise1.eBook; */
public class Main1 {
    public static void main(String arg[]) {
        final String array[] = {"Basic Java", "Advanced Java", "Guru Java"};
        Lab2.Exercise1.eBook b = new Lab2.Exercise1.eBook(array);
        int k = 1;
        System.out.println("The title of Chapter "+k+" is "+b.getChapter(k-1));
        String anotherArray[] = b.getChapters();

        System.out.println("There are " + anotherArray.length + " chapters.");
        /* System.out.println(anotherArray) */
        System.out.println(java.util.Arrays.toString(anotherArray));
    }
    public boolean someLibraryMethod() { return true; }
}
