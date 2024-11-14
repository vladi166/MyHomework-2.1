public class Main {
    public static void main(String[] args) {
        int ticket = 15000; // стоимость билета
        int rublesforbonus = 20; // количество рублей для одной бонусной мили

        int bonusmile = ticket / rublesforbonus;

        System.out.println(bonusmile);
    }
}