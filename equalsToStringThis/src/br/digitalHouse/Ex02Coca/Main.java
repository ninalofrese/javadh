package Ex02Coca;

public class Main {
    public static void main(String[] args) {
        Coca cocaUm = new Coca(1, 2.3);
        Coca cocaDois = new Coca(1, 5.2);

        System.out.println(cocaUm.equals(cocaDois));
    }
}
