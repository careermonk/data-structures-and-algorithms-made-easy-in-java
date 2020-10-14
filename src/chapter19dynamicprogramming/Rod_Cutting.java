import java.util.*;
public class cut{
public static int Rod_Cutting(int p[],int n)
{
int max=Integer.MIN_VALUE;
if(n==0)
return 0;
else
{
for(int j=0;j<n;j++)

{
max=Math.max(max,
p[j]+cut_rod(p,n-j-1));
}
}
return max;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the prices of the rod ");
int arr[]=new int[8];
for(int i=0;i<8;i++)
{
arr[i]=sc.nextInt();
}
int n=sc.nextInt();
int p=cut_rod(arr,n);
System.out.println("Maximum value is "+p);
}
}
