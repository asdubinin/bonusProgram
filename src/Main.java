public class Main {
    public static void main(String[] args) {

        int wallet = 100;
        int add = 1500;
        int bonus = add/100;

        if (add > 1000) {
            wallet = wallet + add + bonus;
        } else {
            wallet = wallet + add;
        }

        System.out.println("Баланс счета: " + wallet);


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}