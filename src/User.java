public class User {
  private String punoIme;
  private String email;
  private Vozilo iznajmljenoVozilo;
  private int brojIznajmljivanja;
//  C
  public User(String punoIme, String email){
    this.punoIme = punoIme;
    this.email = email;
    this.iznajmljenoVozilo = null;
    this.brojIznajmljivanja = 0;
  }
//  R
  @Override
  public String toString(){
    return this.punoIme + " " + this.email  + " " + this.iznajmljenoVozilo.registracija() + " " + this.brojIznajmljivanja;
  }
//  U
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
    if(this.iznajmljenoVozilo == null){
      this.iznajmljenoVozilo = vozilo;
      this.brojIznajmljivanja += 1;
    }else{
      System.out.println("Korisnik je vec iznajmio jedno auto!");
    }
  }
  public void izbrisiVozilo(){
    this.iznajmljenoVozilo = null;
  }
}
