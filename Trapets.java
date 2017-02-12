public class Trapets{
	double a, b, h, c, d;
	public Trapets(double aalus, double balus, double hkorgus, double chaar, double dhaar){
		if(aalus<=0){throw new RuntimeException("Sobimatu alus a");}
		if(balus <=0){throw new RuntimeException("Sobimatu alus b");}
		if(aalus==balus){throw new RuntimeException("Tegemist ei ole trapetsiga");}
		if(hkorgus <=0){throw new RuntimeException("Sobimatu k6rgus");}
		if(chaar <=0){throw new RuntimeException("Sobimatu haar c");}
		if(dhaar <=0){throw new RuntimeException("Sobimatu haar d");}
		a=aalus;
		b=balus;
		h=hkorgus;
		c=chaar;
		d=dhaar;
	}
	public double pindala(){
		return ((a+b)/2)*h;
	}
	
	public double ymberm66t(){
		return a+b+c+d;
	}
	public String toString(){
		return "Trapetsi ymberm66t = "+
		       ymberm66t()+"m, pindala = "+pindala()+" ruutmeetrit.";
	}
}