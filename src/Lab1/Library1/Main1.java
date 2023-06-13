package Lab1.Library1;

import Lab1.Library2.*;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("e-Mathematics function using recursion algorithm");
        System.out.println("================================================");
        System.out.println("===> Function 101: Compute b to power n...");
        int b = 3;
        int n = 12;
        System.out.println("......"+b+" to power "+n+" = "+eMath.Power(b,n));
        System.out.println("Data split function: Alphabet & numeric data");
        System.out.println("============================================");
        String istr = "23Da*is5y*0El1#e3$an3or/8";
        eDataSplit.splitAlphaNumeric(istr);
    }
}
