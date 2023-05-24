/**
* Example Code generated by Beijing Volcanoengine Technology.
*/
package com.volcengine.cen.examples;

import com.volcengine.ApiClient;
import com.volcengine.ApiException;
import com.volcengine.sign.Credentials;

import com.volcengine.cen.CenApi;
import com.volcengine.cen.model.*;


public class TestDescribeInstanceGrantedRules {
    public static void main(String[] args) throws Exception {
        String ak = "Your AK";
        String sk = "Your SK";
        String region = "Your Region";

        ApiClient apiClient = new ApiClient()
                .setCredentials(Credentials.getCredentials(ak, sk))
                .setRegion(region);

        CenApi api = new CenApi(apiClient);
        
        DescribeInstanceGrantedRulesRequest describeInstanceGrantedRulesRequest = new DescribeInstanceGrantedRulesRequest();
        describeInstanceGrantedRulesRequest.setInstanceId("vpc-3rlkeggyn6tc010e****");
        describeInstanceGrantedRulesRequest.setInstanceType(DescribeInstanceGrantedRulesRequest.InstanceTypeEnum.valueOf(DescribeInstanceGrantedRulesRequest.InstanceTypeEnum.class, "VPC"));
        
        try {
            DescribeInstanceGrantedRulesResponse response = api.describeInstanceGrantedRules(describeInstanceGrantedRulesRequest);
            System.out.println(response);
        } catch (ApiException e) {
            System.out.println(e.getResponseBody());
        }
    }
}