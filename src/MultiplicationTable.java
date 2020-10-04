import java.util.Scanner;

//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.

public class MultiplicationTable {
    public static void main(String[] args){
        int integer = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число:");
        integer = scn.nextInt();
        System.out.println(integer + " * " + 1 + " = " + integer * 1);
        System.out.println(integer + " * " + 2 + " = " + integer * 2);
        System.out.println(integer + " * " + 3 + " = " + integer * 3);
        System.out.println(integer + " * " + 4 + " = " + integer * 4);
        System.out.println(integer + " * " + 5 + " = " + integer * 5);
        System.out.println(integer + " * " + 6 + " = " + integer * 6);
        System.out.println(integer + " * " + 7 + " = " + integer * 7);
        System.out.println(integer + " * " + 8 + " = " + integer * 8);
        System.out.println(integer + " * " + 9 + " = " + integer * 9);
        System.out.println(integer + " * " + 10 + " = " + integer * 10);
    }
}
