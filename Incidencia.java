public class Incidencia {
    // definimos los atributos de la clase
    private int codigo;
    private static int codigoComun=1;
    private String estado;
    private int numeroPuesto;
    private String infoResuelto;
    private String infoProblema;

    // hacemos el constructor
    public Incidencia(int numeroPuesto, String infoProblema){
        this.codigo=codigoComun;
        codigoComun++;
        this.estado="Pendiente";
        this.numeroPuesto=numeroPuesto;
        this.infoResuelto="";
        this.infoProblema=infoProblema;
    
    }

    public void resolverIncidencia(String info){
        this.estado="Resuelto";
        this.infoResuelto=info;

    }

    // Getters y setters
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroPuesto() {
        return this.numeroPuesto;
    }

    public void setNumeroPuesto(int numeroPuesto) {
        this.numeroPuesto = numeroPuesto;
    }

    public String getInfoResuelto() {
        return this.infoResuelto;
    }

    public void setInfoResuelto(String infoResuelto) {
        this.infoResuelto = infoResuelto;
    }

    // toString
    @Override
    public String toString() {
        return "Incidencia= " + this.codigo + " - " +
            "Puesto:" + this.numeroPuesto + " - " +this.infoProblema+" - "+ this.estado + " - " +
             this.infoResuelto + "'" ;
    }



}
