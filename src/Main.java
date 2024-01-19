import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    UpravljanjeRezervacijama rezervacije = new UpravljanjeRezervacijama();
    UpravljanjeKorisnicima korisnici = rezervacije.korisnici;
    UpravljanjeVozilima vozila = rezervacije.vozila;

    Scanner scanner = new Scanner(System.in);
    System.out.println("[K]orisnici");
    System.out.println("[V]ozila");
    System.out.println("[R]ezervacije");
    System.out.print("Izaberi opciju: ");
    String mainMenu = scanner.nextLine().toUpperCase();

    String korisnikMenu;
    String voziloMenu;
    String rezervacijaMenu;

    switch (mainMenu){
      case("K"):
        System.out.println("[P]rikazi korisnike");
        System.out.println("[D]odaj korisnika");
        System.out.print("Izaberite opciju: ");
        korisnikMenu = scanner.nextLine().toUpperCase();
      case("V"):
        System.out.println("[P]rikazi vozilo");
        System.out.println("[D]odaj vozilo");
        System.out.print("Izaberite opciju: ");
        voziloMenu = scanner.nextLine().toUpperCase();
      case("R"):
        System.out.println("[P]rikazi rezervacije");
        System.out.println("[D]odaj rezervacije");
        System.out.print("Izaberite opciju: ");
        rezervacijaMenu = scanner.nextLine().toUpperCase();
    }

  }
}