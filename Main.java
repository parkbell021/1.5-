import java.util.Scanner;
class Main {
  public static void main(String[] args) {

  //////////Variables
  Scanner input = new Scanner(System.in);
  String question1;
  char question2;
  int question3;
  String question4;


//////////Input Screen for question 1
  System.out.println("Greeting! Please answer on these following questions!");
  System.out.println("------------------------------");
  System.out.println("Question1: Are you in Computer Class. Is it true?");
  question1 = input.nextLine();

//////////Ouput Screen for answer 1 
  boolean answer1 = true;
  if (answer1) 
  {
  System.out.println("Correct");
  }
  else 
  {
  System.out.println("Incorrect");
  } 

//////////Input Screen for question 2
  System.out.println("------------------------------");
  System.out.println("Question2: What grade are you in?");
  System.out.println("a. Grade 9");
  System.out.println("b. Grade 10");
  System.out.println("c. Grade 11");
  System.out.println("d. Grade 12");
  question2 = input.nextLine().charAt(0);

//////////Ouput Screen for answer 2
  if (question2 =='d') 
  {
  System.out.println("Correct");
  }
  else  
  {
  System.out.println("Incorrect");
  }

//////////Input Screen for question 3
  System.out.println("------------------------------");
  System.out.println("Question3: What is a passing grade?");
  question3 = Integer.parseInt(input.nextLine());

//////////Ouput Screen for answer 3
  if (question3>=50||question3<=100)
   {
  System.out.println("Correct! The passing grade is between 50 to 100");
  } 
  else 
  {
  System.out.println("Incorrect. The passing grade is between 50 and 100");
  }
  
//////////Input Screen for question 3
  System.out.println("------------------------------");
  System.out.println("Question4: What is the capital of South Korea?");
  question4 = input.nextLine();

//////////Ouput Screen for answer 4
  if (question4.equals("Seoul")) 
  {
  System.out.println("Correct");
  }
  else  
  {
  System.out.println("Incorrect");
  }
  }
}