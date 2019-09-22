package _04_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {

Cup TeaCup = new Cup();
Kettle TeaKettle = new Kettle();
TeaBag TeaBag = new TeaBag("Mint");
TeaCup.makeTea(null);
}
}