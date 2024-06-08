//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 02:42:53 PM PET 
//


package pe.edu.cibertec.ws.objects;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promedio" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="menorpractica" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "promedio",
    "menorpractica"
})
@XmlRootElement(name = "GetPracticasResponse")
public class GetPracticasResponse {

    @XmlElement(required = true)
    protected double promedio;
    protected int menorpractica;

    /**
     * Obtiene el valor de la propiedad promedio.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public double getPromedio() {
        return promedio;
    }

    /**
     * Define el valor de la propiedad promedio.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPromedio(double value) {
        this.promedio = value;
    }

    /**
     * Obtiene el valor de la propiedad menorpractica.
     * 
     */
    public int getMenorpractica() {
        return menorpractica;
    }

    /**
     * Define el valor de la propiedad menorpractica.
     * 
     */
    public void setMenorpractica(int value) {
        this.menorpractica = value;
    }

}
