import java.util.ArrayList;

public class UpravljanjeRezervacijama {
  public UpravljanjeVozilima vozila = new UpravljanjeVozilima();
  public ArrayList<Rezervacija> rezervacije = new ArrayList<Rezervacija>();
  public void dodajRezervaciju(String registracija, String emial, int brojDana){
    Vozilo vozilo = vozila.pronadjiVozilo(registracija);
    User user = users.prondajiKorisnika(email);
    Rezervacija rezervacija = new Rezervacija(vozilo, user, brojDana);
    rezervacije.add(rezervacija);
    users.dodajAuto(user, vozilo);
  }
  public void izbrisiRezervaciju(int id){
    rezervacije.remove(id);
  }
  public void prikaziRezervacije(){
    rezervacije.forEach(rezervacija -> {
      System.out.println(rezervacije.indexOf(rezervacija) + " " + rezervacija);
    });
  }
}
