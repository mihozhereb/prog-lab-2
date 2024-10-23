package pokemons;

import attacks.Facade;
import attacks.Growth;
import attacks.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Gloom extends Pokemon {
    public Gloom(){
        this("Безымянный",1);
    }

    public Gloom(String name, int level) {
        super(name, level);
        this.setStats(60, 65, 70, 85, 75, 40);
        this.setType(Type.GRASS, Type.POISON);
        this.setMove(new SwordsDance(), new Facade(), new Growth());
    }
}
