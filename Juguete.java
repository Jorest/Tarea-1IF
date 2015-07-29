/// class Juguete - 
class Juguete {
  // Attributes
	private float valorUnitario;
	private float valorAdicional;
	private int codigo;
	private int edadRecomendada;
	private int numeroProveedor;
	private int cantidad;

	  // Operations

	public float getValorAdicional(){
		return valorAdicional;  
	  }
	  
	public void setValorAdicional(float f){
		valorAdicional = f;
	  }
	  
	public float getValorUnitario(){
		return valorUnitario;
	  }
	  
	public void setValorUnitario(float f){
		valorUnitario=f;
	  }
	  
	public int getEdadRecomendada(){
		return edadRecomendada;
	  }
	  
	public void setEdadRecomendada(int i){
		edadRecomendada= i;
	  }
	  
	public int getCodigo(){
		return codigo;
	  }
	  
	public void setCodigo(int i){
		codigo= i;
	  }
	  
	public void setNumeroProveedor(int i){
		numeroProveedor=i;
	  }
	  
	public int getNumeroProveedor(){
		return numeroProveedor;
	  }
	  
	public int getCantidad(){
		return cantidad;
	  }
	  
	public void setCantidad(int i){
	 cantidad=i;
  }
};

