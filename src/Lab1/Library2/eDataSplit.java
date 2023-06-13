package Lab1.Library2;

public class eDataSplit {
    public static void splitAlphaNumeric(String jStr) {
        String str = jStr;
        StringBuilder myAlphabet = new StringBuilder();
        StringBuilder myNumeric = new StringBuilder();
        StringBuilder myPasskey = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) < 'z') ||
                    (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
                myAlphabet.append(str.charAt(i));
            else if (Character.isDigit(str.charAt(i)))
                myNumeric.append(str.charAt(i));
            else
                myPasskey.append(str.charAt(i));
        }
        System.out.println("Alphebet String is: " + myAlphabet);
        System.out.println("Numeric String is : " + myNumeric);
        System.out.println("Residual String is: " + myPasskey);
    }
}
