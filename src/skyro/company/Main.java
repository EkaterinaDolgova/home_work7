package skyro.company;
import java.util.Arrays;
public class Main {
    // Массив случайных чисел
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        //Задание №1
        java.util.Random random = new java.util.Random();
         int[] arr = new int[30];
         int sumArr = 0;
         int minArr = 0;
         int maxArr = 0;
         for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
         for (int i=0;i < arr.length; i++){
             sumArr= sumArr + arr[i];
         }
         System.out.println("Сумма трат за месяц составила " + sumArr + " рублей");
         //Задание №2
         for (final int current : arr){
             if (current >maxArr){
                 maxArr=current;
             }
         }
        System.out.println("Максимальная сумма трат за день составила " + maxArr+ " рублей");
        for (final int current : arr){
            if (current <minArr){
                minArr=current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minArr+ " рублей");
        //Задание №3
        double averageNumber = 0;
        for (int i=0;i < arr.length; i++){
            sumArr= sumArr + arr[i];
        }
        averageNumber = sumArr/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageNumber+ " рублей");
        //Задание №4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i1 = reverseFullName.length-1; i1>=0;i1--){
            System.out.print(reverseFullName[i1]);
        }

   }
}
