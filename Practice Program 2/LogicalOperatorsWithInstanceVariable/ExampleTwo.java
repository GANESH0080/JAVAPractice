package LogicalOperatorsWithInstanceVariable;

public class ExampleTwo {

	// Instance variable which is declared in class and outside the method
			int i;
			int j;
			int k;
			int l;

			public static void main(String[] args) {
				// We are not able to access instance variable in main method when
				// variable not static
				// When we declared variable as static then we can access instance var
				// in main method
				// if (i<j && j<k)

				ExampleTwo test = new ExampleTwo();
				test.i = 10;
				test.j = 20;
				test.k = 30;
				test.l = 22;
				if (test.i < test.j && test.j < test.k && test.k < test.l )
				{
		        System.out.println("Pass");
				}
				else
				{
				System.out.println("Fail");
			}
		}
		}