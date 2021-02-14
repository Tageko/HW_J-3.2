public class Main {
    public static void main(String[] args) {

        int account = 100;
        int amount = 1_260;
        int total_account = amount + account;


        int bonus;

        int limit = 1_000;
        if (amount > limit) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int total_count = total_account + bonus;

        System.out.println(total_count);

    }
}
