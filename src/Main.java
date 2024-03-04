// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Укажите тип установленной операционной системы");

        int osType=console.nextInt();
        int phoneYear;
        System.out.println("Укажите год выпуска телефона");
        phoneYear=console.nextInt();
        if (osType == 0 && phoneYear<2015)  {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");

        } else if (osType==1 && phoneYear<2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");

        } else if (osType == 0 && phoneYear>=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else if (osType == 0 && phoneYear>=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");

        }
        System.out.println("Введите год. Значение должно быть больше 1584");
        int year=console.nextInt();
        boolean b = year % 4 == 0;
        if (year % 100 == 0 && year%400==0 || b) {
            System.out.println("Год является высокосным");
        } else
            System.out.println("Год не является высокосным");


        double deliveryDistance= 95.0;
        int deliveryTime=1;
        System.out.println("Введите расстояние до клиента. По умолчанию рассчет будет дан для значения расстояния равного "+deliveryDistance);
        deliveryDistance=console.nextFloat();
        if (deliveryDistance<20){
            System.out.println("Потребуется дней:"+deliveryTime);
        } else if (deliveryDistance>=20 && deliveryDistance<60) {
            deliveryTime=deliveryTime++;
            System.out.println("Потребуется дней:"+deliveryTime);
        } else if (deliveryDistance>=60 && deliveryDistance<100) {
            deliveryTime=deliveryTime+2;
            System.out.println("Потребуется дней:"+deliveryTime);


        }else
            System.out.println("Доставки нет");
        int monthNumber=12;
        System.out.println("Введите номер месяца. По умолчанию будет использоватьдя Декабрь");
        monthNumber=console.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("Время года - зима");
                break;
            case 2:
                System.out.println("Время года - зима");
                break;
            case 3:
                System.out.println("Время года - весна");
                break;
            case 4:
                System.out.println("Время года - весна");
                break;
            case 5:
                System.out.println("Время года - весна");
                break;
            case 6:
                System.out.println("Время года - лето");
                break;
            case 7:
                System.out.println("Время года - лето");
                break;
            case 8:
                System.out.println("Время года - лето");
                break;
            case 9:
                System.out.println("Время года - осень");
                break;
            case 10:
                System.out.println("Время года - осень");
                break;
            case 11:
                System.out.println("Время года - осень");
                break;
            default:
                System.out.println("Время года - зима");

        }
    }

}


