package pokemons;

import attacks.AerialAce;
import attacks.IronHead;
import attacks.Leer;
import attacks.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Passimian extends Pokemon {
    public Passimian(){
        this("Безымянный",1);
    }

    public Passimian(String name, int level) {
        super(name, level);
        this.setStats(100, 120, 90, 40, 60, 80);
        this.setType(Type.FIGHTING);
        this.setMove(new AerialAce(), new TakeDown(), new IronHead(), new Leer());
    }
}
