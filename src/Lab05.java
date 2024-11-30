import Character.Knight;
import Character.Sorcerer;
import Character.Archer;
import Accessories.Bow;
import Accessories.Ring;
import Accessories.Staff;
import Accessories.Armor;
import Accessories.Sword;
public class Lab05 {
    public static void main(String[] args) {
        Knight K1 = new Knight("K1");
        Sorcerer S1 = new Sorcerer("S1");
        Archer A1 = new Archer("A1");
        Sword sword = new Sword("sword",0,0,0,5,0,5,10);
        Bow bow = new Bow("bow",0,0,0,5,0,0,10);
        Staff staff = new Staff("staff",0,0,0,5,0,0,10);
        Ring ring = new Ring("ring",20,20,10,10,10,10);
        Armor armor = new Armor("armor",20,20,10000,10,10,10);
        K1.Showstat();
        K1.EquipSword(sword);
        K1.Showstat();
        K1.EquipArmor(armor);
        K1.Showstat();
        K1.beattack(2000);
        K1.Showstat();
        K1.LVUP();
        K1.Showstat();

        S1.Showstat();
        S1.EquipRing(ring);
        S1.Showstat();

        S1.beattack(A1.ThrowArrow());
        S1.EquipStaff(staff);
        S1.UseStaff(3);
        S1.Showstat();
        S1.LVUP();
        S1.Showstat();
        S1.beattack(K1.UseSword(3));
        S1.beattack(K1.UseSword(3));
        S1.beattack(K1.UseSword(2));
        K1.Showstat();
        S1.UseStaff(2);
        S1.Showstat();
        A1.Showstat();


    }
}
