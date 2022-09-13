public class Main {
    public static void main(String[] args) {
        homeWork();

    }
    public static void homeWork (){
        System.out.println("Задание 1");
        int [] arr = new int [3];
        arr [0] = 1;
        arr [1] = 2;
        arr [2] = 3;
        double [] arr2 = {1.57, 7.654, 9.986};
        short [] arr3 = {10, 20 , 30};

        System.out.println("Задание 2");
        System.out.printf("Первый массив: %d, %d, %d\n", arr[0], arr[1], arr[2]);
        System.out.printf("Второй массив: %.2f, %.3f, %.3f\n", arr2[0], arr2[1], arr2[2]);
        System.out.printf("Третий массив: %d, %d, %d\n", arr3[0], arr3[1], arr3[2]);

        System.out.println("Задание 3");
        System.out.printf("Первый массив: %d, %d, %d\n", arr[2], arr[1], arr[0]);
        System.out.printf("Второй массив: %.2f, %.3f, %.3f\n", arr2[2], arr2[1], arr2[0]);
        System.out.printf("Третий массив: %d, %d, %d\n", arr3[2], arr3[1], arr3[0]);

        System.out.println("Задание 4");
        for (int a = 0; a < 3; a++){
            arr[0] = arr[0] + 1;
            arr[2] = arr[2] + 1;
            System.out.println(arr[a]);

        }
    }

}