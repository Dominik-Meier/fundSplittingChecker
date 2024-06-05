package ch.zkb.assignment.fundSplittingChecker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.zkb.assignment.fundSplittingChecker.model.Funds;

@Service
public class FundsCheckerService {
    private static final double TOLERANCE = 0.01;
    private static final double HUNDRED_PERCENT = 1.0;

    Logger logger = LoggerFactory.getLogger(FundsCheckerService.class);

    public void checkPercentage(Funds funds) {
        funds.getFunds().forEach(fund -> {
            double sumPercentages = fund.getPositions().stream()
            .mapToDouble(position -> position.getPercentage())
            .sum();

            if (notMachtingTolerance(sumPercentages)) {
                throw new RuntimeException(getErrorMsg(fund.getIsin(), sumPercentages));
            }
        });

        logger.info("Percaentage check passed.");
    }

    private boolean notMachtingTolerance(double sumPercentages) {
        return sumPercentages < HUNDRED_PERCENT - TOLERANCE || sumPercentages > HUNDRED_PERCENT + TOLERANCE;
    }

    private String getErrorMsg(String isin, double sumPercentages) {
        return String.format(
            "Fund with isin: %s does not sum up to 100%%. " +
            "This includes a tolerance of %f. The sum of all positions is %f.",
            isin, TOLERANCE, sumPercentages
        );
    }
}
