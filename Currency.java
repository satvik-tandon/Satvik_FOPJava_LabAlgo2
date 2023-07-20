import java.util.*;

public class Currency {

   public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of currency denominations:");
    int size = sc.nextInt();

    PriorityQueue<Integer> denominations = new PriorityQueue<>(Collections.reverseOrder());

    System.out.println("Enter the currency denominations value:");
    for (int i = 0; i < size; i++)
      denominations.add(sc.nextInt());

    System.out.println("Enter the amount you want to pay:");
    int amount = sc.nextInt();

    Map<Integer, Integer> mp = new TreeMap<>(Collections.reverseOrder());

    while (!denominations.isEmpty()) {
      int denomination = denominations.poll();
      int notes = amount / denomination;
      if (notes > 0) {
        mp.put(denomination, notes);
        amount %= denomination;
      }
    }

    System.out.println("Your payment approach in order to give the min no of notes will be:");
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());

      sc.close();
    }
  }
}
