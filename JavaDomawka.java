import java.util.Scanner;

public class JavaDomawka {
    //First level: Level1:
    //Считывается 2 числа, произвести все арифм. операции с ними
    //(поделить, умножить, сложить, вычесть)

   public static void main(String[] args) {

      Scanner AG = new Scanner(System.in);

      int I = AG.nextInt();
      int II = AG.nextInt();

      System.out.println(I + II);
      System.out.println(I - II);
      System.out.println(I * II);
      System.out.println(I / II);

        //Level2:
        //С консоли вводится трехзначное число. Найдите в нем первую, вторую и третью цифры.
        // Используйте при этом / и (или) %

       Scanner GA = new Scanner(System.in);
       int ag = GA.nextInt();
       System.out.println(ag % 10);
       System.out.println(ag / 100);
       System.out.println(ag/100);



    }
}
