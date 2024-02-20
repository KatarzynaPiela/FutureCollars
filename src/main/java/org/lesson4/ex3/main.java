package org.lesson4.ex3;

public class main {
    public static void main(String[] args) {
      TicketSeller ticketSeller = new TicketSeller("Katarzyna", "Nowak", 2001, 1000);
      System.out.println(ticketSeller);
      Manager manager = new Manager(3000, 500, 2002, "Kowalski", "Jan" );
       Manager manager1 = new Manager(2500, 300, 2003, "Nowak", "Marek");

    }
}
