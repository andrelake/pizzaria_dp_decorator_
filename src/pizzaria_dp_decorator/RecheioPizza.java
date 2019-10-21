package pizzaria_dp_decorator;

public abstract class RecheioPizza implements Pizza{

	protected Pizza tempPizza;
	
	public RecheioPizza(Pizza novaPizza) {
		
		tempPizza = novaPizza;
		
	}
	
	public String getDescricao() {
		
		return tempPizza.getDescricao();
		
	}
	
	public double getValor() {
		
		return tempPizza.getValor();
		
	}
	
}
