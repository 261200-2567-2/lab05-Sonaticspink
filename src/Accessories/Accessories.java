package Accessories;

public class Accessories implements AccessoriesMethods{
    protected String name;
    protected int HPplus;
    protected int MPplus;
    protected int DEFplus;
    protected int ATKplus;
    protected int AGIplus;
    protected int StaminaUsedRate;

    public Accessories(String name, int HPplus, int MPplus, int DEFplus, int ATKplus, int AGIplus, int StaminaUsedRate){
        this.name = name;
        this.HPplus = HPplus;
        this.MPplus = MPplus;
        this.DEFplus = DEFplus;
        this.ATKplus = ATKplus;
        this.AGIplus = AGIplus;
        this.StaminaUsedRate = StaminaUsedRate;

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
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public int[] Getstat() {
        int[] stat = {HPplus,MPplus,DEFplus,ATKplus,AGIplus,StaminaUsedRate};
        return stat;
    }

}
