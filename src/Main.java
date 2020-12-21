public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        int initialDeposit = 100;
        long refill = 666;
        long bonus = refill / 100;
        if (refill > 1000) {
            refill = bonus;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
    }
}

