public class Perfil {
    private String nombre ="0";
    private String primerApellido ="0";
    private String segundoApellido ="0";
    private int edad=0;
    private char lDNI=0;
    private int altura=0;
    private int telefono=0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre() {
        this.nombre=nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido() {
        this.primerApellido=primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido() {
        this.segundoApellido=segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdadgundoApellido() {
        this.edad=edad;
    }

    public int getLDNI() {
        return lDNI;
    }

    public void setlDNI() {
        this.lDNI=lDNI;
    }

    public int getAltura() {
        return altura;
    }

    public void setAlturalDNI() {
        this.altura=altura;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono() {
        this.telefono=telefono;
    }


    Perfil (String nombre, String primerApellido, String segundoApellido, int edad, char lDNI, int altura, int telefono) {
        this.nombre=nombre;
        this.primerApellido=primerApellido;
        this.segundoApellido=segundoApellido;
        this.edad=edad;
        this.lDNI=lDNI;
        this.altura=altura;
        this.telefono=telefono;
    }
}
