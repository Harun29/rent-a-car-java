public class Main {
  public static void main(String[] args) {

//    Vozilo auto = new Vozilo("vw", "polo", 1999, 4600.0, "a54-f-569");

//    auto.updateField("proizvodjac", "audi");
//    auto.updateField("model", "a8");
    Motor motor = new Motor("vw", "polo", 1999, 4600.0, "a54-f-569", 2, "naked");
    motor.updateField("proizvodjac", "suzuki");
    Automobil auto = new Automobil("vw", "polo", 1999, 4600.0, "a54-f-569", 4, 4);
    auto.updateField("broj sjedista", 5);
    Vozilo vozilo = new Vozilo("vw", "polo", 1999, 4600.0, "a54-f-569");
    System.out.println(motor);
    System.out.println(auto);
    System.out.println(vozilo);
    User user = new User("harun", "harun@gmail.com");
    user.dodajAuto(auto);
    System.out.println(user);
  }
}