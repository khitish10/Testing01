package trial;


class test{
	private int length;
	private int breadth;
	
	public void setLength(int l) {
		this.length=l;
	}
	public int getLength() {
		return length;
	}
	public void setBreadth(int b) {
		this.breadth=b;
	}
	public int getBreadth() {
		return breadth;
	}
}

public class demo {
	public static void main(String[] args) {
		test ts=new test();
		
		ts.setLength(10);
		ts.setBreadth(20);
		int len=ts.getLength();
		int bre=ts.getBreadth();
		int area=len*bre;
		System.out.println(area);
		
	}

}
