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
        break;
      }

      String korisnikMenu = "";
      String voziloMenu = "";
      String rezervacijaMenu = "";

      String korisnikMenuDva = "";
      String voziloMenuDva = "";
      String rezervacijaMenuDva = "";

      switch (mainMenu) {
        case "K":
          do {
            // MENU KORISNIKA
            if(korisnikMenu.isEmpty()){
              System.out.println("[P]rikazi korisnike");
              System.out.println("[D]odaj korisnika");
              System.out.println("[B]ack");
              System.out.print("Izaberite opciju: ");
            }
            korisnikMenu = scanner.nextLine().toUpperCase();

            switch (korisnikMenu) {
              case "P":
                korisnici.prikaziKorisnike();
                System.out.println("[A]zuriraj korisnika");
                System.out.println("[I]zbrisi korisnika");
                System.out.println("[B]ack");
                korisnikMenuDva = scanner.nextLine().toUpperCase();
                switch (korisnikMenuDva){
                  case "A":
                    System.out.print("redni broj korisnika: ");
                    int index = scanner.nextInt();
                    System.out.print("polje za update: ");
                    scanner.nextLine();
                    String fieldToUpdate = scanner.nextLine();

                    System.out.print("nova vrijednost: ");
                    Object newValue = scanner.nextLine();
                    korisnici.updateUser(index, fieldToUpdate, newValue);
                    break;
                  case "I":
                    System.out.print("redni broj korisnika: ");
                    int id = scanner.nextInt();
                    korisnici.izbrisiKorisnika(id);
                    break;
                }
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
            // MENU VOZILA
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
                System.out.println("[B]ack");
                voziloMenuDva = scanner.nextLine().toUpperCase();
                switch (voziloMenuDva) {
                  case "A":
                    System.out.print("redni broj vozila: ");
                    int index = scanner.nextInt();
                    System.out.print("polje za update: ");
                    String fieldToUpdate = scanner.nextLine();
                    System.out.print("nova vrijednost: ");
                    Object newValue = scanner.nextLine();
                    vozila.updateVozilo(index, fieldToUpdate, newValue);
                    break;
                  case "I":
                    System.out.print("redni broj vozila: ");
                    int id = scanner.nextInt();
                    vozila.izbrisiVozilo(id);
                    break;
                }
                break;
              case "D":
                System.out.println("[A]utomobil");
                System.out.println("[M]otor");
                System.out.println("[B]ack");
                voziloMenuDva = scanner.nextLine().toUpperCase();
                System.out.print("proizvodjac: ");
                String proizvodjac = scanner.nextLine();
                System.out.print("model: ");
                String model = scanner.nextLine();
                System.out.print("godiste: ");
                int godiste = scanner.nextInt();
                System.out.print("cijena: ");
                double cijena = scanner.nextDouble();
                System.out.print("registracija: ");
                scanner.nextLine();
                String registracija = scanner.nextLine();
                switch (voziloMenuDva) {
                  case "A":
                    System.out.print("broj sjedista: ");
                    int brojSjedista = scanner.nextInt();
                    System.out.print("broj vrata: ");
                    int brojVrata = scanner.nextInt();
                    Automobil auto = new Automobil(proizvodjac, model, godiste, cijena, registracija, brojSjedista, brojVrata);
                    vozila.dodajVozilo(auto);
                    break;
                  case "M":
                    System.out.print("broj sjedista: ");
                    int brojTockova = scanner.nextInt();
                    System.out.print("broj vrata: ");
                    String tipMotora = scanner.nextLine();
                    Motor motor = new Motor(proizvodjac, model, godiste, cijena, registracija, brojTockova, tipMotora);
                    vozila.dodajVozilo(motor);
                    break;
                }
                break;
              }
            }while (!voziloMenu.equals("B"));
          break;

        case "R":
          do {
            // MENU REZERVACIJA
            System.out.println("[P]rikazi rezervacije");
            System.out.println("[D]odaj rezervacije");
            System.out.println("[B]ack");
            System.out.print("Izaberite opciju: ");
            rezervacijaMenu = scanner.nextLine().toUpperCase();

            switch (rezervacijaMenu) {
              case "P":
                rezervacije.prikaziRezervacije();
                System.out.println("[I]zbrisi rezervaciju");
                System.out.println("[B]ack");
                rezervacijaMenuDva = scanner.nextLine().toUpperCase();
                if(rezervacijaMenuDva.equals("I")){
                  System.out.print("redni broj rezervacije: ");
                  int index = scanner.nextInt();
                  rezervacije.izbrisiRezervaciju(index);
                }
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
            }
          } while (!rezervacijaMenu.equals("B"));
          break;
      }
    }
  }
}
