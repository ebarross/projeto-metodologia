package metodologia;

public class Util {
	
	public Util() {}
	
	public static void swap(Object[] array, int i, int j) {
		Object temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}