package pokemons;

import attacks.EnergyBall;
import attacks.ScaryFace;
import attacks.ShadowBall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cofagrigus extends Pokemon {
    public Cofagrigus(){
        this("Безымянный",1);
    }

    public Cofagrigus(String name, int level) {
        super(name, level);
        this.setStats(58, 50, 145, 95, 105, 30);
        this.setType(Type.GHOST);
        this.setMove(new EnergyBall(), new ShadowBall(), new ScaryFace());
    }
}
