package com.ksn.leo.web.service.stock;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.ksn.core.utils.HttpUtils;
import com.ksn.leo.web.vo.stock.FinanceMainIndexVo;
import com.ksn.leo.web.vo.stock.FinanceQuarterIndexVo;
import com.ksn.leo.web.vo.stock.QuoteVo;

@Service
public class StockService extends BaseService {
	
	/**
	 * 根据股票代码，获取股票的报价信息
	 * @param stockCode 股票代码，必须带上交易所编码，上证为SH，深证为SZ
	 * @return
	 */
	public QuoteVo getQuote(String stockCode) {
		String uri = "https://xueqiu.com/v4/stock/quote.json?code=" + stockCode;
		try {
			String result = HttpUtils.doGet(uri);
			Gson gson = new Gson();
			Map map = gson.fromJson(result, Map.class);
			for (Object obj : map.values()) {
				JsonElement json = gson.toJsonTree(obj);
				QuoteVo quoteVo = gson.fromJson(json, QuoteVo.class);
				return quoteVo;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 根据股票代码，获取股票的近4个季度财务指标
	 * @param stockCode
	 * @return
	 */
	public List<FinanceQuarterIndexVo> getFinanceQuarterIndex(String stockCode) {
		String uri = "https://xueqiu.com/stock/f10/finqindic.json?symbol=" + stockCode + "&page=1&size=4";
		try {
			String result = HttpUtils.doGet(uri);
			Gson gson = new Gson();
			Map map = gson.fromJson(result, Map.class);
			List<Map> list = (List<Map>) map.get("list");
			JsonElement json = gson.toJsonTree(list);
			List<FinanceQuarterIndexVo> list2 = gson.fromJson(json, new TypeToken<List<FinanceQuarterIndexVo>>(){}.getType());
			return list2;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 根据股票代码，获取股票的主要财务指标
	 * @param stockCode
	 * @return
	 */
	public List<FinanceMainIndexVo> getFinanceMainIndex(String stockCode) {
		String uri = "http://xueqiu.com/stock/f10/finmainindex.json?symbol=" + stockCode + "&page=1&size=100";
		
		try {
			String result = HttpUtils.doGet(uri);
			Gson gson = new Gson();
			Map map = gson.fromJson(result, Map.class);
			List<Map> list = (List<Map>) map.get("list");
			JsonElement json = gson.toJsonTree(list);
			List<FinanceMainIndexVo> list2 = gson.fromJson(json, new TypeToken<List<FinanceMainIndexVo>>(){}.getType());
			return list2;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
