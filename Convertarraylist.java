import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> languages= new ArrayList<>();

    
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    
    String[] arr = new String[languages.size()];

    
    languages.toArray(arr);
    System.out.print("Array: ");
    for(String item:arr) {
      System.out.print(item+", ");
    }
  }
}
