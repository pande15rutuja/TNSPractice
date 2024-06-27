package pack;

public class ClassA {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int x=10;
		System.out.println("a and b value before the opertor :"+ a+" "+b);
		
		++a;
		int c=++a+b+a--;
		System.out.println("c"+" "+c);
		
		int d=c++ +a +b--;
		System.out.println(d);
	}

}
