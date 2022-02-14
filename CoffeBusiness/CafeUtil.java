import java.util.ArrayList;

class CafeUtil {
  public int getStreakGoal(int numWeeks) {
    int sum = 0;
    for (int i = 1; i <= numWeeks; i++) {
      sum += i;
    }
    return sum;
  }

  public double getOrderTotal(double[] prices) {
    double sum = 0;
    for (int i = 0; i < prices.length; i++) {
      sum += prices[i];
    }
    return sum;
  }

  public void displayMenu(ArrayList<String> menuItems) {
    for (int i = 0; i < menuItems.size(); i++) {
      System.out.println(i + " " + menuItems.get(i));
    }
  }

  public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
    if (menuItems.size() != prices.size()) {
      System.out.println("Diferentes tamaños de array");
      return false;
    }

    for (int i = 0; i < menuItems.size(); i++) {
      System.out.format("%d %s -- $%,.2f %n", i, menuItems.get(i), prices.get(i));
    }
    return true;
  }

  public void addCustomer(ArrayList<String> customers) {
    System.out.println("Por favor, ingresa tu nombre:");
    String userName = System.console().readLine();
    System.out.println("Hola, " + userName);
    System.out.println("Hay " + customers.size() + " personas frente a ti");
    customers.add(userName);
    System.out.println(customers);
  }

  public void addCustomers(ArrayList<String> customers) {
    
    String userName = "";
    do {
      System.out.println("Por favor, ingrese nuevo usuario (para terminar presione q):");
      userName = System.console().readLine();
      if (userName.equals("q")) {
        break;
      }
      System.out.println("Agregado, " + userName);
      System.out.println("Hay " + customers.size() + " personas frente a este usuario");
      customers.add(userName);
      System.out.println(customers);
      System.out.println("--------------------------------");
    } while (!userName.equals("q"));  
  }

  public void printPriceChart(String product, double price, int maxQuantity) {
    System.out.println(product);
    for (int i = 1; i <= maxQuantity; i++) {
      double mount = price * i - (400*i);
      System.out.format("%d - $%,.2f %n", i, mount);
    }
  }
}
