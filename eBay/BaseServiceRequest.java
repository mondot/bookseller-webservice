
package eBay;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 						This is the base class container for all service operation requests.
 * 					
 * 
 * <p>Classe Java pour BaseServiceRequest complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceRequest")
@XmlSeeAlso({
    GetHistogramsRequest.class,
    FindItemsForFavoriteSearchRequest.class,
    GetSearchKeywordsRecommendationRequest.class,
    GetVersionRequest.class,
    BestMatchFindingServiceRequest.class
})
public abstract class BaseServiceRequest {


}
