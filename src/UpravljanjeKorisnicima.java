import java.util.ArrayList;

public class UpravljanjeKorisnicima {

  public ArrayList<User> korisnici = new ArrayList<User>();

  public void dodajKorisnika(String punoIme, String email){
    User user = new User(punoIme, email);
    korisnici.add(user);
  }
  public void izbrisiKorisnika(int id) {
    korisnici.remove(id);
  }
  public void prikaziKorisnike(){
    korisnici.forEach(korisnik -> {
      System.out.println("["+ korisnici.indexOf(korisnik) + "]" + korisnik);
    });
  }
  public User pronadjiKorisnika(String email) {
    return korisnici.stream()
            .filter(korisnik -> korisnik.email.equals(email
            ))
            .findFirst()
            .orElse(null);
  }
  public void dodajAutoKorisniku(int index, Vozilo vozilo){
    korisnici.get(index).dodajAuto(vozilo);
  }
  public void izbrisiAutoKorisniku(int index){
    korisnici.get(index).izbrisiVozilo();
  }
  public int indexOf(User user) {
    return korisnici.indexOf(user);
  }
  public void updateUser(int index, String fieldToUpdate, Object newValue){
    korisnici.get(index).updateField(fieldToUpdate, newValue);
  }
}
