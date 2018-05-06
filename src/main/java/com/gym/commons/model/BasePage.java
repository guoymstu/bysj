package com.gym.commons.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasePage <T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int pageNo = 1;// 页码，默认是第一页
	private int recordNo=0;
	private int pageSize =10; // 每页显示的记录数，默认是10
	private int totalRecord;// 总记录数
	private int totalPage;// 总页数
	private String pageUrl;// 请求路径
	private Integer isAjax=0;//
	private  String urlParam;//map string 类型的参数
	Map<String, Object> paramsMap=new HashMap<String, Object>();//传递参数，只用于前台请求的参数，不能是实体对象
	private T t;//后台传递对象参数，不用于向前太传递
	
	private List<T> results;// 对应的当前页记录
	
	
	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
		this.setRecordNo((pageNo-1)*pageSize);
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
		if(pageSize!=0){
			// 在设置总页数的时候计算出对应的总页数
			int totalPage = totalRecord % pageSize == 0 ? totalRecord / pageSize
					: totalRecord / pageSize + 1;
			this.setTotalPage(totalPage);
		}
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getResults() {
		return results;
	}

	public void setResults(List<T> results) {
		this.results = results;
	}



	public String getPageUrl() {
		return pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}
	
	

	public Integer getIsAjax() {
		return isAjax;
	}

	public void setIsAjax(Integer isAjax) {
		this.isAjax = isAjax;
	}

	public int getRecordNo() {
		return recordNo;
	}

	public void setRecordNo(int recordNo) {
		this.recordNo = recordNo;
	}

	/**
	 * 设置请求参数
	 * @param key
	 * @param value
	 */
   public void putParam(String key,Object value)
   {	
	   this.paramsMap.put(key, value);		   
   }
   
   /**
    * 获得请求参数
    * @param key
    * @return
    */
   public Object getParam(Object key)
   {
	   return this.paramsMap.get(key);
   }
	
	
	public String getUrlParam() {
		return urlParam;
	}

	/**
	 * url参数
	 * @param urlParam
	 */
	public void setUrlParam(Map<String,Object> urlParam) {
		String urlStr="";
		for(String key:urlParam.keySet())
		{
			Object obj=urlParam.get(key);
			if(obj!=null)
			urlStr=urlStr+"&"+key+"="+obj;
			
		}
		this.urlParam = urlStr.substring(urlStr.indexOf("&")+1);
		System.out.println("#########请求参数"+this.urlParam);
	}

	/**
	 * 只用于页面参数
	 * @return
	 */
	public Map<String, Object> getParamsMap() {
		return paramsMap;
	}

	/**
	 * 只用于页面参数，不能是对象因为要加到url中
	 * @param paramsMap
	 */
	public void setParamsMap(Map<String, Object> paramsMap) {
		this.paramsMap = paramsMap;
		this.setUrlParam(paramsMap);
	}


	/**
	 * 用于后台传递对象参数
	 * @return
	 */
	public T getT() {
		return t;
	}

	/**
	 * 后台传递对象参数
	 * @param t
	 */
	public void setT(T t) {
		this.t = t;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Page [pageNo=").append(pageNo).append(", pageSize=")
				.append(pageSize).append(", results=").append(results)
				.append(", totalPage=").append(totalPage)
				.append(", totalRecord=").append(totalRecord).append("]");
		return builder.toString();
	}
}
