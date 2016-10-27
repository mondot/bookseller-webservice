
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
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * 
 * 				Contains information specific to the item listing.
 * 			
 * 
 * <p>Classe Java pour ListingInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ListingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bestOfferEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buyItNowAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buyItNowPrice" type="{http://www.ebay.com/marketplace/search/v1/services}Amount" minOccurs="0"/>
 *         &lt;element name="convertedBuyItNowPrice" type="{http://www.ebay.com/marketplace/search/v1/services}Amount" minOccurs="0"/>
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="listingType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="gift" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ListingInfo", propOrder = {
    "bestOfferEnabled",
    "buyItNowAvailable",
    "buyItNowPrice",
    "convertedBuyItNowPrice",
    "startTime",
    "endTime",
    "listingType",
    "gift",
    "delimiter",
    "any"
})
public class ListingInfo {

    protected Boolean bestOfferEnabled;
    protected Boolean buyItNowAvailable;
    protected Amount buyItNowPrice;
    protected Amount convertedBuyItNowPrice;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String listingType;
    protected Boolean gift;
    protected String delimiter;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Obtient la valeur de la propriété bestOfferEnabled.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBestOfferEnabled() {
        return bestOfferEnabled;
    }

    /**
     * Définit la valeur de la propriété bestOfferEnabled.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBestOfferEnabled(Boolean value) {
        this.bestOfferEnabled = value;
    }

    /**
     * Obtient la valeur de la propriété buyItNowAvailable.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuyItNowAvailable() {
        return buyItNowAvailable;
    }

    /**
     * Définit la valeur de la propriété buyItNowAvailable.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuyItNowAvailable(Boolean value) {
        this.buyItNowAvailable = value;
    }

    /**
     * Obtient la valeur de la propriété buyItNowPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getBuyItNowPrice() {
        return buyItNowPrice;
    }

    /**
     * Définit la valeur de la propriété buyItNowPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setBuyItNowPrice(Amount value) {
        this.buyItNowPrice = value;
    }

    /**
     * Obtient la valeur de la propriété convertedBuyItNowPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getConvertedBuyItNowPrice() {
        return convertedBuyItNowPrice;
    }

    /**
     * Définit la valeur de la propriété convertedBuyItNowPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setConvertedBuyItNowPrice(Amount value) {
        this.convertedBuyItNowPrice = value;
    }

    /**
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Obtient la valeur de la propriété endTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Définit la valeur de la propriété endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Obtient la valeur de la propriété listingType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListingType() {
        return listingType;
    }

    /**
     * Définit la valeur de la propriété listingType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListingType(String value) {
        this.listingType = value;
    }

    /**
     * Obtient la valeur de la propriété gift.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGift() {
        return gift;
    }

    /**
     * Définit la valeur de la propriété gift.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGift(Boolean value) {
        this.gift = value;
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
