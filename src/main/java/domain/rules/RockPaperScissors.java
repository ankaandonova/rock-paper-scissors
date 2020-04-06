package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {

    public Result results(boolean result) {
        if (result) {
            return Result.WIN;
        }else{
            return Result.LOSE;
        }
    }

    @Override
    public Result decide(Move mine, Move theirs) {
        if (mine.equals(theirs)){
            return Result.DRAW;
        }
        switch (mine) {
            case ROCK:
                return results(theirs.equals(Move.SCISSORS));
            case PAPER:
                return results(theirs.equals(Move.ROCK));
            case SCISSORS:
                return results(theirs.equals(Move.PAPER));
        }
        return null;
    }
}
