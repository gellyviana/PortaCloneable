public class Porta implements Cloneable{

	private double altura;
	private double largura;
	private boolean aberta;

	public Porta(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
		this.aberta = false;
	}

	public Object clone(){
		Porta p = new Porta(this.altura, this.largura);
		if (this.aberta) {
			p.abrir();
		}
		return p;		
	}
	public void setAltura(double altura){
		this.altura = altura; 
	}
	public double getAltura(){
		return this.altura;
	}
	public void setLargura(double largura){
		this.largura = largura;
	}
	public double getLargura(){
		return this.largura;
	}
	public boolean isAberta(){
		return this.aberta;
	}
	public void abrir(){
		this.aberta = true;
	} 
	public void fechar(){
		this.aberta = false;
	} 
	public boolean equals(Object o){
		if (o instanceof Porta ) {
			Porta p = (Porta)o;
			if (this.altura== p.getAltura() && this.getLargura() == p.largura && this.aberta == p.isAberta()){
				return true;
			}
		}return false;
	}

}