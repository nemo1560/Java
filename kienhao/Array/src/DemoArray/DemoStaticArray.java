package DemoArray;

public class DemoStaticArray{
	
	public static void main(String[] args) {
		int[] array= {4,5,6,7,8,9,0,2,4,5};
		int[] array2 = new int[10];
		for(int i=0;i<array2.length;i++) {
			array2[i] = (int) Math.round(Math.random()*10);
		}
		int[] array3 = new int[10];
		
		for(int i=0;i<array3.length;i++) {
			array2[i] = (int) Math.round(Math.random()*10);
			array3[i] = array2[i];
		}
		for(int a=1;a<array3.length;a++) {
			for(int b=0;b<=array3.length-1;b++) {
				if(array3[a] < array3[b]) {
					int temp = array3[a];
					array3[a] = array3[b];
					array3[b] = temp;
				}
			}
		}
		
		printArray(array2);
		printArray(array);
		printArray(array3);
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
