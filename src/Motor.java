public class Motor extends Vozilo{
  private int brojTockova;
  private String tipMotora;
//  C
  public Motor(String proizvodjac, String model, int godiste, double cijena, String registracija, int brojTockova, String tipMotora){
    super(proizvodjac, model, godiste, cijena, registracija);
    this.brojTockova = brojTockova;
    this.tipMotora = tipMotora;
  }
//  R
  @Override
  public String toString(){
    return super.toString() + " " + this.brojTockova + " " + this.tipMotora;
  }
//  U
  @Override
  public void updateField(String fieldName, Object value){
    switch (fieldName) {
      case "broj tockova":
        this.brojTockova = (int) value;
        break;
      case "tip motora":
        this.tipMotora = (String) value;
        break;
      default:
        super.updateField(fieldName, value);
    }
  }
}
