
import logica.IAgua;
import logica.Pokemon;


public class Squirt extends Pokemon implements IAgua{

    public Squirt() {
    }

    @Override
    protected void atacarPlacaje() {
           System.out.println("hola soy squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
          System.out.println("hola soy squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("hola soy squirtle y este es mi ataque placaje");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("hola soy squirtle y este es mi ataque hidro bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("hola soy squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
         System.out.println("hola soy squirtle y este es mi ataque pistola de agua");
    }
        
    
}
