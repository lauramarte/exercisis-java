package tema2;

public class Raul {

	public static void main(String[] args){
		int[] raul = new int[]{116, 101, 32, 101, 115, 116, 105, 109, 111, 32, 60, 51};
		char[] raulChars = new char[raul.length];
		for(int i =0;i<raul.length;i++){
			raulChars[i] = (char) raul[i];
		}
		String raulString = new String(raulChars);
		System.out.println(raulString);
	}

}
