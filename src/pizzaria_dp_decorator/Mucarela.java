package pizzaria_dp_decorator;

public class Mucarela extends RecheioPizza{

	public Mucarela(Pizza novaPizza) {
		super(novaPizza);
		
		System.out.println("Adicionando massa fina.");
		System.out.println("Adicionando mu�arela.");
	}
	
	public String getDescricao() {
		
		return tempPizza.getDescricao() + ", Mu�arela";
		
	}
	
	public double getValor() {
		
		return tempPizza.getValor() + 0.5;
		
	}
	
	
}
