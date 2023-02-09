public class Main {
    public static void main(String[] args) {

        int balance = 1200;
        int depositAmount = 1100;
        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            System.out.println("Ваш бонус: " + bonus);
            System.out.println("Сумма на вашем счету: " + (balance + bonus));
        } else {
            System.out.println("Средств недостаточно для получения бонуса");
            System.out.println("Сумма на вашем счету: " + balance);
        }
    }
}