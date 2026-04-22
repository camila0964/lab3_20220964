import java.util.ArrayList;

public class Club {
    private String nombre;
    private int cantidadDeMiembros;
    private Presidente presidente;
    private TipoDeClub tipoDeClub;
    private ArrayList<Evento> listaEventos;

    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeMiembros() {
        return cantidadDeMiembros;
    }

    public void setCantidadDeMiembros(int cantidadDeMiembros) {
        this.cantidadDeMiembros = cantidadDeMiembros;
    }

    public Presidente getPresidente() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public TipoDeClub getTipoDeClub() {
        return tipoDeClub;
    }

    public void setTipoDeClub(TipoDeClub tipoDeClub) {
        this.tipoDeClub = tipoDeClub;
    }


}
