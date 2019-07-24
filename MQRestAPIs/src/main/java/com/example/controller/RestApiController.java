package com.example.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import org.w3c.dom.DOMException;
import org.xml.sax.SAXException;

import com.example.MQService.LocalQueues;
import com.example.MQService.MQServices;
import com.example.MQService.PCFLocalQueues;
import com.example.demo.MyBean;
import com.ibm.mq.MQException;
import com.ibm.mq.headers.internal.Header;
import com.ibm.mq.headers.internal.HeaderField;
import com.ibm.mq.headers.internal.HeaderMessages;
import com.ibm.mq.pcf.PCFException;

import javafx.beans.property.SetProperty;

 
@RestController
@RequestMapping("/{connectionString}")
public class RestApiController {
   
    public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
 
    @Autowired
    MQServices mqService; //Service which will do all data retrieval/manipulation work
    @Autowired
    MyBean bean;
    // -------------------Retrieve All Users---------------------------------------------
 
    @RequestMapping(value = "/queue/allLocal", method = RequestMethod.GET)
    public ResponseEntity<List> listLocalQueues( @PathVariable("connectionString") String connString) throws MQException, IOException {
        List users = mqService.listLocalQueues(connString);
        
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        } 
        return new ResponseEntity<List>(users, HttpStatus.OK);
    }
    @RequestMapping(value = "/queue/browseMessages/{qName}", method = RequestMethod.GET)
    ResponseEntity<List<String>> browseMessages(@PathVariable("qName") String queueName, @PathVariable("connectionString") String connString) throws MQException, IOException, JMSException {
        List browsedMsgs = mqService.browseMessages(queueName, connString);
        return new ResponseEntity<List<String>>(browsedMsgs, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/queue/put/{queueName}", method = RequestMethod.PUT)
    public ResponseEntity<?> putMessages(@RequestBody String msg, @PathVariable("connectionString") String connString, @PathVariable("queueName") String queueName) {
        String messages = mqService.putMessage(msg ,connString, queueName);
        return new ResponseEntity<String>(messages, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/queue/put/{queueName}/rfh", method = RequestMethod.PUT)
    public ResponseEntity<?> putHeaderMessage(@RequestHeader Map header,@RequestBody String msg, @PathVariable("connectionString") String connString, @PathVariable("queueName") String queueName) throws DOMException, ParserConfigurationException, SAXException, IOException {
        String messages = mqService.putHeaderMessage(header, msg ,connString, queueName);
        return new ResponseEntity<String>(messages, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/queue/properties/{queueName}", method = RequestMethod.GET)
    public ResponseEntity<?> getQProperties(@PathVariable("connectionString") String connString, @PathVariable("queueName") String queueName) throws PCFException, MQException, IOException {
        Map properties = mqService.getQProperties(connString, queueName);
        return new ResponseEntity<Map<String,Object>>(properties, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/queue/local", method = RequestMethod.GET)
    public ResponseEntity<List<LocalQueues>> listLocalQueues2(@PathVariable("connectionString") String connString) throws MQException, IOException {
    	PCFLocalQueues pcfLoc2= new PCFLocalQueues(); 
    	List users = pcfLoc2.getLocalQueues(connString, "normal");
    	HttpHeaders responseHeaders = new HttpHeaders();
    	   responseHeaders.set("Access-Control-Allow-Origin", "*");
    	   
    if (users.isEmpty()) {
    return new ResponseEntity(HttpStatus.NO_CONTENT);
    // You many decide to return HttpStatus.NOT_FOUND
    }
    return new ResponseEntity<List<LocalQueues>>(users,responseHeaders, HttpStatus.OK);
    
    } 
    
    @RequestMapping(value = "/queue/local/system", method = RequestMethod.GET)
    public ResponseEntity<List<LocalQueues>> systemQueues(@PathVariable("connectionString") String connString) throws MQException, IOException {
    	PCFLocalQueues pcfLoc2= new PCFLocalQueues(); 
    	List users = pcfLoc2.getLocalQueues(connString, "system");
    if (users.isEmpty()) {
    return new ResponseEntity(HttpStatus.NO_CONTENT);
    // You many decide to return HttpStatus.NOT_FOUND
    }
    return new ResponseEntity<List<LocalQueues>>(users, HttpStatus.OK);
    } 
   
}

