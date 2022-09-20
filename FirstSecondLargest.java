package week3.day2;
public class FirstSecondLargest {

	public static void main(String[] args) {
				int[] data = {3,2,11,4,6,7};
				int temp=0;
				System.out.println("Original Array: ");
				for (int i = 0; i < data.length; i++) {
					System.out.println(data[i]+" ");
				}
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data.length; j++) {
						if(data[i]>data[j]) {
						temp=data[i];
						data[i]=data[j];
						data[j]=temp;
						}
					}
					}
				System.out.println("Array sorted in descending order");
				for (int i = 0; i < data.length; i++) {
					System.out.println(data[i]+" ");
					
				}
				System.out.println("2nd element from the last");
				System.out.println(data[4]);
				
	}

}
