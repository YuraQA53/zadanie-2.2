public class Main {
    public static void main(String[] args) {
        int valueBill = 300; // начальный баланс
        int refill = 1100; // пополнение счета
        int condition = 1000; // условия выполнения
        int bonus = 0;
        if (refill > condition) {
            bonus = refill / 100;
        }
        System.out.println("Итоговый счет:");
        System.out.println(valueBill + refill);
        System.out.println("Количество бонусных рублей:");
        System.out.println(bonus);
    }
}
