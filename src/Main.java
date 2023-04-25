public class Main {
    public static void main(String[] args) {
   Boss boss = new Boss();
   boss.setHeal(300);
   boss.setDemage(30);
   boss.weapon.setWeaponType(WeaponType.MECH);
   boss.weapon.setWeaponName("Aldos");
        System.out.println("Heal :"+boss.getHeal()+
                           "\nDamage :"+boss.getDemage()+
                           "\nWeapon :"+boss.weapon.getWeaponType()+
                           "\nName : "+ boss.weapon.getWeaponName());

        System.out.println(boss.printInfo());
        Skeleton skeleton1 =new Skeleton();
        skeleton1.setHeal(400);
        skeleton1.setDemage(20);
        skeleton1.weapon.setWeaponType(WeaponType.NOJ);
        skeleton1.weapon.setWeaponName("sklet");
        skeleton1.setContStrel(3);
        System.out.println(skeleton1.printInfo());
        Skeleton skeleton2 =new Skeleton();
        skeleton2.setHeal(350);
        skeleton2.setDemage(25);
        skeleton2.weapon.setWeaponType(WeaponType.PISTOLET);
        skeleton2.weapon.setWeaponName("lolita");
        skeleton2.setContStrel(2);
        System.out.println(skeleton2.printInfo());
    }

}