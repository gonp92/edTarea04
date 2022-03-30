package cuentas;
/**
 * @author Gonzalo Paniagua
 *
 */
public class CCuenta {
/**
 * atributos de la clase CCuenta
 * 
 */
	    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
/**
 * constructor por defecto
 */
    public CCuenta()
    {
    }
   

    
    /**
     * @param nom nombre
     * @param cue numero de cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    
    /**
     * @return devuelve el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa lanza la excepcion
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    
    /**
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o no hay suficiente sadlo lanza la excepcion
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo()  - cantidad);
    }
    

	/**
	 * @return getter del atributo nombre que devuelve el nombre
	 */
	private String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre setter del atributo nombre que permite establecer el nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return getter del atributo cuenta que devuelve la cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * @param cuenta setter del atributo cuenta que permite establecer la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	/**
	 * @return getter del atributo saldo que devuelve el saldo
	 */
	private double getSaldo() {
		return saldo;
	}
	
	/**
	 * @param saldo setter del atributo saldo que permite establecer el saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	/**
	 * @return getter del atributo tipoInteres que devuelve el tipoInteres
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}
	
	/**
	 * @param tipoInteres setter del atributo tipoInteres que permite establecer el tipoInteres
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
