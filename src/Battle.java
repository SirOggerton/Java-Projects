import jcolor.Attribute;

import static jcolor.Ansi.colorize;


@SuppressWarnings("BusyWait")
public class Battle {

    boolean mobDead = false;
    String playerName;
    int playerHealth;
    int playerWeaponStrength;

    String monsterName;
    int monsterHealth;
    int monsterWeaponStrength;

    public Battle(HumanoidMob player, HumanoidMob monster) throws InterruptedException {
        this.playerName = player.getName();
        this.playerHealth = player.getHealth();
        this.playerWeaponStrength = player.getWeaponStrength();

        this.monsterName = monster.getName();
        this.monsterHealth = monster.getHealth();
        this.monsterWeaponStrength = monster.getWeaponStrength();

        System.out.println("A wild " + colorize("orc ", Attribute.GREEN_TEXT()) + "appears!");
        System.out.println("The stranger tosses you a " + colorize("beginner's sword!", Attribute.CYAN_TEXT()));

        Thread.sleep(2000);

        while(!mobDead){
                playerHealth -= monsterWeaponStrength;
                System.out.println("He swings his " + colorize("white", Attribute.BRIGHT_WHITE_TEXT()) + " at you, hitting for " +
                                colorize(String.valueOf(monsterWeaponStrength), Attribute.BRIGHT_RED_TEXT()) + " damage!");

                System.out.println("Your " + colorize("health ", Attribute.RED_TEXT()) + "is now " + colorize(String.valueOf(playerHealth), Attribute.RED_TEXT()) + "\n");

                Thread.sleep(3000);

                monsterHealth -= playerWeaponStrength;

                System.out.println("You swing the " + colorize("sword", Attribute.BRIGHT_CYAN_TEXT()) + " wildly at the " + colorize(monsterName, Attribute.BRIGHT_GREEN_TEXT()) +
                        " hitting it for " + colorize(String.valueOf(playerWeaponStrength), Attribute.BRIGHT_RED_TEXT()) + " damage!");

                System.out.println("The " + colorize(monsterName, Attribute.BRIGHT_GREEN_TEXT()) + "'s health is now: " +
                        colorize(String.valueOf(monsterHealth), Attribute.RED_TEXT()) + "\n");

               if(monsterHealth <= 0){
                System.out.println("You killed the " + colorize(monsterName, Attribute.BRIGHT_GREEN_TEXT()) + "! Your final health is: " + colorize(String.valueOf(playerHealth), Attribute.RED_TEXT()));
                mobDead = true;
                }
        }
    }
}
