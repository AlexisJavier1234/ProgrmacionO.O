/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta;

/**
 *
 * @author Usuario
 */
public class Cuenta {
//atributo

    private long NumeroCuenta;
    private long DNI;
    private double SaldoActual;
    private double InteresAnual;

    //Metodos constructores
    public Cuenta(long NumeroCuenta, long DNI, double SaldoActual, double InteresAnual) {
        this.NumeroCuenta = NumeroCuenta;
        this.DNI = DNI;
        this.SaldoActual = SaldoActual;
        this.InteresAnual = InteresAnual;
    }

    public Cuenta() {

    }
    //getters setters

    public long getNumeroCuenta() {
        return NumeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return SaldoActual;
    }

    public void setSaldoActual(double SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public double getInteresAnual() {
        return InteresAnual;
    }

    public void setInteresAnual(double InteresAnual) {
        this.InteresAnual = InteresAnual;
    }
    //metodos

    public void ActualizarSaldo() {
        this.SaldoActual = SaldoActual - (InteresAnual / 365);
    }

    public void IngresarSaldo(double saldo) {
        this.SaldoActual += saldo;

    }
//retirar

    public void Retirar(double Cantidad) {
        this.SaldoActual -= Cantidad;
    }

//mostrar
    public String MostrarDatos(Cuenta cliente) {
        String datos = "N.Cuenta: " + cliente.NumeroCuenta + "/n";
        datos += "DNI: " + cliente.DNI + "/n";
        datos += "Interes Anual: " + cliente.InteresAnual + "/n";
        datos += "Saldo Actual: " + cliente.SaldoActual + "/n";
        return datos;
    }
}
