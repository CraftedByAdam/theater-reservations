package com.pluralsight;

import java.util.Scanner;

public class MyTheaterReservation {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your Full Name: ");
        String name = scanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.print("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        String[] nameParts = name.split(" ");
        System.out.println(nameParts[1] + ", " + nameParts[0]);

        String[] dateParts = date.split("/");
        System.out.println(dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0]);

        String ticketText;
        if (tickets == 1) {
            ticketText = "ticket";
        }else{
            ticketText = "tickets";
        }

        System.out.println(tickets + " " + ticketText + " " + "reserved for" + " " + dateParts[2] + "-" + dateParts[1] + "-" + dateParts[0] + " " + "under" + " " +nameParts[1] + ", " + nameParts[0]);

    }
}
