import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0 ) {
            System.out.println(year + " год является высокосным");
        } else {
            System.out.println(year + " год не является высокосным");
        }

    }

    public static void checkVersionProgramm (int clientOS, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0) {
            if (clientDeviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для IOS по ссылке");
            }
            else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }


        else if (clientDeviceYear < currentYear){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static int calcDeliveryTerm (int deliveryDistance){
        int deliveryDays = 0;
        if (deliveryDistance <= 0) {
            System.out.println("Введите корректное значение расстояния");
        }
        if (deliveryDistance > 0 && deliveryDistance < 20) {
            deliveryDays = 1;
        }
        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays = 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }
        if (deliveryDistance >= 100) {
            System.out.println("Свыше 100 км доставки нет");
        }
        return deliveryDays;

    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }
    public static void task1() {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int year = 2021;
        checkYear(year);
    }

    public static void task2() {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int clientOS = 0;
        int clientDeviceYear  = 2022;

        checkVersionProgramm(clientOS, clientDeviceYear);

    }

    public static void task3() {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int deliveryDistance = 10;
        int days = calcDeliveryTerm(deliveryDistance);
        System.out.println("Срок доставки составит, " +days+ " д.");

    }



}
