package aggregation;

public class AggregationChild {
	String name;
	int age;
	AggregationParent ref;

	public AggregationChild(String name,int age ,AggregationParent ref) {
		
		this.name=name;
		this.age=age;
		this.ref=ref;
		
	}
	public void display() {
		
		System.out.println("name:" +name);
		System.out.println("age:" + age);
		System.out.println(ref.name+ref.age);
	}
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AggregationParent objparent =new AggregationParent("Sojy",30);
		
		AggregationChild obj=new AggregationChild("Solly",26,objparent);
		obj.display();

	}

}
