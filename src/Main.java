import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Club club1 = new  Club();
        Presidente presidente1 = new Presidente();
        Evento evento1 = new Evento();
        Evento evento2 = new Evento();
        TipoDeClub tipoDeClub = new TipoDeClub();
        ArrayList<Evento> listaEventos = new ArrayList();

        //Llenamos los atributos del presidente1
        presidente1.setNombre("Juan Pérez");
        presidente1.setCodigoDeEstudiante(20220964);

        tipoDeClub.setEsAcademico(true);

        //Llenamos los atributos del evento1
        evento1.setNombre("Evento 1");
        evento1.setFecha("10/04/2026");
        evento1.setCantidadDeAsistentes(20);

        //Llenamos los atributos del evento2
        evento2.setNombre("Evento 2");
        evento2.setFecha("15/05/2026");
        evento2.setCantidadDeAsistentes(40);

        //Llenamos los atributos del club1
        club1.setNombre("Club 1");
        club1.setPresidente(presidente1);
        club1.setTipoDeClub(tipoDeClub);
        club1.setCantidadDeMiembros(21);
        club1.setListaEventos(listaEventos);

        //Añadimos los eventos a la lista dinámica
        listaEventos.add(evento1);
        listaEventos.add(evento2);

        int cantEventos = listaEventos.size();

        //Imprimimos los objetos creados
        System.out.println("Presidente creado:");
        System.out.println("Nombre: "+presidente1.getNombre());
        System.out.println("Código de estudiante: "+presidente1.getCodigoDeEstudiante());
        System.out.println(" ");
        System.out.println("Club creado:");
        System.out.println("Nombre: " + club1.getNombre());
        System.out.println("Presidente: " +club1.getPresidente().getNombre());
        System.out.println("¿Es académico?: "  +club1.getTipoDeClub().isEsAcademico());
        System.out.println("Cantidad de miembros: " +club1.getCantidadDeMiembros());
        System.out.println("Cantidad de eventos añadidos a la lista: " +cantEventos);
        System.out.println(" ");
        System.out.println("Evento 1 creado:");
        System.out.println("Nombre: " + evento1.getNombre());
        System.out.println("Fecha: " + evento1.getFecha());
        System.out.println("Cantidad de asistentes: " +evento1.getCantidadDeAsistentes());
        System.out.println(" ");
        System.out.println("Evento 2 creado:");
        System.out.println("Nombre: " + evento2.getNombre());
        System.out.println("Fecha: " + evento2.getFecha());
        System.out.println("Cantidad de asistentes: " +evento2.getCantidadDeAsistentes());
    }
}