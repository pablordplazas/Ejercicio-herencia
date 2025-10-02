public class cliente extends persona {
    private String categoria;
    private String codigo;


    public cliente() {
    }

    public cliente(String nombre, String apellido, int edad, String Documento, String categoria, String codigo) {
        super(nombre, apellido, edad, Documento);
        this.categoria = categoria;
        this.codigo = codigo;
    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return super.toString() + "cliente{" +
                "categoria='" + categoria + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
    @Override
    public String mostrarinfo() {
        return "SOY UN CLIENTE nombre  "+ nombre + "apellido  "+ apellido + "edad  "+ edad + "Documento  "+ Documento +
                "categoria  "+ categoria + "codigo  " + codigo;
    }
}
