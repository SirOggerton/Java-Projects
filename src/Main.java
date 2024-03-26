import jcolor.Attribute;

import javax.swing.*;
import java.util.Scanner;

//JColor formats the console text
import static jcolor.Ansi.colorize;


public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        HumanoidMob player = new HumanoidMob();
        HumanoidMob orc1 = new HumanoidMob();

        orc1.setName("Orc");
        orc1.setHealth(80);
        orc1.setWeaponStrength(1);

        System.out.println("Welcome! What is your name?");

        player.setName(scanner.next());

        System.out.println("That's a strange name " + colorize(player.getName(), Attribute.BLUE_TEXT()) + "...Very strange indeed.");

        System.out.println("What is your starting " + colorize("health?", Attribute.RED_TEXT()));

        player.setHealth(scanner.nextInt());

        System.out.println("I figured as much. What about the strength of that weapon you carry?");

        player.setWeaponStrength(scanner.nextInt());

        System.out.println("Great. Now try to fight this " + colorize(orc1.getName(), Attribute.BRIGHT_GREEN_TEXT()) + "!");

        new Battle(player, orc1);

    }
}