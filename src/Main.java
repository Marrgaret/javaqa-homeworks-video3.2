public class Main {
    /**
     * Сотовый оператор дарит клиенту по 1 рублю за каждые полные 100 рублей пополнения.
     * incomingAmount - сумма на счете до пополнения.
     * depositAmount - сумма пополнения.
     * bonusAmount - расчет начисления бонуса.
     */
    public static void main(String[] args) {

        int incomingAmount = 150;
        int depositAmount = 1150;
        boolean bonusCalc = depositAmount > 1000;

        int bonusAmount;
        if (bonusCalc) {
            bonusAmount = depositAmount / 100;
        } else {
            bonusAmount = 0;
        }
        int account = incomingAmount + depositAmount + bonusAmount;

        System.out.println("Итоговая сумма на счете: " + account + " ₽");
        System.out.println("Бонус за пополнение: " + bonusAmount + " ₽");
    }
}
