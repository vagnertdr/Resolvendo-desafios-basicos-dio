import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // consume the newline character
        scanner.nextLine();

        // nextLine() returns an empty string after nextInt() is called
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + ". You are " + age + " years old.");
    }
}