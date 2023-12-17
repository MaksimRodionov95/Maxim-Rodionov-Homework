import java.util.Random;

public class Lesson_2 {
    public static void main(String[] args) {
        Lesson_2.printThreeWords();
        Lesson_2.checkTheSumSign();
        Lesson_2.printColor();
        Lesson_2.compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkTheSumSign() {
        Random rand = new Random();
        int a = rand.nextInt();
        int b = rand.nextInt();
        int sum = a + b;
        System.out.println("Сумма = " + sum);
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        Random rand = new Random();
        int value = rand.nextInt(1100) - 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100 ) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
   public static void compareNumbers(){
       Random rand = new Random();
       int a = rand.nextInt();
       int b = rand.nextInt();
      String compare = a >= b? "a >= b" : "a < b";
      System.out.println(compare);
   }
}
