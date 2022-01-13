import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
           - a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
    */





        Student student1 = new Student(){

        String Imię = "Basia";
        String Nazwisko = "Kowalska";
        int rok = 3;
        boolean attending = true;
        };


        Student student2 = new Student() {

            String Imię = "Kasia";
            String Nazwisko = "Kowalska";
            int rok = 5;
            boolean attending = false;
        };

        Student student3 = new Student() {

            String Imię = "Daniel";
            String Nazwisko = "Stachowski";
            int rok = 8;
            boolean attending = true;
        };

        ArrayList<Student> studentci = new ArrayList<>();
        studentci.add(student1);
        studentci.add(student2);
        studentci.add(student3);

        for(Student student: studentci);
        {
            System.out.println(student1  + "\n" + student2 + "\n" + student3);
        }























    }
}
