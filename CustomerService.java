/*Customer Service System Welcome Screen
Imagine you're developing a customer service console-based application that greets each customer with a personalized message when they log in. The program should retrieve the customer's name and display a friendly welcome message. This interaction helps customers feel acknowledged as they begin their service session. The message should display "Welcome" followed by the user's name, formatted neatly with a tab space in between.

In this customer service system, when a user logs in, the system should greet them with a personalized message. For example, if the user’s name is "John", the system should display "Welcome John", where there is a tab space between "Welcome" and "John". This mimics a real-time scenario where personalized greetings make interactions with automated systems more user-friendly and professional.

Write a program that prints a welcome message to the user. The message should be in the format:

"Welcome [username]", where the username is printed after a tab space.



Input Format

The user will input their name as a string.



Output Format

The system should output "Welcome [username]", with a tab space separating the word "Welcome" and the user's name.



Sample Input

Tamilarasan



Sample Output

Welcome Tamilarasan */

import java.util.Scanner;

public class CustomerService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("Welcome\t" + username);
    }
}
