public class Main {

    public static void checkYear(int year) {
        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }
    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int year = 2000;
        checkYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2

    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3

    }



}
