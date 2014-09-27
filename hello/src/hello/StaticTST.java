package hello;

//package mytst4;

public class StaticTST {
	public int my_id_ns;//
	public static int my_id_s=2011;
	
	public StaticTST(){
		my_id_ns++;
		my_id_s++;
	}
	
	public void Prt_ns(){
		System.out.println("Now,my_id_ns is:"+my_id_ns);
	}
	public void Prt_s(){
		System.out.println("Now,my_id_s is:"+my_id_s);
	}
	
	public static void main(String[] args){
		StaticTST a=new StaticTST();
		StaticTST b=new StaticTST();
//		StaticTST1 c=new StaticTST1();
		a.my_id_ns=122;
		b.my_id_ns=232;
		a.Prt_ns();
		a.Prt_s();
		b.Prt_ns();
		b.Prt_s();
	}
//	!!!RESULT:
//	Now,my_id_ns is122
//	Now,my_id_s is2013
//	Now,my_id_ns is232
//	Now,my_id_s is2013


}