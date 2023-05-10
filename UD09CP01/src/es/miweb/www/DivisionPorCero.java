package es.miweb.www;

public class DivisionPorCero {

	public void division(int num1, int num2){
		try{
			if (num2==0){
				throw new ExcepcionDeDivisionPorCero();
			}
			System.out.println("Resultado: "+(num1/num2));
		}catch (ExcepcionDeDivisionPorCero ex){
			System.out.println("Trata excepcion de "+ex.getMessage()+"/ por 0");
		}finally{
			System.out.println("Finally hecho");
		}
		System.out.println("Volviendo de division");
	}

}
