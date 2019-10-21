package pizzaria_dp_decorator;

public class PadraoPizza implements Pizza{

	@Override
	public String getDescricao() {
		return "Massa fina";
	}

	@Override
	public double getValor() {
		return 5.00;
	}
}
