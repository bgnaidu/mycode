package Sample.coreprograms;

public class Typecasting {

	public static void main(String[] args) {
		
int i=1000000000;
double d=1234.456;
float f=3456.56f;


//implicit type casting

double d1=i;
System.out.println(d1);
double d2=f;
System.out.println(d2);

//explicit casting

float f2=(float)d;
System.out.println(f2);
int i1=(int)f;
System.out.println(i1);

//Boolean casting

boolean b=true;

//int i2=(int)b;// throw an error
// primitives to string 
String string=String.valueOf(d2);
System.out.println(string);
String s=Integer.toString(i1);
System.out.println(i1);
//String to primitives
int i4=Integer.parseInt(s);
System.out.println(i4);
byte b2=Byte.parseByte(string);
System.out.println(b2);
	}

}
