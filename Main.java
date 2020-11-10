import java.util.*;
class Main {
  public static void main(String[] args) {
  Scanner userInput = new Scanner(System.in);
  Scanner userIn2 = new Scanner(System.in);
  System.out.println("Enter string here and the program will return its length");
  String y = userInput.nextLine();
  int x = y.length();
  System.out.println("the length of the string is: " + x);
  System.out.println("Enter the length of the substring you want outputted from your string. The substring will start at the first character and end at the character number you entered. Enter length here:");
  int characterNum = userIn2.nextInt();
  String newSub = y.substring(0, characterNum);
  System.out.println("Your substring is: " + newSub);
  System.out.println("Enter the section of your original string you wish to replace: ");
  String remove = userInput.nextLine();
  System.out.println("What do you want it to be replaced with? ");
  String replace = userInput.nextLine();
  String nString = y.replace(remove, replace);
  System.out.println("Your new string is:" + nString);
  //you have to type word = here because it saves the operation to the string object. otherwise it just treats it like it never happened.
  System.out.println(nString);
  }
}