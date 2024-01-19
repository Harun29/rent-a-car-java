import java.time.LocalDate;

public class Rezervacija {

  private Vozilo vozilo;
  private User korisnik;
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
    return this.vozilo + " " + this.korisnik + " from: " + this.startDate + " to: " + this.endDate;
  }

}
