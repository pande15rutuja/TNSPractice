package pack;

public class SwitchDemo {
	public static void main(String[] args) {
		char x='l';
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println(x+"is a leader");
			break;
		case 'd':
		case 'D':
			System.out.println(x+" is a Digital");
			default:
				System.out.println(x+"is other than the letters");
			
		}
	}

}
