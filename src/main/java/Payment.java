public class Payment {
    public static void main(String[] args) {
        final int apartmentPrice = 16500000;
        System.out.println("Цена квартиры - " + apartmentPrice);

        final double percentFirstPayment = 0.2;
        System.out.println("Процент первоначального взноса - " + percentFirstPayment);

        double amountFirstPayment = apartmentPrice * percentFirstPayment;
        System.out.println("Сумма первоначального взноса - " + amountFirstPayment);
    }
}
