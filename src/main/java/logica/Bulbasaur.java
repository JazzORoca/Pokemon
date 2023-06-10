
package logica;


public class Bulbasaur extends Pokemon implements IPlanta{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur  y este es mi ataque placaje");
    }

    public Bulbasaur() {
    }
        

    @Override
    protected void atacarAraniazo() {
       System.out.println("Hola soy Bulbasaur  y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
       System.out.println("Hola soy Bulbasaur  y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur  y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
      System.out.println("Hola soy Bulbasaur  y este es mi ataque paralizar");
    }
    
}
