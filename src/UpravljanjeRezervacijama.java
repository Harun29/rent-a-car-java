import java.util.ArrayList;

public class UpravljanjeRezervacijama {
  public UpravljanjeVozilima vozila = new UpravljanjeVozilima();
  public UpravljanjeKorisnicima korisnici = new UpravljanjeKorisnicima();
  public ArrayList<Rezervacija> rezervacije = new ArrayList<Rezervacija>();
  public void dodajRezervaciju(String registracija, String email, int brojDana){
    Vozilo vozilo = vozila.pronadjiVozilo(registracija);
    int indexOfVehicle = 9999;
    if(vozilo != null){
      indexOfVehicle = vozila.indexOf(vozilo);
    }else{
      System.out.println("------------Vozilo nije pronadjeno.------------------");
    }
    int indexOfUser = 9999;
    User user = korisnici.pronadjiKorisnika(email);
    if(user != null){
      indexOfUser = korisnici.indexOf(user);
    }else{
      System.out.println("------------Korisnik nije pronadjen.------------------");
    }

    if(indexOfUser != 9999 && indexOfVehicle != 9999){
      Rezervacija rezervacija = new Rezervacija(vozilo, user, brojDana);
      rezervacije.add(rezervacija);
      korisnici.dodajAutoKorisniku(indexOfUser, vozilo);
      vozila.autoRezervisano(indexOfVehicle);
    }
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
      System.out.println("  " + rezervacije.indexOf(rezervacija)+ ") " + rezervacija);
    });
  }
}
