package Day_2;

public class Demo8 {

	public static void main(String[] args) {
		/*int a[]= {23,45,56,78};
		int count=0;
		for (int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);*/
		int a[]= {4,4,8,6,7,1,9,2};
		int arr[]=new int [a.length];
		int index=0;
		for (int i=0;i<arr.length;i++)
		{
			int count=0;
			for (int j=0; j<arr.length;j++)
			{
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				arr[index++]= a[i];
			}
			
		}

		System.out.println("no repeated:");
		for (int i=0; i<index;i++) {
			System.out.println(arr[i]+ " ");
		}
	}
}

