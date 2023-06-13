package Lab2.Exercise1;

public class eBook {
    private String chapters[];
    private static final int DEFAULT_CHAPTERS = 3;

    public eBook() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++)
            chapters[i] = "n/a";
    }
    public eBook(String argument[]) {
        /* Construct the object with an array of chapter names */
        chapters = argument;
    }
    public String getChapter(int i) {
        /* return the chapter by the given index */
        return chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}