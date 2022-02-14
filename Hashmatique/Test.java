import java.util.HashMap;
import java.util.Set;

public class Test {
  public static void main(String args[]) {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Cancion 1", "Prueba 1 Prueba 1 Prueba 1");
    trackList.put("Cancion 2", "Prueba 2 Prueba 2 Prueba 2");
    trackList.put("Cancion 3", "Prueba 3 Prueba 3 Prueba 3");
    trackList.put("Cancion 4", "Prueba 4 Prueba 4 Prueba 4");

    System.out.println(trackList.get("Cancion 1"));

    Set<String> setNames = trackList.keySet();

    for (String song : setNames) {
      System.out.println(trackList.get(song));
    }
  }
}
