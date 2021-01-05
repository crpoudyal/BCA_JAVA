package classObjectMethod;
import java.lang.Math;
public class Triangle {
	double a,b,c,Area,Par,s;
	Triangle(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;	
	}
	void Area() {
		double s=(a+b+c)/2;
		Area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		System.out.println("Area of Triangle is "+Area);
	}
	void Paremeter() {
		Par = a+b+c;
		System.out.println("Paremeter of Triangle is "+Par);
	}

	public static void main(String[] args) {
		
		Triangle obj = new Triangle(3,4,5);
		obj.Paremeter();
		obj.Area();

	}

}
