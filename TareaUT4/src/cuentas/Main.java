package cuentas;
/**
 * Método para probar la clase CCuenta
 * 
 */
public class Main {
/**
 * Iniciamos una cuenta y operamos con ella
 * @param args 
 */
    public static void main(String[] args) {
        
    	CCuenta cuenta1;
        double saldoActual = 0;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1, saldoActual);
    }

    /**
     * Método con las operaciones relativas a una instancia de CCuenta
     * @param cuenta1 objeto de tipo CCuenta
     * @param cantidad el saldo con el que se va a iniciar la cuenta
     */
	private static void operativa_cuenta(CCuenta cuenta1, double cantidad) {

		cuenta1.setSaldo(cantidad);
        System.out.println("El saldo actual es"+ cuenta1.getSaldo() );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
