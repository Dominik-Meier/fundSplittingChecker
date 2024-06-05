package ch.zkb.assignment.fundSplittingChecker;

import java.util.List;

import ch.zkb.assignment.fundSplittingChecker.model.Fund;
import ch.zkb.assignment.fundSplittingChecker.model.Funds;
import ch.zkb.assignment.fundSplittingChecker.model.Position;

public class FundsMother {
    public static final Position p1 = new Position("1", 0.5d);
    public static final Position p2 = new Position("2", 0.5d);
    public static final Position p3 = new Position("3", 0.51d);
    public static final Position p4 = new Position("4", 0.49d);
    public static final Position p5 = new Position("5", 0.511d);
    public static final Position p6 = new Position("6", 0.489d);

    public static final Fund fund1 = new Fund("1", List.of(p1, p2));
    public static final Fund fund2 = new Fund("2", List.of(p1, p3));
    public static final Fund fund3 = new Fund("3", List.of(p1, p4));
    public static final Fund fund4 = new Fund("4", List.of(p1, p5));
    public static final Fund fund5 = new Fund("5", List.of(p1, p6));
    public static final Fund fund6 = new Fund("5", List.of());


    public static Funds getValidFunds() {
        Funds funds = new Funds(List.of(fund1, fund2, fund3));
        return funds;
    }

    public static Funds getInvalidFunds_toBig() {
        Funds funds = new Funds(List.of(fund4));
        return funds;
    }

    public static Funds getInvalidFunds_toSmall() {
        Funds funds = new Funds(List.of(fund5));
        return funds;
    }

        public static Funds getInvalidFunds_emptyPostitionList() {
        Funds funds = new Funds(List.of(fund6));
        return funds;
    }
}
