package JavaBasicProgramming;

public class SmallestNumber {

	 int m1(){
		int arr[]={20,30,5};
		int min=arr[0];
		for( int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					min= arr[i];
					arr[i]=arr[j];
					arr[j]=min;
				}
			}
		}
			return arr[0];
		 
	}
		
		public static void main(String[]args) {
			 SmallestNumber sm= new SmallestNumber();
			 System.out.println(sm.m1());
			 
		}
}




