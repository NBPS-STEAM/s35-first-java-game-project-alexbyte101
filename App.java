
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
		
		System.out.println("Hello " + playerName + ", you are one of the Dungeon's most aclaimed and beloved thieves.\n You hold masteries in many arenas -- \nIdentity Theft \n Social Enginnering \n Manipulation \nIllusion");	
    System.out.println("This season, the Lord of Thieves has chosen you to complete a strenuous mission: Anaconda.");
    System.out.println("1. Next");
    int first_choice = myScanner.nextInt();
    if(first_choice == 1){
      System.out.println("Anaconda is known to be an impossible mission only legendary masterminds can complete.\n You'll have to enter the Shorendia Castle with the identity of someone else, and ransack all the values you can find in the time period...");
      System.out.println("The reason why this mission is difficult is because the guards will not let you in unless you have all of the elements they desire.");
      System.out.println("You pack some random belongigs to seem like an innocent traveller, and head to the main entrance of the KingDom");
    }else {
      	System.out.println("\n------------------------------------------------------------------\n");
      System.out.println("You were supposed to type in 1 \n ANYWAYS");

      System.out.println("Anaconda is known to be an impossible mission only legendary masterminds can complete.\n You'll have to enter the Shorendia Castle with the identity of someone else, and ransack all the values you can find in the time period...");
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
			if(silverRing==1 && spiritbook ==1 && sacredvenom &&  crystalhoop==1 && frozensunlight ==1){
				ending();
			}
			else{
				System.out.println("Guard: Hello there, stranger. So your name is " + playerName + '?');
        System.out.println("You: Yes, I'm a goods trader from the Southern Tribe");
				System.out.println("Guard: We cannot let you in yet, as you dont contain the items of purity and verification. \n These include: \n The Sacred Venom \n The Crystal Loop \n The Spirit Book \n The Frozen Sunlight \n and The Silver Ring");
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
		System.out.println("You are at the crossroad. If you go south, you will go back to the castle's entrance.\n\n");
		System.out.println("1: Go north");
		System.out.println("2: Go east");
		System.out.println("3: Go south");
		System.out.println("4: Go west");
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
		else{
			crossRoad();
		}
	}
	
	public void north(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("There is a river. You drink the water and rest at the riverside.");
		System.out.println("Your HP is recovered.");
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
		System.out.println("You encounter a goblin!\n");
		System.out.println("1: Fight");
		System.out.println("2: Run");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			fight();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			west();
		}
	}
	
	public void fight(){
		System.out.println("\n------------------------------------------------------------------\n");
		System.out.println("Your HP: "+ playerHP);
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("\n1: Attack");
		System.out.println("2: Run");
		System.out.println("\n------------------------------------------------------------------\n");
		
		choice = myScanner.nextInt();
		
		if(choice==1){
			attack();
		}
		else if(choice==2){
			crossRoad();
		}
		else{
			fight();
		}
	}
	
	public void attack(){
		int playerDamage =0;
		
		
		if(playerWeapon.equals("Knife")){
			playerDamage = new java.util.Random().nextInt(5); 
		}
		else if(playerWeapon.equals("Long Sword")){
			playerDamage = new java.util.Random().nextInt(8); 
		}
		
		System.out.println("You attacked the monster and gave " + playerDamage + " damage!");
		
		monsterHP = monsterHP - playerDamage;
		
		System.out.println("Monster HP: " + monsterHP);
		
		if(monsterHP<1){ win(); } else if(monsterHP>0){
			int monsterDamage =0;
			
			monsterDamage = new java.util.Random().nextInt(4);
			
			System.out.println("The monster attacked you and gave " + monsterDamage + " damage!");
			
			playerHP = playerHP - monsterDamage;
			
			System.out.println("Player HP: " + playerHP);
			
			if(playerHP<1){ dead(); } else if(playerHP>0){
				fight();
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

	
