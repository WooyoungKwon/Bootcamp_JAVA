package Day23.Diablo;

public abstract class Character {
    protected int hp;
    protected int mp;
    // ...

    WeaponBehavior weapon; // Association (Aggregation)

    abstract void info();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public final void preformWeapon() {
        weapon.useWeapon();
    }
}