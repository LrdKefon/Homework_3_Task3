public class CreditPaymentService {
    public int calculate(int summa, int period) {
        double percent;
        percent = 9.99 / 12 / 100;
        double payment;
        double coefficient = percent * Math.pow(1 + percent, period) / (Math.pow(1 + percent, period) - 1);
        payment = summa * coefficient;
        return (int) payment;

    }
}
