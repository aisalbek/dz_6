public class Boss extends GameEntity{
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return " Health " + getHeal() + " Damage " + getDemage()
                + " Weapon type " + weapon.getWeaponType() + " Weapon name " + weapon.getWeaponName();
    }
}
