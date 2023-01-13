public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Matias");
        persona.setEdad(35);
        persona.setTelefono(123456789);

        System.out.println("hola, mi nombre es "+'"'+persona.getNombre()+'"');
        System.out.println("mi edad es de "+'"'+persona.getEdad()+'"'+" años");
        System.out.println("y mi numero de telefono es "+'"'+persona.getTelefono()+'"');
    }
}

