//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.sate.infrastructure.service.external.domain.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Adjunto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Adjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docAdjunto" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="flagAdjunto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Adjunto", propOrder = {
    "docAdjunto",
    "flagAdjunto"
})
public class Adjunto {

    @XmlElement(required = true, nillable = true)
    protected byte[] docAdjunto;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer flagAdjunto;

    /**
     * Gets the value of the docAdjunto property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDocAdjunto() {
        return docAdjunto;
    }

    /**
     * Sets the value of the docAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDocAdjunto(byte[] value) {
        this.docAdjunto = ((byte[]) value);
    }

    /**
     * Gets the value of the flagAdjunto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFlagAdjunto() {
        return flagAdjunto;
    }

    /**
     * Sets the value of the flagAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFlagAdjunto(Integer value) {
        this.flagAdjunto = value;
    }

}