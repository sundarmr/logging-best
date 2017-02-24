package com.weather;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621107
 * 2017-02-22T22:57:30.059-05:00
 * Generated source version: 3.0.4.redhat-621107
 * 
 */
@WebService(targetNamespace = "http://www.webserviceX.NET/", name = "StockQuoteHttpGet")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface StockQuoteHttpGet {

    /**
     * Get Stock quote for a company Symbol
     */
    @WebMethod(operationName = "GetQuote")
    @WebResult(name = "string", targetNamespace = "http://www.webserviceX.NET/", partName = "Body")
    public java.lang.String getQuote(
        @WebParam(partName = "symbol", name = "symbol", targetNamespace = "http://www.webserviceX.NET/")
        java.lang.String symbol
    );
}
