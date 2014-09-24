package mytst4;

public class StaticTST1 {
	public int my_id_ns;//非静态
	public static int my_id_s=2011;
	
	public StaticTST1(){
		my_id_ns++;
		my_id_s++;
	}
	
	public void Prt_ns(){
		System.out.println("Now,my_id_ns is："+my_id_ns);
	}
	public void Prt_s(){
		System.out.println("Now,my_id_s is："+my_id_s);
	}
	
	public static void main(String[] args){
		StaticTST1 a=new StaticTST1();
		StaticTST1 b=new StaticTST1();
//		StaticTST1 c=new StaticTST1();
		a.my_id_ns=122;
		b.my_id_ns=232;
		a.Prt_ns();
		a.Prt_s();
		b.Prt_ns();
		b.Prt_s();
	}
//	!!!RESULT:
//	Now,my_id_ns is：122
//	Now,my_id_s is：2013
//	Now,my_id_ns is：232
//	Now,my_id_s is：2013


}
