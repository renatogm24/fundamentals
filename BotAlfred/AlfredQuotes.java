import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class AlfredQuotes {
    
  public String basicGreeting() {
    // No necesitas codificar aquí, este es un método de ejemplo
    return "Hola, encantado de verte. ¿Cómo estás?";
  }
    
  public String yell(String phrase) {

    // No necesitas codificar aquí, este es un método de ejemplo
    return phrase.toUpperCase()+"!!!!";
  }
    
    public String guestGreeting(String name) {
      return String.format("Hola, %s. Encantado de verte", name);
    }
    
    public String guestGreeting() {
        Date date = new Date();   // given date
        Calendar calendar = GregorianCalendar.getInstance(); 
        calendar.setTime(date);   
        int hour = calendar.get(Calendar.HOUR_OF_DAY); 
        String timeGreeting = "";
        if (hour<12) {
          timeGreeting = "Buenos dias";
        } else if (hour >= 12 && hour < 19) {
          timeGreeting = "Buenos tardes";
        } else {
          timeGreeting = "Buenos noches";
        }
        return String.format("%s. Encantado de verte",timeGreeting);
    }
    
    public String dateAnnouncement() {
        return String.format("Actualmente es %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
      if (conversation.contains("Alexis")) {
          return "De inmediato, señor. Ciertamente no es lo suficientemente sofisticada para eso";
        } else if(conversation.contains("Alfred")){
          return "A su servicio. Como desee, naturalmente";
        } else {
          return "Bien. Y con eso, me retiraré";
        }
        
    }
    
	// BONUS NINJA
	// Ver las especificaciones para sobrecargar el método guessGreeting
    // BONUS SENSEI
    // ¡Escribe tu propio método AlfredQuotes usando cualquiera de los métodos String que has aprendido!
}