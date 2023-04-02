package comunicacion;

public class Fabula extends Escrito{
    public String ensenanza;
    public String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    public String toString(){
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getEnsenanza();
        
    }
    
    public String interpretacion(){
        return interpretacion;
    }
    
    public int palabrasTotales(int palabrasPagina){
       return getPaginas()*palabrasPagina*1;
   }
    
    public String getEnsenanza() {
        return ensenanza;
    }

    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
