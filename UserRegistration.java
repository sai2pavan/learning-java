/*User Registration System
You are developing a User Registration System for an online platform where users need to register by providing their age and name. The system needs to collect and store these details for each user to manage their profile. The age will be used to verify the eligibility of the user, while the name will be stored for identification purposes.

In this scenario, the program prompts the user to input their age (as an integer) and their name (as a string). After collecting the inputs, the program prints the details in a user-friendly format. This functionality is useful for applications that require user registration, such as e-commerce platforms, social media, or any online service that needs user identification and verification.



Input Format

The input consists of:

An integer representing the user's age.
A string representing the user's name.


Output Format

The output should print the user's age and name in a structured format.



Sample Input

25

Alice



Sample Output

User Details:

Name: Alice

Age: 25*/

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();

        System.out.println("User Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
