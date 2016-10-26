
package fi.aalto.t_75_5300.bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour visaCard complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="visaCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="owner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="validYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="validMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="csv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "visaCard", propOrder = {
    "owner",
    "number",
    "validYear",
    "validMonth",
    "csv"
})
public class VisaCard {

    @XmlElement(required = true)
    protected String owner;
    @XmlElement(required = true)
    protected String number;
    protected int validYear;
    protected int validMonth;
    @XmlElement(required = true)
    protected String csv;

    /**
     * Obtient la valeur de la propriété owner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Définit la valeur de la propriété owner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Obtient la valeur de la propriété number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Définit la valeur de la propriété number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Obtient la valeur de la propriété validYear.
     * 
     */
    public int getValidYear() {
        return validYear;
    }

    /**
     * Définit la valeur de la propriété validYear.
     * 
     */
    public void setValidYear(int value) {
        this.validYear = value;
    }

    /**
     * Obtient la valeur de la propriété validMonth.
     * 
     */
    public int getValidMonth() {
        return validMonth;
    }

    /**
     * Définit la valeur de la propriété validMonth.
     * 
     */
    public void setValidMonth(int value) {
        this.validMonth = value;
    }

    /**
     * Obtient la valeur de la propriété csv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsv() {
        return csv;
    }

    /**
     * Définit la valeur de la propriété csv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsv(String value) {
        this.csv = value;
    }

}
