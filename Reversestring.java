import java.util.Stack;

public class StringReverseExample { 

  public static void main(String[] args) { 
    String string = "codippa"; 
    
    Stack stack = new Stack(); 
    
    for (Character character : string.toCharArray()) { 
       
      stack.push(character); 
    } 
     
    String reversed = ""; 
    while(!stack.isEmpty()) { 
       
      reversed += stack.pop(); 
    } 
     
    System.out.println("Original string is: " + string); 
    System.out.println("Reversed string is: " + reversed); 
  } 
}
