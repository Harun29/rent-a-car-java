public class Vozilo {

    private String brend;
    private String model;
    private int godiste;
    private double cijena;
    private boolean rentano;

//    Konstruktor

    public Vozilo(String brend, String model, int godiste, double cijena){
      this.brend = brend;
      this.model = model;
      this.godiste = godiste;
      this.cijena = cijena;
      this.rentano = false;
    }

}

