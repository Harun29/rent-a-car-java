public class Automobil extends Vozilo{
  private int brojSjedista;
  private int brojVrata;
  //  C
  public Automobil(String proizvodjac, String model, int godiste, double cijena, String registracija, int brojSjedista, int brojVrata){
    super(proizvodjac, model, godiste, cijena, registracija);
    this.brojSjedista = brojSjedista;
    this.brojVrata = brojVrata;
  }
  //  R
  @Override
  public String toString(){
    return super.toString() + " broj sjedista: " + this.brojSjedista + " broj vrata: " + this.brojVrata;
  }
  //  U
  @Override
  public void updateField(String fieldName, Object value){
    switch (fieldName) {
      case "broj sjedista":
        this.brojSjedista = (int) value;
        break;
      case "broj vrata":
        this.brojVrata = (int) value;
        break;
      default:
        super.updateField(fieldName, value);
    }
  }
}

