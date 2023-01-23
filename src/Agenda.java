import java.util.InputMismatchException;

public class Agenda {
    public Perfil [] contactos = new Perfil[5];

    Agenda () {
    }

    public void anadirContacto(Perfil nuevoPerfil, int posicion) {
        try {
            if (contactos[posicion]==null) {
                contactos[posicion]=nuevoPerfil;

            } else {
                System.out.println("\n"+"Ya existe un perfil en esta ubicación"+"\n");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("\n"+"No existe ese número de contacto, debe consultar un contacto del 0 al 4"+"\n");
        }

    }

    public void verAgenda() {
        for (int i=0 ; i < contactos.length; i++){
            if (contactos[i]==null) {
                System.out.println("Vacío");
            } else {
                System.out.println("Perfil "+i+" "+contactos[i].getNombre()+" "+contactos[i].getPrimerApellido()+" "+contactos[i].getSegundoApellido());
            }

        }
    }
    public void verPerfil(int posicion) {
        try {
            System.out.println("\n"+"Nombre completo: "+contactos[posicion].getNombre()+" "+contactos[posicion].getPrimerApellido()+" "+contactos[posicion].getSegundoApellido()+"\n"+"Edad: "+contactos[posicion].getEdad()+"\n"+"Letra del DNI: "+contactos[posicion].getLDNI()+"\n"+"Altura(cm): "+contactos[posicion].getAltura()+"\n"+"Número de teléfono: "+contactos[posicion].getTelefono());
        } catch (NullPointerException ex) {
            System.out.println("\n"+"Vacío");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No existe ese número de contacto, debe consultar un contacto del 0 al 4"+"\n");
        }

    }
}