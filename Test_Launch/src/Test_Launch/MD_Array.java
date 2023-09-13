package Test_Launch;

public class MD_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = new int[5][5];
		
		for (int i=0; i<5; i++) {
			for(int k=0; k<5; k++) {
				array1[i][k] = (i*k) +k;
				System.out.println("Arrow row " + i + "Array column " + k + "Array value " + array1[i][k]);
			}
			
		}
		
		
	}

}
