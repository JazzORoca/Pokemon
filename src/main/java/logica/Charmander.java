
package logica;


public class Charmander  extends Pokemon implements IFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("hola soy charmander y este es mi ataque placaje");
    }
       

    @Override
    protected void atacarAraniazo() {
         System.out.println("hola soy charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
           System.out.println("hola soy charmander y este es mi ataque mordisco");
    }

    @Override
    public void atacarPunoFuego() {
    System.out.println("hola soy charmander y este es mi ataque puño de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("hola soy charmander y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("hola soy charmander y este es mi ataque atacar ascuas");
    }
    
}
