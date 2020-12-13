package game;

import java.io.IOException;
import java.util.*;

public class LOL {

private static String command, commandAttack, commandShop;
private static int monsterRat = 100;
private static int monsterWeasel = 110;
private static int monsterBear = 120;
private static int hp = 100;
private static int level = 0;
private static int mana = 10;
private static int expTotal = 0;
private static int goldTotal = 0;
private static int commandItem, commandBuy, arrow, shuriken, bomb, nuke, hpPotion, mpPotion, potion, items;

public static void main(String[] args) throws IOException
{
	title();
	Instructions();
	game();
}

private static void Instructions() 
{
	System.out.println("To begin, type in your desired activity");
}
public static void title()
{
    System.out.println("\nWelcome to my text based game!" + 
        "\n\nType 'stop' at anytime to quit and exit!"); //Need to come up with title
}
public static void huntRat()
{
    Scanner in = new Scanner(System.in);
    System.out.println("A Monster Appeared! Its a Wild Rat! ");
    
    do
    {
        System.out.print("What Skill do you want to use?" + "\nAttack,Heal,Item,Run: ");
        commandAttack = in.next();
        System.out.println("");
    
        if(commandAttack.equalsIgnoreCase("Run"))
    	{
            game();
    	}
    
        if(commandAttack.equalsIgnoreCase("Attack"))
    	{
            int attack = (int)(Math.random()*50+15); //15-50
            System.out.println("-You have done: " + attack + " damage");
            monsterRat = monsterRat - attack;
            System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
        }
    
        if(commandAttack.equalsIgnoreCase("Heal") && mana >= 2)
    	{
        int healing = (int)(Math.random()*35+5); //5-35
        hp = Math.min(hp + healing, 100);
        mana = Math.max(mana - 2, 0);
        System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n"
            + "Mana: " + mana + "/10\n");
        }
    
        if(commandAttack.equalsIgnoreCase("Item") && items >= 1)
    	{
        System.out.println("Choose what to use::\n");
        System.out.println("1. Arrow: " + arrow + "\n"
            + "2. Shurkiken: " + shuriken + "\n"
            + "3. Bombs: " + bomb + "\n"
            + "4. Nukes: " + nuke + "\n"
            + "5. Small HP-Potion: " + hpPotion + "\n"
            + "6. Mana-Potion: " + mpPotion + "\n"
            + "7. Large HP-Potion: " + potion + "\n"); //ending of attack command 
                
        commandItem = in.nextInt();
        
        if(commandItem == 1 && arrow >= 1)
        {
            System.out.println("You fire an arrow at the monster!");
            int attack = 20;
            
            System.out.println("-You have done: " + attack + " damage");
            monsterRat = monsterRat - attack;
            
            System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
            arrow--;
        }
        
        if(commandItem == 2 && shuriken >= 1)
        {
            System.out.println("You throw a shuriken at the monster!");
            int attack = 40;
            
            System.out.println("-You have done: " + attack + " damage");
            monsterRat = monsterRat - attack;
            
            System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
            shuriken--;
        }
        
        if(commandItem == 3 && bomb >= 1)
        {
            System.out.println("-You throw a bomb at the monster!");
            int attack = 60;
            
            System.out.println("-You have done: " + attack + " damage");
            monsterRat = monsterRat - attack;
            
            System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
            bomb--;
        }
        if(commandItem == 4 && nuke >= 1)
        {
            System.out.println("-You drop a nuke on the creature!");
            int attack = 100;
            
            System.out.println("-You have done: " + attack + " damage");
            monsterRat = monsterRat - attack;
            
            System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
            nuke--;
        }
        
        if(commandItem == 5 && hpPotion >= 1)
        {
            int healing = 20;
            hp = hp + healing;
            
            System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n");
            hpPotion--;
        }
        
        if(commandItem == 6 && mpPotion >= 1)
        {
            mana = 10;
            
            System.out.println("-You now have 10/10 mana!");
            mpPotion--;
        }
        
        if(commandItem == 7 && potion >= 1)
        {
            int healing = 40;
            hp = hp + healing;
            
            System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n");
            potion--;
        }
    }
    // MosterRat Attack
    if(monsterRat > 50 && monsterRat < 100) //50-100
    {
        int dmg = (int)(Math.random()*20+1); //1-20
        hp = hp - dmg; 
        System.out.println("-The Wild Rat bit you for: " + dmg + " HP of damage to you!\n" + "-You have: "
            + hp + "hp left!\n");
    }
    if(monsterRat > 0 && monsterRat < 50) //low health attack 0-50
    {
        int dmg = (int)(Math.random()*25+5); //5-25
        hp = hp - dmg; 
        System.out.println("-The Wild Rat smacked you for: " + dmg 
            + " HP of damage to you!\n" + "-You have: "
            + hp + "hp left!\n");
    }
    
    if(hp <= 0)
    {
        System.out.println("-You have died! Game Over!");
        System.exit(0);
    }
    
    mana = Math.min(mana + 1, 10);
        }
    
        while(monsterRat >= 1);
            int expRat = (int)(Math.random()*20+5); //5-20
            int goldRat = (int)(Math.random()*10+5); //5-15
            goldTotal = goldTotal + goldRat;
            expTotal = expTotal + expRat;
            
            System.out.println("You have gotten: " + expRat
            + " EXP!\nYou picked up: "
            + goldRat + " gold!\n");
            monsterRat = 100;
    }   
// Skeleton
public static void huntWeasel()
{
    Scanner in = new Scanner(System.in);
    System.out.println("A Monster Appeared! Its a Wild Weasel! ");
    
    do
    {
        System.out.print("What Skill do you want to use?" + "\nAttack,Heal,Item,Run: ");
        commandAttack = in.next();
        System.out.println("");
    
        if(commandAttack.equalsIgnoreCase("Run"))
    	{
            game();
        }
    
        if(commandAttack.equalsIgnoreCase("Attack"))
    	{
            int attack = (int)(Math.random()*40+10); //10-40
            System.out.println("-You have done: " + attack + " damage");
            monsterWeasel = monsterWeasel - attack;
            System.out.println("-The Wild Weasel has: " + monsterWeasel + " HP left!\n");
        }
    
        if(commandAttack.equalsIgnoreCase("Heal") && mana >= 2)
    	{
            int healing = (int)(10 + Math.random()*35-10+1);
            hp = Math.min(hp + healing, 100);
            mana = Math.max(mana - 2, 0);
            System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n" + "Mana: " + mana + "/10\n");
        }
    
        if(commandAttack.equalsIgnoreCase("Item") && items >= 1)
    	{
            System.out.println("Choose what to use::\n");
            System.out.println("1. Arrow: " + arrow + "\n"
                + "2. Shurkiken: " + shuriken + "\n"
                + "3. Bombs: " + bomb + "\n"
                + "4. Nukes: " + nuke + "\n"
                + "5. Small HP-Potion: " + hpPotion + "\n"
                + "6. Mana-Potion: " + mpPotion + "\n"
                + "7. Large HP-Potion: " + potion + "\n");
            commandItem = in.nextInt();
        
            if(commandItem == 1 && arrow >= 1)
            {
                System.out.println("You fire an arrow at the monster!");
                int attack = 20;
                System.out.println("-You have done: " + attack + " damage");
                monsterWeasel = monsterWeasel - attack;
                System.out.println("-The Wild Rat has: " + monsterWeasel + " HP left!\n");
                arrow--;
            }
        
            if(commandItem == 2 && shuriken >= 1)
            {
                System.out.println("You throw a shuriken at the monster!");
                int attack = 40;
                System.out.println("-You have done: " + attack + " damage");
                monsterWeasel = monsterWeasel - attack;
                System.out.println("-The Wild Rat has: " + monsterWeasel + " HP left!\n");
                shuriken--;
            }
        
            if(commandItem == 3 && bomb >= 1)
            {
                System.out.println("You throw a bomb at the monster!");
                int attack = 60;
                System.out.println("-You have done: " + attack + " damage");
                monsterWeasel = monsterWeasel - attack;
                System.out.println("-The Wild Rat has: " + monsterWeasel + " HP left!\n");
                bomb--;
            }
        
            if(commandItem == 4 && nuke >= 1)
            {
                System.out.println("-You drop a nuke on the creature!");
                int attack = 100;
                
                System.out.println("-You have done: " + attack + " damage");
                monsterRat = monsterRat - attack;
                
                System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
                nuke--;
            }
            
            if(commandItem == 5 && hpPotion >= 1)
            {
                int healing = 20;
                hp = hp + healing;
                
                System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n");
                hpPotion--;
            }
            
            if(commandItem == 6 && mpPotion >= 1)
            {
                mana = 10;
                
                System.out.println("-You now have 10/10 mana!");
                mpPotion--;
            }
            
            if(commandItem == 7 && potion >= 1)
            {
                int healing = 40;
                hp = hp + healing;
                
                System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n");
                potion--;
            }
        }
    
        if(monsterWeasel > 76 && monsterWeasel < 110) //weasel normal attack 76-100
    	{
            int dmg = (int)(Math.random()*30+10);//10-30
            hp = hp - dmg; 
            System.out.println("-The Wild Weasel clawed you for: " + dmg + "!\n" + "-You have: " + hp + "hp left!\n");
        }

        if(monsterWeasel > 43 && monsterWeasel < 76) //weasel normal attack2 43-76
    	{
            int dmg = (int)(Math.random()*35+13);//13-35
            hp = hp - dmg; 
            System.out.println("-The Wild Weasel has bit you for: " + dmg + "!\n" + "-You have: " + hp + "hp left!\n");
        }

        if(monsterWeasel > 43 && monsterWeasel < 0) //weasel attack 43-0
    	{
            int dmg = (int)(Math.random()*20+5);//5-20
            int dmg2 = (int)(Math.random()*20+5);//5-20
            hp = hp - dmg; 
            hp = hp - dmg2;
            System.out.println("-The Wild Weasel struggled to hit you for: " + dmg + "!\n" + "-You have: " + hp + "hp left!\n");
            System.out.println("-It somehow managed to hit you again for: " + dmg2 + "!\n" + "-You have: " + hp + "hp left!\n");
        }
    
        if(hp <= 0)
        {
            System.out.println("-You have died! \nGame Over!");
            System.exit(0);
        }
        mana = Math.min(mana + 1, 10);
    }
    
        while(monsterWeasel >= 1);
        int expWeasel = (int)(Math.random()*40+12); //12-40
        int goldWeasel = (int)(Math.random()*45+12); //12-45
        goldTotal = goldTotal + goldWeasel;
        expTotal = expTotal + expWeasel;
        System.out.println("You have gotten: " + expWeasel + " EXP!\nYou picked up: " + goldWeasel + " gold!\n");
        monsterWeasel = 110;
} 

public static void huntBear()
{
    Scanner in = new Scanner(System.in);
    System.out.println("A Monster Appeared! Its a Wild Bear! ");
    
    do
    {
        System.out.print("What Skill do you want to use?" + "\nAttack,Heal,Item,Run: ");
        commandAttack = in.next();
        System.out.println();
    
        if(commandAttack.equalsIgnoreCase("Run"))
    	{
            game();
        }
    
        if(commandAttack.equalsIgnoreCase("attack"))
        {
            int attack = (int)(Math.random()*40+10); //10-40
            System.out.println("-You have done: " + attack + " damage");
            monsterBear = monsterBear - attack;
            System.out.println("-The Wild Bear has: " + monsterBear + " HP left!\n");
        }
    
        if(commandAttack.equalsIgnoreCase("Heal") && mana >= 2)
    	{
            int healing = (int)(10 + Math.random()*35-10+1);
            hp = Math.min(hp + healing, 100);
            mana = Math.max(mana - 2, 0);
            System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n" + "Mana: " + mana + "/10\n");
        }
    
        if(commandAttack.equalsIgnoreCase("Item") && items >= 1)
    	{
            System.out.println("Choose what to use::\n");
            System.out.println("1. Arrow: " + arrow + "\n"
            + "2. Shurkiken: " + shuriken + "\n"
            + "3. Bombs: " + bomb + "\n"
            + "4. Nukes: " + nuke + "\n"
            + "5. Small HP-Potion: " + hpPotion + "\n"
            + "6. Mana-Potion: " + mpPotion + "\n"
            + "7. Large HP-Potion: " + potion + "\n");
    
            commandItem = in.nextInt(); //choosing specific weapon from items (1-6)
        
            if(commandItem == 1 && arrow >= 1)
            {
                System.out.println("You fire an arrow at the monster!");
                int attack = 20;
                System.out.println("-You have done: " + attack + " damage");      
                monsterBear = monsterBear - attack;
                System.out.println("-The Wild Bear has: " + monsterBear + " HP left!\n");
                arrow--;
            }
        
            if(commandItem == 2 && shuriken >= 1)
            {
                System.out.println("You throw a shuriken at the monster!");
                int attack = 40;
                System.out.println("-You have done: " + attack + " damage");
                
                monsterBear = monsterBear - attack;
                System.out.println("-The Wild Bear has: " + monsterBear + " HP left!\n");
                shuriken--;
            }
        
            if(commandItem == 3 && bomb >= 1)
            {
                System.out.println("You throw a bomb at the monster!");
                int attack = 60;
                System.out.println("-You have done: " + attack + " damage");
                
                monsterBear = monsterBear - attack;
                System.out.println("-The Wild Bear has: " + monsterBear + " HP left!\n");
                bomb--;
            }
        
            if(commandItem == 4 && nuke >= 1)
        {
            System.out.println("-You drop a nuke on the creature!");
            int attack = 100;
            
            System.out.println("-You have done: " + attack + " damage");
            monsterRat = monsterRat - attack;
            
            System.out.println("-The Wild Rat has: " + monsterRat + " HP left!\n");
            nuke--;
        }
        
        if(commandItem == 5 && hpPotion >= 1)
        {
            int healing = 20;
            hp = hp + healing;
            
            System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n");
            hpPotion--;
        }
        
        if(commandItem == 6 && mpPotion >= 1)
        {
            mana = 10;
            
            System.out.println("-You now have 10/10 mana!");
            mpPotion--;
        }
        
        if(commandItem == 7 && potion >= 1)
        {
            int healing = 40;
            hp = hp + healing;
            
            System.out.println("-You have healed: " + healing + "\n-You have now: " + hp + " hp!\n");
            potion--;
        }
        }
    
        if(monsterBear > 80 && monsterBear < 120) //bear attack 1
    	{
            int dmg = (int)(Math.random()*45+15); //15-45
            hp = hp - dmg; 
            System.out.println("-The Wild Bear has done: " + dmg + " HP of damage to you!\n" + "-You have: " + hp + "hp left!\n");
        }
        
        if(monsterBear > 40 && monsterBear < 80) //bear attack 2
    	{
            int dmg = (int)(Math.random()*50+20); //20-50
            hp = hp - dmg; 
            System.out.println("-The Wild Bear has done: " + dmg + " HP of damage to you!\n" + "-You have: " + hp + "hp left!\n");
        }
        if(monsterBear > 10 && monsterBear < 40) //bear attack 3
    	{
            int dmg = (int)(Math.random()*60+25); //25-60
            hp = hp - dmg; 
            System.out.println("-The Wild Bear has done: " + dmg + " HP of damage to you!\n" + "-You have: " + hp + "hp left!\n");
        }
        if(monsterBear > 0 && monsterBear < 10) //bear attack
    	{
            int heal = (int)(Math.random()*100+40); //40-100
            monsterBear = monsterBear + heal; 
            System.out.println("-The Wild Bear has slept and regained: " + heal + " HP back!\n");
        }
    
        if(hp <= 0) //if player dies
        {
            System.out.println("-You have died! Game Over!");
            System.exit(0);
        }
        
        mana = Math.min(mana + 1, 10);
    }
    
    while(monsterBear >= 1); //if monster dies
        int expBear = (int)(Math.random()*75+20); //20-75
        int goldBear = (int)(Math.random()*55+20); //20-55
        goldTotal = goldTotal + goldBear;
        expTotal = expTotal + expBear;
        System.out.println("You have gotten: " + expBear + " EXP!\nYou picked up: " + goldBear + " gold!\n"); 
        monsterBear = 120;
}

public static void shop()
{
    String[] weapon = {"1. Arrow - 10gold DMG: 20 (lvl: 0)\n", 
    "2. Shuriken - 20gold DMG: 40 (lvl: 1)\n", 
    "3. Bomb - 40gold DMG: 60 (lvl: 2)\n", 
    "4. Nuke - 50gold DMG: 100 (lvl: 5)\n"};
               
    String[] item = {"1. Small HP-Potion - 10gold Heal: 20 (lvl: 0)\n",
    "2. Mana-Potion - 20gold Full-Mana (lvl: 1)\n", 
    "3. Large HP-Potion - 40gold Heal: 40 (lvl: 2)\n"}; 
    
    do
    {
        Scanner in = new Scanner(System.in); 
        System.out.print("----------------------------\nWhat do you want to shop for?" //shop and its items formatted
            + "\n\nWeapons \nItems \nLeave \n"
            + "Choice: ");
        commandShop = in.next();
        System.out.println();
    
        if(commandShop.equalsIgnoreCase("Weapons"))
        {
            
            Random numberGenerator = new Random();
            // Generate A Random Number 
            int nextRandom = numberGenerator.nextInt();
            Set<Integer> validate = new HashSet<>();
            // Add First Randomly Genrated Number To Set 
            validate.add(nextRandom);

            for (int i = 0; i < 3; i++) 
            {
                // Generate Randoms Till You Find A Unique Random Number 
                while(validate.contains(nextRandom)) 
                {
                nextRandom = numberGenerator.nextInt(4);
                }
                // Add Newly Found Random Number To Validate 
                validate.add(nextRandom);
                System.out.println(weapon[nextRandom]);
            }
            System.out.println("\n Just type the number:");
            commandBuy = in.nextInt();


            System.out.println();
        
            if(commandBuy == 1 && goldTotal >= 10)
            {
                arrow++;
                items++;
                goldTotal = goldTotal - 10;
                System.out.println("You now have: " + arrow + " arrow(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
        
            if(commandBuy == 2 && goldTotal >= 20 && level >= 1)
            {
                shuriken++;
                items++;
                goldTotal = goldTotal - 20;
                System.out.println("You now have: " + shuriken 
                    + " Shuriken(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
        
            if(commandBuy == 3 && goldTotal >= 40 && level >= 2)
            {
                bomb++;
                items++;
                goldTotal = goldTotal - 40;
                System.out.println("You now have: " + bomb + " Bomb(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
            
            if(commandBuy == 4 && goldTotal >= 50 && level >= 3)
            {   
                nuke++;
                items++;
                goldTotal = goldTotal - 50;
                System.out.println("You now have: " + nuke + " nukes(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
        
            else
            {
            System.out.println("You do not have the required level or gold need to buy this weapon!");
            }
        }
    
        if(commandShop.equalsIgnoreCase("Items"))
        {
            Random numberGenerator = new Random();
            // Generate A Random Number 
            int nextRandom = numberGenerator.nextInt();
            Set<Integer> validateitem = new HashSet<>();
            // Add First Randomly Genrated Number To Set 
            validateitem.add(nextRandom);
            for (int i = 0; i < 2; i++) {
                // Generate Randoms Till You Find A Unique Random Number 
                while(validateitem.contains(nextRandom)) {
                    nextRandom = numberGenerator.nextInt(3);
                }
                 // Add Newly Found Random Number To Validate 
                 validateitem.add(nextRandom);

                 System.out.println(item[nextRandom]);
                    }
            System.out.print("Choice: ");
            commandShop = in.next();
            System.out.println();
        
            if(commandBuy == 1 && goldTotal >= 10)
            {
                hpPotion++;
                items++;
                goldTotal = goldTotal - 10;
                System.out.println("You now have: " + hpPotion + " Small HP-Potion(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
        
            if(commandBuy == 2 && goldTotal >= 20 && level >= 1)
            {
                mpPotion++;
                items++;
                goldTotal = goldTotal - 20;
                System.out.println("You now have: " + mpPotion + " Mana-Potion(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
        
            if(commandBuy == 3 && goldTotal >= 40 && level >= 2)
            {
                potion++;
                items++;
                goldTotal = goldTotal - 40;
                System.out.println("You now have: " + potion + " Large HP-Potions(s)!\n"
                    + "You now have: " + goldTotal + " gold!\n");
            }
        
            else
            {
                System.out.println("You do not have the required level or gold needed to buy this item!");
            }
        }
    
    }
    while(!commandShop.equalsIgnoreCase("Leave"));
}

public static void game()
{ 
    Scanner in = new Scanner(System.in);
    do
    {
        System.out.print("-----------------------\n");
        System.out.print("What do you wish to do?\n");
        System.out.print("Hunt \nShop \nSleep \nStats \nLevelUp");
        System.out.print("\nInventory \n");
        System.out.print("Choice: ");
        command = in.next();
        System.out.println();
        
        if(command.equalsIgnoreCase("Hunt"))
        {
            int monsterChance = (int)(Math.random() * 100);
            
            if(monsterChance <= 50)
            {
                huntRat();
            }
            
            if(monsterChance <=90 && monsterChance > 50)
            {
                huntWeasel();
            }
            
            if(monsterChance <=100 && monsterChance > 90)
            {
                huntBear();
            }
        }
        
        if(command.equalsIgnoreCase("Sleep"))
        {
            hp = 100;
            mana = 10;
            System.out.println("You HP is now at 100");
            System.out.print("and your Mana is at 10!\n");
        }
        
        if(command.equalsIgnoreCase("Stats"))
        {
            System.out.println("You have: " + expTotal + " exp!");
            System.out.println("You have: " + goldTotal + " gold!");
            System.out.println("Your level is: " + level);
        }
    
        if(command.equalsIgnoreCase("LevelUp"))
        {
            
            if(expTotal >= 100)
            {
                level++;
                System.out.println("CONGRATS! You have leveled up!");
                System.out.println("Your level is: " + level);
                expTotal = expTotal - expTotal;
                hp = hp + hp;
            }
            
            else
            {
                System.out.println("You don't have enough exp! Hunt more!");
            }
        }
        
        if(command.equalsIgnoreCase("Shop"))
        {
            System.out.println("Welcome to the shops!");
            shop();
        }
        
        if(command.equalsIgnoreCase("Inventory"))
        {
            System.out.print("You have: " + arrow + " arrow(s)\n");
            System.out.print("You have: " + shuriken + " shuriken(s)\n");
            System.out.print("You have: " + bomb + " bomb(s)\n");
            System.out.print("You have: " + nuke + " nukes(s)\n");
            System.out.print("You have: " + hpPotion + " small hp-potion(s)\n");
            System.out.print("You have: " + mpPotion + " mana-potion(s)\n");
            System.out.print("You have: " + potion + " large hp-potion(s)\n");
        }
    }
        while(!command.equalsIgnoreCase("STOP"));
        System.out.println("You have left the game, GG!");
} 
    }

