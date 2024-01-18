public class Vozilo {
  private String proizvodjac;
  private String model;
  private int godiste;
  private double cijena;
  private String registracija;
  private boolean rentano;

//  C
  public Vozilo(String proizvodjac, String model, int godiste, double cijena, String registracija){
    this.proizvodjac = proizvodjac;
    this.model = model;
    this.godiste = godiste;
    this.cijena = cijena;
    this.registracija = registracija;
    this.rentano = false;
  }
//  R
  @Override
  public String toString(){
    return this.proizvodjac + " " + this.model + " " + this.godiste + " " + this.cijena + " " + this.registracija + " " + this.rentano;
  }
//  U
  public void updateField(String fieldName, Object value) {
    switch (fieldName) {
      case "proizvodjac":
        this.proizvodjac = (String) value;
        break;
      case "model":
        this.model = (String) value;
        break;
      case "godiste":
        this.godiste = (int) value;
        break;
      case "cijena":
        this.cijena = (double) value;
        break;
      case "registracija":
        this.registracija = (String) value;
        break;
      case "rentano":
        this.rentano = (boolean) value;
        break;
      default:
        throw new IllegalArgumentException("Invalid field name: " + fieldName);
    }
  }

}

