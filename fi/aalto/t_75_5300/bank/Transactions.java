
package fi.aalto.t_75_5300.bank;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Transactions", targetNamespace = "http://aalto.fi/t-75.5300/bank")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Transactions {


    /**
     * 
     * @param arg0
     * @return
     *     returns fi.aalto.t_75_5300.bank.TransactionResult
     * @throws TransactionException_Exception
     */
    @WebMethod
    @WebResult(name = "result", targetNamespace = "")
    @RequestWrapper(localName = "makeVisaTransaction", targetNamespace = "http://aalto.fi/t-75.5300/bank", className = "fi.aalto.t_75_5300.bank.MakeVisaTransaction")
    @ResponseWrapper(localName = "makeVisaTransactionResponse", targetNamespace = "http://aalto.fi/t-75.5300/bank", className = "fi.aalto.t_75_5300.bank.MakeVisaTransactionResponse")
    public TransactionResult makeVisaTransaction(
        @WebParam(name = "arg0", targetNamespace = "")
        VisaTransaction arg0)
        throws TransactionException_Exception
    ;

}
