public class Cuenta {
	private double saldo;
	private int pin;

	public Cuenta(double saldo, int pin){
		this.saldo = saldo;
		this.pin = pin;
	}

	public boolean retirarDinero(double cantidad, int pin){
		boolean retiroCorrecto = false;
		if(pin == this.pin){
			if(cantidad <= this.saldo){
				retiroCorrecto = true;
				this.saldo -= cantidad;
			}
			else{
				System.out.println("No tiene suficiente saldo");
			}
		}
		else{
			System.out.println("El pin es invalido");
		}
		return retiroCorrecto;
	}

	public double getSaldo(){
		return saldo;
	}
}