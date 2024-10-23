package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class ScaryFace extends StatusMove {
    public ScaryFace() {
        super(Type.NORMAL, 0, 100);
    }

    protected String describe() {
        return "использует атаку Scary Face";
    }

    protected void applyOppEffects(Pokemon def) {
        Effect e = new Effect().stat(Stat.SPEED, -2);
        def.addEffect(e);
    }
}
