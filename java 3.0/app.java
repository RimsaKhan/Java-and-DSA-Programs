/*import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows=sc.nextInt();
        System.out.println("Enter the cols");
        int cols=sc.nextInt();
        int [][]arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
        System.out.println();
        }
    }
}
import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the row");
        int row=sc.nextInt();
        System.out.println("enter the size of the col");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the number whose indices need to be searched");
        int number=sc.nextInt();  
        
       for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
          if(arr[i][j]==number){
          System.out.println("The number is found at the indices of :"+"["+i +" , "+ j+"]");
          }
          }
        }
    }
}
import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr number of rows");
        int n=sc.nextInt();
        System.out.println("Enter number of col");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
    
        for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("spiral order");
        int rowstart=0;
        int rowend=n-1;
        int colstart=0;
        int colend=m-1;

        while(rowstart<=rowend && colstart<=colend){

            for(int col=colstart;col<=colend;col++){
                System.out.print(arr[rowstart][col]+" ");
            }
            rowstart++;
        
            for(int row=rowstart;row<=rowend;row++){
                System.out.print(arr[row][colend]+" ");
            }
            colend--;
        
            for(int col=colend;col>=colstart;col--){
                System.out.print(arr[rowend][col]+" ");
            }
            rowend--;
            
            for(int row=rowend;row>=rowstart;row--){
                System.out.print(arr[row][colstart]+" ");
            }
            colstart++;
            System.out.println();
}
}
}
import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row u wnat");
        int row=sc.nextInt();
        System.out.println("Enter the size of col u wnat");
        int col=sc.nextInt();
        int arr1[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr1[i][j]+" ");
        }
        System.out.println();
        }
        System.out.println("Transpose of the matrix");
        int arr2[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr2[j][i]=arr1[i][j];   
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row u want");
        int row=sc.nextInt();
        System.out.println("Enter the size of the column u want");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
           System.out.println();
        }
        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
import java.util.*;
class program{
public static void main(String[] args) {
    int arr[]={1,2,3,3,4,3,3};
    int n=arr.length;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number u want to count");
    int num=sc.nextInt();
    int count=0;
    for(int i=0;i<n;i++){
        if(num==arr[i]){
            count++; 
        }
   
    }
    System.out.println("the number of times"+num+"occurs is"+" "+count);
}
}
import java.util.*;
class program{
public static void main(String[] args) {
    int arr[]={5,40,3,2,1};
    boolean sort=true;
for(int i=0;i<arr.length-1;i++){
    if(arr[i]<=arr[i+1]){
        continue;
    } 
    else{
        sort=true;
        break;
    }
  }
if (sort){
    System.out.println("the array is sorted");
}
else{
    System.out.println("Not sorted");
}
 }
}

import java.util.*;
class program{
    public static void main(String[] args) {
        int count=0;
        int arr[]={2,3,2,8};
        for(int i=0;i<arr.length;i++){
    
                count+=arr[i];
        }
        System.out.println("the sum of the numbers are"+" "+count);
    }
}
import java.util.*;
class program{
  
    public static void main(String[] args) {
    int arr[][]={{1,2,3,5},{2,3,48,5,6}}; 
    int max=Integer.MIN_VALUE; 
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>max){
              max=arr[i][j];

            }
        }
    }
    System.out.println("the maxium number is"+max);
    }
}*/
import java.util.*;
class program{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of row");
        int row=sc.nextInt();
        System.out.println("enter the size of col");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;i<col;j++){
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+" ");
        
        System.out.println();
    
    if(arr[i]==arr[j]){
        System.out.println(arr[i][j]);
    }
    }
}
}
}
