package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    protected String describe() {
        return "использует атаку Facade";
    }

    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double damage = super.calcBaseDamage(att, def);

        if (def.getCondition().equals(Status.BURN) | def.getCondition().equals(Status.PARALYZE) |
                def.getCondition().equals(Status.POISON)) {
            damage *= 2;
        }

        return damage;
    }
}
