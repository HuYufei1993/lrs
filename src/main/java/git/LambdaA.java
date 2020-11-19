package git;

public class LambdaA {

    public static void main(String[] args) {
      GreetingMessage message1 = (a, b) -> 1;
      GreetingMessage message2 = (a, b) -> a+b;
    }
}

interface GreetingMessage {
    int hello(int a, int b);
}