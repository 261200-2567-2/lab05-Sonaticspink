package Accessories;

public class Staff extends Accessories{
    private int StaffDamage;
    private final int MPconsumeRate = 5;

    public Staff(String name, int HPplus, int MPplus, int DEFplus, int ATKplus, int AGIplus, int StaminaUsedRate, int SaffDMG) {
        super(name, HPplus, MPplus, DEFplus, ATKplus, AGIplus, StaminaUsedRate);
        StaffDamage = SaffDMG;
    }

    public int[] Fire(){
        return new int[]{StaffDamage, MPconsumeRate};
    }
    public int[] Ice(){
        return new int[]{StaffDamage*2, MPconsumeRate*2};
    }
    public int[] Heal(){
        return new int[]{StaffDamage, MPconsumeRate*2};
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
        System.out.println("StaffDamage: " + StaffDamage);
        System.out.println("-----------------------------------------------------");
    }

    public int[] StaffUsed (int choice){
        switch(choice){
            case 1: return Fire();
            case 2: return Ice();
            case 3: return Heal();
        }
        return null;
    }

}
