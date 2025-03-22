import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    /*
        String dorian = "Dorian desayuna a las 9:15 AM";
        String textoinvertido = new StringBuilder(dorian).reverse().toString();
        JOptionPane.showMessageDialog(null, textoinvertido);
      */
        String texto = JOptionPane.showInputDialog("Introduce una cadena:");
        RetosCadenas libreriastring = new RetosCadenas();
        libreriastring.setCadena(texto);
        libreriastring.Calcularlength();
        libreriastring.CalcularcharAt(3);
        libreriastring.Calcularsubstring(3);
        libreriastring.Calcularsubstring(3,5);
        libreriastring.CalculartoUpperCase();
        libreriastring.CalculartolowerCase();
        libreriastring.Calculartrim();
        libreriastring.Calcularcontains("n");
        libreriastring.Calcularreplace();
        libreriastring.ImprimirInversa();
        libreriastring.ImprimirMayusculaMinuscula();
        libreriastring.contadordeletras();
        libreriastring.letrasconcomas();
        libreriastring.acronimos();



    }
}
