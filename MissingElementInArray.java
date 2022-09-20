package week3.day2;



public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		int temp=0;
		int diff;
		System.out.println("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
			}
		System.out.println("Array sorted in ascending order");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
		System.out.println("Checking");
		for (int i =1; i < arr.length; i++) {
			System.out.println(i);
			if(i+1 != arr[i]) {
				System.out.println("Missing Element in the Array: ");
				System.out.println(i+1);
				break;
			}
		}
	}
}
		
	


