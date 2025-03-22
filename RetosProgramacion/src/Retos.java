public class Retos {
    //String a nivel clase
    private String Cadena;


    // Getter para Cadena
    public String getCadena() {
        return Cadena;
    }

    // Setter para Cadena
    public void setCadena(String texto) {
        this.Cadena = texto;
    }
    public void Calcularlength(){
        System.out.println("El tamaño de la cadena es: " + getCadena().length());
    }
    public void CalcularcharAt(int index){
        System.out.println("En la posicion del index se encuentra el siguiente caracter: " + getCadena().charAt(index));
    }
    public void Calcularsubstring(int beginIndex){
        System.out.println("En la la subcadena es: " + getCadena().substring(beginIndex));
    }
    public void Calcularsubstring(int beginIndex, int endIndex){
        System.out.println("En la la subcadena es: " + getCadena().substring(beginIndex, endIndex));
    }
    public void CalculartoUpperCase(){
        System.out.println("En mayusculas es: " + getCadena().toUpperCase());
    }
    public void CalculartolowerCase(){
        System.out.println("En menisculas es: " + getCadena().toLowerCase());
    }
    public void Calculartrim(){
        System.out.println("El trim es: " + getCadena().trim().length());
    }
    public void Calcularcontains(CharSequence s){
        System.out.println("La cadena contiene el caracter: " + getCadena().contains(s));
    }
    public void Calcularreplace(){
        System.out.println("La nueva cadena es: " + getCadena().replace("a","4"));
    }
    public void ImprimirInversa(){
        StringBuilder inversa = new StringBuilder();
        int cadenaLongitud = getCadena().length();
        for (int i = cadenaLongitud -1 ; i >= 0; i--){
            inversa.append(getCadena().charAt(i));
        }
        System.out.println("La nueva cadena es: " + inversa);
    }

    public void ImprimirMayusculaMinuscula(){
        StringBuilder mm = new StringBuilder();
        int cadenaLongitud = getCadena().length();
        for (int i = 0 ; i <= cadenaLongitud -1; i++){
            //mm.append(getCadena().charAt(i));

            if (i % 2 == 0 ){
                mm.append(String.valueOf(getCadena().charAt(i)).toUpperCase());
            } else {
                mm.append(String.valueOf(getCadena().charAt(i)));
            }


        }
        System.out.println(mm);
        //System.out.println("La nueva cadena es: " + inversa);
    }
    public void contadordeletras() {
        String cadena = getCadena();
        int contadorA = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                contadorA++;
            }
        }

        System.out.println("La cantidad de 'a' es: " + contadorA);
    }
    public void letrasconcomas(){
        StringBuilder lcc = new StringBuilder();
        int cadenaLongitud = getCadena().length();
        for (int i = 0 ; i <= cadenaLongitud -1; i++){
            lcc.append(getCadena().charAt(i)+ ",");
        }
        System.out.println(lcc);
    }
    public void acronimos(){
        String cadena = getCadena();
        StringBuilder acr = new StringBuilder();
        for (int i = 0 ; i <= cadena.length() -1; i++){
            char caracter = cadena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                acr.append(caracter);
            }
        }
        System.out.println(acr);

    }

}
