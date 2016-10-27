
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 					This container supplies information for an item that has a Strike-Through
 * 					Pricing (STP) or Minimum Advertised Price (MAP) discount pricing treatment.
 * 					STP and MAP applies to only fixed price, BIN items. STP is available on the
 * 					US, UK, and DE sites while MAP is available only on the US site.
 * 					<br><br>
 * 					This feature is available to qualified sellers who participate in the
 * 					Discount Pricing program. A seller can provide a discount price treatment for
 * 					Non-MSKU and MSKU items in Clothing, Shoes and Accessories (CDA), Motors, and
 * 					Electronics (Home and Garden is expected to be supported in the future).
 * 				
 * 
 * <p>Classe Java pour DiscountPriceInfo complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DiscountPriceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originalRetailPrice" type="{http://www.ebay.com/marketplace/search/v1/services}Amount"/>
 *         &lt;element name="minimumAdvertisedPriceExposure" type="{http://www.ebay.com/marketplace/search/v1/services}MapExposureEnum" minOccurs="0"/>
 *         &lt;element name="pricingTreatment" type="{http://www.ebay.com/marketplace/search/v1/services}PriceTreatmentEnum"/>
 *         &lt;element name="soldOnEbay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="soldOffEbay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPriceInfo", propOrder = {
    "originalRetailPrice",
    "minimumAdvertisedPriceExposure",
    "pricingTreatment",
    "soldOnEbay",
    "soldOffEbay"
})
public class DiscountPriceInfo {

    @XmlElement(required = true)
    protected Amount originalRetailPrice;
    @XmlSchemaType(name = "string")
    protected MapExposureEnum minimumAdvertisedPriceExposure;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PriceTreatmentEnum pricingTreatment;
    @XmlElement(defaultValue = "false")
    protected Boolean soldOnEbay;
    @XmlElement(defaultValue = "false")
    protected Boolean soldOffEbay;

    /**
     * Obtient la valeur de la propriété originalRetailPrice.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getOriginalRetailPrice() {
        return originalRetailPrice;
    }

    /**
     * Définit la valeur de la propriété originalRetailPrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setOriginalRetailPrice(Amount value) {
        this.originalRetailPrice = value;
    }

    /**
     * Obtient la valeur de la propriété minimumAdvertisedPriceExposure.
     * 
     * @return
     *     possible object is
     *     {@link MapExposureEnum }
     *     
     */
    public MapExposureEnum getMinimumAdvertisedPriceExposure() {
        return minimumAdvertisedPriceExposure;
    }

    /**
     * Définit la valeur de la propriété minimumAdvertisedPriceExposure.
     * 
     * @param value
     *     allowed object is
     *     {@link MapExposureEnum }
     *     
     */
    public void setMinimumAdvertisedPriceExposure(MapExposureEnum value) {
        this.minimumAdvertisedPriceExposure = value;
    }

    /**
     * Obtient la valeur de la propriété pricingTreatment.
     * 
     * @return
     *     possible object is
     *     {@link PriceTreatmentEnum }
     *     
     */
    public PriceTreatmentEnum getPricingTreatment() {
        return pricingTreatment;
    }

    /**
     * Définit la valeur de la propriété pricingTreatment.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceTreatmentEnum }
     *     
     */
    public void setPricingTreatment(PriceTreatmentEnum value) {
        this.pricingTreatment = value;
    }

    /**
     * Obtient la valeur de la propriété soldOnEbay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOnEbay() {
        return soldOnEbay;
    }

    /**
     * Définit la valeur de la propriété soldOnEbay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOnEbay(Boolean value) {
        this.soldOnEbay = value;
    }

    /**
     * Obtient la valeur de la propriété soldOffEbay.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSoldOffEbay() {
        return soldOffEbay;
    }

    /**
     * Définit la valeur de la propriété soldOffEbay.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSoldOffEbay(Boolean value) {
        this.soldOffEbay = value;
    }

}
