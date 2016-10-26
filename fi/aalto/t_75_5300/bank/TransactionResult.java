
package fi.aalto.t_75_5300.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour transactionResult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="transactionResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archiveNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionResult", propOrder = {
    "archiveNumber"
})
public class TransactionResult {

    @XmlElement(required = true)
    protected String archiveNumber;

    /**
     * Obtient la valeur de la propriété archiveNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiveNumber() {
        return archiveNumber;
    }

    /**
     * Définit la valeur de la propriété archiveNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiveNumber(String value) {
        this.archiveNumber = value;
    }

}
