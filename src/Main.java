public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        CreditPaymentService service = new CreditPaymentService();
        int summa = 1_000_000;// 2 варианта, новая переменная и с внесением в метод.
        int period = 12;
        int paymentOneMonth = service.calculate(summa, period); // новая переменная
        System.out.println();
        System.out.println("Сумма месячного платежа: " + paymentOneMonth);
        System.out.println("Процентная ставка: 9,99%");

        System.out.println();
        System.out.println("Сумма месячного платежа: "
                + service.calculate(1_000_000, 24));
        System.out.println("Процентная ставка: 9,99%");

        System.out.println();
        System.out.println("Сумма месячного платежа: "
                + service.calculate(1_000_000, 36));
        System.out.println("Процентная ставка: 9,99%");


    }
}