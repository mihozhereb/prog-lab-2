import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Bellossom("Антон", 1);
        Pokemon p2 = new Cofagrigus("Максим", 1);
        Pokemon p3 = new Gloom("Иван", 1);
        Pokemon p4 = new Oddish("Михаил", 1);
        Pokemon p5 = new Passimian("Платон", 1);
        Pokemon p6 = new Yamask("Виктор", 1);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addAlly(p5);
        b.addFoe(p6);
        b.go();
    }
}