
import java.util.Scanner;


public class App {
  Scanner myScanner = new Scanner(System.in);
	Scanner enterScanner = new Scanner(System.in);
	int playerHP;
	String playerName;
	String playerWeapon;
	int choice;
	int monsterHP;
	int silverRing;
  int crystalhoop;
  int sacredvenom;
  int frozensunlight;
  int spiritbook;

	public static void main(String[] args) {

		App dublin;
		dublin = new App();	
		
		dublin.playerSetUp(); 	
		dublin.townGate();
	}
	
	public void playerSetUp(){
		
		
		playerHP = 10;
		monsterHP = 15;

		playerWeapon = "Knife";

		System.out.println("Your HP: "+ playerHP);
		System.out.println("Your Weapon: "+ playerWeapon);
		
		System.out.println("Please enter your name:");
		
		playerName = myScanner.nextLine();
    	System.out.println("\n------------------------------------------------------------------\n");
		
		System.out.println("Hello " + playerName + ", \nyou are one of the Dungeon's most aclaimed and beloved \nthieves.\nYou hold masteries in many arenas -- \nIdentity Theft \nSocial Enginnering \nManipulation \nIllusion");
    	System.out.println("\n------------------------------------------------------------------\n");
		
    System.out.println("This season, the Lord of Thieves has chosen you to complete a \nstrenuous mission: Anaconda.");
    System.out.println("Press 1 to continue ");
    int first_choice = myScanner.nextInt();
    if(first_choice == 1){
      
      System.out.println("Anaconda is known to be an impossible mission only legendary \nmasterminds can complete it.\nYou'll have to enter the Shorendia Castle with the identity \nof someone else,and ransack all the values you can find \nin the time period...");
      System.out.println("The reason why this mission is difficult is because the guards\n will not let you in the Castle unless\n you have all of the elements they desire.");
      System.out.println("You pack some random belongings to seem like an innocent traveller, \nand head to the main entrance of the KingDom");
      System.out.println("To start your mission press 1");
      first_choice = myScanner.nextInt();
      while(first_choice != 1){
        System.out.println("To start your mission press 1");
        first_choice = myScanner.nextInt();
      }
      
    }else {
      	System.out.println("\n------------------------------------------------------------------\n");
      System.out.println("You were supposed to type in 1 \n ANYWAYS");

      System.out.println("Anaconda is known to be an impossible mission only legendary masterminds can complete.\n You'll have to enter the Shorendia Castle with the identity of someone else, \nand ransack all the values you can find in the time period...");
      System.out.println("The reason why this mission is difficult is because the guards will not let you in unless you have all of the elements they desire.");
      System.out.println("You pack some random belongigs to seem like an innocent traveller, and head to the main entrance of the KingDom");
    }
		
		
	}	
	
	public void townGate(){
		
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are at the gate of the Kingdom.");
		System.out.println("A guard is standing in front of you.");
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("");
		System.out.println("1: Talk to the guard");
		System.out.println("2: Sneak past the guard");
		System.out.println("3: Leave");
		System.out.println("\n------------------------------------------------------------------\n");

		choice = myScanner.nextInt();
		

		if(choice==1){
			if(silverRing==1 && crystalhoop==1){
				ending();
			}
			else{
				System.out.println("Guard: Hello there, stranger. So your name is " + playerName + '?');
        System.out.println("You: Yes, I'm a goods trader from the Southern Tribe");
				System.out.println("Guard: We cannot let you in yet, as you dont contain the items of purity \nand verification. \n These include: \n The Sacred Venom \n The Crystal Loop \n The Spirit Book \n The Frozen Sunlight \n and The Silver Ring");
        System.out.println("Guard: Take the crossroad on the right and start searching there");
        crossRoad();

			}
			
		}
		else if(choice==2){
			playerHP = playerHP-1;
			System.out.println("Guard: Wrong choice. \n\nThe guard arrests you, and shoots down your horse.\n");
      dead();
		}
		else if(choice==3){
			System.out.println("You leave in the search of crossroad to go back to your Dungeon");
      west();
      	
		}	
		else{
			townGate();
		}
	}
	
	public void crossRoad(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You do not have all the items the guards desire, yet.\n You are at the crossroad. \n You can return to the castle's entrance, by hitting 5\n ");
    System.out.println("1: Go north, to Wizard Kyoshi's place");
		System.out.println("2: Go east, to the Cobra's Temple");
		System.out.println("3: Go south, to the underground Library");
		System.out.println("4: Go west, to the Enchanted Forest");
    System.out.println("5. Go back to the castle's entrance");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			north();
		}
		else if(choice==2){
			east();
		}
		else if(choice==3){
			townGate();
		}
		else if(choice==4){
			west();
		}
    else if(choice == 5){
      townGate();
    }
		else{
			crossRoad();
		}
	}
	
	public void north(){
    Scanner input = new Scanner(System.in);
		System.out.println("\n------------------------------------------------------------------\n");
    if(frozensunlight == 0);{

    
    // You meet Kyoshi
		System.out.println("You knock on the door, but there is no response.");
    System.out.println("You start to head back, but hear the door open behind you.");
     
    System.out.println("'How can I help you?', you hear Kyoshi ask.");
    System.out.println("You: I'm looking for some kind of jar with sunlight? ");
    System.out.println("Kyoshi: Ah, yes! You mean this?\n He steps aside, to reveal a stunning and intricate jar\n that glowed bright in the room." );
    
    //Next 
    System.out.println("1. Next");
    choice = input.nextInt();
    if(choice ==1 ){
      System.out.println("You run to it with your arms wide, but trip over a tight rope \n underneath your feet.");
    System.out.println("Kyoshi: Yeah, not so fast. To recieve this jar, you'll have to \ncomplete on my most challenging mazes!");

      // You enter the maze
    System.out.println("Suddenly, the ground underneath \nyou starts to shake, and you fall into a \n endless-looking maze.");
    Hangman();

    }else {
    System.out.println("You run to it with your arms wide, but trip over a tight rope underneath your feet.");
    System.out.println("Kyoshi: Yeah, not so fast. To recieve this jar, you'll have to complete on my most challenging mazes!");

      
    System.out.println("Suddenly, the ground underneath you starts to shake, and you fall into a endless-looking maze.");
    Hangman();
    }
   
		playerHP = playerHP + 1;
		System.out.println("Your HP: " + playerHP);
		System.out.println("\n\n1: Go back to the crossroad");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			crossRoad();
		}
		else{
			north();
		}
	}
  }



	public void east(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You walked into a forest and found a Long Sword!");
		playerWeapon = "Long Sword";
		System.out.println("Your Weapon: "+ playerWeapon);
		System.out.println("\n\n1: Go back to the crossroad");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			crossRoad();
		}
		else{
			east();
		}
	}
	




	public void west(){
		System.out.println("\n------------------------------------------------------------------\n");
	  Scanner in = new Scanner();
    Random rand = new Random(); // rand num generator for enemies.

    //enemy variables
    String[] enemies = { "Monster", "Goblin", "Assassin"};
    int maxHealthE = 80;
    int AttackfromEnemy = 25;

    //user variables
    int health = 90;
    int damageFromAttack = 50;
    int healthPotions = 2;
    int potionsHealing = 20;
    int potionsFromEnemies = 40; // There is a 40 percent chance for the enemy to drop a healing potion

    boolean running = true;
    FIGHT:
    while(running) {
          System.out.println("\n------------------------------------------------------------------\n");
          int enemyHealth = rand.nextInt(maxHealthE); // rand num from 0 to 80;
          String enemy = enemies[rand.nextInt(enemies.length)]; // selects rand enemy from array
          System.out.println("\t# A " + enemy + "has appeared!! #\n");

          while(enemyHealth > 0) {
            System.out.println("\tYour HP: " +health);
            System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
            System.out.println("\nWhat are you gonna do?");
            System.out.println("\t1. Attack");
            System.out.println("\t2. Drink health potion");
            System.out.println("\t3.Run");

            String input = in.nextLine();
            if(input.equals("1")) {//CHOICE 1
              int damageDealt = rand.nextInt(damageFromAttack);// rand num from 0 to 50 for damage to enemy
              int damageTaken = rand.nextInt(AttackfromEnemy); //rand num from 0 to 25 for damage to player

                enemyHealth -= damageDealt; //enemy health
                health -= damageTaken; // user health

                System.out.println("\t>You strike the " + enemy + "for" + damageDealt + " damage.");
                System.out.println("\t You recieve" + damageTaken + " in retaliation");
                if(health <= 0) {
                  System.out.println("\t> You have taken too much damage. You are to weak to go on!");
                  break;
                }

            }else if(input.equals("2")){ // CHOICE 2
                    if(healthPotions > 0){
                      health += potionsHealing;
                      healthpotions--;
                      System.out.println("You drink a health potion, healing yourself for "+ potionsHealing + ".\n\t> You now have" + health + " HP."
                      + "\n\t> You have " + healthPotions + "left.\n");
                    }else {
                        System.out.println("\t> You have no health potions left \n Defeat enemies for a chance to earn one");
                    }
                    
            }else if(input.equals("3")){ // CHOICE 3
                     System.out.println("\t You run away from the" + enemy + "!");
                     continue FIGHT;
            }else{
              System.out.println("\tInvalid Command!");

            }
          }

              
            if(health <1) {
              System.out.println("You limp out in the forest, unable to get obtain the SilverRing ");
              break;
            }
                  System.out.println("\n------------------------------------------------------------------\n");
                  System.out.println(" # " + enemy + " was defeated! # ");
                  System.out.println("You obtained the silver Ring");
            if(rand.nextInt(100) < potionsFromEnemies) {
              healthPotions++;
              System.out.println(" # The " + enemy + " dropped a health potion! # ");
              System.out.println(" # You now have " + healthPotions + " health potion(s) left");
            }

            // 2ND CHOICE OPTIONS (AFTER 1ST FIGHT)
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue Fighting to obtain the Silver Ring, if you havent yet obtained it");
            System.out.println("2. Go back to the crossroad");
            String input = nextLine();
            while(!input.equals("1") && !input.equals("2")) {
              System.out.println("Invalid command!");
              input = in.nextLine();
            }

            if(input.equals("1")) { //option 1
              System.out.println("You continue fighting!");
            }else if ( input.equals("2")) {
              System.out.println("You return to the cross road");
              break;
              crossRoad();
            }
 
    }
    


	}



	

	public void dead(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You are dead!!!");
		System.out.println("\n\nGAME OVER");
		System.out.println("\n------------------------------------------------------------------\n");
		
	}
	
	public void win(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("You killed the monster!");
		System.out.println("The monster dropped a ring!");
		System.out.println("You obtaind a silver ring!\n\n");
		System.out.println("1: Go east");
		System.out.println("\n------------------------------------------------------------------\n");
		
		silverRing = 1;
		
		choice = myScanner.nextInt();
		if(choice==1){
			crossRoad();
		}
		else{
			win();
		}
		
	}
	
	public void ending(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Guard: Oh you killed that goblin!?? Great!");
		System.out.println("Guard: It seems you are a trustworthy guy. Welcome to our town!");
		System.out.println("\n\n           THE END                    ");
		System.out.println("\n------------------------------------------------------------------\n");
	}
}

	
