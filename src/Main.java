public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int payment = 1600;
        int bonus;

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        int result = balance + bonus + payment;

        System.out.println("Ваш баланс: " + result);
        System.out.println("Вам начислено бонусов: " + bonus);

    }

}