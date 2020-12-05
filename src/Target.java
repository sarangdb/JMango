import java.util.*;
public class Target {
	
	public static void main(String[] args) {
		
		/*int[] a= {0,0,0,0,0,
				  0,0,0,0,0};
		int target,sum,i,j;
		boolean notFound=true;
		Scanner sc = new Scanner (System.in );
		System.out.println("Enter the list of numbers:");
		
		for(i=0;i<10;)
		{
			
			a[i]=sc.nextInt();
			i++;
			if (i==10) {break;}
			
		}
		System.out.println("Enter the target which is sum of any two number from above two number");
		target=sc.nextInt();
		for(i=0;i<a.length;i++)
		{
			int ele=a[i];
			
			for(j=i;j<a.length;j++)
			{
				if(i==j)continue; //if both are same they are continue to next number
				
				sum=ele+a[j];
				if(sum==target) {
					
					System.out.println("Target "+target+" is sum of two element"+a[i]+" and "+a[j]);
					notFound=false;
				}
			}
		}
		if(notFound) {
			System.out.println("Target number "+target+" is not the sum of any two number from given list ");
		}*/
		
		
		ArrayList al = new ArrayList();
		int target,sum,i,j;
		boolean notFound=true;
		Scanner sc = new Scanner (System.in );
		System.out.println("Enter the list of numbers:");	
		//getting the list from user
		for(i=0;i<10;i++)
		{
			al.add(sc.nextInt());
		}		
		// getting the target from the user
		System.out.println("Enter the target which is sum of any two number from above two number");
		target=sc.nextInt();
		
		// now processing the list to find target as sum of two number
		System.out.println("list has numbers:"+al);
		for(i=0;i<10;i++)
		{
			int ele=(Integer)al.get(i);
			//hi
			for(j=i;j<10;j++)
			{
				if(i==j)continue; //if both are same they are continue to next number
				
				sum=ele+(Integer)al.get(j);
				if(sum==target) {
					
					System.out.println("Target "+target+" is sum of two element"+al.get(i)+" and "+al.get(j));
					notFound=false;
				}
			}
		}		
	}	
}
