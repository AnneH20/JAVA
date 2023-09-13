package Test_Launch;

public class Sort_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {5, 3, 4, 1, 2};
		int temp = 0;
		
		System.out.println("Before sorting");
		for (int i=0; i<num.length; i++) {
			System.out.println("Num " + i + "  = " + num[i]);
		}
		
		for (int i=0; i<num.length; i++) {
			for (int k=0; k<num.length; k++) {
				if (num[i] < num [k]) {
					temp = num[i];
					num[i] = num[k];
					num[k] = temp;
				}
			}
		}
		for (int i=0; i<num.length; i++) {
			System.out.println("Arranged Num = " + i + " " + num[i]);;
		}
	}
}
