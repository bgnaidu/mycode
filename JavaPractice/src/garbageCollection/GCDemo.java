package garbageCollection;

public class GCDemo {

	int objID;
	public GCDemo(int objID) {
		this.objID=objID;
		System.out.println("created "+objID);
		
	}
	public static void main(String[] args) {
		new GCDemo(1);
		new GCDemo(2);
		for(int i=0;i<500;i++) {
			System.gc();
		}
		
		

	}
	@Override
	protected void finalize() {
		System.out.println("finalize happened"+ objID);
	}

}
