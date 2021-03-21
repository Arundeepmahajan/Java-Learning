/*this one is interesting*/
class JavaMath{
	public static void main(String[] args) {
		int y=10;
		int u=90;
		int x=36;
		System.out.println("Maximum: "+Math.max(y,u));
		System.out.println("Minimum: "+Math.min(y,u));
		System.out.println("Square Root: "+Math.sqrt(x));
		System.out.println("Absolute: "+Math.abs(-78.90));
		System.out.println("Random: "+Math.random());
		int randomNum=(int)(Math.random()*101);
		System.out.println(randomNum);	
	}
}