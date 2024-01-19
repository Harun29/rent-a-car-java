import java.util.ArrayList;
public class UpravljanjeVozilima {
  public ArrayList<Vozilo> vozila= new ArrayList<Vozilo>();
  public void dodajVozilo(Vozilo vozilo){
    vozila.add(vozilo);
  }
  public void izbrisiVozilo(int id) {
    vozila.remove(id);
  }
  public void prikaziVozila(){
    vozila.forEach(vozilo -> {
      System.out.println("  "+ vozila.indexOf(vozilo) + ") " + vozilo);
    });
  }
  public Vozilo pronadjiVozilo(String registracija) {
    return vozila.stream()
            .filter(vozilo -> vozilo.registracija().equals(registracija))
            .findFirst()
            .orElse(null);
  }
  public void autoRezervisano(int index){
    vozila.get(index).updateField("rentano", true);
  }
  public void autoNijeRezervisano(int index){
    vozila.get(index).updateField("rentano", false);
  }
  public int indexOf(Vozilo vozilo){
    return vozila.indexOf(vozilo);
  }
  public void updateVozilo(int index, String fieldToUpdate, Object newValue){
    vozila.get(index).updateField(fieldToUpdate, newValue);
  }
}
