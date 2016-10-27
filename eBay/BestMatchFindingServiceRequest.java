
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base request container for all Finding Service operations.
 * 					
 * 
 * <p>Classe Java pour BestMatchFindingServiceRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BestMatchFindingServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/search/v1/services}PaginationInput" minOccurs="0"/>
 *         &lt;element name="buyerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="affiliate" type="{http://www.ebay.com/marketplace/search/v1/services}Affiliate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BestMatchFindingServiceRequest", propOrder = {
    "paginationInput",
    "buyerPostalCode",
    "affiliate"
})
@XmlSeeAlso({
    FindItemsByImageRequest.class,
    BaseFindingServiceRequest.class
})
public abstract class BestMatchFindingServiceRequest
    extends BaseServiceRequest
{

    protected PaginationInput paginationInput;
    protected String buyerPostalCode;
    protected Affiliate affiliate;

    /**
     * Obtient la valeur de la propriété paginationInput.
     * 
     * @return
     *     possible object is
     *     {@link PaginationInput }
     *     
     */
    public PaginationInput getPaginationInput() {
        return paginationInput;
    }

    /**
     * Définit la valeur de la propriété paginationInput.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationInput }
     *     
     */
    public void setPaginationInput(PaginationInput value) {
        this.paginationInput = value;
    }

    /**
     * Obtient la valeur de la propriété buyerPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerPostalCode() {
        return buyerPostalCode;
    }

    /**
     * Définit la valeur de la propriété buyerPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerPostalCode(String value) {
        this.buyerPostalCode = value;
    }

    /**
     * Obtient la valeur de la propriété affiliate.
     * 
     * @return
     *     possible object is
     *     {@link Affiliate }
     *     
     */
    public Affiliate getAffiliate() {
        return affiliate;
    }

    /**
     * Définit la valeur de la propriété affiliate.
     * 
     * @param value
     *     allowed object is
     *     {@link Affiliate }
     *     
     */
    public void setAffiliate(Affiliate value) {
        this.affiliate = value;
    }

}
