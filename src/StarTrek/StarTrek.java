package StarTrek;

public class StarTrek {

	public static void main(String[] args) {

		int szam1 = 1;
		int szam2 = 1;
		int szam3 = 1;

		Emberek barnus = new Emberek("Barni",100,100,100,"Gyerek", "gyerek", "gyerek", 1);
		Emberek barnusKlon = barnus;
		Emberek barnusKlon2 = barnusKlon;
		System.out.printf("Objektum nev változó értéke:%s%n",barnus.nev);
		System.out.printf("Objektum nev változó értéke:%s%n",barnusKlon.nev);
		System.out.printf("Objektum nev változó értéke:%s%n",barnusKlon2.nev);
		barnusKlon2.nev="Barnabás";
		System.out.printf("Objektum nev változó értéke:%s%n",barnus.nev);

		Emberek teszt1 = new Emberek();
		Emberek teszt2 = new Emberek("Data");
		Emberek teszt3 = new Emberek("Paris", 100, 98, 70, "Kormányos", "Híd", "Vár", 8);
//		System.out.printf("%nNév: %s%nÉleterő: %d%n", teszt1.nev, teszt1.eletEro);
//		System.out.printf("%nNév: %s%nÉleterő: %d%n", teszt2.nev, teszt2.eletEro);
//		System.out.printf("%nNév: %s%nÉleterő: %d%n", teszt3.nev, teszt3.eletEro);
	}

}
