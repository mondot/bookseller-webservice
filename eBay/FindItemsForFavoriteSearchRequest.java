
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 						Reserved for future use.
 * 					
 * 
 * <p>Classe Java pour FindItemsForFavoriteSearchRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FindItemsForFavoriteSearchRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ebay.com/marketplace/search/v1/services}BaseServiceRequest">
 *       &lt;sequence>
 *         &lt;element name="searchId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="searchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startTimeFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="paginationInput" type="{http://www.ebay.com/marketplace/search/v1/services}PaginationInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindItemsForFavoriteSearchRequest", propOrder = {
    "searchId",
    "searchName",
    "startTimeFrom",
    "paginationInput"
})
public class FindItemsForFavoriteSearchRequest
    extends BaseServiceRequest
{

    protected Long searchId;
    protected String searchName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTimeFrom;
    protected PaginationInput paginationInput;

    /**
     * Obtient la valeur de la propriété searchId.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSearchId() {
        return searchId;
    }

    /**
     * Définit la valeur de la propriété searchId.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSearchId(Long value) {
        this.searchId = value;
    }

    /**
     * Obtient la valeur de la propriété searchName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchName() {
        return searchName;
    }

    /**
     * Définit la valeur de la propriété searchName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchName(String value) {
        this.searchName = value;
    }

    /**
     * Obtient la valeur de la propriété startTimeFrom.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTimeFrom() {
        return startTimeFrom;
    }

    /**
     * Définit la valeur de la propriété startTimeFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTimeFrom(XMLGregorianCalendar value) {
        this.startTimeFrom = value;
    }

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

}
