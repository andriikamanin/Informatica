import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void generareArrayCasuale(int[] arr, int size){
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(71) - 20;
        }
    }

    public static void outputArray(int[] arr, int size){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
            if((i+1)%10==0){
                System.out.println();
            }

        }
    }

    public static void reverseArray(int[] arr, int size){
        int left = 0;
        int right = size - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println("Array dopo reverse: ");
        outputArray(arr, size);
    }

    public static void multiploPer3(int[] arr, int size){
        int conto = 0;
        for(int i = 0; i < size; i++){
            if(arr[i] % 3 == 0){
                conto++;
            }
        }
        System.out.println("I numero multipli di 3 sono " + conto);
    }

    public static void findDuplicates(int[] arr) {
        // Создаем HashMap для хранения элементов и их количества
        Map<Integer, Integer> elementCount = new HashMap<>();

        // Заполняем HashMap, считая количество каждого элемента
        for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        // Выводим элементы, которые встречаются более одного раза
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (" + entry.getValue() + ")");
            }
        }
    }


    public static void main(String[] args) {
        final int SIZE = 100;
        int[] arr = new int[SIZE];
        generareArrayCasuale(arr, SIZE);
        outputArray(arr, SIZE);
        reverseArray(arr, SIZE);
        multiploPer3(arr,SIZE);
        findDuplicates(arr);
    }
}