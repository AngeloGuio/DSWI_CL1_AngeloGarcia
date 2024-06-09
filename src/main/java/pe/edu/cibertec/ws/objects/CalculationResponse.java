//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 05:49:36 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CalculationResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CalculationResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="square" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="half" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalculationResponse", propOrder = {
    "square",
    "half"
})
public class CalculationResponse {

    protected int square;
    protected double half;

    /**
     * Obtiene el valor de la propiedad square.
     * 
     */
    public int getSquare() {
        return square;
    }

    /**
     * Define el valor de la propiedad square.
     * 
     */
    public void setSquare(int value) {
        this.square = value;
    }

    /**
     * Obtiene el valor de la propiedad half.
     * 
     */
    public double getHalf() {
        return half;
    }

    /**
     * Define el valor de la propiedad half.
     * 
     */
    public void setHalf(double value) {
        this.half = value;
    }

}
