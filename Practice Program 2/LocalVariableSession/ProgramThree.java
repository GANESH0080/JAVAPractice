package LocalVariableSession;

//Local variable declared inside the method / constructor
//For local variable no any default value
public class ProgramThree {

	ProgramThree() {
		int i = 5000;
		System.out.println("Method I value is : " + " " + i);
	}

	static void getData() {
		int i = 10000;
		System.out.println("GetData Method I value is : " + " " + i);
	}

	static void getDetails() {
		int i = 30000;
		System.out.println("GetDetails Method I value is : " + " " + i);
		getData();
	}

	public static void main(String[] args) {
		ProgramThree Test = new ProgramThree();
		Test.getDetails();

	}

}
