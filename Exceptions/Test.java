import java.util.ArrayList;

public class Test {
  public static void main(String args[]) {
    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("Hola Mundo");
    myList.add(48);
    myList.add("Adios Mundo");

    for(int i = 0; i < myList.size(); i++) {
      try {
        int castedValue = (int) myList.get(i);
      } catch (ClassCastException e) {
        System.out.format("El error se dio en el indice %d con el valor %s %n", i, myList.get(i));
      }
      
    }
  }
  
  
}
