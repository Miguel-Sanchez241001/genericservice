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
 *         &lt;element name="tdocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ndocumento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codtrans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perfil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ctaConsult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "tdocumento",
    "ndocumento",
    "codtrans",
    "perfil",
    "user",
    "ctaConsult"
})
@XmlRootElement(name = "getCuentas")
public class GetCuentas {

    @XmlElement(required = true, nillable = true)
    protected String tdocumento;
    @XmlElement(required = true, nillable = true)
    protected String ndocumento;
    @XmlElement(required = true, nillable = true)
    protected String codtrans;
    @XmlElement(required = true, nillable = true)
    protected String perfil;
    @XmlElement(required = true, nillable = true)
    protected String user;
    protected int ctaConsult;

    /**
     * Gets the value of the tdocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdocumento() {
        return tdocumento;
    }

    /**
     * Sets the value of the tdocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdocumento(String value) {
        this.tdocumento = value;
    }

    /**
     * Gets the value of the ndocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNdocumento() {
        return ndocumento;
    }

    /**
     * Sets the value of the ndocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNdocumento(String value) {
        this.ndocumento = value;
    }

    /**
     * Gets the value of the codtrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodtrans() {
        return codtrans;
    }

    /**
     * Sets the value of the codtrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodtrans(String value) {
        this.codtrans = value;
    }

    /**
     * Gets the value of the perfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     * Sets the value of the perfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfil(String value) {
        this.perfil = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the ctaConsult property.
     * 
     */
    public int getCtaConsult() {
        return ctaConsult;
    }

    /**
     * Sets the value of the ctaConsult property.
     * 
     */
    public void setCtaConsult(int value) {
        this.ctaConsult = value;
    }

}
