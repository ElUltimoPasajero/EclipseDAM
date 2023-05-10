
public class MainSerVivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerVivo x = new SerVivo ((byte) 5);
		SerVivo y = new SerVivo ((byte) 10); 
		
	    System.out.println(x.mayor(y));
		
	    
	    Humano a = new Humano ((byte)35, "Homero");
	    Humano b = new Humano ((byte)9, "Bart");

	    
	    System.out.println(a.mayor(b));
	   
	    
	    if ((a.mayor(b)).equals(a)) {
	    	
        System.out.println(b);	    	
	    	
	    	
	    }else {
	    	
	    	System.out.println(a);
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
