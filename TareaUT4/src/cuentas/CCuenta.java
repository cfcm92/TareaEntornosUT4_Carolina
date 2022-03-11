/**
 * @autor Carolina Fernández
 * version 1.0
 * since 11/03/2022
 * 
 */
package cuentas;
/**
 * Clase para la creación de una cuenta bancaria. Incluye los métodos ingresar, 
 * retirar y estado, además de los getter y setter.
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros de la clase CCuenta
     * @param nom nombre del titular de la cuenta
     * @param cue número de cuenta bancaria
     * @param sal saldo con el que se inicializa la cuenta
     * @param tipo tipo de interés que va a generar la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Método para obtener el saldo de la cuenta
     * @return saldo de la cuenta
     */

    public double estado()
    {
        return getSaldo();
    }
/**
 * Método para ingresar dinero a una cuenta bancaria
 * @param cantidad la cantidad que quieres ingresar
 * @throws Exception cuando ingresa una cantidad negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Método para retirar dinero de una cuenta bancaria
 * @param cantidad cantidad que quieres retirar
 * @throws Exception Cuando no hay suficiente saldo o si has ingresado una cantidad negativa
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtienes el saldo de la cuenta
     * @return saldo
     */
	protected double getSaldo() {
		return saldo;
	}

	/**
	 * Establecer el saldo de la cuenta
	 * @param saldo saldo que tiene la cuenta
	 */
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Te dice el número de cuenta
	 * @return número de cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/** 
	 * Establecer el número de cuenta
	 * @param cuenta número de cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Obtener el nombre del titular de la cuenta
	 * @return nombre del titular de la cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Establecer el nombre del titular de la cuenta
	 * @param nombre nombre del titular de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve qué tipo de interés va a tener la cuenta establecido en número
	 * @return tipo de inteŕes de tipo double
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Establecer tipo de interés de la cuenta (en número)
	 * @param tipoInterés tipo de interés de la cuenta de tipo double
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
