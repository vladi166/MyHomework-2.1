public class Main {
    public static void main(String[] args) {
        int ticket = 15000; // стоимость билета
        int rublesForBonus = 20; // количество рублей для одной бонусной мили

        int bonusMile = ticket / rublesForBonus;

        System.out.println(bonusMile);
    }
}