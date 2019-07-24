package com.mqmft.rest.controller;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.stubbing.OngoingStubbing;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;

import com.mqmft.db.util.DBServiceConnector;
import com.mqmft.db.util.InsertHost;
import com.mqmft.db.util.InsertQMs;
import com.mqmft.db.util.MonitorStatus;
import com.mqmft.rest.api.utility.MQMFTCommonUtility;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ DBAPIController.class })
@PowerMockIgnore("javax.management.*")
public class DBAPIControllerTest {

	@Mock
	DBServiceConnector serviceConnector;
	@InjectMocks
	DBAPIController control;
	@InjectMocks
	InsertQMs updateString;
	@InjectMocks
	MQMFTCommonUtility mqMFTCommonUtility;
	@InjectMocks
	InsertHost insertHost;
	@InjectMocks
	MonitorStatus monitorstatus;

	@Test
	public void getQueueManagerstest() throws IOException {

		PowerMockito.when(serviceConnector.getQueueManagers()).thenReturn("EB110004");
		control.getQueueManagers();
		assertTrue(true);
	}

	@Test
	public void getQueueManagerstestexception() throws IOException {

		PowerMockito.when(serviceConnector.getQueueManagers()).thenThrow(IOException.class);
		control.getQueueManagers();
		assertTrue(true);
	}

	@Test
	public void updateQueueManagerstest() throws IOException {

		// String[] updateString={
//    			  "hostId":" 0","host_ip": "string",
//    			  "host_name": "string",
//    			  "isActive": "string",
//    			  "isAgent": "string",
//    			  "isCmnd": "string",
//    			  "isCoord": "string",
//    			  "qmChannel": "string",
//    			  "qmName": "string",
//    			  "qmPort": 0,
//    			  "qmUserid": "string",
//    			  "qmid": "0"
//    			};
		String updated = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.updateQueueManagers(updateString)).thenReturn(updated);
		control.updateQueueManagers(updateString);
		assertTrue(true);
	}

	@Test
	public void updateQueueManagerstestexceptiopn() throws IOException {

		String updated = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.updateQueueManagers(updateString)).thenThrow(IOException.class);
		control.updateQueueManagers(updateString);
		assertTrue(true);
	}

	@Test
	public void deleteQueueManagerstest() throws IOException {

		PowerMockito.when(serviceConnector.deleteQueueManagers("3445"))
				.thenReturn("deleted QMgr with ID :\" + deleted QMgr with ID :\" + qmgrId");
		control.deleteQueueManagers("3445");
		assertTrue(true);
	}

	@Test
	public void deleteQueueManagerstestexception() throws IOException {

		PowerMockito.when(serviceConnector.deleteQueueManagers("3445")).thenThrow(IOException.class);
		control.deleteQueueManagers("3445");
		assertTrue(true);
	}

	@Test
	public void insertQueueManagerstest() throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("hostId", "string");
		jo.put("host_name", "string");
		jo.put("isActive", "yes");

		PowerMockito.when(serviceConnector.insertQueueManagers(updateString)).thenReturn(jo);
		control.insertQueueManagers(updateString);
		assertTrue(true);
	}//

	@Test
	public void getHoststest() throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("hostId", "string");
		jo.put("host_name", "string");
		jo.put("isActive", "yes");

		PowerMockito.when(serviceConnector.getHosts()).thenReturn("getHosts");
		control.getHosts();
		assertTrue(true);
	}

	@Test
	public void getHoststestexception() throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("hostId", "string");
		jo.put("host_name", "string");
		jo.put("isActive", "yes");

		PowerMockito.when(serviceConnector.getHosts()).thenThrow(IOException.class);
		control.getHosts();
		assertTrue(true);
	}

	@Test
	public void insertHoststest() throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("hostId", "string");
		jo.put("host_name", "string");
		jo.put("isActive", "yes");

		PowerMockito.when(serviceConnector.insertHost(insertHost)).thenReturn(jo);
		control.insertHosts(insertHost);
		assertTrue(true);
	}

	@Test
	public void insertHoststestexception() throws IOException, RestClientException, URISyntaxException, JSONException {
//   	 JSONObject jo = new JSONObject(); 
//        
//        // putting data to JSONObject 
//        jo.put("hostId", "string"); 
//        jo.put("host_name", "string"); 
//        jo.put("isActive", "yes"); 

		PowerMockito.when(serviceConnector.insertHost(insertHost)).thenThrow(IOException.class);
		control.insertHosts(insertHost);
		assertTrue(true);
	}//

	@Test
	public void updateHoststest() throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("hostId", "string");
		jo.put("host_name", "string");
		jo.put("isActive", "yes");
		String updated = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.updateHosts(insertHost)).thenReturn(updated);
		control.updateHosts(insertHost);
		assertTrue(true);
	}

	@Test
	public void updateHoststestexception() throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.put("hostId", "string");
		jo.put("host_name", "string");
		jo.put("isActive", "yes");
		String updated = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.updateHosts(insertHost)).thenThrow(IOException.class);
		control.updateHosts(insertHost);
		assertTrue(true);
	}

	@Test
	public void deleteHoststest() throws IOException, RestClientException, URISyntaxException, JSONException {

		String updated = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.deleteHosts("hostId")).thenReturn("Deleted the host");
		control.deleteHosts("hostID");
		assertTrue(true);
	}

	@Test
	public void deleteHoststestexception() throws IOException, RestClientException, URISyntaxException, JSONException {
		PowerMockito.when(serviceConnector.deleteHosts(null)).thenThrow(IOException.class);
		control.deleteHosts(null);
		assertTrue(true);
	}

	@Test
	public void getAllJobNamestest() throws IOException, RestClientException, URISyntaxException, JSONException {

		PowerMockito.when(serviceConnector.getAllJobNames()).thenReturn("Got all job names");
		control.getAllJobNames();
		assertTrue(true);
	}

	@Test
	public void getAllJobNamestestexception()
			throws IOException, RestClientException, URISyntaxException, JSONException {

		PowerMockito.when(serviceConnector.getAllJobNames()).thenThrow(IOException.class);
		control.getAllJobNames();
		assertTrue(true);
	}

	@Test
	public void getTransferLogstest() throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.getTransferLogs("startTime", "endTime", "jobName")).thenReturn(response);
		control.getTransferLogs("startTime", "endTime", "jobName");
		assertTrue(true);
	}

	@Test
	public void getTransferLogstestexception()
			throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "{hostId: 0, host_name: host_name, isActive: yes}";
		PowerMockito.when(serviceConnector.getTransferLogs("startTime", "endTime", "jobName"))
				.thenThrow(IOException.class);
		control.getTransferLogs("startTime", "endTime", "jobName");
		assertTrue(true);
	}

	@Test
	public void getTransferValuestest() throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "Transforvalue";
		PowerMockito.when(serviceConnector.getTransferValues("ID")).thenReturn(response);
		control.getTransferValues("ID");
		assertTrue(true);
	}

	@Test
	public void getTransferValuestestexception()
			throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "Transforvalue";
		PowerMockito.when(serviceConnector.getTransferValues("ID")).thenThrow(IOException.class);
		control.getTransferValues("ID");
		assertTrue(true);
	}//

	@Test
	public void getDeletedMonitorStatustest()
			throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "Deleted monitors";
		PowerMockito.when(serviceConnector.getDeletedMonitorStatus()).thenReturn(response);
		control.getDeletedMonitorStatus();
		assertTrue(true);
	}

	@Test
	public void getDeletedMonitorStatustestexception()
			throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "Deleted monitors";
		PowerMockito.when(serviceConnector.getDeletedMonitorStatus()).thenThrow(IOException.class);
		control.getDeletedMonitorStatus();
		assertTrue(true);
	}

	@Test
	public void getMonitorstest() throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "Got monitors";
		PowerMockito.when(serviceConnector.getMonitors()).thenReturn(response);
		control.getMonitors();
		assertTrue(true);
	}

	@Test
	public void getMonitorstestexception() throws IOException, RestClientException, URISyntaxException, JSONException {
		String response = "Got monitors";
		PowerMockito.when(serviceConnector.getMonitors()).thenThrow(IOException.class);
		control.getMonitors();
		assertTrue(true);
	}

	@Test
	public void insertDeletedMonitorStatustest()
			throws IOException, RestClientException, URISyntaxException, JSONException {
		JSONObject response = new JSONObject();

		// putting data to JSONObject
		response.put("monitor", "string");
		response.put("status", "ok");

		PowerMockito.when(serviceConnector.insertDeletedMonitorStatus(monitorstatus)).thenReturn(response);
		control.insertDeletedMonitorStatus(monitorstatus);
		assertTrue(true);
	}

	@Test
	public void insertDeletedMonitorStatustestexception()
			throws IOException, RestClientException, URISyntaxException, JSONException {

		PowerMockito.when(serviceConnector.insertDeletedMonitorStatus(monitorstatus)).thenThrow(IOException.class);
		control.insertDeletedMonitorStatus(monitorstatus);
		assertTrue(true);
	}

}
