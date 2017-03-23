package StarTrek;

/**
 * @author Andras Olah (olahandras78@gmail.com)
 * @author Oláh-Bozó Barnabás (olahbozobarnabas@gmail.com)
 */
public class Emberek {

	public String nev; //Ez az ember neve
	public int eletEro; //Ez mutatja az adott ember életerejét
	public int energia;
	public int ehseg;
	public String szakma;
	public String helyszin;
	public String tevekenyseg;
	public int rang;

//KONSTRUKTOR üres (létrehozó)
	Emberek() {
	}

//Konstruktor paraméterekkel
	Emberek(String miLegyenANev) {
		nev = miLegyenANev;
	}
//Konstruktor az összes paraméterrel, kezdőadatoknak

	Emberek(String kezdoNev, int kezdoEletEro, int kezdoEnergia, int kezdoEhseg, String kezdoSzakma, String kezdoHelyszin, String kezdoTevekenyseg, int kezdoRang) {
		this.nev = kezdoNev;
		this.eletEro = kezdoEletEro;
		this.energia = kezdoEnergia;
		this.ehseg = kezdoEhseg;
		this.szakma = kezdoSzakma;
		this.helyszin = kezdoHelyszin;
		this.tevekenyseg = kezdoTevekenyseg;
		this.rang = kezdoRang;

	}

}
