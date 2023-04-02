package comunicacion;

public class Fabula extends Escrito{
    public String enseñanza;
    public String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }

    public String toString(){
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getEnseñanza();
        
    }
    
    public String interpretacion(){
        return interpretacion;
    }
    
    public int palabrasTotales(int palabrasPagina){
       return getPaginas()*palabrasPagina*1;
   }
    
    public String getEnseñanza() {
        return enseñanza;
    }

    public void setEnseñanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
