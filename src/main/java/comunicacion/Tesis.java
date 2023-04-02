package comunicacion;
import java.util.ArrayList;

public class Tesis extends Escrito{
    public String idea;
    public static ArrayList<String> argumentos= new ArrayList<String>();
    public String conclusion;
    public String referencias;
    public String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    public String toString(){
        return getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+"\n"+getPaginas()+"\n"+getIdea()+"\n"+Tesis.argumentos.size()+"\n"+getConclusion()+"\n"+getReferencias();
    }
    
    public String interpretacion(){
        return interpretacion;
    }
    
    public int palabrasTotales(int palabrasPagina){
       return getPaginas()*palabrasPagina*5;
   }
    
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public static ArrayList<String> getArgumentos() {
        return Tesis.argumentos;
    }

    public static void setArgumentos(ArrayList<String> argumentos) {
        Tesis.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
