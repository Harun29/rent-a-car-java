public class User {
  private String punoIme;
  private String email;
  private Vozilo iznajmljenoVozilo;
  private int brojIznajmljivanja;
  public User(String punoIme, String email){
    this.punoIme = punoIme;
    this.email = email;
    this.iznajmljenoVozilo = null;
    this.brojIznajmljivanja = 0;
  }
  @Override
  public String toString(){
    return this.punoIme + " " + this.email  + " " + this.iznajmljenoVozilo.registracija() + " " + this.brojIznajmljivanja;
  }
  public void updateField(String fieldName, Object value) {
    switch (fieldName) {
      case "ime":
        this.punoIme = (String) value;
        break;
      case "email":
        this.email = (String) value;
        break;
      default:
        throw new IllegalArgumentException("Invalid field name: " + fieldName);
    }
  }
  public void dodajAuto(Vozilo vozilo){
    this.iznajmljenoVozilo = vozilo;
    this.brojIznajmljivanja += 1;
  }
}
