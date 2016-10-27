
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base request container for all Finding Service operations.
 * 					
 * 
 * <p>Classe Java pour BaseFindingServiceRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BaseFindingServiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BestMatchFindingServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="sortOrder" type="{http://www.ebay.com/marketplace/search/v1/services}SortOrderType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFindingServiceRequest", propOrder = {
    "sortOrder"
})
@XmlSeeAlso({
    FindItemsAdvancedRequest.class,
    FindCompletedItemsRequest.class,
    FindItemsByKeywordsRequest.class,
    FindItemsByProductRequest.class,
    FindItemsIneBayStoresRequest.class,
    FindItemsByCategoryRequest.class
})
public abstract class BaseFindingServiceRequest
    extends BestMatchFindingServiceRequest
{

    @XmlSchemaType(name = "string")
    protected SortOrderType sortOrder;

    /**
     * Obtient la valeur de la propriété sortOrder.
     * 
     * @return
     *     possible object is
     *     {@link SortOrderType }
     *     
     */
    public SortOrderType getSortOrder() {
        return sortOrder;
    }

    /**
     * Définit la valeur de la propriété sortOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link SortOrderType }
     *     
     */
    public void setSortOrder(SortOrderType value) {
        this.sortOrder = value;
    }

}
