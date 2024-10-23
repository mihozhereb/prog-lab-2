package pokemons;

import attacks.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yamask extends Pokemon {
    public Yamask(){
        this("Безымянный",1);
    }

    public Yamask(String name, int level) {
        super(name, level);
        this.setStats(38, 30, 85, 55, 65, 30);
        this.setType(Type.GHOST);
        this.setMove(new EnergyBall(), new ShadowBall(), new Facade());
    }
}
