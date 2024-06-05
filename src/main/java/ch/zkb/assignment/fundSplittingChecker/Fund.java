package ch.zkb.assignment.fundSplittingChecker;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fund", propOrder = {
    "isin",
    "positions"
})
public class Fund {

    @XmlAttribute(name = "isin", required = true)
    private String isin;

    @XmlElement(name = "position", required = true)
    private List<Position> positions;
}
