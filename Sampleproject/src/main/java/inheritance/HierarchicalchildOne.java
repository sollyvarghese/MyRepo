package inheritance;

public class HierarchicalchildOne extends HierarchicalParent {
	
	public void displayOne() {
		
		String a= "solly";
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchicalchildOne obj = new HierarchicalchildOne();
		obj.sum();
		obj.displayOne();

	}

}
