
package eBay;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PriceTreatmentEnum.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceTreatmentEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STP"/>
 *     &lt;enumeration value="MAP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceTreatmentEnum")
@XmlEnum
public enum PriceTreatmentEnum {


    /**
     * 
     * 								STP stands for Strike-Through Pricing.
     * 							
     * 
     */
    STP,

    /**
     * 
     * 								MAP stands for Minimum Advertised Price.
     * 							
     * 
     */
    MAP;

    public String value() {
        return name();
    }

    public static PriceTreatmentEnum fromValue(String v) {
        return valueOf(v);
    }

}
