package Accessories;

public class Armor extends Accessories{
    public Armor(String name, int HPplus, int MPplus, int DEFplus, int ATKplus, int AGIplus, int StaminaUsedRate) {
        super(name, HPplus, MPplus, DEFplus, ATKplus, AGIplus, StaminaUsedRate);
    }

    public int ArmorBuff(){
        int ArmorBuff = 5;
        return ArmorBuff;
    }
}
