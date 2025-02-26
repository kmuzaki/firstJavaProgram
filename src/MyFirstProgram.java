import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args){
        // Initialise necessary variables for the program
        String username;
        String javaVersion = System.getProperty("java.version");
        // boolean doneListeningFacts = false;
        
        // Storing multiple facts about Java within an array
        String[] javaFacts = {"Java in a nutshell was created by a group of people who despise the C programming language.", 
        "Java was initially named 'Oak' , however it was later renamed Java due to trademark issues. Which coincidentally",
        "Java was built with the 'Write Once, Run Anywhere' (WORA) Ideology, meaning that a compiled Java code could run on any device with Java Virtual Machine (JVM) installed. Even modern cars could run Java! Incredible, don't you think?",
        ""};

        // Initiate scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Print welcome message
        System.out.println("Ughh what is it again Gordon- Oh! It's you. Welcome to Black Mesa, fellow scientist!");
        System.out.println("I'm Dr. Isaac Kleiner, but you can call me Izzy.");

        // Asks the user for name as input
        System.out.print("What's your name?: ");
        username = scanner.next();

        // Prints the message
        System.out.println("Ah I see! Well, it's nice to meet you, " + username + "!");
        System.out.println("It seems like you currently have Java version " + javaVersion + " installed.");

        // Close the scanner
        scanner.close();
    }
}
