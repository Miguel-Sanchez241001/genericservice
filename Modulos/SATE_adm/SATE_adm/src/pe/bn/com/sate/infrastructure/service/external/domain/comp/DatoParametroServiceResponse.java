//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.sate.infrastructure.service.external.domain.comp;

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
 *         &lt;element name="datoParametroServiceReturn" type="{http://bean.ws.comp.bn.com.pe}SistemaParametro"/>
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
    "datoParametroServiceReturn"
})
@XmlRootElement(name = "datoParametroServiceResponse", namespace = "http://service.ws.comp.bn.com.pe")
public class DatoParametroServiceResponse {

    @XmlElement(required = true, nillable = true)
    protected SistemaParametro datoParametroServiceReturn;

    /**
     * Gets the value of the datoParametroServiceReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SistemaParametro }
     *     
     */
    public SistemaParametro getDatoParametroServiceReturn() {
        return datoParametroServiceReturn;
    }

    /**
     * Sets the value of the datoParametroServiceReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SistemaParametro }
     *     
     */
    public void setDatoParametroServiceReturn(SistemaParametro value) {
        this.datoParametroServiceReturn = value;
    }

}
