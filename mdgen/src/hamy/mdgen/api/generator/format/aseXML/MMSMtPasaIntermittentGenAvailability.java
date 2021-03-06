//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.18 at 10:36:34 AM AEDT 
//


package hamy.mdgen.api.generator.format.aseXML;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         Purpose - Provide intermittent generator availability information for the MtPasa time frame
 *       
 * 
 * <p>Java class for MMSMtPasaIntermittentGenAvailability complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMSMtPasaIntermittentGenAvailability">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpperLimit" type="{urn:aseXML:r38}UpperLimit" minOccurs="0"/>
 *         &lt;element name="Clusters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Cluster" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ElementClusterId" type="{urn:aseXML:r38}ElementClusterId"/>
 *                             &lt;element name="ElementsNotAvailable" type="{urn:aseXML:r38}ElementsNotAvailable"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
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
@XmlType(name = "MMSMtPasaIntermittentGenAvailability", propOrder = {
    "upperLimit",
    "clusters"
})
public class MMSMtPasaIntermittentGenAvailability {

    @XmlElement(name = "UpperLimit")
    protected BigInteger upperLimit;
    @XmlElement(name = "Clusters")
    protected MMSMtPasaIntermittentGenAvailability.Clusters clusters;

    /**
     * Gets the value of the upperLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUpperLimit() {
        return upperLimit;
    }

    /**
     * Sets the value of the upperLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUpperLimit(BigInteger value) {
        this.upperLimit = value;
    }

    /**
     * Gets the value of the clusters property.
     * 
     * @return
     *     possible object is
     *     {@link MMSMtPasaIntermittentGenAvailability.Clusters }
     *     
     */
    public MMSMtPasaIntermittentGenAvailability.Clusters getClusters() {
        return clusters;
    }

    /**
     * Sets the value of the clusters property.
     * 
     * @param value
     *     allowed object is
     *     {@link MMSMtPasaIntermittentGenAvailability.Clusters }
     *     
     */
    public void setClusters(MMSMtPasaIntermittentGenAvailability.Clusters value) {
        this.clusters = value;
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
     *         &lt;element name="Cluster" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ElementClusterId" type="{urn:aseXML:r38}ElementClusterId"/>
     *                   &lt;element name="ElementsNotAvailable" type="{urn:aseXML:r38}ElementsNotAvailable"/>
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
        "cluster"
    })
    public static class Clusters {

        @XmlElement(name = "Cluster", required = true)
        protected List<MMSMtPasaIntermittentGenAvailability.Clusters.Cluster> cluster;

        /**
         * Gets the value of the cluster property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cluster property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCluster().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MMSMtPasaIntermittentGenAvailability.Clusters.Cluster }
         * 
         * 
         */
        public List<MMSMtPasaIntermittentGenAvailability.Clusters.Cluster> getCluster() {
            if (cluster == null) {
                cluster = new ArrayList<MMSMtPasaIntermittentGenAvailability.Clusters.Cluster>();
            }
            return this.cluster;
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
         *         &lt;element name="ElementClusterId" type="{urn:aseXML:r38}ElementClusterId"/>
         *         &lt;element name="ElementsNotAvailable" type="{urn:aseXML:r38}ElementsNotAvailable"/>
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
            "elementClusterId",
            "elementsNotAvailable"
        })
        public static class Cluster {

            @XmlElement(name = "ElementClusterId", required = true)
            protected String elementClusterId;
            @XmlElement(name = "ElementsNotAvailable", required = true)
            protected BigInteger elementsNotAvailable;

            /**
             * Gets the value of the elementClusterId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getElementClusterId() {
                return elementClusterId;
            }

            /**
             * Sets the value of the elementClusterId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setElementClusterId(String value) {
                this.elementClusterId = value;
            }

            /**
             * Gets the value of the elementsNotAvailable property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getElementsNotAvailable() {
                return elementsNotAvailable;
            }

            /**
             * Sets the value of the elementsNotAvailable property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setElementsNotAvailable(BigInteger value) {
                this.elementsNotAvailable = value;
            }

        }

    }

}
