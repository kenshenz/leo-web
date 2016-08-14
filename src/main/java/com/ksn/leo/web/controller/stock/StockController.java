package com.ksn.leo.web.controller.stock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ksn.core.annonation.LoggerAnnotation;
import com.ksn.core.utils.DateTimeUtils;
import com.ksn.core.utils.NumberUtils;
import com.ksn.leo.web.controller.BaseController;
import com.ksn.leo.web.service.stock.StockService;
import com.ksn.leo.web.vo.stock.FinanceMainIndexVo;
import com.ksn.leo.web.vo.stock.FinanceQuarterIndexVo;
import com.ksn.leo.web.vo.stock.QuoteVo;
import com.ksn.leo.web.vo.stock.StockVo;

@Controller
@RequestMapping("/uc/stock")
public class StockController extends BaseController {
	@Autowired
	private StockService stockService;

	@RequestMapping(path = "/stockList.htm", method = RequestMethod.GET)
	@LoggerAnnotation(desc = "股票首页")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("/stock/stockList");
		
		DateTime d1 = new DateTime(new Date()).minusYears(1);
		DateTime d2 = d1.minusYears(1);
		DateTime d3 = d2.minusYears(1);
		DateTime d4 = d3.minusYears(1);
		DateTime d5 = d4.minusYears(1);
		DateTime d6 = d5.minusYears(1);
		String date_pre1 = DateTimeUtils.date2string(d1.toDate(), "yy");
		String date_pre2 = DateTimeUtils.date2string(d2.toDate(), "yy");
		String date_pre3 = DateTimeUtils.date2string(d3.toDate(), "yy");
		String date_pre4 = DateTimeUtils.date2string(d4.toDate(), "yy");
		String date_pre5 = DateTimeUtils.date2string(d5.toDate(), "yy");
		String date_pre6 = DateTimeUtils.date2string(d6.toDate(), "yy");
		
		mav.addObject("date_pre1", date_pre1);
		mav.addObject("date_pre2", date_pre2);
		mav.addObject("date_pre3", date_pre3);
		mav.addObject("date_pre4", date_pre4);
		mav.addObject("date_pre5", date_pre5);
		mav.addObject("date_pre6", date_pre6);
		
		return mav;
	}
	
	@RequestMapping(path = "/getStockList.json")
	@ResponseBody
	@LoggerAnnotation(desc = "获取股票数据")
	public List<StockVo> getStockList() {
		return this.getStockVoList("SH600104", "SH601238", "SH601939", "SH600000", "SH600887", "SZ000651", "SZ000333", "SZ300070",
				"SZ000826", "SZ000999", "SZ000777", "SZ002358", "SZ002701", "SH600519", "SZ000858", "SZ000568", "SZ002304", "SH601628", "SH601318",
				"SH601601", "SH601336");
	}
	
	public List<StockVo> getStockVoList(String... stockCodes) {
		List<StockVo> list = new ArrayList<StockVo>();
		stockService.login();
		
		DateTime d1 = new DateTime(new Date()).minusYears(1);
		DateTime d2 = d1.minusYears(1);
		DateTime d3 = d2.minusYears(1);
		DateTime d4 = d3.minusYears(1);
		DateTime d5 = d4.minusYears(1);
		DateTime d6 = d5.minusYears(1);
		String date_pre1 = DateTimeUtils.date2string(d1.toDate(), "yyyy1231");
		String date_pre2 = DateTimeUtils.date2string(d2.toDate(), "yyyy1231");
		String date_pre3 = DateTimeUtils.date2string(d3.toDate(), "yyyy1231");
		String date_pre4 = DateTimeUtils.date2string(d4.toDate(), "yyyy1231");
		String date_pre5 = DateTimeUtils.date2string(d5.toDate(), "yyyy1231");
		String date_pre6 = DateTimeUtils.date2string(d6.toDate(), "yyyy1231");
		for (String stockCode : stockCodes) {
			QuoteVo quoteVo = stockService.getQuote(stockCode);
			if (quoteVo.getCurrent() == 0) continue;
			List<FinanceMainIndexVo> financeMainIndexList = stockService.getFinanceMainIndex(stockCode);
			List<FinanceQuarterIndexVo> financeQuarterIndexList = stockService.getFinanceQuarterIndex(stockCode);
			FinanceMainIndexVo mainIndex_pre1 = null, mainIndex_pre2 = null, mainIndex_pre3 = null,
					mainIndex_pre4 = null, mainIndex_pre5 = null, mainIndex_pre6 = null;
			FinanceQuarterIndexVo quarterIndex_pre1 = null, quarterIndex_pre2 = null, quarterIndex_pre3 = null,
					quarterIndex_pre4 = null;
			for (FinanceMainIndexVo vo : financeMainIndexList) {
				if (date_pre1.equals(vo.getReportdate())) {
					mainIndex_pre1 = vo;
				} else if (date_pre2.equals(vo.getReportdate())) {
					mainIndex_pre2 = vo;
				} else if (date_pre3.equals(vo.getReportdate())) {
					mainIndex_pre3 = vo;
				} else if (date_pre4.equals(vo.getReportdate())) {
					mainIndex_pre4 = vo;
				} else if (date_pre5.equals(vo.getReportdate())) {
					mainIndex_pre5 = vo;
				} else if (date_pre6.equals(vo.getReportdate())) {
					mainIndex_pre6 = vo;
				}
			}
			quarterIndex_pre1 = financeQuarterIndexList.get(0);
			quarterIndex_pre2 = financeQuarterIndexList.get(1);
			quarterIndex_pre3 = financeQuarterIndexList.get(2);
			quarterIndex_pre4 = financeQuarterIndexList.get(3);
			double eps = NumberUtils.sum(quarterIndex_pre1.getEpsdiluted(), quarterIndex_pre2.getEpsdiluted(),
					quarterIndex_pre3.getEpsdiluted(), quarterIndex_pre4.getEpsdiluted());

			StockVo stockVo = new StockVo();
			stockVo.setStockName(quoteVo.getName());
			stockVo.setCurrent(NumberUtils.scale(quoteVo.getCurrent()));
			stockVo.setTotalShares(NumberUtils.scale(quoteVo.getTotalShares() / NumberUtils.HUNDRED_MILLION));
			stockVo.setMarketCapital(NumberUtils.scale(quoteVo.getMarketCapital() / NumberUtils.HUNDRED_MILLION));
//			stockVo.setEps(NumberUtils.scale(quoteVo.getEps()));
			stockVo.setEps(NumberUtils.scale(eps));
//			stockVo.setEpsRate(NumberUtils.scale(quoteVo.getEps() / quoteVo.getCurrent(), 4));
			stockVo.setEpsRate(NumberUtils.scale(eps / quoteVo.getCurrent(), 4));
			stockVo.setPeTTM(NumberUtils.scale(quoteVo.getPe_ttm()));
			stockVo.setDividend(NumberUtils.scale(quoteVo.getDividend()));
			stockVo.setDividendRate(NumberUtils.scale(quoteVo.getDividend() / quoteVo.getCurrent(), 4));
			stockVo.setNetAssets(NumberUtils.scale(quoteVo.getNet_assets()));
			stockVo.setNetAssetsRate(NumberUtils.scale(quoteVo.getEps() / quoteVo.getNet_assets(), 4));
			stockVo.setPb(NumberUtils.scale(quoteVo.getPb()));
			stockVo.setNetprofit_pre1(NumberUtils.scale(mainIndex_pre1.getNetprofit() / NumberUtils.HUNDRED_MILLION));
			stockVo.setNetprofit_pre2(NumberUtils.scale(mainIndex_pre2.getNetprofit() / NumberUtils.HUNDRED_MILLION));
			stockVo.setNetprofit_pre3(NumberUtils.scale(mainIndex_pre3.getNetprofit() / NumberUtils.HUNDRED_MILLION));
			stockVo.setNetprofit_pre4(NumberUtils.scale(mainIndex_pre4.getNetprofit() / NumberUtils.HUNDRED_MILLION));
			stockVo.setNetprofit_pre5(NumberUtils.scale(mainIndex_pre5.getNetprofit() / NumberUtils.HUNDRED_MILLION));
			stockVo.setNetprofit_pre6(NumberUtils.scale(mainIndex_pre6.getNetprofit() / NumberUtils.HUNDRED_MILLION));
			stockVo.setNetprofitRate_1(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getNetprofit() / mainIndex_pre2.getNetprofit(), 1.0 / 1) - 1, 4));
			stockVo.setNetprofitRate_2(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getNetprofit() / mainIndex_pre3.getNetprofit(), 1.0 / 2) - 1, 4));
			stockVo.setNetprofitRate_3(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getNetprofit() / mainIndex_pre4.getNetprofit(), 1.0 / 3) - 1, 4));
			stockVo.setNetprofitRate_4(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getNetprofit() / mainIndex_pre5.getNetprofit(), 1.0 / 4) - 1, 4));
			stockVo.setNetprofitRate_5(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getNetprofit() / mainIndex_pre6.getNetprofit(), 1.0 / 5) - 1, 4));
			stockVo.setTotsharequi_pre1(NumberUtils.scale(mainIndex_pre1.getTotsharequi() / NumberUtils.HUNDRED_MILLION));
			stockVo.setTotsharequi_pre2(NumberUtils.scale(mainIndex_pre2.getTotsharequi() / NumberUtils.HUNDRED_MILLION));
			stockVo.setTotsharequi_pre3(NumberUtils.scale(mainIndex_pre3.getTotsharequi() / NumberUtils.HUNDRED_MILLION));
			stockVo.setTotsharequi_pre4(NumberUtils.scale(mainIndex_pre4.getTotsharequi() / NumberUtils.HUNDRED_MILLION));
			stockVo.setTotsharequi_pre5(NumberUtils.scale(mainIndex_pre5.getTotsharequi() / NumberUtils.HUNDRED_MILLION));
			stockVo.setTotsharequi_pre6(NumberUtils.scale(mainIndex_pre6.getTotsharequi() / NumberUtils.HUNDRED_MILLION));
			stockVo.setTotsharequiRate_1(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getTotsharequi() / mainIndex_pre2.getTotsharequi(), 1.0 / 1) - 1, 4));
			stockVo.setTotsharequiRate_2(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getTotsharequi() / mainIndex_pre3.getTotsharequi(), 1.0 / 2) - 1, 4));
			stockVo.setTotsharequiRate_3(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getTotsharequi() / mainIndex_pre4.getTotsharequi(), 1.0 / 3) - 1, 4));
			stockVo.setTotsharequiRate_4(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getTotsharequi() / mainIndex_pre5.getTotsharequi(), 1.0 / 4) - 1, 4));
			stockVo.setTotsharequiRate_5(NumberUtils
					.scale(Math.pow(mainIndex_pre1.getTotsharequi() / mainIndex_pre6.getTotsharequi(), 1.0 / 5) - 1, 4));
			stockVo.setPeg(NumberUtils.scale(stockVo.getPeTTM() / stockVo.getNetprofitRate_1() / 100));
			
			list.add(stockVo);
		}
		return list;
	}
}
