package hw2;

public class Task4 {
    public static void main(String[] args) {
        int count  = 15;
        if (count <=100 && count >=90) {
            System.out.println("отлично");
        }
        if (count <= 89 && count >= 60) {
            System.out.println("хорошо");
        } else if (count <= 59 && count >= 40) {
            System.out.println("удовлетворительно");
        } else if (count <= 39 && count >= 0) {
            System.out.println("пробуй еще!");
    }
}
}
