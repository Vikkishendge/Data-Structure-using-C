
package GeeksforGeeks;

public class CopyArray
{

	public static void main(String[] args)
	{
		int[] arr1= {10,20,30,40,50};
		int[] arr2=new int[arr1.length];  // put arr1 size to arr2
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];                // copy arr1 to arr2
			
		}
		System.out.println("Original array arr1 and its index:");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("index["+i+"]="+arr1[i]);  // print array element as well as its index.
		}
		System.out.println("Copy array arr2:");
	    for(int i=0;i<arr2.length;i++)
	    {
		System.out.println(arr2[i]);
	    }
   }

}
