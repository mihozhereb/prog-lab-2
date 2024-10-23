package pokemons;

import attacks.Facade;
import attacks.Growth;
import attacks.QuiverDance;
import attacks.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellossom extends Pokemon {
    public Bellossom(){
        this("Безымянный",1);
    }

    public Bellossom(String name, int level) {
        super(name, level);
        this.setStats(75, 80, 95, 90, 100, 50);
        this.setType(Type.GRASS);
        this.setMove(new SwordsDance(), new Facade(), new Growth(), new QuiverDance());
    }
}
