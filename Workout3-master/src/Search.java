import java.util.Scanner;

public class Search {
    public static int search(int arrSize, int findNum, int[] arr)
    {
        int start =0;
        for(int i=0;i<arrSize;i++)
        {
            if(arr[i]==findNum)
            {
                start =1;
            }

        }
        return start;
    }

    public static int[] sort(int arrSize,int[] arr)
    {
        for(int i=0;i<arrSize-1;i++)
        {
            int s =arr[i];
            int sin =i;
            for(int j=i+1;j<arrSize;j++)
            {
                if(arr[j]< s)
                {
                    s =arr[j];
                    sin =j;
                }
            }
            int temp=arr[i];
            arr[i]= s;
            arr[sin]=temp;
        }

        return arr;
    }


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size");
        int arrsize =sc.nextInt();


        int arr[]=new int[arrsize];

        System.out.println("Enter the elements");

        for(int i = 0; i< arrsize; i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter an element to find in array:");

        int f =sc.nextInt();

        int s = search(arrsize, f,arr);

        if(s ==1)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");

        }

        int sortArr[]=sort(arrsize,arr);

        System.out.println("Sorted Array:");

        for(int i=0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\t");
        }
    }




}
