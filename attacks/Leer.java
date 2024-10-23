package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Leer extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 85);
    }

    protected String describe() {
        return "использует атаку Leer";
    }

    protected void applyOppEffects(Pokemon def) {
        Effect e = new Effect().stat(Stat.DEFENSE, -1);
        def.addEffect(e);
    }
}
