/*In a shopping mall, there is a Lift with a capacity of 500kgs only.
There are N persons waiting for the lift, and their weights (weights[]) are given.
If The Lift is overloaded, it will not move.
 
Your task is to find out the maximum number of persons can use the Lift,
without any overloading issue.

Input Format:
-------------
Line-1: An integer N, number of persons
Line-2: N space separated integers, weights of the persons.

Output Format:
--------------
Print an integer, max num of persons canuse the lift.


Sample Input-1:
---------------
6
98 121 76 135 142 65

Sample Output-1:
----------------
5


Sample Input-2:
---------------
7
85 67 69 83 54 61 50

Sample Output-2:
----------------
7
 */
import java.util.*;
public class LiftProb{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(solve(n,arr));
    }
    public static int solve(int n,int arr[]){
        Arrays.sort(arr);
        int cnt=0;
        int sum=0;
        for(int i=0;i<n;i++){
               sum+=arr[i];
            if(sum<=500){
                cnt++;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}