
package logica;


public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }
    
    @Override
    protected void atacarPlacaje() {
           System.out.println("hola soy pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
          System.out.println("hola soy pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("hola soy pikachu y este es mi ataque placaje");
    }

    @Override
    public void atacarImpactTrueno() {
      
    }

    @Override
    public void punoTrueno() {
         System.out.println("hola soy pikachu y este es mi ataque puño trueno");
    }
}
