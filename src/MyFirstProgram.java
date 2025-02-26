import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args){
        // Initialise necessary variables for the program
        String username;
        String javaVersion = System.getProperty("java.version"); // Retrieve Java version
        boolean doneListeningFacts = false;
        
        // Storing multiple facts about Java within an array
        String[] javaFacts = {"Java in a nutshell was created by a group of people who despise the C programming language.", 
        "Java was initially named 'Oak' , however it was later renamed Java due to trademark issues. Which coincidentally",
        "Java was built with the 'Write Once, Run Anywhere' (WORA) Ideology, meaning that a compiled Java code could run on any device with Java Virtual Machine (JVM) installed. Even modern cars could run Java! Incredible, don't you think?",
        "Java was created by James Gosling, Mike Sheridan, Patrick Naughton, and others at Sun Microsystems in 1995.",
        "The name Java was inspired by the developers' love for Java Coffee. Hence the popular coffee cup logo associated with Java you see today.",
        "The revolutionary 'Write Once, Run Anywhere' (WORA) concept eliminated the need for developers to create separate versions of their software for different platforms.",
        "Java is a fully object-oriented language, which means that it is built around the concept of 'objects', which are entities that combine data and behavior.",
        "Java's object-oriented approach not only simplifies the development of complex systems, but also makes code more maintainable and scalable.",
        "Java was heavily influenced by C++ but removed complex features like pointers and operator overloading.",
        "Although Java was released in 1995. The actual first Java Development Kit or JDK 1.0 was released in 1996.",
        "Java has an automatic memory management feature called 'Garbage Collection'. It Java programs run more efficiently by remove unused objects, freeing up memory in the background.",
        };

        /* References for Java Facts 
         - "Java: History, Features, and Ecosystem" module from UC Elearn
         - ChatGPT, https://chatgpt.com/share/67bf130b-8844-800c-acd5-7ff8101fcf02
         - GeeksforGeeks, Java Memory Management, https://www.geeksforgeeks.org/java-memory-management/
         - GeeksforGeeks, Garbage Collection in Java, https://www.geeksforgeeks.org/garbage-collection-java/
        */

        int arrayCursor = 0;

        // Initialise scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Print welcome message
        System.out.println("Ughh what is it again Gordon- Oh! It's you. Welcome to Black Mesa, fellow scientist!");
        System.out.println("I'm Dr. Isaac Kleiner, but you can call me Izzy.");

        // Asks the user for name as input
        System.out.print("What's your name?: ");
        username = scanner.next();

        // Prints the message
        if (username.equals("Gordon")) {
            System.out.println("Oh? Well that makes it easier for me to remember, actually. Since one of my colleagues is also named Gordon.");
            System.out.println("Hahah. What a matter of coincidence!");
        } else if (username.equals("Freeman")) {
            System.out.println("Freeman!? What are the odds that you have the exact same name as my friend's last name?");
        } else {
            System.out.println("Ah I see! Well, it's nice to meet you, " + username + "!");
            System.out.println("");
        }

        // Print a Java fact
        // do {
            arrayCursor = (int) (Math.random() * 11);
            System.out.println("Did you know? " + javaFacts[arrayCursor]);
        // }
        // while (doneListeningFacts == false);
          

        // Prints out current Java version
        System.out.println("It seems like you currently have Java version " + javaVersion + " installed.");

        // Close the scanner
        scanner.close();
    }
}

/*
 
 */