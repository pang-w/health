package com.dachen.commons.net;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;

import com.dachen.sdk.utils.HttpClient;
import com.dachen.util.ReqUtil;

public class HttpHelper {

	/**
	 * 发起post请求
	 * 
	 * @param url
	 * @param paramMap
	 * @throws IOException
	 */
	public static String post(String url, Map<String, String> paramMap) {
		List<NameValuePair> formparams = new ArrayList<NameValuePair>();
		for (Map.Entry<String, String> entry : paramMap.entrySet()) {
			formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		return post(url, formparams);
	}

	public static String post(String url, List<NameValuePair> formparams) {
		HttpPost httpPost = null;
		String respContent = null;
		try {
			HttpClient httpClient = HttpClient.getHttpClient(null);
			httpPost = new HttpPost(url);
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, "UTF-8");
			httpPost.setEntity(entity);
			httpPost.setConfig(httpClient.getRequestConfig());
			respContent = httpClient.execute(httpPost);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (httpPost != null) {
				httpPost.abort();
			}
		}
		return respContent;
	}

	/**
	 * 发起get请求
	 * 
	 * @param url
	 * @param paramMap
	 * @return
	 */
	public static String get(String url, Map<String, String> paramMap) {
		int i = 0;
		for (Map.Entry<String, String> entry : paramMap.entrySet()) {
			if (i == 0) {
				url = url + "?" + entry.getKey() + "=" + entry.getValue();
			} else {
				url = url + "&" + entry.getKey() + "=" + entry.getValue();
			}
			i++;
		}
		HttpGet httpGet = null;
		try {
			HttpClient httpClient = HttpClient.getHttpClient(null);
			httpGet = new HttpGet(url.toString());
			httpGet.setConfig(httpClient.getRequestConfig());
			String respons = httpClient.execute(httpGet);
			return respons;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (httpGet != null) {
				httpGet.abort();
			}
		}

		return null;
	}

	/**
	 * 发起post请求
	 * 
	 * @param url
	 * @param paramMap
	 * @throws Exception
	 * @throws IOException
	 */
	public static String postJson(String url, String jsonParam) {
		HttpPost post = null;
		try {
			HttpClient httpClient = HttpClient.getHttpClient(null);
			post = new HttpPost(url);
			post.setConfig(httpClient.getRequestConfig());
			post.setHeader("access-token", ReqUtil.instance.getToken());
			StringEntity reqEntity = new StringEntity(jsonParam, "UTF-8");
			reqEntity.setContentType("application/json");
			post.setEntity(reqEntity);
			String respons = httpClient.execute(post);
			return respons;
		} catch (Exception bizException) {
			bizException.printStackTrace();
		} finally {
			if (post != null) {
				post.abort();
			}
		}
		return null;
	}

}
