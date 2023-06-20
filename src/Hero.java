public class Hero {
    private int heals;
    private int damage;
    private int SuperAbility;

    public Hero(int heals, int damage, int superAbility) {
        this.heals = heals;
        this.damage = damage;
        SuperAbility = superAbility;
    }

    public Hero(int heals, int damage) {
        this.heals = heals;
        this.damage = damage;
    }

    public int getHeals() {
        return heals;
    }

    public int getDamage() {
        return damage;
    }

    public int getSuperAbility() {
        return SuperAbility;
    }
}
