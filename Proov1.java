public class Proov1{
	public static void main(String[] args){
		Trapets laud1=new Trapets(2, 1, 5, 3, 4);
		Trapets laud2=new Trapets(5, 5.5, 2.5, 4, 6.5);
		Trapets laud3=new Trapets(2, 1.5, 3, 4, 1);
		Trapets laud4=new Trapets(3, 5, 7, 6, 4);
		Trapets laud5=new Trapets(1, 1.5, 2, 3, 2);
		System.out.println("1. "+laud1.pindala()+" "+laud1.ymberm66t());
		System.out.println("2. "+laud2.pindala());
		System.out.println("3. "+laud3.pindala());
		System.out.println("4. "+laud4);
		System.out.println("5. "+laud5.toString());
	}
}
/*
[johareil@greeny t02klass]$ java Proov1
1. 7.5 10.0
2. 13.125
3. 5.25
4. Trapetsi ymberm66t = 18.0m, pindala = 28.0 ruutmeetrit.
5. Trapetsi ymberm66t = 7.5m, pindala = 2.5 ruutmeetrit.

*/