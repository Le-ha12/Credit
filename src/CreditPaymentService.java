public class CreditPaymentService {
    public double calculate(int summa, int god, double procent) {
        double r = procent / 100 / 12;
        double credit = (r * summa) / (1 - Math.pow(1 + r, -(god * 12)));
        return credit;
    }

}
