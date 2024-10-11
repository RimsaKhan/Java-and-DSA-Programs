/*class main{
    
public static void floyed(int n){
    int counter=1;
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(counter+ " ");
        counter++;
      }
      System.out.println();
    }
}
    public static void main(String args[]){
        floyed(3);
        
}
    /* 
    public static void zeroonetriangle (int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
             if ((i+j)%2==0){
             System.out.print("1");
             }
             else{
                System.out.print("0");
             }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroonetriangle(5);
    }
}

public  static void butterfly(int n){
    for (int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
              System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    for (int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(n-i);j++){
              System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
    public static void main(String[]args){
        butterfly(6);
    }
***************************************** SOLID RECTANGLE******************************************
        public static void solid_rombus(int n){
            for (int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //stars
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            solid_rombus(7);
        }
******************************HOLLOW ROMBUS**********************************
        public static void hollow_rombus(int n) {
            for (int i=1;i<=n;i++){
                //spaces
                for(int j=1;j<=(n-i);j++){
                    System.out.print(" ");
                }
                //create hollow rectangle it will create the hollow rombus shape **stars
                for(int j=1;j<=n;j++){
                    if(i==1||i==n||j==1||j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                    System.out.println();
                }
            }
        public static void main(String[] args) {
            hollow_rombus(5);
        }
     **********************************DIAMOND SHAPE***************************************************
            public static void diamond(int n) {
                for(int i=1;i<=n;i++){
                    for (int j=1;j<=(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=(2*i)-1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i=n;i>=1;i--){
                    for (int j=1;j<=(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j=1;j<=2*(i-1);j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }
            public static void main(String[] args) {
                diamond(5);
            }
            
            public static void bonus_problem_number_triangle(int n) {
                for(int i=1;i<=n;i++){
                    for(int j=1;j<(n-i);j++){
                        System.out.print(" ");
                    }
                for(int j=1;j<=i;j++){
                    System.out.print(i + " ");
                }    
                System.out.println();

                }
            }
            public static void main(String[] args) {
                bonus_problem_number_triangle(6);
            }
************************PALINDROME*******************************************************
            public static void palindrome(int n) {
                //inner loop
                for(int i=1;i<=n;i++){
                    // spaces inner loop
                    for (int j=1;j<=(n-i);j++){
                        System.out.print(" ");
                    }
                    //desending order
                    for(int j=i;j>=1;j--){
                        System.out.print(j);
                    }
                    //ascending order
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
}
public static void main(String[] args) {
    palindrome(10);
}
}
*/ /*/
import .util.*;
public class ArrayCC{

    public static void main(String[] args) {
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of physics");
        marks[0]=sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        marks[1]=sc.nextInt();
        System.out.println("Enter the marks of Maths");
        marks[2]=sc.nextInt();

        System.out.println("phy"+marks[0]);
        System.out.println("che"+marks[1]);
        System.out.println("Math"+marks[2]);
        marks[0]=89;
        System.out.println("phy"+marks[0]);
        marks[1]=marks[1]+2;
        System.out.println("che"+marks.length);

    }
     
    public static void update(int marks[] ) {
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
public static void main(String[] args) {
    int marks[]={65,98,67};
    update(marks);

    for(int i=0;i<marks.length;i++){
        System.out.println(marks[i]+" ");
}
System.out.println();
}

**************************LINEAR SEARCH***********************************************

public static int linear_search(int number[],int key ) {
    for(int i=0;i<=number.length;i++){
       if(number[i]==key) {
        return i;
       }
    }
    return -1;
}
public static void main(String[] args) {
    int number[]={76,89,34,90,32};
    String menu[]={"dosa","cake","milk","fruits","tea"};
    int key=44;
    int index= linear_search(number, key);
    if(index==-1){
        System.out.println("Not found");
    }
    else{
    System.out.println("Key has been found  at index:" +index);
    }
}

public static int menucard(String menu[],String key) {
    for(int i=0;i<menu.length;i++){
        if(menu[i]==(key)){
            return i;
        }
    }
            return -1;
        }
public static void main(String[] args) {
    String menu[]={"dosa","cake","milk","sandwich"};
    String key="sandwich";
    int index=menucard(menu,key);
    if(index==-1){
        System.out.println("not found");
    }
    else{
        System.out.println("key is been found at "+ index);
    }
}
 
public static int largestnum(int number[]) {
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        if(largest<number[i]){
            largest=number[i];
        }
    }
    return largest;
}
public static void main(String[] args) {
    int number[]={2,4,6,7,8};
    System.out.println("the largest number is "+largestnum(number));
}

public static int smallestnumber( int number[]) {
    int smallest=Integer.MAX_VALUE;
    for(int i=0;i<number.length;i++){
        if (smallest>number[i]){
           smallest=number[i];
        }
    }
    return smallest;
    
}
public static void main(String[] args) {
    int number[]={6,4,9,3,7,6,82,7};
    System.out.println("the smallest number is  "+smallestnumber(number));
}

***************************************BINARY SEARCH(WITHOUT FUNCTION)*************************************************
public static void main(String[] args) {
    int num[]={2,4,6,8,10,12,14};
    int key=4;
    int start=0;
    int end=num.length-1;
    while(start<=end){
        int mid=(start+end)/2;
    
    if(num[mid]==key){
   System.out.println("The key is been found"+mid);
    }
    if(num[mid]< key){
        start=mid+1;
    }
    else{
        end=mid-1;
    }
}
public static int binarysearch(int num[],int key) {
    int start=0;
    int end=num.length-1;
    while(start<=end){
        int mid=(start+end)/2;
        if(num[mid]==key){
            return mid;
        }
        if(num[mid]<key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
    }
        return -1;
    }
public static void main(String[] args) {
    int num[]={2,37,87,65,54,8,3};
    int key =90;
    System.out.println("the key has been found at the index"+ binarysearch(num, key));
}

public static void reverse(int num[]) {
int first=0,last=num.length-1;
while(first<last){
    // classical code for swapping
    int temp=num[last];
    num[last]=num[first];
    num[first]=temp;
    first++;
    last--;
}   
}
public static void main(String[] args) {
    int num[]={2,4,3,6};
    reverse(num);
    //printing the array
   for(int i=0;i<num.length;i++){
    System.out.println(num);
   }
}

*******************************print pair and total number of pairs******************************************************
public static void printpairs(int num[]) {
    int tp=0;

   for(int i=0;i<num.length;i++){
    int curr=num[i];//2,3,4,5,6,7,8
    for(int j=i+1;j<num.length;j++){
        System.out.println("("+curr+","+num[j]+")");
        tp++;
    }
    System.out.println();
   }
   System.out.println("totalpairs="+tp);
}
public static void main(String[] args) {
    int num[]={2,3,4,5,6,7,8};
    printpairs(num);
}
*******************************PRINT SUB-ARRAY OF AN ARRAY****************************************
    public static void printsubarray(int num[]) {
        int total=0;
        int sum=0;
        for(int i=0;i<=num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){//print
                    System.out.print(num[k]+" ");
                    sum=sum+num[k];
                }
                total++;
                System.out.println();
            }
            System.out.println();
        }
            System.out.println("totalpairs"+total);
            System.out.println(sum);
        }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printsubarray(num);
    }
     
    public static void max_value(int num[]) {
        
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++ ){
            int start=i;
            for(int j=i;j<num.length;j++){
              int last=j;
              int currsum=0;
              for(int k=start;k<=last;k++){
                currsum=currsum+num[k];
              }
              System.out.println(currsum);
              if(maxsum<currsum){
                maxsum=currsum;
              }
            }
            }
             System.out.println("the max sum is"+maxsum);
    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        max_value(num);
    }
 
  public static void prefixsum(int num[]) {
    int currsum=0;
    int maxSum=Integer.MIN_VALUE;
    int prefix[]=new int[num.length];
    prefix[0]=num[0];
//calculate prefix sum
    for(int i=1;i<prefix.length;i++){
      prefix[i]=prefix[i-1]+num[i];
    }
    for(int i=0;i<num.length;i++){
        int start=i;
       for(int j=i;j<num.length;j++){
        int end=j;
        currsum= start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
        if(maxSum<currsum){
            maxSum=currsum;
        }
        }
  }
  System.out.println("the maxsum is"+maxSum);
}
 public static void main(String[] args) {
    int num[]={-1,-2,6,-1,3};
    prefixsum(num);
  }
  
  public static void kadance(int num[]) {
    int ms=Integer.MIN_VALUE;
    int mins=Integer.MAX_VALUE;
    int cs=0;
    for(int i=0;i<num.length;i++){
        cs=cs +num[i];
        if(cs<0){
            cs=0;
        }
        ms=Math.max(cs,ms);
    } 
        if(num[i]>0){
        cs=0;
}
    System.out.println("our maximum subarray sum is "+ms);
    System.out.println("our minimum subarray sum is "+mins);
  }
  public static void main(String[] args) {
    int num[]={-2,-3,-1,-2,-3};
    kadance(num);
  }
  PRACTICE QUESTIONS FOR 
  
   class A{
    A(){
   System.out.println("Hi");
    }
    A(int x){
        System.out.println("Welcome to");
    }
    A(int x,int y){
        System.out.println("");
    }
    public static void main(String[] args) {
        A obj=new A(10);
        A object=new A(30,20);
    }
   }

public static void main(String[] args) {
    System.out.println("enter the value of a");
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a%2!=0){
        System.out.println("hello");

        
            if((a>=0)&& (a<=10)){
                System.out.println("hii");
            }else if((a>10)&&(a<=21)){
                    System.out.println("hii jii");
                }
                else if(a>20){
                    System.out.println("bye");
                }
            
            }
                else{
                    System.out.println("even number");
                }   
}

//*******************Generate 20 random numbers************************
import .util.*;
class arr{
    //maxleftbroundary  -array
//maxrightbroundary  -array
        //loop
        //find the min=water level
        //trapped water=waterlevel-height*width
    public static int trapping_rainwater(int height[]) {
        int n=height.length;    
        //maxleftbroundary  -array    
        int maxleftboundary[]=new int[n];
        maxleftboundary[0]=height[0];
        for(int i=1;i<n;i++){
            maxleftboundary[i]=Math.max(height[i],maxleftboundary[i-1]);
        }
        //maxrightbroundary  -array
        int maxrightboundary[]=new int[n];
        maxrightboundary[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxrightboundary[i]=Math.max(height[i],maxrightboundary[i+1]);
        }
        int trappedrain=0;
        for(int i=0;i<n;i++){
           int waterlevel=Math.min(maxleftboundary[i],maxrightboundary[i]);
           trappedrain+=waterlevel-height[i];
        }
        return trappedrain;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapping_rainwater(height));
    }

import .util.*;
class arr{
    public static int trapping_rainwater(int height[]) {
        int n=height.length;
        int maxleftboundary[]=new int[n];
        maxleftboundary[0]=height[0];
        for(int i=1;i<n;i++){
            maxleftboundary[i]=Math.max(height[i],maxleftboundary[i-1]);
        }
        int maxrightboundary[]=new int[n];
        maxrightboundary[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxrightboundary[i]=Math.max(height[i],maxrightboundary[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(maxleftboundary[i],maxrightboundary[i]);
            trappedwater +=waterlevel-height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,87,4,3,2,90,2,5};
        System.out.println(trapping_rainwater(height));
    }
}

import .util.*;
class arr{
    public static int stocks(int prices[]) {
        int buying_price=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buying_price<prices[i]){
              int profit=prices[i]-buying_price;
              maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buying_price=prices[i];
            }
        }
            return maxprofit;
        }
    
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stocks(prices));
    }
}
************************PrRACTISE QUESTION RAINWATER****************************************
import .util.*;
class arr{
    public static int trapping_rainwater(int height[]) {
        int n=height.length;
        int maxleftboundary[]=new int[n];
        maxleftboundary[0]=height[0];
        for(int i=1;i<n;i++){
               maxleftboundary[i]=Math.max(height[i],maxleftboundary[i-1]);
        }
        int maxrightboundary[]=new int[n];
        maxrightboundary[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxrightboundary[i]=Math.max(height[i],maxrightboundary[i+1]);
        }
        int trappedwater=0;
        for(int i=0;i<n;i++){
            int waterlevel= Math.min(maxleftboundary[i],maxrightboundary[i]);
            trappedwater +=waterlevel-height[i];
        }
       return trappedwater;
}
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println(trapping_rainwater(height));
    }
}
import .util.*;
class arr{
    public static boolean find_duplicates(int nums[]) {
        for(int i=0;i<=nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                   return true;
                }
            }
        }
                   return false;       
    }  
public static void main(String[] args) {
    int nums[]={1,2,3};
    System.out.println(find_duplicates(nums));  
}
    }
import .util.*;
class arr{
    public static int binarysearch(int nums[],int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
         if(nums[mid]==target){
            return mid;
         }
         if(nums[mid]<target){
             start=mid+1;
         }
         else{
            end=mid-1;
         }
        }
         return -1;
    }
    public static void main(String[] args) {
       int nums[]={4,5,6,7,0,1,2};
       int target=5;
       System.out.println(binarysearch(nums,target)); 
    }
}

import .util.*;
class arr{
    public static int stocks_to_buy(int prices[]) {
        int buying_price=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(buying_price<prices[i]){
            int profit=prices[i]-buying_price;
            maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buying_price=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(stocks_to_buy(prices));
    }
}
import .util.*;
class Basicsorting{
    public static void bubblesort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,2,1,3};
        bubblesort(arr);
        printarr(arr);
    }
}
import .util.*;
class arr{
    public static int selectionsort(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            int minelement=i;
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[minelement]>arr[j]){
                    minelement=j;
                }

            }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={3,5,2,5,7,2,9,6,8};

        
    }
}
import .util.*;
class Solution {
    public static int[] twoSum(int[]nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<=nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
             }
              }
        }
        return null;
    }
    public static void main(String[]args){
        int nums[]={2,7,11,15};
        int target=13;
        int[]result=twoSum(nums,target);
        if(result!=null){
            System.out.println("indices are "+result[0]+","+result[1]);
        }else{
            System.out.println("no solution found");
        }
    }
}
class main{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.err.print("*");
            }
            System.out.println();
        }
    }
}
//FUNCTION SIN 
import .util.*;
class Main{
    public static void printMyName (String name ){
        System.out.println(name);
        return;
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    printMyName("the name is :" +name);
    }
}

class Main{
    public static int sumOfNumbers(int a,int b){
      int sum=a+b;
      return sum;
    }
    public static void main(String[]args){
    System.out.println("the sum of a and b is "+sumOfNumbers (2,3));
    }
}
import .util.*;
public class Main{
    public static int function1(int a,int b){
        int sum=a+b;
        return sum;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The sum is "+ function1(a,b));
    }
}
import .util.*;
class Main{
    public static int mul (int a,int b){
        return a*b;
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a=sc.nextInt();
    System.out.println("Enter the value of b");
    int b=sc.nextInt();
    System.out.println("The multiplication of a and b is "+mul(a,b));
    }
}

import .util.*;

class Main{
    public static void fac (int n){
        if(n<=0){
           System.out.println("Invalid number");
           return; 
        }
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return;
    }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    fac(n);
    
  }
}
  
  import .util.*;

class Main{
    public static void evenandodd (int n){
        if(n*2==0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenandodd(n);
    }
}

import .util.*;
public class table{
    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(i*n); 
        }
        
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    table(n);
    }
}

import .util.*;
    class prime{
        public static void primenum(int n){
        boolean isprime=true;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                isprime=false;
                break;
            }
            if(isprime){
                System.out.println("it is a prime number");
            }
            else{
                System.out.println("it is not a prime number");
            }
        }
    
        }
        public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primenum(n);
        }
    }

class program{
    public static void main(String[] args) {
        System.out.println(Math.sqrt(2));
    }
}
import .util.*;

class demo {
    public static void isprime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("it is a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }

    public static void multiple(int a, int b) {
        isprime(a);
        isprime(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiple(a, b);
    }
}
***************FIBONACI SERIES******************
import java.util.*;
class program{
    
    public static void fibonacci(int n) {
        int firstnum=0;
        int secondnum=1;
        System.out.print(firstnum + ", ");
        System.out.print(secondnum + ", ");

        for(int i=2;i<=n-1;i++){
        int nextnum= firstnum+secondnum;
        firstnum=secondnum;
        secondnum=nextnum;
        System.out.print(nextnum + " ,");
        }
        
    }
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     fibonacci(n);   
    }
}

*********************REVERSE OF A NUMBER************************************
import .util.*;
class program{
    public static void reverse(int n) {
        int num=n;
        while(num>0){
            int rev=num%10;
            System.out.print(rev);
            num= num/10;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverse(n);
    }
}
import .util.*;
class practisequestion{
    public static int Average(int marks1,int marks2,int marks3) {
        int average=(marks1+marks2+marks3)/3;
        return average;
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter teh first subject marks");
    int marks1=sc.nextInt();
    System.out.println("enter teh second subject marks");
    int marks2=sc.nextInt();
    System.out.println("enter teh third subject marks");
    int marks3=sc.nextInt();
    System.out.println(Average(marks1,marks2,marks3));
 }
}
import java.util.*;
class practise{
    public static void sumofoddnum(int num ) {
        int sum=0;
        for (int i=1;i<=num;i++){
            if(i%2!=0){
              sum=sum+i;
              System.out.println(sum);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scnner(System.in);
        int num=sc.nextInt();
        System.out.println("The sum of odd number is: "sumofoddnum(num));
    }
}
import java.util.*;
class practise{
    public static int greater(int num1,int num2) {
     if(num1>num2){
        System.out.println(num1+"num1 is the greatest");
     }
     else{
        System.out.println(num2+"num1 is the greatest");
     }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num1=sc.nextInt();
        System.out.println(greater(num1,num2));
    }
}
import java.util.*;
class practice{
    public static int circumferenceofcircle(int radius) {
        int circumference=2*Math.PI.radius;
        System.out.println("The circumference of a circle is : "+circumference);
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        System.out.println(circumferenceofcircle(radius));
        
    }
}*/
import java.util.*;
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
            System.out.println(arr[i][j]);
        }
        System.out.println();
    
    }
}