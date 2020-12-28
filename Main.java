public class Main {

	public static void main(String[] args) {
		Gama objC=new Gama(new Alfa(1,2),3);		
		Beta objB=new Beta(1,2,3);
		int resul=objB.incrementarA();
		System.out.println(objC.toString());
		
	}
}

	/*
		Vehiculo a=new Vehiculo("Onix", 18000, "asc1234");
		Vehiculo b=new Vehiculo("Fiat",12000,"sde2323");
		System.out.println("El Vehiculo a es:"+a.toString());
		System.out.println("El Vehiculo b queda: "+b.toString());
		b.setMarca("Gol");
        System.out.println("El Vehiculo b queda:"+b.getMarca());
}
	

}*/