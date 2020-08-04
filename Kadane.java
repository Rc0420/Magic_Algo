import java.util.*;
 class Kadane
       {
         public static void main(String arg[])
	    {
	       Scanner sc=new Scanner(System.in);
	      int  n=sc.nextInt();
	      int a[]=new int[n];
          for(int i=0;i<a.length;i++)
           {
              a[i]=sc.nextInt();       
           }

       // Maximum sum in subset 

        int max=Integer.MIN_VALUE; 
        int sum=0;

        for(int i=0;i<n;i++)
        {
        	sum=sum+a[i];
        	max=Math.max(sum,max);
        	 if(sum<0)
        	   sum=0;
        }
         
        System.out.println(max); 
}

}