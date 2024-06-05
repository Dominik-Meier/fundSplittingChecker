package ch.zkb.assignment.fundSplittingChecker.model;

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
@XmlType(name = "position", propOrder = {
    "id",
    "percentage"
})
public class Position {

    @XmlAttribute(name = "id", required = true)
    private String id;

    @XmlElement(name = "percentage", required = true)
    private double percentage;
}
