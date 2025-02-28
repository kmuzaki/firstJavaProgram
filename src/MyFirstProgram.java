import java.util.Scanner;

public class MyFirstProgram {
    // Initialise string colours
    static String Black = "\u001b[30m";
    static String Red = "\u001b[31m";
    static String Green = "\u001b[32m";
    static String Yellow = "\u001b[33m";
    static String Blue = "\u001b[34m";
    static String Magenta = "\u001b[35m";
    static String Cyan = "\u001b[36m";
    static String White = "\u001b[37m";
    static String Reset = "\u001b[0m";
    static String BrightYellow = "\u001b[33;1m";

    public static void main(String[] args){
        // Initialise necessary variables for the program
        String username;
        String javaVersion = System.getProperty("java.version"); // Retrieve Java version
        
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
        "Although Java was released in 1995, the actual first Java Development Kit or JDK 1.0 was released in 1996.",
        "Java has an automatic memory management feature called 'Garbage Collection'. It runs Java programs more efficiently by removing unused objects and freeing up memory in the process.",
        "One of Java's most celebrated features is its platform independence. Fascinating, don't you think?",
        "Java was designed with a strong emphasis on reliability and security because of its clean and strongly typed syntaxes.",
        "Minecraft was built on Java. Though Mojang to this day hasn't rewrite the game's code to take full advantage of current PC hardware. What a bummer."};

        /* References for Java Facts 
         - "Java: History, Features, and Ecosystem" module from UC Elearn
         - ChatGPT, https://chatgpt.com/share/67bf130b-8844-800c-acd5-7ff8101fcf02
         - GeeksforGeeks, Java Memory Management, https://www.geeksforgeeks.org/java-memory-management/
         - GeeksforGeeks, Garbage Collection in Java, https://www.geeksforgeeks.org/garbage-collection-java/
         - Lord Jon25, The Downfall of Minecraft's performance, https://www.youtube.com/watch?v=QhRRft5hqZs&pp=ygUcbWluZWNyYWZ0IHBlcmZvcm1hbmNlIGlzc3Vlcw%3D%3D
        */

        int arraySize = (javaFacts.length);
        int arrayCursor = 0;

        // Initialise scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Print welcome message
        System.out.println(Yellow + "Ughh what is it again Gordon- Oh! It's you. Welcome to Black Mesa, fellow scientist!");
        System.out.println("I'm Dr. Isaac Kleiner, but you can call me Izzy.");
        System.out.println("");

        // Asks the user for name as input
        System.out.print("What's your name?: " + Reset);
        username = scanner.next();

        // Prints the message
        if (username.equals("Gordon")) {
            System.out.println(Yellow + "Oh? Well that makes it easier for me to remember, actually. Since one of my colleagues is also named Gordon.");
            System.out.println("Hahah. What a matter of coincidence!");
            System.out.println("");
        } else if (username.equals("Freeman")) {
            System.out.println(Yellow + "Freeman!? What are the odds that you have the exact same name as my friend's last name?");
            System.out.println("");
            System.out.print("Oh well then. ");
        } else {
            System.out.println(Yellow + "Ah I see! Well, it's nice to meet you, " + Cyan + username + Yellow + "!");
            System.out.println("");
        }
        

        // Print a Java fact
        arrayCursor = (int) (Math.random() * arraySize);
        System.out.println("Did you know? " + Green + javaFacts[arrayCursor]);
        System.out.println("");  

        // Prints out current Java version
        System.out.println(Yellow + "It seems like you currently have Java version " + BrightYellow + javaVersion + Yellow + " installed, " + Cyan + username + Yellow + "." + Reset);

        // Close the scanner
        scanner.close();
    }
}

/* Code references
 w3Schools, Java Tutorial, http://www.w3schools.com/java/
Code With Vinay, Colours In Console in Java Using ANSI Color codes, https://youtu.be/MERwLlyIJvs
 */