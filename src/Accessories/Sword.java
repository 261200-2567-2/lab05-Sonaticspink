package Accessories;

public class Sword extends Accessories{
    private int SwordDamage;
    public Sword(String name, int HPplus, int MPplus, int DEFplus, int ATKplus, int AGIplus, int StaminaUsedRate, int SwordDMG) {
        super(name, HPplus, MPplus, DEFplus, ATKplus, AGIplus, StaminaUsedRate);
        SwordDamage = SwordDMG;
    }

    public int[] HeavyAttack(){
        return new int[]{SwordDamage*2, StaminaUsedRate*2};
    }
    public int[] LightAttack(){
        return new int[]{SwordDamage, StaminaUsedRate};
    }
    public int[] StarBurstStream(){
        return new int[]{SwordDamage*3, StaminaUsedRate*3};
    }

    @Override
    public void showstat() {
        System.out.println("Name: " + name);
        System.out.println("HP +" + HPplus);
        System.out.println("MP +" + MPplus);
        System.out.println("DEF +" + DEFplus);
        System.out.println("ATK +" + ATKplus);
        System.out.println("AGI +" + AGIplus);
        System.out.println("StaminaUseRate +" + StaminaUsedRate);
        System.out.println("SwordDMG: " + SwordDamage);
        System.out.println("-----------------------------------------------------");
    }

    public int[] SwordUsed(int choise){
        switch(choise){
            case 1: return LightAttack();

            case 2: return HeavyAttack();

            case 3: return StarBurstStream();

        }
        return null;
    }
}
