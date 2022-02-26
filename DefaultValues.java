package JavaBasicProgramming;

public class DefaultValues {
	int a;
	short b;
	long c;
	float d;
	byte e;
	double f;
	void Values(){
	System.out.println(" Default value int: "+a);
	System.out.println(" Default value short: "+b);
	System.out.println(" Default value long: "+c);
	System.out.println(" Default value float: "+d);
	System.out.println(" Default value byte: "+e);
	System.out.println(" Default value double: "+f);
	}
	public static void main(String[]args) {
		DefaultValues df=new DefaultValues();
		df.Values();
	
	}

}
