import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    UpravljanjeRezervacijama rezervacije = new UpravljanjeRezervacijama();
    UpravljanjeKorisnicima korisnici = rezervacije.korisnici;
    UpravljanjeVozilima vozila = rezervacije.vozila;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      // Main Menu
      System.out.println("[K]orisnici");
      System.out.println("[V]ozila");
      System.out.println("[R]ezervacije");
      System.out.println("[E]xit");
      System.out.print("Izaberi opciju: ");
      String mainMenu = scanner.nextLine().toUpperCase();

      if (mainMenu.equals("E")) {
        break; // Exit the program
      }

      String korisnikMenu = "";
      String voziloMenu = "";
      String rezervacijaMenu = "";

      switch (mainMenu) {
        case "K":
          do {
            // User Menu
            if(korisnikMenu.isEmpty()){
              System.out.println("[P]rikazi korisnike");
              System.out.println("[D]odaj korisnika");
            }
            System.out.println("[B]ack");
            System.out.print("Izaberite opciju: ");
            korisnikMenu = scanner.nextLine().toUpperCase();

            switch (korisnikMenu) {
              case "P":
                korisnici.prikaziKorisnike();
                System.out.println("[A]zuriraj korisnika");
                System.out.println("[I]zbrisi korisnika");
                break;
              case "D":
                System.out.print("puno ime: ");
                String punoIme = scanner.nextLine();
                System.out.print("email: ");
                String email = scanner.nextLine();
                korisnici.dodajKorisnika(punoIme, email);
                break;
            }
          } while (!korisnikMenu.equals("B"));
          break;

        case "V":
          do {
            // Vehicle Menu
            System.out.println("[P]rikazi vozilo");
            System.out.println("[D]odaj vozilo");
            System.out.println("[B]ack");
            System.out.print("Izaberite opciju: ");
            voziloMenu = scanner.nextLine().toUpperCase();

            switch (voziloMenu) {
              case "P":
                vozila.prikaziVozila();
                System.out.println("[A]zuriraj vozilo");
                System.out.println("[I]zbrisi vozilo");
                break;
              case "D":
                System.out.println("[A]utomobil");
                System.out.println("[M]otor");
                break;
            }
          } while (!voziloMenu.equals("B"));
          break;

        case "R":
          do {
            // Reservation Menu
            System.out.println("[P]rikazi rezervacije");
            System.out.println("[D]odaj rezervacije");
            System.out.println("[B]ack");
            System.out.print("Izaberite opciju: ");
            rezervacijaMenu = scanner.nextLine().toUpperCase();

            switch (rezervacijaMenu) {
              case "P":
                rezervacije.prikaziRezervacije();
                System.out.println("[I]zbrisi rezervaciju");
                break;
              case "D":
                System.out.print("Registracija: ");
                String registracija = scanner.nextLine();
                System.out.print("Korisnik (email): ");
                String rezervacijaEmail = scanner.nextLine();
                System.out.print("iznajmljuje se na: ");
                int brojDana = scanner.nextInt();
                rezervacije.dodajRezervaciju(registracija, rezervacijaEmail, brojDana);
                break;
              case "I":
                System.out.print("ID rezervacije za brisanje: ");
                int rezervacijaId = scanner.nextInt();
                rezervacije.izbrisiRezervaciju(rezervacijaId);
                break;
            }
          } while (!rezervacijaMenu.equals("B"));
          break;
      }
    }
  }
}
