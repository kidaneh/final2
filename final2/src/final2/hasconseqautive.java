package final2;

public class hasconseqautive {

	
		public static boolean hasTwoConsecutive(int arr[])
		{
		for(int i=1;i<arr.length;i++)
		{
		if(arr[i]-arr[i-1]==1||arr[i]-arr[i-1]==-1)
		return true;
		}
		return false;
		}
		public static void main(String []args){
		int arr[]={1, 18, 2, 7, 9, 39, 18, 40};
		System.out.println(hasTwoConsecutive(arr));
		}
		}
