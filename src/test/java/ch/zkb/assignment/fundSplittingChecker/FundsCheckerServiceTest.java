package ch.zkb.assignment.fundSplittingChecker;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch.zkb.assignment.fundSplittingChecker.service.FundsCheckerService;

public class FundsCheckerServiceTest {

    FundsCheckerService fundsCheckerService;

    @BeforeEach
        public void setup() {
            fundsCheckerService = new FundsCheckerService();
    }

    @Test
    void checkValidPercentage() {
        fundsCheckerService.checkPercentage(FundsMother.getValidFunds());
    }

    @Test
    void checkInvalidPercentage_toBig() {
    Exception exception = assertThrows(RuntimeException.class, () -> {
            fundsCheckerService.checkPercentage(FundsMother.getInvalidFunds_toBig());
        });
    }

    @Test
    void checkInvalidPercentage_toSmall() {
    Exception exception = assertThrows(RuntimeException.class, () -> {
            fundsCheckerService.checkPercentage(FundsMother.getInvalidFunds_toSmall());
        });
    }

    @Test
    void checkInvalidPercentage_emptyPositionList() {
    Exception exception = assertThrows(RuntimeException.class, () -> {
            fundsCheckerService.checkPercentage(FundsMother.getInvalidFunds_emptyPostitionList());
        });
    }
}
