import java.util.Scanner;

public class FirstProgramm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Задайте нижнюю границу промежутка: ");
            int min = in.nextInt();
            System.out.print("Задайте верхнюю границу промежутка: ");
            int max = in.nextInt();
            int[] randomArray = new int[25];
            System.out.println("Массив, заполненный случайными числами");
            for(int i=0;i<randomArray.length;i++) {
                randomArray[i] = randomIntBetweenRandom(min, max);
                System.out.print(randomArray[i]+" | ");
            }
            boobleSort(randomArray);
            System.out.println("\nОтсортированный массив");
            for(int element : randomArray) {
                System.out.print(element + " | ");
            }
        }catch (Exception e){
           System.out.println("Верхняя и нижняя границы должны быть целыми числами");
        }
    }

    public static int randomIntBetweenRandom(int min, int max){
        return (int)((Math.random() * (max - min + 1)) + min);
    }

    public static void boobleSort(int[] array){
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i]>array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }
}
