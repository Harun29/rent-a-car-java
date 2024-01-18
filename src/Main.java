public class Main {
  public static void main(String[] args) {

    Vozilo auto = new Vozilo("vw", "polo", 1999, 4600.0, "a54-f-569");

    auto.updateField("proizvodjac", "audi");
    auto.updateField("model", "a8");

    System.out.println(auto);
  }
}