
public class Madre extends Thread{
	//Atributo con la creación de la mesa
	private Mesa mesa;
	
	//Constructor de la clase
	public Madre(Mesa mesa) {
		this.mesa = mesa;
	}
	
	//Método run sobreescrito para que la mama vaya colocando trozos
	@Override
    public void run() {
        try {
            System.out.println("Mami llega al cumpleaños");
            Thread.sleep(1000);
            for (int i = 0; i >= 6; i++) {
            	mesa.dejarTrozo();
            	System.out.println("Mamá pone la tarta");
            }
            System.out.println("Mamá se va de la fiesta");
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }	
}
