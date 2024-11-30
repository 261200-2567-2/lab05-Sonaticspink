package Character;
import Accessories.Bow;
public class Archer extends Character implements Charactermethods {
    private int MaxArrow = 10;
    private int Arrow = MaxArrow;
    private Bow bow;

    public Archer(String name) {
        this.name = name;
    }

    @Override
    public void LVUP() {
        super.LVUP();
        MaxArrow += 5;
        Arrow = MaxArrow;
    }

    @Override
    public void Showstat(){
        System.out.println("Name: " + name);
        System.out.println("Level: " + LV);
        System.out.println("HP: "+ HP +"/"+MaxHP);
        System.out.println("Arrow: " + Arrow +"/"+ MaxArrow);
        System.out.println("DEF: " + DEF);
        System.out.println("ATK: " + ATK);
        System.out.println("AGI: " + AGI);
        System.out.println("Stamina: " + Stamina + "/" + MaxStamina);
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void calculatestat() {
        super.calculatestat();
        Arrow = MaxArrow;
        if(bow != null){
            EquipBow(bow);
        }
    }

    public int UseBow(int choice) {
        if (bow == null) {
            System.out.println("Bow is not equiped!");
            return 0;
        } else {
            int[] cal = bow.BowUsed(choice);
            if(cal[1] > Arrow){
                System.out.println("Not Enough Arrow!");
                return 0;
            }
            else{
                Arrow -= cal[1];
                return cal[0];
            }
        }
    }

    public void EquipBow (Bow bow){
        this.bow = bow;
        ATK += bow.Getstat()[3];
    }

    public void UnequipBow(){
        this.bow = null;
        calculatestat();
    }
    public int getJOB(){
        return 2;
    }

    public int ThrowArrow(){
        int DMGcal = 3*Arrow;
        Arrow = 0;
        return DMGcal;
    }
}