/*this is the file of knowing java variables*/
class JavaVariables{
	public static void main(String[] args) {
		int n=10;
		char c='c';
		float f=112.34;
		boolean tr=true;
		String str="hi";
		System.out.printf("%d %c %s %f %b",n,c,str,f,tr);
	}
}
/*There are different types of variables
1. String:- it basically stores text(you might know it)
2. Integer:- stores integer
3. Float:- stores decimal numbers
4. char:- stores single character
5. Boolean:- stores true or false
The general rules for constructing names for variables (unique identifiers) are:

    Names can contain letters, digits, underscores, and dollar signs
    Names must begin with a letter
    Names should start with a lowercase letter and it cannot contain whitespace
    Names can also begin with $ and _ (but we will not use it in this tutorial)
    Names are case sensitive ("myVar" and "myvar" are different variables)
    Reserved words (like Java keywords, such as int or boolean) cannot be used as names
*/