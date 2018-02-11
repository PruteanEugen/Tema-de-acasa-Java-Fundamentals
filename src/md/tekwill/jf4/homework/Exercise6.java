package md.tekwill.jf4.homework;

public class Exercise6 {

    /*
     * Write a Java program to compute the specified expressions and print the output. Go to the editor
     * Test Data:
     * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
     * Expected Output
     * 2.138888888888889
     */

    public static void main(String[] args) {
      double num1 = 25.5;
      double num2 = 3.5;
      double num3 = 40.5;
      double num4 = 4.5;
      double resultat = ((num1*num2-num2*num2) / (num3-num4));
        System.out.println("Rezultatul operatiei este :" + resultat);
    }
}
