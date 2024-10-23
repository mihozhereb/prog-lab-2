package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }

    protected String describe() {
        return "использует атаку Energy Ball";
    }

    protected void applyOppEffects(Pokemon def) {
        Effect e = new Effect().chance(.1).stat(Stat.SPECIAL_DEFENSE, -1);
        def.addEffect(e);
    }
}
