package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
Smurf HandySmurf = new Smurf("HandySmurf");	
Smurf PapaSmurf = new Smurf("PapaSmurf");
Smurf Smurfette = new Smurf("Smurfette");
HandySmurf.eat();
HandySmurf.getName();
PapaSmurf.getName();
Smurfette.getName();
PapaSmurf.getHatColor();
Smurfette.getHatColor();

}
}
