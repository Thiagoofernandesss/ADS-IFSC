
public class Quadrado {
    public float lado;
    public float area;

    public void setLado(float lado) {
        this.lado = lado;
    }
  
    public float calculaArea(){
        area= lado*lado;
        return area;
    }
    
    public String mostraresultado(){
        return "A área do quadrado é "+ area;
    }
    
}
