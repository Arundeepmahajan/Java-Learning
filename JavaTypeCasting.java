/** now i can confirm that w3schools has done a very good work by putting this work online. like there material is really good*/
/* well let me tell you guys something, I am doing all this on my Pentium 4 1.7 ghz processor with 512mb RAM, If you want to donate some money you can ;)
*/
class JavaTypeCasting{
	public static void main(String[] args) {
		System.out.println("What is Java Type Casting");
		System.out.println("Type Casting is when you assign a value of one primitive data type to another type");
		System.out.println("In Java, there are 2 types of Type Casting : !. Widening Casting(automatic) 2.Narrowing Casting(manually)");
		/*
    Widening Casting (automatically) - converting a smaller type to a larger type size
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting (manually) - converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte */
    System.out.println("Widening Casting");
    int hu=9;
    double mu=hu;
    System.out.println(hu);
    System.out.println(mu);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Narrowing Casting");
    double du=9.78;
    int iu=(int) du;
    System.out.println(du);
    System.out.println(iu);
			}
}