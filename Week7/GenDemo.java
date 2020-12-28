class Generics<N,P,A>{
	N ob1;
	P ob2;
	A ob3;
	
	Generics(N o1,P o2,A o3){
		ob1=o1;
		ob2=o2;
		ob3=o3;
	}
	
	void showTypes(){
		System.out.println("Type of first parameter is:"+ob1.getClass().getName());
		System.out.println("Type of second parameter is:"+ob2.getClass().getName());
		System.out.println("Type of third parameter is:"+ob3.getClass().getName());
	}
	
	N getOb1(){
		return ob1;
	}
	
	P getOb2(){
		return ob2;
	}
	
	A getOb3(){
		return ob3;
	}
}

class GenDemo{
	public static void main(String args[]){
		Generics<String,String,Integer> obj= new Generics<String,String,Integer>("Neelam Godihal","1BM19EC089",19);
		
		obj.showTypes();
		
		String str=obj.getOb1();
		System.out.println("First parameter:"+str);
		
		String usn=obj.getOb2();
		System.out.println("Second parameter:"+usn);
		
		int i=obj.getOb3();
		System.out.println("Third parameter:"+i);
	}

}
