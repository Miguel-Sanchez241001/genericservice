//
// Generated By:JAX-WS RI IBM 2.2.1-11/25/2013 11:48 AM(foreman)- (JAXB RI IBM 2.2.3-11/25/2013 12:35 PM(foreman)-)
//


package pe.bn.com.sate.infrastructure.service.external.domain.comp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SistemaParametro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SistemaParametro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aliasSistema" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grupoParametro" type="{http://bean.ws.comp.bn.com.pe}ArrayOfGrupoParametro"/>
 *         &lt;element name="proceso" type="{http://bean.ws.comp.bn.com.pe}ReturnProceso"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SistemaParametro", propOrder = {
    "aliasSistema",
    "grupoParametro",
    "proceso"
})
public class SistemaParametro {

    @XmlElement(required = true, nillable = true)
    protected String aliasSistema;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfGrupoParametro grupoParametro;
    @XmlElement(required = true, nillable = true)
    protected ReturnProceso proceso;

    /**
     * Gets the value of the aliasSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAliasSistema() {
        return aliasSistema;
    }

    /**
     * Sets the value of the aliasSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAliasSistema(String value) {
        this.aliasSistema = value;
    }

    /**
     * Gets the value of the grupoParametro property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfGrupoParametro }
     *     
     */
    public ArrayOfGrupoParametro getGrupoParametro() {
        return grupoParametro;
    }

    /**
     * Sets the value of the grupoParametro property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfGrupoParametro }
     *     
     */
    public void setGrupoParametro(ArrayOfGrupoParametro value) {
        this.grupoParametro = value;
    }

    /**
     * Gets the value of the proceso property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnProceso }
     *     
     */
    public ReturnProceso getProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnProceso }
     *     
     */
    public void setProceso(ReturnProceso value) {
        this.proceso = value;
    }

}
