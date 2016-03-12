package org.sourceit;
import static java.lang.Math.*;
import java.util.Random;

public class HomeTask1 {

    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b) {

        double hipotenuza = 0;
        if (a > 0 & b > 0) hipotenuza = sqrt(pow(a, 2d) + pow(b, 2d));
        return hipotenuza;
    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c) {
        double perimeterTriangle = 0;
        if (a > 0 & b >0 & c >0) perimeterTriangle = a + b + c;
        return perimeterTriangle;
    }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {
// a — base of the triangle, b — height triangle
        double areaTriangle = 0;
        if (a > 0 & b >0) areaTriangle = a * b / 2d;
        return areaTriangle;
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max) {
        Random randNum = new Random();
        int randomNumberFromRange = 0;
        if (max - min == 0){
            randomNumberFromRange = max;
        } else
        {
            randomNumberFromRange = randNum.nextInt(max - min) + min;
        }
        return randomNumberFromRange;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number) {
        long sum = 0;
        number = abs(number);
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till) {
        int consequent = 1;
        if(till >= 0) {
            if (till == 0 | till == 1) {
                consequent = 1;
            } else {
                consequent = fibonacci(till - 2) + fibonacci(till - 1);
            }
        }
        return consequent;
    }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket) {
        boolean happy = false;
        if (ticket >= 1 & ticket <= 999999) {
            long sumFirstThreeDigitsTicket = 0;
            long sumSecondThreeDigitsTicket = 0;
            for(int i = 1; i <= 3; i++) {
                sumSecondThreeDigitsTicket += ticket % 10;
                ticket /= 10;
            }
            for(int i = 1; i <= 3; i++) {
                sumFirstThreeDigitsTicket += ticket % 10;
                ticket /= 10;
            }
            if(sumFirstThreeDigitsTicket == sumSecondThreeDigitsTicket) happy = true;
        }
        return happy;
    }

}
