public class BinarySearch
{  
 public static void Binary(int arr[], int start, int end, int ele)
 {  
   int mid = (start + end)/2;  
   while( start <= end )
   {  
      if ( arr[mid] < ele )
      {  
        start = mid + 1;     
      }else if ( arr[mid] == ele)
      {  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
      else
      {  
         end = mid - 1;  
      }  
      mid = (start + end)/2;  
   }  
   if ( start > end )
   {  
      System.out.println("Element is not found!");  
   }  
 }  
 public static void main(String args[]){  
        //3,45,65,23,11,56,76,66,9,43
        int arr[] = {3,9,11,23,43,45,56,65,66,76};  
        int ele = 65;  
        int end=arr.length-1;  
        Binary(arr,0,end,ele);     
 }  
}  