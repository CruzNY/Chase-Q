import java.lang.Math;
public class Reverse_Int{
    public static void main(String args[]){
	int x = -19245;
	int rev = reverse(x); //-321
	System.out.println("Input "+x);
	System.out.println();
	System.out.println("Output "+rev);
    }
    public static int reverse(int x){	
	int rev = 0;
	int temp = Math.abs(x);
	while(temp > 0){
	    rev = rev * 10;
	    rev = rev + temp % 10;
	    temp = temp / 10;
	}
	if(x<0)
	    return rev*-1;
	else
	    return rev;
    }
}
