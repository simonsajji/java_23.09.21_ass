package strings_classes;

public class Varags {
	
	public static void main(String args[]) {
		
		int g=sum(1,2,4,5,6,7,8,10);
		System.out.println(g);
		
		printstr("hello","world","this","is","Simon");
	}
	
	// method to print multiple Integers are varags
	public static int sum(int a, int i, int o,int b,int... rem) {
		int sum=a+i+o+b;
		for(int h=0;h<rem.length;h++) {
			 sum=rem[h]+sum;
			
		}
		return sum;
		
		
	}
	
	// method to print multiple strings are varags
	public static void printstr(String x,String y,String z,String...strings) {
		x=x+" "+ y+" "+ z;
		for(int k=0;k<strings.length;k++) {
			x=x+" " + strings[k];
			
		}
		System.out.print(x);
	}

}
