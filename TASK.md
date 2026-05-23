### You're a secret service agent and urgently need to sort through a batch of intercepted messages. Their contents aren't important yet, but you absolutely must quickly figure out which ones are the shortest and which are the longest. Time is precious, and every second of computing time can be used to save the world!

#### Create a list of three hypothetical "secret messages" (strings). Your mission is to sort this list by the length of each message. Use the shortest and most efficient lambda expression possible. Once the messages are sorted, immediately display the result so your superior can quickly assess the situation.

```java
import java.util.ArrayList;
import java.util.List;

public class SecretServiceApp {
    public static void main(String[] args) {
        // Create a mutable list of three "secret messages"
        List<String> messages = new ArrayList<>(List.of(
                "Agreement reached at 11:40 PM",
                "Urgent!",
                "Alpha Cipher"
        ));
        
        // Sort by ascending length using a short lambda comparator
        
        // Print the sorted messages line by line
    }
}
```
