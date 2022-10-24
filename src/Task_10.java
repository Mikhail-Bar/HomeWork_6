import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_10 {
    static int size;

    public static void main(String[] args) {
        System.out.print("Enter size Array: ");
        size = EnterSize();
        int arr[] = new int [size];
        Randomize(arr);
        PrintArr(arr);
        ModNull(arr);
    }
    public static int EnterSize(){
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        return size;

    }
    static void Randomize(int arr[]){
        Random random = new Random();
        for (int i = 0; i < size; i++)
            arr[i] = random.nextInt(33)+1;
    }
    static void PrintArr(int arr[]){
        System.out.print(Arrays.toString(arr));
    }

    static void ModNull(int arr[]){

        boolean flag = true;

        for (int i = 1; i < size-1; i++) {
            if (arr[i]%arr[i-1] == 0 && arr[i]%arr[i+1] == 0) {
                System.out.printf("Index: %d,  Digits: %d", i, arr[i]);
                flag = false;
            }
        }
        if (flag)

            System.out.println("\nArray element not found that is divisible by value\n" +
                    "element on left and element value on\n" +
                    "right without a trace.");
        System.exit(-1);
    }


}
        /*
        Заполните массив размерности n случайными числами от 0 до 33.
        Найдите элемент массива, который делится на значение элемента слева и значение элемента на
        прямо без остатка.
        Вывести значения исходного массива в консоль.
        Вывести индекс найденного элемента; если он не найден, выход -1. n указывается с клавиатуры.
        */