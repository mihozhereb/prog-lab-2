package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class SwordsDance extends StatusMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 100);
    }

    protected String describe() {
        return "использует атаку Swords Dance";
    }

    protected void applySelfEffects(Pokemon att) {
        Effect e = new Effect().stat(Stat.ATTACK, 2);
        att.addEffect(e);
    }
}
