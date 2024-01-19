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

}
