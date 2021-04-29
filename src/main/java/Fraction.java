
public class Fraction {
	
		
		private int numerador, denominador;

		public Fraction(int numerador, int denominador) {
			this.numerador = numerador;
			this.denominador = denominador;
		}

		public int getNumerador() {
			return numerador;
		}

		public void setNumerador(int numerador) {
			this.numerador = numerador;
		}

		public int getDenominador() {
			return denominador;
		}

		public void setDenominador(int denominador) {
			this.denominador = denominador;
		}
		
		public int getSumaNumeros(){
			
			return this.numerador+this.denominador;
		}
		
		public int getRestaNumeros() {
			
			return this.numerador-this.denominador;
		}
		
		public int getInversoNumeros() {
			
			return this.denominador/this.numerador;
		}
	}

