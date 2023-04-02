package comunicacion;

public class Alfabeto extends Pictograma{
    public String[] letras;
    public String interpretacion;

    public Alfabeto(String origen, String[] letras,String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String interpretacion(){
        return interpretacion;
    }
    
    public int cantidadLetras(){
        return letras.length;
        
    }
    
    public String toString(){
        String alfabeto = "";
        for(int i=0; i<letras.length; i++){
            if (i==letras.length-1){
                alfabeto += letras[i];
            }
            else{
                alfabeto += letras[i]+", ";
            }
        }
        return alfabeto;
    }
    
    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    
}
