package com.methodrefernce;

interface Parser{
	int parse(int i);
}
class IntegerParser{
	
	public static int convert(int s) {
		if(s>10)
			s=s-2;
		else
			s=s+2;
		return s;
	}
}
class MyPrint{
	
	public void printA(int i,Parser p) {
		i=p.parse(i);
		System.out.println(i);
	}
}
public class MethodRef {
	public static void main(String[] args) {
		/*List<Integer> lst=Arrays.asList(1,2,3,4);
		lst.forEach(System.out::println); // :: - Method Refernce
		*/		
		int i=9;
		MyPrint mp=new MyPrint();
		mp.printA(i,new Parser() {
			
			@Override
			public int parse(int i) {
				return IntegerParser.convert(11);
			}
		});
		System.out.println("using method reference");
		mp.printA(i,IntegerParser::convert);
	}

}
