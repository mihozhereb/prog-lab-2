package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class Growth extends StatusMove {
    public Growth() {
        super(Type.NORMAL, 0, 100);
    }

    protected String describe() {
        return "использует атаку Growth";
    }

    protected void applySelfEffects(Pokemon att) {
        Effect e1 = new Effect().stat(Stat.ATTACK, 1);
        att.addEffect(e1);

        Effect e2 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        att.addEffect(e2);
    }
}
