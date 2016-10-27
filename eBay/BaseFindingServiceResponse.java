
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						Base response container for all Finding Service operations.
 * 					
 * 
 * <p>Classe Java pour BaseFindingServiceResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BaseFindingServiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceResponse">
 *       &lt;sequence>
 *         &lt;element name="searchResult" type="{http://www.ebay.com/marketplace/search/v1/services}SearchResult" minOccurs="0"/>
 *         &lt;element name="paginationOutput" type="{http://www.ebay.com/marketplace/search/v1/services}PaginationOutput" minOccurs="0"/>
 *         &lt;element name="itemSearchURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="extension" type="{http://www.ebay.com/marketplace/search/v1/services}ExtensionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFindingServiceResponse", propOrder = {
    "searchResult",
    "paginationOutput",
    "itemSearchURL",
    "extension"
})
@XmlSeeAlso({
    FindItemsByCategoryResponse.class,
    FindItemsForFavoriteSearchResponse.class,
    FindItemsByProductResponse.class,
    FindItemsByImageResponse.class,
    FindItemsIneBayStoresResponse.class,
    FindItemsByKeywordsResponse.class,
    FindCompletedItemsResponse.class,
    FindItemsAdvancedResponse.class
})
public abstract class BaseFindingServiceResponse
    extends BaseServiceResponse
{

    protected SearchResult searchResult;
    protected PaginationOutput paginationOutput;
    @XmlSchemaType(name = "anyURI")
    protected String itemSearchURL;
    protected List<ExtensionType> extension;

    /**
     * Obtient la valeur de la propriété searchResult.
     * 
     * @return
     *     possible object is
     *     {@link SearchResult }
     *     
     */
    public SearchResult getSearchResult() {
        return searchResult;
    }

    /**
     * Définit la valeur de la propriété searchResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchResult }
     *     
     */
    public void setSearchResult(SearchResult value) {
        this.searchResult = value;
    }

    /**
     * Obtient la valeur de la propriété paginationOutput.
     * 
     * @return
     *     possible object is
     *     {@link PaginationOutput }
     *     
     */
    public PaginationOutput getPaginationOutput() {
        return paginationOutput;
    }

    /**
     * Définit la valeur de la propriété paginationOutput.
     * 
     * @param value
     *     allowed object is
     *     {@link PaginationOutput }
     *     
     */
    public void setPaginationOutput(PaginationOutput value) {
        this.paginationOutput = value;
    }

    /**
     * Obtient la valeur de la propriété itemSearchURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSearchURL() {
        return itemSearchURL;
    }

    /**
     * Définit la valeur de la propriété itemSearchURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSearchURL(String value) {
        this.itemSearchURL = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionType }
     * 
     * 
     */
    public List<ExtensionType> getExtension() {
        if (extension == null) {
            extension = new ArrayList<ExtensionType>();
        }
        return this.extension;
    }

}
