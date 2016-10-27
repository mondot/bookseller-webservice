
package eBay;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 						A container for error details.
 * 					
 * 
 * <p>Classe Java pour ErrorData complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ErrorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="severity" type="{http://www.ebay.com/marketplace/search/v1/services}ErrorSeverity"/>
 *         &lt;element name="category" type="{http://www.ebay.com/marketplace/search/v1/services}ErrorCategory"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="subdomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exceptionId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="parameter" type="{http://www.ebay.com/marketplace/search/v1/services}ErrorParameter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorData", propOrder = {
    "errorId",
    "domain",
    "severity",
    "category",
    "message",
    "subdomain",
    "exceptionId",
    "parameter"
})
public class ErrorData {

    protected long errorId;
    @XmlElement(required = true)
    protected String domain;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ErrorSeverity severity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ErrorCategory category;
    @XmlElement(required = true)
    protected String message;
    protected String subdomain;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String exceptionId;
    @XmlElement(nillable = true)
    protected List<ErrorParameter> parameter;

    /**
     * Obtient la valeur de la propriété errorId.
     * 
     */
    public long getErrorId() {
        return errorId;
    }

    /**
     * Définit la valeur de la propriété errorId.
     * 
     */
    public void setErrorId(long value) {
        this.errorId = value;
    }

    /**
     * Obtient la valeur de la propriété domain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Définit la valeur de la propriété domain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Obtient la valeur de la propriété severity.
     * 
     * @return
     *     possible object is
     *     {@link ErrorSeverity }
     *     
     */
    public ErrorSeverity getSeverity() {
        return severity;
    }

    /**
     * Définit la valeur de la propriété severity.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorSeverity }
     *     
     */
    public void setSeverity(ErrorSeverity value) {
        this.severity = value;
    }

    /**
     * Obtient la valeur de la propriété category.
     * 
     * @return
     *     possible object is
     *     {@link ErrorCategory }
     *     
     */
    public ErrorCategory getCategory() {
        return category;
    }

    /**
     * Définit la valeur de la propriété category.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorCategory }
     *     
     */
    public void setCategory(ErrorCategory value) {
        this.category = value;
    }

    /**
     * Obtient la valeur de la propriété message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Définit la valeur de la propriété message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtient la valeur de la propriété subdomain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Définit la valeur de la propriété subdomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdomain(String value) {
        this.subdomain = value;
    }

    /**
     * Obtient la valeur de la propriété exceptionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExceptionId() {
        return exceptionId;
    }

    /**
     * Définit la valeur de la propriété exceptionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExceptionId(String value) {
        this.exceptionId = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorParameter }
     * 
     * 
     */
    public List<ErrorParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ErrorParameter>();
        }
        return this.parameter;
    }

}
