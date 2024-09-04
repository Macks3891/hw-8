import java.util.Random;
import java.util.Scanner;
class PrimitiveTypesExample {
    public static void main(String[] args) {
        byte aByte = 127;
        short aShort = 32767;
        int anInt = 2147483647;
        long aLong = 9223372036854775807L;
        float aFloat = 3.4e+38f;
        double aDouble = 1.7e+308;
        char aChar = 'A';
        boolean aBoolean = true;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число (a): ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число (b): ");
        int b = scanner.nextInt();

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
        System.out.println("Остаток: " + remainder);

        scanner.close();

        Random random = new Random();
        char char1 = (char) (random.nextInt(26) + 'A'); // Генерация заглавной буквы
        char char2 = (char) (random.nextInt(26) + 'A');
        char char3 = (char) (random.nextInt(26) + 'A');
        char char4 = (char) (random.nextInt(26) + 'A');

        System.out.print("Случайное слово: " + char1 + char2 + char3 + char4);

        long longValue = 2147483648L;
        int intValue = (int) longValue;

        System.out.println("\nLong value: " + longValue);
        System.out.println("Переполненный int value: " + intValue);
    }
}