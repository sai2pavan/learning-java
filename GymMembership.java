/*Gym Membership Registration System
Imagine you are developing a Gym Membership Registration System for a fitness center. When a new user wants to join the gym, they are required to provide their personal details for registration. The user is prompted to input their name and select a membership plan, such as "Monthly" or "Yearly". After the user enters their information, the system confirms the details by displaying them in a well-formatted output.



This type of program is often used in registration systems for gyms, fitness centers, or sports clubs. It ensures that the member's name and the type of membership are clearly presented so that the gym's staff can verify the registration process.

The task is to create a console-based application that collects the user's name and the membership type (such as "Monthly" or "Yearly"). The program should immediately display the information after it is entered, confirming the user’s registration in a clean, readable format. This application does not involve complex operations—just gathering input and displaying it.



Input Format

The program will prompt the user to input:

A string representing the user's name.
A string representing the selected membership type (e.g., "Monthly", "Yearly").


Output Format

The program will print:

The user's name.
The selected membership type.


Sample Input

John Doe

Monthly



Sample Output

Member Name: John Doe

Selected Membership: Monthly*/

import java.util.Scanner;

public class GymMembership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String membership = scanner.nextLine();

        System.out.println("Member Name: " + name);
        System.out.println("Selected Membership: " + membership);
    }
}
