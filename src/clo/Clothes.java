package clo;

public abstract class Clothes{
	private String material;
	private String typ;

	public Clothes(String m, String t){
        this.material=m;
        this.typ=t;
    }

	public String getMaterial(){
		return material;
	}
	public void setMaterial(String m){
		this.material = m;
	}
	public String getTyp(){
		return typ;
	}
	public void setTyp(String t){
		this.typ = t;
	}

    @Override
    public String toString(){
      System.out.println("Information about clothes: ");
      return getMaterial() + " " + getTyp() + '\n';
    }

   @Override
    public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
        return false;
    }

    Clothes cl = (Clothes) obj;
    return (material == cl.material || (material != null && material.equals(cl.getMaterial()))) && (typ == cl.typ|| (typ != null && typ.equals(cl.getTyp())));
    }

    @Override
    public int hashCode(){
    final int p = 31;
    int result = 1;
    result = p * result + ((material == null) ? 0 : material.hashCode());             
    result = p * result + ((typ == null) ? 0 : typ.hashCode()); 
    return result;
    }

    public  void temp(){
     System.out.println("Clothes became warmer.");
    }

    public void change(){
     System.out.println("Clothes are wrinkled.");
    }


    public abstract void fall();
    public abstract void cut();
    

}