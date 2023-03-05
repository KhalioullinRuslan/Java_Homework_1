// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)

// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120


import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        System.out.println("Треугольное число " + triangleNum(number));
        System.out.printf("Факториал = %d", factNum(number));
        sc.close();
    }


    public static int triangleNum(int number) {
        int triangleNumber = (number * (number + 1)) / 2;
        return triangleNumber;
    }

    public static int factNum(int number) {
        if (number == 0) return 1;
        return number*factNum(number-1);

    }
}