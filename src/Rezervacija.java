import java.time.LocalDate;

public class Rezervacija {

  public Vozilo vozilo;
  public User korisnik;
  private LocalDate startDate;
  private LocalDate endDate;

  public Rezervacija(Vozilo vozilo, User korisnik, int brojDana){
    this.vozilo = vozilo;
    this.korisnik = korisnik;
    this.startDate = LocalDate.now();
    this.endDate = LocalDate.now().plusDays(brojDana);
  }

  @Override
  public String toString(){
    return this.vozilo.registracija() + " " + this.korisnik.email + " from: " + this.startDate + " to: " + this.endDate;
  }

}
