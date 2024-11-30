package Character;
import Accessories.Ring;
import Accessories.Staff;

public class Sorcerer extends Character  {
    private int MaxMP = 25;
    private int MP = MaxMP;
    private Staff staff;
    public Sorcerer(String name) {
        this.name = name;
    }

    @Override
    public void LVUP() {
        super.LVUP();
        MaxMP += 5;
        MP = MaxMP;
    }

    @Override
    public void Showstat() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + LV);
        System.out.println("HP: "+ HP +"/"+MaxHP);
        System.out.println("MP: " + MP +"/"+ MaxMP);
        System.out.println("DEF: " + DEF);
        System.out.println("ATK: " + ATK);
        System.out.println("AGI: " + AGI);
        System.out.println("Stamina: " + Stamina + "/" + MaxStamina);
        System.out.println("-----------------------------------------------------");
    }

    @Override
    public void calculatestat() {
        super.calculatestat();
        MP = MaxMP;
        if(staff != null) {
            EquipStaff(staff);
        }
    }

    public int UseStaff(int choice){
        if(staff == null){
            System.out.println("No staff equiped");
            return 0;
        }
        else{
            int[] cal = staff.StaffUsed(choice);
            if(cal[1] > MP){
                System.out.println("Not enough MP");
                return 0;
            }

            if(choice == 3 && cal[1] < MP){
                HP += cal[0];
                MP -= cal[1];
                System.out.println("Heal +"+cal[0]);
                return 0;
            }

            else{
                MP -= cal[1];
                return cal[0];}
        }
    }

    public void EquipStaff(Staff staff){
        this.staff = staff;
        MP += staff.Getstat()[1];
        ATK += staff.Getstat()[3];
    }

    public void UnquipStaff(){
        this.staff = null;
        calculatestat();
    }
    public int getJOB(){
        return 3;
    }

    public int TPose(){
        return 999;
    }

    @Override
    public void EquipRing(Ring ring) {
        super.EquipRing(ring);
        MaxMP += ring.Getstat()[1];
    }
}
