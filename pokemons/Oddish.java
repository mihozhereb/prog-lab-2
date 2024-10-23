package pokemons;

import attacks.Facade;
import attacks.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Oddish extends Pokemon {
    public Oddish(){
        this("Безымянный",1);
    }

    public Oddish(String name, int level) {
        super(name, level);
        this.setStats(45, 50, 55, 75, 65, 30);
        this.setType(Type.GRASS, Type.POISON);
        this.setMove(new SwordsDance(), new Facade());
    }
}
