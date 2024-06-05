package ch.zkb.assignment.fundSplittingChecker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ch.zkb.assignment.fundSplittingChecker.service.FundsCheckerService;
import ch.zkb.assignment.fundSplittingChecker.service.XmlReaderService;

@SpringBootTest(args={".\\src\\main\\resources\\input_valid.xml"})
class FundSplittingCheckerApplicationTests {

	@Autowired
	private XmlReaderService xmlReaderService;

	@Autowired
	private FundsCheckerService fundsCheckerService;

	@Test
	void runsWithValidInput() {
	}

}
