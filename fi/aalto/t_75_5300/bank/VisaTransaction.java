
package fi.aalto.t_75_5300.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour visaTransaction complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visaTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountInCents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="card" type="{http://aalto.fi/t-75.5300/bank}visaCard"/>
 *         &lt;element name="targetIBAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transactionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visaTransaction", propOrder = {
    "amountInCents",
    "card",
    "targetIBAN",
    "transactionMessage"
})
public class VisaTransaction {

    protected int amountInCents;
    @XmlElement(required = true)
    protected VisaCard card;
    @XmlElement(required = true)
    protected String targetIBAN;
    @XmlElement(required = true)
    protected String transactionMessage;

    /**
     * Obtient la valeur de la propriété amountInCents.
     * 
     */
    public int getAmountInCents() {
        return amountInCents;
    }

    /**
     * Définit la valeur de la propriété amountInCents.
     * 
     */
    public void setAmountInCents(int value) {
        this.amountInCents = value;
    }

    /**
     * Obtient la valeur de la propriété card.
     * 
     * @return
     *     possible object is
     *     {@link VisaCard }
     *     
     */
    public VisaCard getCard() {
        return card;
    }

    /**
     * Définit la valeur de la propriété card.
     * 
     * @param value
     *     allowed object is
     *     {@link VisaCard }
     *     
     */
    public void setCard(VisaCard value) {
        this.card = value;
    }

    /**
     * Obtient la valeur de la propriété targetIBAN.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetIBAN() {
        return targetIBAN;
    }

    /**
     * Définit la valeur de la propriété targetIBAN.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetIBAN(String value) {
        this.targetIBAN = value;
    }

    /**
     * Obtient la valeur de la propriété transactionMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionMessage() {
        return transactionMessage;
    }

    /**
     * Définit la valeur de la propriété transactionMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionMessage(String value) {
        this.transactionMessage = value;
    }

}
