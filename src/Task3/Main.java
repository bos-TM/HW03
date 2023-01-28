package Task3;

public class Main {
    public static void main(String[] args) {
        String text = "This is a sample text taken from the internet. It can be about anything. The important thing is to split it into two equal parts.";

        int halfLength = text.length() / 2;
        String firstHalf = text.substring(0, halfLength);
        String secondHalf = text.substring(halfLength);

        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}
