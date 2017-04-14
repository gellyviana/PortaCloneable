public class Main{
	public static void main(String[] args) throws Exception{
		Porta p1 = new Porta(2.10,0.90);
		p1.fechar();
		Porta p2 = (Porta) p1.clone();
		System.out.println("Esta aberta p1: " + p1.isAberta());
		System.out.println("Esta aberta p2: " + p2.isAberta());

		if(p1.equals(p2))
			System.out.println("p1 igual a p2");
		else 
			System.out.println("p1 diferente a p2");
	}
}