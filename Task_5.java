// Вывести все простые числа от 1 до 1000


public class Task_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if (simpleNumber(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean simpleNumber(int num){
        for (int i = 2; i <= num/2; i++) {
        if (num%i ==0) return false;
        }
        return true;
    }
}