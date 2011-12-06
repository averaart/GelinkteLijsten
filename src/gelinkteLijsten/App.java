package gelinkteLijsten;

/**
 * In deze opdracht verken je het generieke karakter van de gelinkte datastructuur.
 * Daarvoor programmeer je eerst de klasse 'GelinkteLijst'. Deze klasse is abstract.
 * De Klasses Stapel en Wachtrij implementeren de GelinkteLijst. 
 * 
 * - Zorg dat je criteria opstelt (zoals we in les 2 gedaan hebben) en beschrijf 
 *   dit in de javadoc bij elke methode.
 * - Aan de hand van de criteria controleer je of de opdracht correct werkt.
 * - Implementeer tot slot de klasse App. Deze is bedoeld om de werking van 
 *   verschillende klassses te demonstreren.
 * 
 * @author youritjang
 *
 */

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GelinkteLijst lijst = new GelinkteLijst();
		
		lijst.insertFirst(1);
		System.out.print(lijst.toString());
		
		lijst.insertFirst(0);
		System.out.print(lijst.toString());

		lijst.insertLast(5);
		System.out.print(lijst.toString());
		
//		lijst.insertBefore(4, 5);
//		lijst.insertAfter(2, 1);
		
//		System.out.print(lijst.toString());
		
	}

}
