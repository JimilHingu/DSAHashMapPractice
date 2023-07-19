import java.util.*;

public class QuthirdCreatingflow {

  public static String printFlow(HashMap<String, String> map) {
    //this is a change
    for (String i : map.keySet()) {
      for (String j : map.keySet()) {
        if (i.equals(map.get(j))) {
          System.out.println("starting poin is: " + j);
          return i;
        } 
      }
    }
    return null;

  }

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("AAA", "CCC");
    map.put("CCC", "EEE");
    map.put("EEE", "III");
    map.put("III", "JJJ");
    map.put("JJJ", "KKK");
    map.put("KKK", "LLL");
    String start = printFlow(map);

    while(map.containsKey(start)){
      System.out.println( start);
      start=map.get(start);
    }
  }
}
