package gelinkteLijsten;


/**
 * De stapel, of eigenlijk 'Stack', is ook een 
 * klassieke datastructuur.
 * In [Hubbard, Hoofdstuk 5] wordt de Stack besproken. 
 * Niet te veel spieken, daar leert u immers minder van. 
 * 
 * In deze klasse implementeer je zelf een Stack, door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt. De Node komt in deze
 * klasse niet voor.
 */
public class Stapel {
	/**
	 * Zet een object boven op de stapel
	 * @param object
	 */
	void push(Object object){}
	
	/**
	 * Haalt het bovenste object van de stapel
	 * LIFO: Last-in, First-out
	 * @return het bovenste object
	 */
	Object pop(){return new Object();}
	
	/**
	 * Geeft het bovenste object terug, maar 
	 * laat het op de stapel staan.
	 * @return
	 */
	Object front(){return new Object();}

	/**
	 * Geeft 'true' als er niks op de stapel ligt.
	 * @return
	 */
	boolean isEmpty(){return false;}
}
