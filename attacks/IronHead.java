package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import static ru.ifmo.se.pokemon.Effect.flinch;

public class IronHead extends PhysicalMove {
    public IronHead() {
        super(Type.STEEL, 80, 100);
    }

    protected String describe() {
        return "использует атаку Iron Head";
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        if (Math.random() <= .3) {
            flinch(def);
        }
        def.setMod(Stat.HP, (int) Math.round(damage));
    }
}
