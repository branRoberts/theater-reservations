package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print(" Please enter your full name: ");
        String name = input.nextLine().trim();
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = input.nextLine().trim();
        System.out.print("How many tickets would you like: ");
        int tickets = input.nextInt();



        LocalDate formatedDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        String formattedName = name.substring(0, 1).toUpperCase() + name.substring(1);
        String fullTicket = "";
        int spaceIndex = name.indexOf(' ');
        String firstName = formattedName.substring(0,spaceIndex);
        String lastName = formattedName.substring(spaceIndex + 1);
        String formattedFullName = lastName + ", " + firstName;

        if (tickets == 1){
          fullTicket += tickets + " ticket reserved for " + formatedDate + " under " + formattedFullName;
            System.out.println(fullTicket);
        }
        else if (tickets > 1){
            fullTicket += tickets + " tickets reserved for " + formatedDate + " under " + formattedFullName;
            System.out.println(fullTicket);
        }
        else {
            System.out.println("You did not buy any tickets");
        }
    }
}
