package org.lesson13ex4;

import java.util.List;
import java.util.stream.Stream;

public class Doctor {
    public static void main(String[] args) {
        List<String> doctorsList = List.of(
                "Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra",
                "Przychodnia:Internista:Laryngolog:Pediatra");
        List<String> doctors = doctorsList.stream()
                .flatMap(doc -> Stream.of(doc.split(":")))    // R apply(T t);
                .filter(doc -> !doc.equals("Szpital") && !doc.equals("Przychodnia"))
                .distinct()
                .toList();
        System.out.println(doctors);
    }
}