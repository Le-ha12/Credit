// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summa = 1000000; // сумма кредита
        int god = 1; // срок кредита
        double procent = 9.99; // процент по кредиту
        double credit = service.calculate(summa, god, procent); // расчет кредита
        String creditResult = String.format("%.0f", credit);
        System.out.println("Сумма кредита : " + summa + ".руб");
        System.out.println("Процентная ставка : " + procent + "%");
        System.out.println("Срок кредита : " + god + " год (а/лет)");
        System.out.println("Ежемесячный взнос : " + creditResult + ".руб");
    }
}