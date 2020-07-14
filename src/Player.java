import java.util.Random;

public class Player {
    private int lifes;
    private int numAleatorio;

    public Player(){
        setLifes(10);
        setNumAleatorio(new Random().nextInt(100)+1);

    }


    public void die(){
        if(lifes > 0){
            lifes--;
        }
        if(lifes == 0){
            System.out.println("Perdiste wey\n" +
                    "El número era el " + numAleatorio);
        }
    }

    public void winner(){
        System.out.println("Has ganau!!!");
        lifes = 0;
    }

    public void comprobacion(int x){
        if(x != numAleatorio){
            die();
            aviso(x);
        }else{
            winner();
        }
    }

    public void aviso(int x){
        if ( lifes > 0) {
            if (x > numAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("El número es mayor.");
            }
        }
    }
    //getters y setters
    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public int getNumAleatorio() {
        return numAleatorio;
    }

    public void setNumAleatorio(int numAleatorio) {
        this.numAleatorio = numAleatorio;
    }
}
