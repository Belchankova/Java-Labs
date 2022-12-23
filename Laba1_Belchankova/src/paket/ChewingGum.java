package paket;

public  class  ChewingGum extends Food {
	
    private String flavour;

    public ChewingGum (String flavour) {
     
        super("Жевачка");
   
        this.flavour=flavour;
    }
    public void consume()
    {
        System.out.println(this + " разжевана");

    }
    
    public String getFlavour() {
    	 return flavour;
    	}

    	public void  getFlavour(String flavour) {
    	 this.flavour = flavour;
    	}



    	public String toString() {
    	 return super.toString() + " размера '" + flavour.toUpperCase() + "'";
    	}

}