package Character;

import Accessories.Sword;

public class Knight extends Character implements Charactermethods {
    private int Maxholy = 20;
    private int Holy = Maxholy;
    private Sword sword;
    public Knight(String name) {
        this.name = name;
    }

    @Override
    public void LVUP() {
        super.LVUP();
        Maxholy = Maxholy + 5;
        calculatestat();
    }

    @Override
    public void Showstat(){
        System.out.println("Name: " + name);
        System.out.println("Level: " + LV);
        System.out.println("HP: "+ HP +"/"+MaxHP);
        System.out.println("HOLY!: " + Holy);
        System.out.println("DEF: " + DEF);
        System.out.println("ATK: " + ATK);
        System.out.println("AGI: " + AGI);
        System.out.println("Stamina: " + Stamina + "/" + MaxStamina);
        System.out.println("-----------------------------------------------------");
    }


    @Override
    public void calculatestat() {
        super.calculatestat();
        Holy = Maxholy;
        if(sword != null) {
            EquipSword(sword);
        }
    }

    public int UseSword(int choice) {
        if(sword == null) {
            System.out.println("Sword is not equiped!");
            return 0;
        }
        else{
            int[] cal = sword.SwordUsed(choice);
            if(cal[1] > Stamina){
                System.out.println("Not Enough Stamina!");
                return 0;

            }
            else{
                Stamina -= cal[1];
                return cal[0];
            }
        }
    }

    public void EquipSword(Sword sword) {
        this.sword = sword;
        ATK += sword.Getstat()[3];
    }

    public void UnequipSword() {
        this.sword = null;
        calculatestat();
    }
    public int getJOB() {
        return 1;
    }

    public void HolyPower(){
        HP += 5;
        Holy -= 5;
    }


}
