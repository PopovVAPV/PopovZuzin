import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test1();
        // Test2();
        // Test3();
        // Test4();
        // Test5();
        Test6();

    }

    public static void Test1() { // Задание 1
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = input.nextInt();
        double y = (4 * Math.pow(x, 4) + 3) / (5 * Math.pow(x, 3) - 2);
        System.out.println("y равен = " + y);
    }

    public static void Test2() { // Задание 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты вершин треугольника: ");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();
        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();

        double x = (x1 + x2 + x3) / 3;
        double y = (y1 + y2 + y3) / 3;

        System.out.println("Координаты точки пересечения медиан: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void Test3() { // Задание 3
        Scanner input = new Scanner(System.in);
        System.out.println("Введите R: ");
        double PI = 3.14;
        double R = input.nextInt();
        double S = PI * Math.pow(R, 2);
        System.out.println("Площадь круга равна = " + S);
    }

    public static void Test4() { // Задание 4
        Scanner input = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = input.nextInt();
        System.out.println("Введите y: ");
        double y = input.nextInt();
        System.out.println("Введите z: ");
        double z = input.nextInt();
        double Result = ((Math.pow(x, 2) * y - 3 * x * y * z) / (5 * Math.pow(z, 2) + 4)) / (Math.pow(x * y * z, 3) + 3);
        System.out.println("Ответ: " + Result);

    }

    public static void Test5() { // Задание 5
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число не является палиндромом.");
        }
    }

    public static void Test6() { // Задание 6
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сегодняшний день числом: ");
        int days = scanner.nextInt();
    }
}


