package pizzaria_dp_decorator;

public class TestePizza {
	
	public static void main(String[] args) {
		
		Pizza basicaPizza = new MolhoTomate(new Mucarela(new PadraoPizza()));
		
		System.out.println("Descrição da Pizza: " + basicaPizza.getDescricao());
		
		System.out.println("Valor Total: " + basicaPizza.getValor());
		
	}
}
