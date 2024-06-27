package pack;

public class ForEachDemo {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		for(int i:arr )
		{
			System.out.println(i);
		}
		char ch[]= {'j','a','v','a'};
		for(char c:ch)
		{
			System.out.println(c);
		}
		String s1[]= {"java","Programming","Learning"};
		for(String s:s1)
		{
			System.out.print(s+" ");
		}
	}

}
