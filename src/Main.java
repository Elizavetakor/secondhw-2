public class Main {
    public static void main(String[] args) {

        int first = 100;
        int cash = 700;
        int bonus = 100;

        if (cash + first > 1000) {
            System.out.println("Сумма на счету " + (first + cash) + " рублей");
            System.out.println("Сумма вместе с бонусами составляет " + ((cash / bonus) + cash + first));
        } else {
            System.out.println("Сумма на счету " + (first + cash) + " рублей");
        }


    }
}
