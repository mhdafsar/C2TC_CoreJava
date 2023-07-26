package day02;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.println(j);
				//System.out.print(j + " "+i);
			}
			System.out.println();
		}

	}

}