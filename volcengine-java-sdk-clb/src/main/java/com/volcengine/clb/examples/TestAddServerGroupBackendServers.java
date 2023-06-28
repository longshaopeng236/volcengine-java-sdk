/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.clb.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.clb.ClbApi;
import com.volcengine.clb.model.*;
import java.util.*;


public class TestAddServerGroupBackendServers {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        ClbApi api = new ClbApi(apiClient);
        
        ServerForAddServerGroupBackendServersInput reqServers0 = new ServerForAddServerGroupBackendServersInput();
        reqServers0.setDescription("ecs1");
        reqServers0.setInstanceId("i-3tkuehz8oa3vj0wz****");
        reqServers0.setIp("192.XX.XX.2");
        reqServers0.setPort(1);
        reqServers0.setType("ecs");
        reqServers0.setWeight(100);
        
        AddServerGroupBackendServersRequest addServerGroupBackendServersRequest = new AddServerGroupBackendServersRequest();
        addServerGroupBackendServersRequest.setServerGroupId("rsp-bp1o94dp5i6ea****");
        addServerGroupBackendServersRequest.setServers(Arrays.asList(reqServers0));
        
        try {
            AddServerGroupBackendServersResponse response = api.addServerGroupBackendServers(addServerGroupBackendServersRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}