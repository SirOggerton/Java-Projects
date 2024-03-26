public class HumanoidMob {
    String name;
    int health;
    int weaponStrength;


    public HumanoidMob(){

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }

    public void setWeaponStrength(int weaponStrength){
        this.weaponStrength = weaponStrength;
    }
    public int getWeaponStrength(){
        return this.weaponStrength;
    }



}
