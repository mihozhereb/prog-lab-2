package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class TakeDown extends PhysicalMove {
    public TakeDown() {
        super(Type.NORMAL, 90, 85);
    }

    protected String describe() {
        return "использует атаку Take Down";
    }

    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int)Math.round(damage / 4.));
    }
}
