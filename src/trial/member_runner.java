package trial;

public class member_runner {

	public static void main(String[] args) {
		employee obj1=new employee();
		manager obj2=new manager();
		obj1.name="Khitish";
		obj1.age=22;
		obj1.add="Chhend";
		obj1.phn=0661;
		obj1.printSalary(30000);
		obj1.specialization="Java";
		
		obj1.printName();
		

	}

}
