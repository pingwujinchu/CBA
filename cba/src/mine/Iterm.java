package mine;

import weka.core.Attribute;

public class Iterm{
      private Attribute attr;
      private double value;
	public Iterm(Attribute attr, double value) {
		super();
		this.attr = attr;
		this.value = value;
	}
      
    public double getValue(){
    	return value;
    }
    
    public Attribute getAttribute(){
    	return attr;
    }

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Iterm)){
			System.out.println(obj instanceof Iterm);
			return false;
		}else{
			Iterm it = (Iterm)obj;
			if(this.attr.equals(it.attr) && this.value == it.value){
				return true;
			}else{
				return false;
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return attr.toString()+","+value;
	}
	
	
    
    
}
