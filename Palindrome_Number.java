import java.util.Scanner;
public class Palindrome_Number{
    public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	int x = input.nextInt();
	System.out.println(is_Palindrome(x));
    }
    public static boolean is_Palindrome(int n){
	if(n < 0)
	    return false;
	else{
	    int temp = n, rev = 0;
	    while(temp != 0){
		rev = rev * 10;
		rev = rev + temp % 10;
		temp /= 10;
	    }
	    if(rev == n)
		return true;
	    else
		return false;
	}
    }
}
