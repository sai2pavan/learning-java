/*Student Information Management System
You are developing a Student Information Management System for a school or university. This system allows administrators or teachers to enter and display the details of students easily. Each student has specific attributes, including their name, age, CGPA, and grade. The system will print these details in a user-friendly format when the information is entered.

In this scenario, the program prompts the user to input the student's details: name (string), age (integer), CGPA (float), and grade (character). After collecting this information, the program will display the details in a structured format. The CGPA must be formatted to two decimal places to ensure readability and accuracy.



Input Format

The input consists of:

A string representing the student's name.

An integer representing the student's age.

A float representing the student's CGPA.

A character representing the student's grade.



Output Format

The program should output the student’s details in the following format:

Name: [name]

Age: [age]

CGPA: [CGPA]

Grade: [grade]



Sample Input

Rajeev

20

8.6467

B



Sample Output

Name: Rajeev

Age: 20

CGPA: 8.64

Grade: B */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();
        float cgpaInput = scanner.nextFloat();
        scanner.nextLine();
        char grade = scanner.nextLine().charAt(0);

        BigDecimal cgpa = new BigDecimal(Float.toString(cgpaInput));
        cgpa = cgpa.setScale(2, RoundingMode.DOWN);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Grade: " + grade);
    }
}
