package aggregation;

public class Aggregation2Child {
	int c;
	int d;
	int sub;
	Aggregation2parent ref;
	
	public Aggregation2Child(int c, int d,Aggregation2parent ref) {
		this.c=c;
		this.d=d;
		int sub=c-d;
		this.sub=sub;
		this.ref=ref;
		
			
	}
	public void display() {
		
		System.out.println("Sub ="+sub);
		System.out.println("Sum ="+ref.sum);
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Aggregation2parent obj1 = new Aggregation2parent(2,4);
		Aggregation2Child obj2 = new Aggregation2Child(6,4,obj1);
		obj2.display();
		
		
	}

}
