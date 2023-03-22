package hw2;

public class Task6 {
    public static void main(String[] args) {
        int sum = 5000;
        int saleCode1 = 4525;
        switch (saleCode1) {
            case 4525:
                System.out.println(sum - (int) (sum * 0.3));
                break;
            case 6424:
            case 7012:
                System.out.println(sum - (int) (sum * 0.2));
            case 7646:
            case 9011:
            case 6612:
                System.out.println(sum - (int) (sum * 0.1));
                break;
            default:
                System.out.println(sum);
                break;

        }

    }
}
