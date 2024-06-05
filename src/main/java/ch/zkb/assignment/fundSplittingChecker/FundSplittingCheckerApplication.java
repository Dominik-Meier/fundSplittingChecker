package ch.zkb.assignment.fundSplittingChecker;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.zkb.assignment.fundSplittingChecker.model.Funds;
import ch.zkb.assignment.fundSplittingChecker.service.FundsCheckerService;
import ch.zkb.assignment.fundSplittingChecker.service.XmlReaderService;

@SpringBootApplication
public class FundSplittingCheckerApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(FundSplittingCheckerApplication.class);

	@Autowired
    private XmlReaderService xmlReaderService;

	@Autowired
	private FundsCheckerService fundsCheckerService;

	public static void main(String[] args) {
		SpringApplication.run(FundSplittingCheckerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String filePath;
        if (args.length > 0) {
            filePath = args[0];
    	} else {
			throw new RuntimeException("Please provide the path to the XML file as an argument.");
		}

		Funds funds = xmlReaderService.readFunds(filePath);
		try {
			fundsCheckerService.checkPercentage(funds);
		} catch (RuntimeException e) {
			logger.error("Performing checks has failed with error message: " + e.getMessage());
		}
	}
}
