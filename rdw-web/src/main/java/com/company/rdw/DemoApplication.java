package com.company.rdw;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import nl.webservices.soap.CarRDWCarDataRequestType;
import nl.webservices.soap.CarRDWCarDataResponseType;
import nl.webservices.soap.HeaderLoginType;
import nl.webservices.soap.LoginRequestType;
import nl.webservices.soap.LoginResponseType;
import nl.webservices.soap.WebservicesNlPortType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.ws.WebServiceMessage;
import org.springframework.ws.client.core.WebServiceMessageCallback;
import org.springframework.ws.soap.SoapHeader;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.xml.transform.StringSource;

import com.company.rdw.service.MyAppConfig;
import com.sun.tools.ws.wsdl.document.soap.SOAPHeader;


/**
 * Created by x073880 on 5/5/2017.
 */
@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {
    public  static  void main(String[] args) throws MalformedURLException {
    	
    	/*final String WS_URL = "https://ws1.webservices.nl/soap_doclit";
    	
    	URL url = new URL(WS_URL);
        QName qname = new QName("http://www.webservices.nl/soap/", "Webservices.nl");

        Service service = Service.create(url, qname);
        HeaderHandlerResolver handlerResolver = new HeaderHandlerResolver();
        service.setHandlerResolver(handlerResolver);
        
        WebservicesNlPortType hello = service.getPort(WebservicesNlPortType.class);
        */

    	
        //*******************UserName & Password ******************************//*
        /*Map<String, Object> req_ctx = ((BindingProvider)hello).getRequestContext();
        req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
        
        Map<String, List<String>> headers = new HashMap<String, List<String>>();
        headers.put("Username", Collections.singletonList("solicitant_User"));
        headers.put("Password", Collections.singletonList("a1fefd74c35225f8eab80e2865dec014"));
        req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);*/
        //**********************************************************************//*
        /*HeaderLoginType loginHeader = new HeaderLoginType();
        loginHeader.setUsername("solicitant_User");
        loginHeader.setPassword("a1fefd74c35225f8eab80e2865dec014");
 
        LoginRequestType loginRequestType = new LoginRequestType();
        loginRequestType.setUsername("solicitant_User");
        loginRequestType.setPassword("a1fefd74c35225f8eab80e2865dec014");
        LoginResponseType loginResposneType = hello.login(loginRequestType);*/
        
       /*CarRDWCarDataRequestType carRDWCarDataRequest = new CarRDWCarDataRequestType();
        carRDWCarDataRequest.setLicensePlate("1-SXS-51");
        CarRDWCarDataResponseType carRDWCarDataResponse = hello.carRDWCarData(carRDWCarDataRequest);
        String apkDueDate = carRDWCarDataResponse.getOut().getApkDueDate();*/
        

    	ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		MyAppConfig appConfig = (MyAppConfig) ctx.getBean("myAppConfig");
		System.out.println(appConfig.toString());
        
        SpringApplication.run(DemoApplication.class);
    }
    
    
}
