// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(45);
        boss.setHeals(200);
        boss.setTypeDefence("Phisikal");

        System.out.println("health:" + boss.getHeals() + "\ndamage :" + boss.getDamage()+"\nTypeDefence:" + boss.getTypeDefence());
    }
}