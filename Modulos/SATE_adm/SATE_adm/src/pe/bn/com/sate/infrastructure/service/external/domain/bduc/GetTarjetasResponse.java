//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.sate.infrastructure.service.external.domain.bduc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getTarjetasReturn" type="{http://domain.bduc.bn.pe}BnTarjetasCliente"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getTarjetasReturn"
})
@XmlRootElement(name = "getTarjetasResponse")
public class GetTarjetasResponse {

    @XmlElement(required = true, nillable = true)
    protected BnTarjetasCliente getTarjetasReturn;

    /**
     * Gets the value of the getTarjetasReturn property.
     * 
     * @return
     *     possible object is
     *     {@link BnTarjetasCliente }
     *     
     */
    public BnTarjetasCliente getGetTarjetasReturn() {
        return getTarjetasReturn;
    }

    /**
     * Sets the value of the getTarjetasReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BnTarjetasCliente }
     *     
     */
    public void setGetTarjetasReturn(BnTarjetasCliente value) {
        this.getTarjetasReturn = value;
    }

}
