
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
import org.w3c.dom.Element;


/**
 * 
 * 						Container holding the item's shipping details.
 * 					
 * 
 * <p>Classe Java pour ShippingInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ShippingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shippingServiceCost" type="{http://www.ebay.com/marketplace/search/v1/services}Amount" minOccurs="0"/>
 *         &lt;element name="shippingType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="shipToLocations" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expeditedShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="oneDayShippingAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="handlingTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intermediatedShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ShippingInfo", propOrder = {
    "shippingServiceCost",
    "shippingType",
    "shipToLocations",
    "expeditedShipping",
    "oneDayShippingAvailable",
    "handlingTime",
    "intermediatedShipping",
    "delimiter",
    "any"
})
public class ShippingInfo {

    protected Amount shippingServiceCost;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingType;
    protected List<String> shipToLocations;
    protected Boolean expeditedShipping;
    protected Boolean oneDayShippingAvailable;
    protected Integer handlingTime;
    protected Boolean intermediatedShipping;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtient la valeur de la propriété shippingServiceCost.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getShippingServiceCost() {
        return shippingServiceCost;
    }

    /**
     * Définit la valeur de la propriété shippingServiceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setShippingServiceCost(Amount value) {
        this.shippingServiceCost = value;
    }

    /**
     * Obtient la valeur de la propriété shippingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * Définit la valeur de la propriété shippingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingType(String value) {
        this.shippingType = value;
    }

    /**
     * Gets the value of the shipToLocations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToLocations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipToLocations() {
        if (shipToLocations == null) {
            shipToLocations = new ArrayList<String>();
        }
        return this.shipToLocations;
    }

    /**
     * Obtient la valeur de la propriété expeditedShipping.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExpeditedShipping() {
        return expeditedShipping;
    }

    /**
     * Définit la valeur de la propriété expeditedShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExpeditedShipping(Boolean value) {
        this.expeditedShipping = value;
    }

    /**
     * Obtient la valeur de la propriété oneDayShippingAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneDayShippingAvailable() {
        return oneDayShippingAvailable;
    }

    /**
     * Définit la valeur de la propriété oneDayShippingAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneDayShippingAvailable(Boolean value) {
        this.oneDayShippingAvailable = value;
    }

    /**
     * Obtient la valeur de la propriété handlingTime.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHandlingTime() {
        return handlingTime;
    }

    /**
     * Définit la valeur de la propriété handlingTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHandlingTime(Integer value) {
        this.handlingTime = value;
    }

    /**
     * Obtient la valeur de la propriété intermediatedShipping.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntermediatedShipping() {
        return intermediatedShipping;
    }

    /**
     * Définit la valeur de la propriété intermediatedShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntermediatedShipping(Boolean value) {
        this.intermediatedShipping = value;
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
