
package hamy.mdgen.api.generator.format.xai.CMIMDSeeder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CM-IMDSeederPortType", targetNamespace = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-IMDSeeder")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CMIMDSeederPortType {


    /**
     * 
     * @param body
     * @throws CMIMDSeederFault
     */
    @WebMethod(operationName = "CM-IMDSeeder", action = "http://ouaf.oracle.com/spl/XAIXapp/xaiserver/CM-IMDSeeder")
    public void cmIMDSeeder(
        @WebParam(name = "CM-IMDSeeder", targetNamespace = "http://oracle.com/CM-IMDSeeder.xsd", mode = WebParam.Mode.INOUT, partName = "body")
        Holder<CMIMDSeeder> body)
        throws CMIMDSeederFault
    ;

}