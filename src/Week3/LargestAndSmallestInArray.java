package Week3;

public class LargestAndSmallestInArray
{
    public static void main(String[] args)
    {
        int arr[] = {7,19,4,7,76,43,99,1};
        int max= arr[0];
        int min= arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Max value is : "+ max);
        for (int i=0; i<arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Min value is : " + min);
    }
}