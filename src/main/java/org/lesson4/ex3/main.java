package org.lesson4.ex3;

public class main {
    public static void main(String[] args) {
        TicketSeller ticketSeller = new TicketSeller("Katarzyna", "Nowak", 2001);
        System.out.println(ticketSeller.introduce());
        Manager manager = new Manager ("Grzegorz", "Czerwinski", 2002);
        System.out.println((manager.introduce));
        Manager manager1 = new Manager ("Jan", "Kowalski", 2003);
        manager1.setBonus(500);
        System.out.println(manager1.introduce);

    }
}
