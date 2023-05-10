package es.miweb.www;

import java.util.Random;

public class Simulacion {

	private static final int RANGO=90;
	private static final int LIMITE_CALOR=50;
	private static final int LIMITE_FRIO=20;
	private static Random rnd = new Random();
	private int alertaFrio;
	private int alertaCalor;

	public int getAlertaFrio() {
		return alertaFrio;
	}

	public void setAlertaFrio(int alertaFrio) {
		this.alertaFrio = alertaFrio;
	}

	public int getAlertaCalor() {
		return alertaCalor;
	}

	public void setAlertaCalor(int alertaCalor) {
		this.alertaCalor = alertaCalor;
	}
	
	public static void main(String[] args) {
		Simulacion nuevaSimulacion = new Simulacion();
		int temperatura;
		
		while ((nuevaSimulacion.getAlertaFrio()<5)&&(nuevaSimulacion.getAlertaCalor()<15)){
			try{
				temperatura=rnd.nextInt(RANGO+1);
				System.out.println("\nTemperatura: "+temperatura);
				if (temperatura<LIMITE_FRIO){
					throw new DemasiadoFrio();
				}
				if (temperatura>LIMITE_CALOR){
					throw new DemasiadoCalor();
				}
			}catch (DemasiadoCalor ex){
				nuevaSimulacion.setAlertaCalor(nuevaSimulacion.getAlertaCalor()+1);
				System.out.println(ex.getMessage());
				System.out.println("AlertaCalor: "+nuevaSimulacion.getAlertaCalor());
			}catch (DemasiadoFrio ex){
				nuevaSimulacion.setAlertaFrio(nuevaSimulacion.getAlertaFrio()+1);
				System.out.println(ex.getMessage());
				System.out.println("AlertaFrio: "+nuevaSimulacion.getAlertaFrio());
			}finally{
				try{
					Thread.sleep((int)(Math.random()*2000));
				}catch (InterruptedException ex){
					System.out.println(ex.getMessage());
				}
			}	
		}
	}
}
