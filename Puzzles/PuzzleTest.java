public class PuzzleTest {
  public static void main(String args[]) {
    PuzzleJava puzzle = new PuzzleJava();
    System.out.println(puzzle.getTenRolls());
    System.out.println(puzzle.getRandomLetter());
    System.out.println(puzzle.generatePassword());
    System.out.println(puzzle.getNewPasswordSet(5));

    int[] newList = { 1, 2, 3, 4, 5, 6 };
    for (int i = 0; i < newList.length; i++) {
      System.out.println(newList[i]);
    }

    System.out.println("--------------");

    puzzle.shuffleArray(newList);
    //Pasa la referencia y modifica el array original

    for (int i = 0; i < newList.length; i++) {
      System.out.println(newList[i]);
    }
  }
}
