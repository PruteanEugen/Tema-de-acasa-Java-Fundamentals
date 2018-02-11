package md.tekwill.jf4.homework;

public class Exercise4 {

    /*
     * Write a Java program to print the result of the following operations. Go to the editor
     * Test Data:
     * a. -5 + 8 * 6
     * b. (55+9) % 9
     * c. 20 + -3*5 / 8
     * d. 5 + 15 / 3 * 2 - 8 % 3
     * Expected Output :
     * 43
     * 1
     * 19
     * 13
     */

    public static void main(String[] args) {
  //a.
        int num1 = -5;
        int num2 =  8;
        int num3 =  6;
        int rez_operatiei = -5+8*6;
        System.out.println("Rezultatul exertiului 1 este :" + rez_operatiei);
   //b.
         int number1 = 55;
         int number2 =  9;
         int rezutatul_sumei = (number1+number2) % number2;
        System.out.println("Rezultatul exertiului 2 este :" + rezutatul_sumei);

        //c.  semne de intrebare dc e 19 si nu 21

        int n1 = 20;
        int n2 = -3;
        int n3 =  5;
        int n4 =  8;
        int r_operatiei = n1+ -n2*n3 / n4;
        System.out.println("Rezultatul exertiului 3 este :" + r_operatiei);

     /* c. 20 + -3*5 / 8
                * d. 5 + 15 / 3 * 2 - 8 % 3  */


     //d.
        int numarul_1 = 5;
        int numarul_2 = 15;
        int numarul_3 = 3;
        int numarul_4 = 2;
        int numarul_5 = 8;
        int rez_oper = numarul_1+numarul_2 / numarul_3 *numarul_4 - numarul_5 % numarul_3;
        System.out.println("Rezultatul exertiului 4 este :" + rez_oper);

    }
}
