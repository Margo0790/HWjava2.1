public class Main {
    public static void main(String[] args) {

        int amount = 2000;
        int balance = 200;
        int bonus = 0;
        if (amount > 1000) {
            bonus = (amount / 100 * 1);
        }
        int totalBalance = balance + amount + bonus;
        System.out.println("Количество бонусов: " + bonus);
        System.out.println("Итоговый баланс: " + totalBalance + "рублей");
    }
}