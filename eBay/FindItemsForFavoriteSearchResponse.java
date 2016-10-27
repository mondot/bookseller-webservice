
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Reserved for future use.
 * 					
 * 
 * <p>Classe Java pour FindItemsForFavoriteSearchResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FindItemsForFavoriteSearchResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseFindingServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="categoryHistogramContainer" type="{http://www.ebay.com/marketplace/search/v1/services}CategoryHistogramContainer" minOccurs="0"/>
 *         &lt;element name="aspectHistogramContainer" type="{http://www.ebay.com/marketplace/search/v1/services}AspectHistogramContainer" minOccurs="0"/>
 *         &lt;element name="conditionHistogramContainer" type="{http://www.ebay.com/marketplace/search/v1/services}ConditionHistogramContainer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemsForFavoriteSearchResponse", propOrder = {
    "categoryHistogramContainer",
    "aspectHistogramContainer",
    "conditionHistogramContainer"
})
public class FindItemsForFavoriteSearchResponse
    extends BaseFindingServiceResponse
{

    protected CategoryHistogramContainer categoryHistogramContainer;
    protected AspectHistogramContainer aspectHistogramContainer;
    protected ConditionHistogramContainer conditionHistogramContainer;

    /**
     * Obtient la valeur de la propriété categoryHistogramContainer.
     * 
     * @return
     *     possible object is
     *     {@link CategoryHistogramContainer }
     *     
     */
    public CategoryHistogramContainer getCategoryHistogramContainer() {
        return categoryHistogramContainer;
    }

    /**
     * Définit la valeur de la propriété categoryHistogramContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryHistogramContainer }
     *     
     */
    public void setCategoryHistogramContainer(CategoryHistogramContainer value) {
        this.categoryHistogramContainer = value;
    }

    /**
     * Obtient la valeur de la propriété aspectHistogramContainer.
     * 
     * @return
     *     possible object is
     *     {@link AspectHistogramContainer }
     *     
     */
    public AspectHistogramContainer getAspectHistogramContainer() {
        return aspectHistogramContainer;
    }

    /**
     * Définit la valeur de la propriété aspectHistogramContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link AspectHistogramContainer }
     *     
     */
    public void setAspectHistogramContainer(AspectHistogramContainer value) {
        this.aspectHistogramContainer = value;
    }

    /**
     * Obtient la valeur de la propriété conditionHistogramContainer.
     * 
     * @return
     *     possible object is
     *     {@link ConditionHistogramContainer }
     *     
     */
    public ConditionHistogramContainer getConditionHistogramContainer() {
        return conditionHistogramContainer;
    }

    /**
     * Définit la valeur de la propriété conditionHistogramContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionHistogramContainer }
     *     
     */
    public void setConditionHistogramContainer(ConditionHistogramContainer value) {
        this.conditionHistogramContainer = value;
    }

}
