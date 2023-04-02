package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma{
    public static ArrayList<String> letras = new ArrayList<String>();
    public String interpretacion;

    public Alfabeto(String origen, String interpretacion) {
        super(origen);
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return interpretacion;
    }
    
    public static int cantidadLetras(){
        return Alfabeto.letras.size();
        
    }
    
    public String toString(){
        String alfabeto = "";
        for(String letra:letras){
            if (letras.indexOf(letra)==letras.size()-1){
                alfabeto += letra;
            }
            else{
                alfabeto += letra+", ";
            }
        }
        return alfabeto;
    }
    
    public static ArrayList<String> getLetras() {
        return letras;
    }

    public static void setLetras(ArrayList<String> letras) {
        Alfabeto.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
