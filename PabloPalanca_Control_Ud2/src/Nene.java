
public class Nene extends Thread{
	//Atributos con el nombre y la creación de la mesa
	private String nombre;
	private Mesa mesa;
	
	//Constructor de la clase
	public Nene(String nombre, Mesa mesa) {
		this.nombre = nombre;
		this.mesa = mesa;
	}
	
	//Método run sonbreescrito para que cada nene obtenga su trozo de tarta
	@Override
    public void run() {
        try {
            System.out.println(this.nombre + " llega a la fiesta");
            Thread.sleep(500);
            mesa.cogerTrozo();
            System.out.println(this.nombre + " se marcha del cumpleaños");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
