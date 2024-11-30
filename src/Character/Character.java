package Character;

import Accessories.Armor;
import Accessories.Ring;

public class Character implements Charactermethods{

    protected String name = "DUDE";
    protected int MaxHP = 100;
    protected int HP = MaxHP;
    protected int BaseDEF = 2;
    protected int DEF = BaseDEF;
    protected int BaseATK = 5;
    protected int ATK = BaseATK;
    protected int BaseAGI = 10;
    protected int AGI = BaseAGI;
    protected int MaxStamina = 50;
    protected int Stamina = MaxStamina;
    protected int LV = 1;
    protected Armor armor;
    protected Ring ring;

    @Override
    public int BasicAttack(){
        return ATK;
    }

    @Override
    public void Showstat(){
        System.out.println("Name: " + name);
        System.out.println("Level: " + LV);
        System.out.println("HP: "+ HP +"/"+MaxHP);
        System.out.println("DEF: " + DEF);
        System.out.println("ATK: " + ATK);
        System.out.println("AGI: " + AGI);
        System.out.println("Stamina: " + Stamina + "/" + MaxStamina);
        System.out.println("-----------------------------------------------------");
    }
    @Override
    public boolean Escape(int requireAGI){
        if(AGI < requireAGI){
            return false;
        }
        else {return true;}
    }

    @Override
    public void LVUP(){
        MaxHP = MaxHP+10;
        MaxStamina = MaxStamina+10;
        BaseDEF = BaseDEF+2;
        BaseAGI = AGI+2;
        BaseATK = ATK+2;
        LV++;
        calculatestat();
    }

    @Override
    public void EquipArmor(Armor armor){
        this.armor = armor;
        MaxHP += armor.Getstat()[0];
        DEF += armor.Getstat()[2];
        ATK += armor.Getstat()[3];
        AGI += armor.Getstat()[4];
    }

    @Override
    public void EquipRing(Ring ring) {
        this.ring = ring;
        MaxHP += ring.Getstat()[0];
        DEF += ring.Getstat()[2];
        ATK += ring.Getstat()[3];
        AGI += ring.Getstat()[4];

    }

    @Override
    public void UnquipArmor() {
        this.armor = null;
        calculatestat();
    }

    @Override
    public void UnquipRing() {
        this.ring = null;
        calculatestat();
    }

    @Override
    public boolean UseRing() {
        if(ring == null){
            System.out.println("No ring equipped");
            return false;
        }
        else {
            System.out.println("Teleport Cast!! ");
           return ring.teleport();
        }
    }

    @Override
    public void UseArmor() {
        if(armor == null){
            System.out.println("No armor equipped");
        }
        else{
            System.out.println("Armorbuff!! ");
            DEF += armor.ArmorBuff();
        }
    }

    @Override
    public void beattack(int dmg) {

        if(dmg-DEF < 0) return;
        this.HP -= dmg-DEF;
        if(HP <= 0){System.out.println(name + " DIED");}
        this.Showstat();
    }

    @Override
    public void calculatestat(){
        DEF = BaseDEF;
        ATK = BaseATK;
        AGI = BaseAGI;
        Stamina = MaxStamina;

        if(armor != null){
            EquipArmor(armor);
        }
        if(ring != null){
            EquipRing(ring);
        }

        HP = MaxHP;
    }

}
