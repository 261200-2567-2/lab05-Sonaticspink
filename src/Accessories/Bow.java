package Accessories;

public class Bow extends Accessories {
    private final int ArrowconsumeRate = 1;
    private final int BowDamage ;
    public Bow(String name, int HPplus, int MPplus, int DEFplus, int ATKplus, int AGIplus, int StaminaUsedRate , int bowDMG) {
        super(name, HPplus, MPplus, DEFplus, ATKplus, AGIplus, StaminaUsedRate);
        this.BowDamage = bowDMG;

    }
     public int[] Shoot() {
         return new int[]{BowDamage, ArrowconsumeRate};
     }

     public int[] ShootX2(){
         return new int[]{BowDamage*2, ArrowconsumeRate*2};
     }

     public int[] ShootX3(){
         return new int[]{BowDamage*3, ArrowconsumeRate*3};
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
        System.out.println("BowDMG +" + BowDamage);
        System.out.println("-----------------------------------------------------");
    }

    public int[] BowUsed(int choice){
        switch (choice) {
            case 1:return Shoot();
            case 2:return ShootX2();
            case 3:return ShootX3();
        }
        return null;
    }
}
