public class Task_12 {
    static int arr[][] = {{1, 2, 3, 2, 1}, {2, 2, 3, 2, 2}, {1, 3, 2, 3, 1}, {5, 4, 3, 4, 5}};
    static boolean flag = true;
    public static void main(String[] args) {

        print();
        IfTrue();
        if (flag)
            System.out.println("Yes");
        else System.out.println("No");
    }

    static void print() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
    }
    static void IfTrue(){
        int rows = arr.length , cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols /2; j++) {
                if (arr[i][j] != arr[i][cols - 1 - j])
                    flag = false;
            }
        }
    }
}
/*
    Программа должна вывести слово yes для симметричного массива
    и слово нет для асимметричного массива. Симметричный массив – это
    массив, в котором значения элементов с конца равны
    значение элементов с самого начала. Массив указан и
    инициализируется в начале программы.
    Примеры значений для симметричного массива:
    1, 2, 3, 2, 1
    2, 2, 3, 2, 2
    1, 3, 2, 3, 1
    5, 4, 3, 4, 5
*/
