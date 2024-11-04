
public class Mesa {
	//Atributo con los trozos actuales
	private int trozosTarta = 0;
	
	//Método al que llamará la clase nene para obtener un trozo de tarta
	public synchronized void cogerTrozo() {
		while (this.trozosTarta == 0)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.trozosTarta--;
		notify();
	}
	
	//Método al que llamará la clase madre para dejar los trozos de tarta
	public synchronized void dejarTrozo() {
		while (this.trozosTarta > 0)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.trozosTarta++;
		System.out.println("Mamá pone la tarta");
		notifyAll();
	}
}
