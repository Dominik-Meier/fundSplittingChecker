package ch.zkb.assignment.fundSplittingChecker.service;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import ch.zkb.assignment.fundSplittingChecker.model.Funds;

@Service
public class XmlReaderService {

    public Funds readFunds(String filePath) {

        try {
            JAXBContext context = JAXBContext.newInstance(Funds.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Funds) unmarshaller.unmarshal(new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
