//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.03.02 at 07:16:52 PM EET 
//


package class_generated.generated;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="flower" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Rose"/>
 *                         &lt;enumeration value="Tulip"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="soil">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="sod-podzolic"/>
 *                         &lt;enumeration value="ground"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="origin">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="Iran"/>
 *                         &lt;enumeration value="Netherlands"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="visual_�arameters">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stem_color">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="dark_green"/>
 *                                   &lt;enumeration value="green"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="leaf_color">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="braun"/>
 *                                   &lt;enumeration value="green"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="size">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="50"/>
 *                                   &lt;enumeration value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="grovin_tips">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="temperature_celsius">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="12"/>
 *                                   &lt;enumeration value="7"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="lighting" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="watering_milliliters">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                   &lt;enumeration value="450"/>
 *                                   &lt;enumeration value="550"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="multiplying">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="cuttings"/>
 *                         &lt;enumeration value="seed"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "flower"
})
@XmlRootElement(name = "Flowers")
public class Flowers {

    protected List<Flowers.Flower> flower;

    /**
     * Gets the value of the flower property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot.  any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flower property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlower().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Flowers.Flower }
     * 
     * 
     */
    public List<Flowers.Flower> getFlower() {
        if (flower == null) {
            flower = new ArrayList<Flowers.Flower>();
        }
        return this.flower;
    }


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
     *         &lt;element name="name">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Rose"/>
     *               &lt;enumeration value="Tulip"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="soil">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="sod-podzolic"/>
     *               &lt;enumeration value="ground"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="origin">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="Iran"/>
     *               &lt;enumeration value="Netherlands"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="visual_�arameters">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stem_color">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="dark_green"/>
     *                         &lt;enumeration value="green"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="leaf_color">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="braun"/>
     *                         &lt;enumeration value="green"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="size">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="50"/>
     *                         &lt;enumeration value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="grovin_tips">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="temperature_celsius">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="12"/>
     *                         &lt;enumeration value="7"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="lighting" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="watering_milliliters">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                         &lt;enumeration value="450"/>
     *                         &lt;enumeration value="550"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="multiplying">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="cuttings"/>
     *               &lt;enumeration value="seed"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "name",
        "soil",
        "origin",
        "visualparameters",
        "grovinTips",
        "multiplying"
    })
    public static class Flower {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String soil;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(name = "visual_Parameters", required = true)
        protected Flowers.Flower.VisualParameters visualParameters;
        @XmlElement(name = "grovin_tips", required = true)
        protected Flowers.Flower.GrovinTips grovinTips;
        @XmlElement(required = true)
        protected String multiplying;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the soil property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSoil() {
            return soil;
        }

        /**
         * Sets the value of the soil property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSoil(String value) {
            this.soil = value;
        }

        /**
         * Gets the value of the origin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigin() {
            return origin;
        }

        /**
         * Sets the value of the origin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigin(String value) {
            this.origin = value;
        }

        /**
         * Gets the value of the visual�arameters property.
         * 
         * @return
         *     possible object is
         *     {@link Flowers.Flower.VisualParameters }
         *     
         */
        public Flowers.Flower.VisualParameters getVisualParameters() {
            return visualParameters;
        }

        /**
         * Sets the value of the visualParameters property.
         * 
         * @param value
         *     allowed object is
         *     {@link Flowers.Flower.VisualParameters }
         *     
         */
        public void setVisualParameters(Flowers.Flower.VisualParameters value) {
            this.visualParameters = value;
        }

        /**
         * Gets the value of the grovinTips property.
         * 
         * @return
         *     possible object is
         *     {@link Flowers.Flower.GrovinTips }
         *     
         */
        public Flowers.Flower.GrovinTips getGrovinTips() {
            return grovinTips;
        }

        /**
         * Sets the value of the grovinTips property.
         * 
         * @param value
         *     allowed object is
         *     {@link Flowers.Flower.GrovinTips }
         *     
         */
        public void setGrovinTips(Flowers.Flower.GrovinTips value) {
            this.grovinTips = value;
        }

        /**
         * Gets the value of the multiplying property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMultiplying() {
            return multiplying;
        }

        /**
         * Sets the value of the multiplying property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMultiplying(String value) {
            this.multiplying = value;
        }


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
         *         &lt;element name="temperature_celsius">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="12"/>
         *               &lt;enumeration value="7"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="lighting" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="watering_milliliters">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="450"/>
         *               &lt;enumeration value="550"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
            "temperatureCelsius",
            "lighting",
            "wateringMilliliters"
        })
        public static class GrovinTips {

            @XmlElement(name = "temperature_celsius")
            protected int temperatureCelsius;
            @XmlElement(required = true)
            protected String lighting;
            @XmlElement(name = "watering_milliliters")
            protected int wateringMilliliters;

            /**
             * Gets the value of the temperatureCelsius property.
             * 
             */
            public int getTemperatureCelsius() {
                return temperatureCelsius;
            }

            /**
             * Sets the value of the temperatureCelsius property.
             * 
             */
            public void setTemperatureCelsius(int value) {
                this.temperatureCelsius = value;
            }

            /**
             * Gets the value of the lighting property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLighting() {
                return lighting;
            }

            /**
             * Sets the value of the lighting property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLighting(String value) {
                this.lighting = value;
            }

            /**
             * Gets the value of the wateringMilliliters property.
             * 
             */
            public int getWateringMilliliters() {
                return wateringMilliliters;
            }

            /**
             * Sets the value of the wateringMilliliters property.
             * 
             */
            public void setWateringMilliliters(int value) {
                this.wateringMilliliters = value;
            }

        }


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
         *         &lt;element name="stem_color">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="dark_green"/>
         *               &lt;enumeration value="green"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="leaf_color">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="braun"/>
         *               &lt;enumeration value="green"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="size">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *               &lt;enumeration value="50"/>
         *               &lt;enumeration value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
            "stemColor",
            "leafColor",
            "size"
        })
        public static class VisualParameters {

            @XmlElement(name = "stem_color", required = true)
            protected String stemColor;
            @XmlElement(name = "leaf_color", required = true)
            protected String leafColor;
            protected int size;

            /**
             * Gets the value of the stemColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStemColor() {
                return stemColor;
            }

            /**
             * Sets the value of the stemColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStemColor(String value) {
                this.stemColor = value;
            }

            /**
             * Gets the value of the leafColor property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLeafColor() {
                return leafColor;
            }

            /**
             * Sets the value of the leafColor property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLeafColor(String value) {
                this.leafColor = value;
            }

            /**
             * Gets the value of the size property.
             * 
             */
            public int getSize() {
                return size;
            }

            /**
             * Sets the value of the size property.
             * 
             */
            public void setSize(int value) {
                this.size = value;
            }

        }

    }

}
