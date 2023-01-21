import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        //Singleton
        // Permite a criação de uma única instancia de uma classe e fornecer um modo para recuperá-la

        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        //Strategy

        ComportamentoNormal n1 = new ComportamentoNormal();
        ComportamentoAgressivo a1 = new ComportamentoAgressivo();
        ComportamentoDefensivo d1 = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(d1);
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Daniel","6213000");
    }
}