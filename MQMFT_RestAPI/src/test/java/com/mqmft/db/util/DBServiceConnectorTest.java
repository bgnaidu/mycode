package com.mqmft.db.util;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.http.HttpEntity;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.client.RestTemplate;

import com.mqmft.rest.controller.DBAPIController;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ DBServiceConnector.class, RestTemplate.class })
@PowerMockIgnore("javax.management.*")
public class DBServiceConnectorTest {

	@Mock
	RestTemplate resttemplate;
	@InjectMocks
	DBServiceConnector connector;
    
	MonitorStatus monitorobject;
	InsertHost hostobject;
	InsertQMs object;
	HttpEntity<Object> httpEntity;

	@Before
	public void setUp() {
		ReflectionTestUtils.setField(connector, "http", "http");
		ReflectionTestUtils.setField(connector, "dbHost", "1.0.0.0");
		ReflectionTestUtils.setField(connector, "dbPort", "2000");
		ReflectionTestUtils.setField(connector, "dbAPI", "api");
	}

	@Test
	public void getQueueManagerstest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito
				.when(resttemplate.getForObject(DBTestConstants.url+DBTestConstants.getQMs, String.class))
				.thenReturn("queumanagerslist");
		connector.getQueueManagers();
		assertTrue(true);

	}

	@Test
	public void deleteQueueManagerstest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate
				.getForObject(DBTestConstants.url+DBTestConstants.delQMs+"/?QM_ID=12345", String.class))
				.thenReturn("queumanagerslist");
		connector.deleteQueueManagers("12345");
		assertTrue(true);

	}

	@Test
	public void insertQueueManagerstest() throws Exception {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.optJSONObject("OK");
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate.postForObject(DBTestConstants.url+DBTestConstants.insertQMs,
				httpEntity, JSONObject.class)).thenReturn(jo);
		connector.insertQueueManagers(object);
		assertTrue(true);

	}

	@Test
	public void updateQueueManagerstest() throws Exception {
		String ur = DBTestConstants.url+DBTestConstants.updateQMs;
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.doNothing().when(resttemplate).put("http1.0.0.0:2000/api/mft/dbServices/updateQueueManager",
				httpEntity, String.class);
		connector.updateQueueManagers(object);
		assertTrue(true);

	}

	@Test
	public void updateQueueManagersExceptiontest() throws Exception {

		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.doThrow(new IOException()).when(resttemplate)
				.put(DBTestConstants.url+DBTestConstants.updateQMs, httpEntity, String.class);
		connector.updateQueueManagers(object);
		assertTrue(true);

	}// doThrow(new
		// Exception()).when(resttemplate).put("http1.0.0.0:2000/api/mft/dbServices/updateQueueManager",
		// httpEntity, String.class); getHosts
	@Test
	public void getHoststest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito
				.when(resttemplate.getForObject(DBTestConstants.url+DBTestConstants.getHosts, String.class))
				.thenReturn("hostslist");
		connector.getHosts();
		assertTrue(true);

	}
	@Test
	public void deleteHoststest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate
				.getForObject(DBTestConstants.url+DBTestConstants.delHosts+"/?Host_id==12345", String.class))
				.thenReturn("Hostslist");
		connector.deleteHosts("12345");
		assertTrue(true);

	}
	
	@Test
	public void insertHosttest() throws Exception {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.optJSONObject("OK");
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate.postForObject(DBTestConstants.url+DBTestConstants.insertHosts,
				httpEntity, JSONObject.class)).thenReturn(jo);
		connector.insertHost(hostobject);
		assertTrue(true);

	}
	
	@Test
	public void updateHosttest() throws Exception {
		
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.doNothing().when(resttemplate).put(DBTestConstants.url+DBTestConstants.updateHosts,
				httpEntity, String.class);
		connector.updateHosts(hostobject);
		assertTrue(true);

	}
	
	@Test
	public void updateHostexceptiontest() throws Exception {
		
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
//		PowerMockito.doNothing().when(resttemplate).put("http1.0.0.0:2000/api/mft/dbServices/updateHosts",
//				httpEntity, String.class);
		PowerMockito.doThrow(new IOException()).when(resttemplate)
		.put(DBTestConstants.url+DBTestConstants.updateHosts, httpEntity, String.class);
		connector.updateHosts(hostobject);
		assertTrue(true);

	}
	//
	
	@Test
	public void getAllJobNamestest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito
				.when(resttemplate.getForObject(DBTestConstants.url+DBTestConstants.getAllJOBNames, String.class))
				.thenReturn("samplejob");
		connector.getAllJobNames();
		assertTrue(true);

	}
	
	//getTransferLogs
	@Test
	public void getTransferLogstest() throws Exception {
		String startTime="timestarted";
		String endtime="timeended";
		String jobName="samplejob";
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito
				.when(resttemplate.getForObject(DBTestConstants.url+DBTestConstants.getTransferLogs+"/"+startTime+"/"+endtime+"/"+jobName, String.class))
				.thenReturn("Sampletransforlogs");
		connector.getTransferLogs(startTime, endtime, jobName);
		assertTrue(true);
		
	}
	//getTransferValues
	@Test
	public void getTransferValuestest() throws Exception {
		String ID="id";
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito
				.when(resttemplate.getForObject(DBTestConstants.url+DBTestConstants.getTransferLogs+"/"+DBTestConstants.getTransferValues+"/"+ID, String.class))
				.thenReturn("sampletransfervalue");
		connector.getTransferValues(ID);
		assertTrue(true);
		
	}
	//getDeletedMonitorStatus
	
	@Test
	public void getDeletedMonitorStatustest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate
				.getForObject(DBTestConstants.url+DBTestConstants.getDeletedMonitorStatus, String.class))
				.thenReturn("deleted successfully");
		connector.getDeletedMonitorStatus();
		assertTrue(true);

	}
	
	//getMonitors
	
	@Test
	public void getMonitorstest() throws Exception {
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate
				.getForObject(DBTestConstants.url+DBTestConstants.getMonitors, String.class))
				.thenReturn("Samplemonitor");
		connector.getMonitors();
		assertTrue(true);

	}
	
	@Test
	public void insertDeletedMonitorStatustest() throws Exception {
		JSONObject jo = new JSONObject();

		// putting data to JSONObject
		jo.optJSONObject("OK");
		PowerMockito.whenNew(RestTemplate.class).withAnyArguments().thenReturn(resttemplate);
		PowerMockito.when(resttemplate
				.postForObject(DBTestConstants.url+DBTestConstants.insertDeletedMonitorStatus,httpEntity, JSONObject.class))
				.thenReturn(jo);
		connector.insertDeletedMonitorStatus(monitorobject);
		assertTrue(true);

	}

}
