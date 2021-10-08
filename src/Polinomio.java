
public class Polinomio {
	
	private int grado;
	private double[] coeficientes;
	
	public Polinomio(double[] coeficientes) {
		this.coeficientes = coeficientes;
		this.grado = coeficientes.length-1;
	}
	
	double evaluarMSucesivas(double x) {
		double resultado = 0;
		
		for(int i=0;i<=grado;i++) {
			double potencia = 1;
			
			for(int j=0;j<grado-i;j++) {
				potencia *= x;
			}
			
			resultado += potencia*coeficientes[i];
		}
		
		return resultado;
		/*
		 * Complejidad:
		 * analizamos el for interno:
		 * 1° iteracion: j desde 0 a grado-1 -> "grado" iteraciones
		 * 2° iteracion: j desde 0 a grado -2 -> "grado - 1" iteraciones
		 * 3° iteracion: j desde 0 a grado-3 -> "grado -2" iteraciones
		 * ...
		 * esto parara cuando haga 1 sola iteracion. 
		 * la cantidad de iteraciones sera:
		 * 1 + 2 + 3 + ... + (grado-1) + grado = grado*(grado+1)/2 iteraciones.
		 * dentro de los ciclos for, se hacen operaciones de complejidad
		 * O(1) (sumas y multiplicaciones)
		 * por lo tanto este algoritmo tiene complejidad O(grado*grado)
		 */
	}
	
	double evaluarRecursiva(double x) {
		double resultado = 0;
		
		for(int i=0;i<=grado;i++) {
			resultado += potencia(x,grado-i)*coeficientes[i];
		}
		
		return resultado;
		//complejidad = O(grado*grado)
	}
	
	double evaluarRecursivaPar(double x) {
		double resultado = 0;
		
		for(int i=0;i<=grado;i++) {
			resultado += potenciaPar(x,grado-i)*coeficientes[i];
		}
		
		return resultado;
		//Complejidad = O(grado*log(grado)), creo, analizar
	}
	
	public double evaluarProgDinamica(double x) { //este podria ser el de mejorada tambien ojo!!!
		double resultado = 0;
		
		double[] dp = new double[grado+1];
		
		dp[0] = 1;
		
		for(int i=1;i<dp.length;i++) {
			dp[i] = x*dp[i-1];
		}
		
		for(int i=0;i<= grado;i++) {
			resultado += coeficientes[i]*dp[grado-i];
		}
		
		return resultado;
		
		//complejidad = O(grado)
		//NOTA: Capaz habria que hacerlo mas parecido al de fibonacci, eso lo veremos
	}
	
	public double evaluarMejorada(double x) { 
		double resultado = 0;
		
		double potencia = 1;

		for(int i=0;i<=grado;i++) {
			
			resultado += potencia*coeficientes[grado-i];

			potencia *= x;
		}
		
		return resultado;
		//Complejidad = O(grado)
	}
	
	public double evaluarPow(double x) {
		double resultado = 0;
		
		for(int i=0;i<=grado;i++) {
			resultado += Math.pow(x,grado-i)*coeficientes[i];
		}		
		
		return resultado;
		//aparentemente Math.pow es O(1) ya que evalua con algunos terminos de la serie
		// de taylor de Exp(x) , por lo tanto -> 
		// Complejidad = O(grado)
	}
	
	public double evaluarHorner(double x) {
		double resultado = coeficientes[0];
		
		for(int i=1;i<=grado;i++) {
			resultado = resultado*x + coeficientes[i];
		}
		
		return resultado;
		//Complejidad = O(grado) pero con O(1) en memoria, es el mas optimo
	}
	
/////////////////////////Funciones de ayuda//////////////////////////////////////////
	private double potencia(double x, int n) {
		// TODO Auto-generated method stub
		if(n == 0) {
			return 1;
		}
		
		return x*potencia(x,n-1);
		//Complejidad = O(n)
	}
	
	private double potenciaPar(double x,int n) {
		if(n == 0) {
			return 1;
		}
		
		if(n%2 == 0) {
			return potenciaPar(x*x,n/2);
		}
		
		return x*potenciaPar(x,n-1);
		//Complejidad = O(log(n))
	}
	
	
}
