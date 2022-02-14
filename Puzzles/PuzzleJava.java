import java.util.ArrayList;
import java.util.Random;

class PuzzleJava {
  Random randMachine = new Random();
  
  public ArrayList<Integer> getTenRolls() {
    ArrayList<Integer> randomRollsList = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      randomRollsList.add(randMachine.nextInt(21));
    }
    return randomRollsList;
  }

  /*
  char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();  
  */
  
  //This generates a lower-cased version of alphabet, if you want upper-cased, you can replace '97' with '65'.
  public char getRandomLetter() {
    char[] alphabet = new char[26];
    for (int i = 0; i < 26; i++) {
      alphabet[i] = (char) (97 + i);
    }

    return alphabet[randMachine.nextInt(alphabet.length)];
  }
  
  public String generatePassword() {
    String password = "";
    for (int i = 0; i < 8; i++) {
      password += getRandomLetter();
    }
    return password;
  }

  public ArrayList<String> getNewPasswordSet(int num) {
    ArrayList<String> randomWordsList = new ArrayList<String>();
    for (int i = 0; i < num; i++) {
      randomWordsList.add(generatePassword());
    }
    return randomWordsList;
  }

  public int[] shuffleArray(int[] list) {
    for (int i = 0; i < list.length; i++) {
      int random = randMachine.nextInt(list.length);
      int aux = list[i];
      list[i] = list[random];
      list[random] = aux;
    }
    return list;
  }
  
}