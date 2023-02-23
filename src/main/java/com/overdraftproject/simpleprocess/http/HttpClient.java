package com.overdraftproject.simpleprocess.http;

import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

public class HttpClient{
    public HttpClient(){

    }

    public CloseableHttpClient getHttpClient(){
        CredentialsProvider provider = new BasicCredentialsProvider();
        CloseableHttpClient httpclient = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
        return httpclient;
    }
}
