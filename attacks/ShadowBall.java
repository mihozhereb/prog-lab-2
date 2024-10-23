package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    protected String describe() {
        return "использует атаку Shadow Ball";
    }

    protected void applyOppEffects(Pokemon def) {
        Effect e = new Effect().chance(.2).stat(Stat.SPECIAL_DEFENSE, -1);
        def.addEffect(e);
    }
}
