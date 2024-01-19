import java.util.ArrayList;
public class UpravljanjeVozilima {
  public ArrayList<Vozilo> vozila= new ArrayList<Vozilo>();
  public void dodajVozilo(Vozilo vozilo){
    vozila.add(vozilo);
  }
  public void izbrisiVozilo(String registracija) {
    vozila.removeIf(vozilo -> !vozilo.registracija().equals(registracija));
  }
  public void prikaziVozila(){
    vozila.forEach(vozilo -> {
      System.out.println(vozilo);
    });
  }
  public Vozilo pronadjiVozilo(String registracija) {
    return vozila.stream()
            .filter(vozilo -> vozilo.registracija().equals(registracija))
            .findFirst()
            .orElse(null);
  }
}
