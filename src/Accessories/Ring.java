package Accessories;

public class Ring extends Accessories{

    public Ring(String name, int HPplus, int MPplus, int DEFplus, int ATKplus, int AGIplus, int StaminaUsedRate) {
        super(name, HPplus, MPplus, DEFplus, ATKplus, AGIplus, StaminaUsedRate);
    }

    public boolean teleport(){
        return true;
    }
}
