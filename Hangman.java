import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Hangman{
  public Hangman(){
   
   
  
    System.out.println("***WELCOME TO HANGMAN****");
  
  
    //The dictionary
    ArrayList<String> words = new ArrayList<>();
    words.add("hello");
    words.add("world");
    words.add("apple");
    words.add("yellow");
    words.add("green");

    Scanner textScanner = new Scanner(words);
    Scanner input = new Scanner(System.in);

    String hidden_text = words.get((int)(Math.random() * words.size()));
    char[] textArray = hidden_text.toCharArray();

    char[] userAnswers = new char[textArray.length];
    for(int i = 0; i < textArray.length; i++) {
      userAnswers[i] = '?';

    }    
    boolean finished = false;
    int lives = 6;

    while(finished == false) {
      System.out.println("*************************");
      String letter = input.next();
       // check for valid input
       // checks first letter or input
       while(letter.length != 1 || Character.isDigit(letter.chatAt(0))) {
               System.out.println("Error input -- Try Again");
               letter = input.next();
       }
        // checks if letter is in the word
        boolean found = false;
        for(int i = 0; i < textArray.length; i++){
          if(letter.chatAt(0) == textArray[i]){
            userAnswers[i] = textArray[i];
            found = true;
          }
        }
        // if letter is not found in word
        if(!found){
            lives --;
            System.out.println("Wrong Letter");
        }
        boolean done = true;
        for(int i = 0; i < userAnswers.length; i++){
          //if letter is not guessed yet
          if(userAnswers[i] == '?'){
            System.out.print("_");
            done = false;
          }else {
            System.out.println(" " + userAnswers[i]);
          }
        }
        System.out.println("\n" + "Lives left: " + lives);
        drawHangman(lives);
        // check if the game ends
        if(done) {
          System.out.println("Congrats! \n You found the word");
          finished = true;
        }  
        if(lives <= 0){
          System.out.println("You are dead.");
          finished = true;
        }      
    
 }

  }
  

  public static void drawHangman(int l) {
  if(l == 6) {
   System.out.println("|----------");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
  else if(l == 5) {
   System.out.println("|----------");
   System.out.println("|    O");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
  else if(l == 4) {
   System.out.println("|----------");
   System.out.println("|    O");
   System.out.println("|    |");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
  else if(l == 3) {
   System.out.println("|----------");
   System.out.println("|    O");
   System.out.println("|   -|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
  else if(l == 2) {
   System.out.println("|----------");
   System.out.println("|    O");
   System.out.println("|   -|-");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
  else if(l == 1) {
   System.out.println("|----------");
   System.out.println("|    O");
   System.out.println("|   -|-");
   System.out.println("|   /");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
  else{
   System.out.println("|----------");
   System.out.println("|    O");
   System.out.println("|   -|-");
   System.out.println("|   /|");
   System.out.println("|");
   System.out.println("|");
   System.out.println("|");
  }
 }
}
