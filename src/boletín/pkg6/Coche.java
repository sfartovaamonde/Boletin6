
package boletín.pkg6;


public class Coche {
    
    private int velocidade;
    
    public Coche(){
        velocidade =0;
    }
    


public int getVelocidade(){
return velocidade; 
}

public void acelerar (int masVelocidad ){
    velocidade += masVelocidad;
}

public void frenar ( int menosVelocidad){
    velocidade -= menosVelocidad;
}

        
}