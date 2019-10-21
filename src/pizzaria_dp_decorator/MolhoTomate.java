package pizzaria_dp_decorator;

public class MolhoTomate extends RecheioPizza{

	public MolhoTomate(Pizza novaPizza) {
		super(novaPizza);
		
		System.out.println("Adicionando molho de tomate.");
		
	}
	
	public String getDescricao() {
		
		return tempPizza.getDescricao() + ", Molho de Tomate";
		
	}
	
	public double getValor() {
		
		return tempPizza.getValor() + 1.00;
		
	}
	
	
}
