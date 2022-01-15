import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

    }

    class Osoba {
        private String imie;
        private String nazwisko;
        private Integer indeks;


        public String setImie(String imie) {
            imie = "Adam";
            return imie;
        }


        public String setNazwisko(String nazwisko) {
            nazwisko = "Mazowiecki";
            return nazwisko;
        }


        public int setIndeks(Integer indeks) {
            indeks = 546233;
            return indeks;
        }


        public Osoba() {
            String imie = setImie("Adam");
            String nazwisko = setNazwisko("Mazowiecki");
            Integer indeks = setIndeks(546233);

            System.out.println(imie + " " + nazwisko + "\n Numer indeksu" + indeks);
        }

        /* zad 2 */

        Class Student;
        private Osoba osoba;
        private Enum WydziałEnum;

        public Osoba(Class student) {
            Student = student;
        }

        public Enum getWydziałEnum() {
            return WydziałEnum;
        }

        public void setWydziałEnum(Enum wydziałEnum) {
            WydziałEnum = wydziałEnum;
        }

        @Override
        public String toString() {
            return "Osoba{" +
                    "imie='" + imie + '\'' +
                    ", nazwisko='" + nazwisko + '\'' +
                    ", indeks=" + indeks +
                    ", Student=" + Student +
                    ", osoba=" + osoba +
                    ", WydziałEnum=" + WydziałEnum +
                    '}';
        }
    /* zad3 */


        Osoba student1 = new Osoba();
        Osoba student2 = new Osoba();
        Osoba student3 = new Osoba();
        Osoba student4 = new Osoba();
        Osoba student5 = new Osoba();




        List list1 = Arrays.asList(student1,student2,student3,student4,student5);

        public List getList1() {
            return list1;
        }

        public void setList1(List list1) {
            this.list1 = list1;
        }








    }






}

















