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





        Student stud1 = new Student();
        stud1.Imię = "Basia";
        stud1.Nazwisko = "Kowalska";
        stud1.rok = 3;
        stud1.attending = true;


        Student stud2 = new Student();
        stud2.Imię = "Kasia";
        stud2.Nazwisko = "Bolewska";
        stud2.rok = 4;
        stud2.attending = false;

        Student stud3 = new Student();
        stud3.Imię = "Daniel";
        stud3.Nazwisko = "Stachowski";
        stud3.rok = 8;
        stud3.attending = true;


        String[] studimiona = {"Basia Kowalska", "Kasia Bolewska", "Daniel Stachowski"};
        int [] studrok = {2,4,8};
        boolean [] attendance = {true, false, true};

        System.out.println(studimiona[0] + "\n" + "Klasa: " + studrok[0] + "\n" + "Obecny/a : " + attendance[0] + "\n");
        System.out.println(studimiona[1] + "\n" + "Klasa: " + studrok[1] + "\n" + "Obecny/a : " + attendance[1] + "\n");
        System.out.println(studimiona[2] + "\n" + "Klasa: " + studrok[2] + "\n" + "Obecny/a : " + attendance[2]);

























    }
}
