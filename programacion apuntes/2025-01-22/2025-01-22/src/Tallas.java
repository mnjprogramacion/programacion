public enum Tallas {
    P(1, "Pequeña"),
    M(2, "Mediana"),
    G(3, "Grande"),
    SG(4, "Supergrande");

    //----------------------------------------------
    //       Declaración de campos
    //----------------------------------------------

    private int iValor;
    private String nombre;

    //----------------------------------------------
    //       Declaración de constructores
    //----------------------------------------------

    private Tallas(int iValor, String cadena) {
        this.iValor = iValor;
        this.nombre = cadena;
    }

    //----------------------------------------------
    //       Declaración de métodos
    //----------------------------------------------

    public int obtenerValor() { return this.iValor; }

    public String obtenerCadena() { return this.nombre; };
}
