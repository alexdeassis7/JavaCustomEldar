package calculadorados;
//Esta sera la clase de negocio en donde aplicaremos Unit Test

//Usando Before y After
public class CalculadoraDos {
	private int ans;

	public CalculadoraDos() {

	}

	public int add(int a, int b) {
		ans = a + b;
		return ans;
	}

	public int sub(int a, int b) {
		ans = a - b;
		return ans;
	}

	// creamos un metodo de dividir que pueda lanzar una Exception
	public int div(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("No podes dividir por cero ...");
		}
		ans = a / b;
		return ans;
	}

	public int add(int v) {
		ans += v;
		return ans;
	}

	public int sub(int v) {
		ans -= v;
		return ans;
	}

	public int ans() {
		return ans;
	}

	public void clear() {
		ans = 0;
	}

	// metodo que seberia estar optimizado
	public void operacionOptima() {
		try {
			Thread.sleep(20); // demoramos 2000 milisegundos la ejecución del Hilo.
		} catch (InterruptedException e) {
			System.out.println("Error al demorar la ejecucion del hilo");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
