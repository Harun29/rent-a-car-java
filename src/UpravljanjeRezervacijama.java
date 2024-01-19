import java.util.ArrayList;

public class UpravljanjeRezervacijama {
  public UpravljanjeVozilima vozila = new UpravljanjeVozilima();
  public UpravljanjeKorisnicima korisnici = new UpravljanjeKorisnicima();
  public ArrayList<Rezervacija> rezervacije = new ArrayList<Rezervacija>();
  public void dodajRezervaciju(String registracija, String email, int brojDana){
    Vozilo vozilo = vozila.pronadjiVozilo(registracija);
    int indexOfVehicle = vozila.indexOf(vozilo);
    User user = korisnici.pronadjiKorisnika(email);
    int indexOfUser = korisnici.indexOf(user);

    Rezervacija rezervacija = new Rezervacija(vozilo, user, brojDana);
    rezervacije.add(rezervacija);

    korisnici.dodajAutoKorisniku(indexOfUser, vozilo);
    vozila.autoRezervisano(indexOfVehicle);
  }
  public void izbrisiRezervaciju(int id){
    rezervacije.remove(id);
    String email = rezervacije.get(id).korisnik.email;
    User user = korisnici.pronadjiKorisnika(email);
    int indexOfUser = korisnici.indexOf(user);

    String registracija = rezervacije.get(id).vozilo.registracija();
    Vozilo vozilo = vozila.pronadjiVozilo(registracija);
    int indexOfVehicle = vozila.indexOf(vozilo);

    korisnici.izbrisiAutoKorisniku(indexOfUser);
    vozila.autoNijeRezervisano(indexOfVehicle);
  }
  public void prikaziRezervacije(){
    rezervacije.forEach(rezervacija -> {
      System.out.println("[" + rezervacije.indexOf(rezervacija)+ "]" + " " + rezervacija);
    });
  }
}
