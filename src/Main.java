public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1");
        int clientOS = 1;
        if(clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        System.out.println("Задание 2");
        int releaseDate = 2015;
        if(clientOS == 0 && releaseDate>2014){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 1 && releaseDate>2014) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if(clientOS == 0 && releaseDate<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }   else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Задание 3
        System.out.println("Задание 3");
        int year = 2021;
        if((year % 4 == 0) && (year % 100 != 0 ) || (year % 400 == 0)){
            System.out.println(year+" является високосным годом");
        } else {
            System.out.println(year+" не является високосным годом");
        }
        //Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if(deliveryDistance < 20){
            System.out.println("Потребуется дней: 1");
        } else if(deliveryDistance>19 && deliveryDistance<61){
            System.out.println("Потребуется дней: 2");
        }   else{
            System.out.println("Потребуется дней: 3");
        }
        //Задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:

        }
    }
}