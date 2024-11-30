package Character;

import Accessories.Armor;
import Accessories.Ring;

public interface Charactermethods {
    int BasicAttack();
    void Showstat() ;
    boolean Escape(int AGI);
    void LVUP();
    void EquipArmor(Armor armor);
    void EquipRing(Ring ring);
    void UnquipArmor();
    void UnquipRing() ;
    boolean UseRing() ;
    void UseArmor() ;
    void beattack(int dmg);
    void calculatestat();


}