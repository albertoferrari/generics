
public class Main {
	public static void main(String[] args) {
		String[] s = {"aldo","giovanni","giacomo"};
		ArrayUtil.printElements(s);
		Character[] c = {'h', 'a', 'l'};
		ArrayUtil.printElements(c);
		Integer[] i = {4 , 8 , 15 , 16 , 23 , 42};
		ArrayUtil.printElements(i);
		Double[] d = {1.1, 2.3, 5.8, 13.21};
		// ArrayUtil.printElements(d); // Errore necessario definire nuovo metodo per Double
	}
}
