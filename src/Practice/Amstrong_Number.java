package Practice;

public class Amstrong_Number {
	
	public void Amstrong(int num) {
		int cube=0;
		int r;
		int t;
		
		t=num;
		while(num>0){
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		if(t==cube) {
			System.out.println("This is Amstrong number");
		}else {
			System.out.println("This is not amstrong number");
		}
	}
public static void main(String[] args) {
	Amstrong_Number am= new Amstrong_Number();
	am.Amstrong(370);
}
}
