
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import org.w3c.dom.Element;


/**
 * 
 * 						Selling details pertaining to the respective item.
 * 					
 * 
 * <p>Classe Java pour SellingStatus complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SellingStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPrice" type="{http://www.ebay.com/marketplace/search/v1/services}Amount" minOccurs="0"/>
 *         &lt;element name="convertedCurrentPrice" type="{http://www.ebay.com/marketplace/search/v1/services}Amount" minOccurs="0"/>
 *         &lt;element name="bidCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sellingState" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="timeLeft" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="delimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellingStatus", propOrder = {
    "currentPrice",
    "convertedCurrentPrice",
    "bidCount",
    "sellingState",
    "timeLeft",
    "delimiter",
    "any"
})
public class SellingStatus {

    protected Amount currentPrice;
    protected Amount convertedCurrentPrice;
    protected Integer bidCount;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sellingState;
    protected Duration timeLeft;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtient la valeur de la propriété currentPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getCurrentPrice() {
        return currentPrice;
    }

    /**
     * Définit la valeur de la propriété currentPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setCurrentPrice(Amount value) {
        this.currentPrice = value;
    }

    /**
     * Obtient la valeur de la propriété convertedCurrentPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }

    /**
     * Définit la valeur de la propriété convertedCurrentPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setConvertedCurrentPrice(Amount value) {
        this.convertedCurrentPrice = value;
    }

    /**
     * Obtient la valeur de la propriété bidCount.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBidCount() {
        return bidCount;
    }

    /**
     * Définit la valeur de la propriété bidCount.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBidCount(Integer value) {
        this.bidCount = value;
    }

    /**
     * Obtient la valeur de la propriété sellingState.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingState() {
        return sellingState;
    }

    /**
     * Définit la valeur de la propriété sellingState.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingState(String value) {
        this.sellingState = value;
    }

    /**
     * Obtient la valeur de la propriété timeLeft.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeLeft() {
        return timeLeft;
    }

    /**
     * Définit la valeur de la propriété timeLeft.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeLeft(Duration value) {
        this.timeLeft = value;
    }

    /**
     * Obtient la valeur de la propriété delimiter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Définit la valeur de la propriété delimiter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimiter(String value) {
        this.delimiter = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
