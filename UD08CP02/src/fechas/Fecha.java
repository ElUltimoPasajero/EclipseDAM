package fechas;

public class Fecha implements Comparable<Object>{

	private int dia;
	private int mes;
	private int anho;
	
	public Fecha(int dia,int mes,int anho){
		if (fechaCorrecta(dia,mes,anho)){
			this.dia=dia;
			this.mes=mes;
			this.anho=anho;
		}else{
			throw new RuntimeException("Datos no válidos para la fecha:"+dia+"/"+mes+"/"+anho);
		}
	}
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnho() {
		return anho;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	public boolean esBisiesto(int anho){
		boolean bisiesto=false;
		if (anho>1582){
			if(((anho%400)==0)||(((anho%4)==0)&&!((anho%100)==0))){
				bisiesto=true;
			}
		}else{
			bisiesto=false;
		}
		return bisiesto;
	}
	
	public int numeroDeDias(int m, int a){
		switch (m){
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12: return 31;
					case 4:
					case 6:
					case 9:
					case 11: return 30;
					default: if (esBisiesto(a)){
								return 29;
							}else{
								return 28;
							}
					}
	}
	
	public int numeroDeDias(int a){
		if (esBisiesto(a)){
			return 366;
		}else{
			return 365;
		}
		
	}
			
	public boolean fechaCorrecta(int dia,int mes,int anho){
		boolean esCorrecta=false;	
		if ((anho>1582)||((anho==1582)&&(mes>10))||
				((anho==1582)&&(mes==10)&&(dia>=15))&&
				((mes>0)&&(mes<=12))&&
				(dia<=(numeroDeDias(mes,anho)))){
			esCorrecta=true;
		}else{
			esCorrecta=false;
		}
		return esCorrecta;
	}
	
	public int diasTranscurridosDelAnho(){
		int numDias=0;
		for (int i=1;i<this.getMes();i++){
			numDias+=numeroDeDias(i,this.getAnho());
		}
		numDias+=this.getDia();
		return numDias;
	}
	
	public int diasTranscurridosDelAnho(Fecha fecha){
		int numDias=0;
		for (int i=1;i<fecha.getMes();i++){
			numDias+=numeroDeDias(i,fecha.getAnho());
		}
		numDias+=fecha.getDia();
		return numDias;
	}
	
	public int diasRestantesDelAnho(){
		int numDias=0;
		for (int i=12;i>this.getMes();i--){
			numDias+=numeroDeDias(i,this.getAnho());
		}
		numDias+=numeroDeDias(this.getMes(),this.getAnho())-this.getDia();
		return numDias;
	}
	
	public int diasRestantesDelAnho(Fecha f){
		int numDias=0;
		for (int i=12;i>f.getMes();i--){
			numDias+=numeroDeDias(i,f.getAnho());
		}
		numDias+=numeroDeDias(f.getMes(),f.getAnho())-f.getDia();
		return numDias;
	}
	
	public int diferenciaDeDiasCon(Fecha f){
		int numDias=0;
		if (fechaCorrecta(f.getDia(),f.getMes(),f.getAnho())){
			if (f.getAnho()<this.getAnho()){
				numDias=diasRestantesDelAnho(f);
				for (int i=f.getAnho()+1;i<this.getAnho();i++){
					numDias+=numeroDeDias(i);
				}
				numDias+=diasTranscurridosDelAnho();
				numDias= -numDias;
			}else if (this.getAnho()<f.getAnho()){
					for (int i=this.getAnho()+1;i<f.getAnho();i++){
						numDias+=numeroDeDias(i);
					}
					numDias+=this.diasRestantesDelAnho();
					numDias+=f.diasTranscurridosDelAnho();
			}else if (this.getAnho()==f.getAnho()){
				if (this.getMes()>f.getMes()){
					for (int i=f.getMes();i<this.getMes();i++){
						numDias+=numeroDeDias(i,this.getAnho()); 
					}
					numDias+=this.getDia();
					numDias-=f.getDia();
					numDias=-numDias;
				}else if (this.getMes()<f.getMes()){
					for (int i=this.getMes();i<f.getMes();i++){
						numDias+=numeroDeDias(i,this.getAnho());
					}
					numDias+=f.getDia()-this.getDia();
				}else if (this.getMes()==f.getMes()){
					numDias=f.getDia()-this.getDia();
				}
			}
		}else{
			throw new RuntimeException("Datos no válidos para la fecha:"+dia+"/"+mes+"/"+anho);
		}
		return numDias;
	}
	
	public void controlaMes(){
		if (this.getMes()<1){
			this.setMes(12);
			this.setAnho(this.getAnho()-1);
		}else if (this.getMes()>12){
			this.setMes(1);
			this.setAnho(this.getAnho()+1);
		}
		
		if (!fechaCorrecta(this.getDia(),this.getMes(),this.getAnho())){
			throw new RuntimeException("Datos no válidos");
		}
	}
	
	public void trasladar(int ndias){
		int diasMes;
		if (ndias>0){
			diasMes=numeroDeDias(this.getMes(),this.getAnho());
		}else{
			diasMes=numeroDeDias(this.getMes()-1,this.getAnho());
		}
		while (Math.abs(ndias)>diasMes){
			if (ndias>0){
				this.setMes(this.getMes()+1);
				this.controlaMes();
				ndias-=diasMes;
				diasMes=numeroDeDias(this.getMes(),this.getAnho());
			}else{
				if ((this.getMes()==1)){ 
					diasMes=31;
				}else{
					diasMes=numeroDeDias(this.getMes()-1,this.getAnho());
				}
				this.setMes(this.getMes()-1);
				this.controlaMes();
				ndias+=diasMes;
			}		
		}
		if (ndias>0){
			this.setDia(this.getDia()+ndias);
		}else{
			this.setMes(this.getMes()-1);
			ndias+=numeroDeDias(this.getMes(),this.getAnho());
			this.setDia(this.getDia()+ndias);
		}
		if ((this.getDia()>0)&&(this.getDia()>numeroDeDias(this.getMes(),this.getAnho()))){
			this.setDia(this.getDia()-numeroDeDias(this.getMes(),this.getAnho()));
			this.setMes(this.getMes()+1);
			this.controlaMes();
		}
	}
	
	public void diaSiguiente(){
		this.trasladar(1);
	}
	
	public void diaAnterior(){
		this.trasladar(-1);
	}
	
	@Override
	public int compareTo(Object obj){
		int i=this.diferenciaDeDiasCon((Fecha)obj);
		if (obj instanceof Fecha){
			if (i>0){
				return 1;
			}else if (i<0){
				return -1;
			}else{
				return 0;
			}
		}else{
			throw new RuntimeException("Fecha no válida");
		}
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Fecha){
			if (this.compareTo((Fecha)obj)==0){
				return true;
			}else{
				return false;
			}
		}else{
			throw new RuntimeException("Fecha no válida");
		}
	}
	
	@Override
	public Fecha clone(){
		return new Fecha(this.getDia(),this.getMes(),this.getAnho());
	}
	
	@Override
	public int hashCode(){
		return this.toString().hashCode();
	}
	
	@Override
	public String toString(){
		return ((this.getDia()<10)?"0"+this.getDia():this.getDia())+"/"+
				((this.getMes()<10)?"0"+this.getMes():this.getMes())+"/"+this.getAnho();
	}

}
