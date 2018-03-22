package hw;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int tri(int a,int b,int c){
		int m=0;
		if(a+b>c&&a+c>b&&b+c>a){
			if(a==b&&b==c) m=1;  //equilateral
			else if(a==b||b==c||a==c) m=2;  //isosceles
			else m=3;  //scalene
		}
		else m=-1;
		
		return m;
	}

}
