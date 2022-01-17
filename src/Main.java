import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */



    }

    public class Zabawki{
        private String nazwa;
        private double cena;
        private String sklep;

        public Zabawki(String nazwa, double cena, String sklep) {
            this.nazwa = nazwa;
            this.cena = cena;
            this.sklep = sklep;
        }

        String getnazwa(){return nazwa;}
        double getcena(){return cena;}
        String getsklep(){return sklep;}


        public class Lalka extends Zabawki{
            private String model;

            public Lalka(String nazwa, double cena, String sklep, String model) {
                super(nazwa, cena, sklep);
                model = "";
            }
        }

            public class Misiek extends Zabawki{
                String szablon;

                public Misiek(String nazwa, double cena, String sklep, String szablon){
                    super(nazwa, cena, sklep);
                    szablon = "";

                }
            }


        public class Klocki extends Zabawki{
            String rodzaj;

            public Klocki(String nazwa, double cena, String sklep, String rodzaj){
                super(nazwa, cena, sklep);
                rodzaj= "";
            }
        }

        Object Zabawka1 = new Zabawki("Monopoly", 59.99, "ToysRU");
        Object Zabawka2 = new Zabawki("Clue", 45.50, "Smyk");
        Object Lala1 = new Lalka("Heather", 60.65, "Smyk", "Lala-M");
        Object Lala2 = new Lalka("Maja", 30.00, "Smyk", "Lala-S");
        Object Miś1 = new Misiek("Barry", 100.00, "ToysRU", "Miś-XL");
        Object Miś2 = new Misiek("Lisek", 46.65, "ToysRU", "Miś-S");
        Object Klocki1 = new Klocki("Lego Portal", 150.43, "ToysRU", "Lego-XL");
        Object Klocki2 = new Klocki("ABC", 40.00, "Smyk", "Klocki-Brick");

        List<Zabawki> Lista = new ArrayList(){};


        @Override
        public String toString() {
            return "Zabawki{" +
                    "nazwa='" + nazwa + '\'' +
                    ", cena=" + cena +
                    ", sklep='" + sklep + '\'' +
                    ", Zabawka1=" + Zabawka1 +
                    ", Zabawka2=" + Zabawka2 +
                    ", Lala1=" + Lala1 +
                    ", Lala2=" + Lala2 +
                    ", Miś1=" + Miś1 +
                    ", Miś2=" + Miś2 +
                    ", Klocki1=" + Klocki1 +
                    ", Klocki2=" + Klocki2 +
                    ", Lista=" + Lista +
                    '}';

        }

    }
}

