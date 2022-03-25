package trial;

public class overload {
	overload(int a, int b){
		System.out.println(a+b);
	}
	overload(String s){
		System.out.println("My name is "+s);
	}
	overload(int a, int b, int c){
		System.out.println(a*b*c);
	}
	overload(double a , int b){
		System.out.println(Math.pow(a, b));
	}

}

