package com.ksn.leo.web.vo.stock;

import java.io.Serializable;

/**
 * 主要财务指标
 * @author feng
 * @date 2016年8月2日
 */
public class FinanceMainIndexVo implements Serializable{

	private static final long serialVersionUID = 1161882415839100973L;
	
	/**
	 * 报告日期
	 */
	private String reportdate;
	
	/**
	 * 基本每股收益
	 */
	private double basiceps;
	
	/**
	 * 每股净资产
	 */
	private double naps;
	
	/**
	 * 每股现金流
	 */
	private double opercashpershare;
	
	/**
	 * 净资产增长率
	 */
	private double netassgrowrate;
	
	/**
	 * 净资产收益率（加权）
	 */
	private double weightedroe;
	
	/**
	 * 主营业务收入增长率
	 */
	private double mainbusincgrowrate;
	
	/**
	 * 净利润增长率
	 */
	private double netincgrowrate;
	
	/**
	 * 总资产增长率
	 */
	private double totassgrowrate;
	
	/**
	 * 销售毛利率
	 */
	private double salegrossprofitrto;
	
	/**
	 * 主营业务收入
	 */
	private double mainbusiincome;
	
	/**
	 * 主营业务利润
	 */
	private double mainbusiprofit;
	
	/**
	 * 利润总额
	 */
	private double totprofit;
	
	/**
	 * 净利润
	 */
	private double netprofit;
	
	/**
	 * 资产总额
	 */
	private double totalassets;
	
	/**
	 * 负债总额
	 */
	private double totalliab;
	
	/**
	 * 股东合计权益（净资产）
	 */
	private double totsharequi;
	
	/**
	 * 经营活动产生的现金流量净额
	 */
	private double operrevenue;
	
	/**
	 * 投资活动产生的现金流量净额
	 */
	private double invnetcashflow;
	
	/**
	 * 筹资活动产生的现金流量净额
	 */
	private double finnetcflow;
	
	/**
	 * 汇率变动对现金及现金等价物的影响
	 */
	private double chgexchgchgs;
	
	/**
	 * 现金及现金等价物净增加额
	 */
	private double cashnetr;
	
	/**
	 * 期末现金及现金等价物余额
	 */
	private double cashequfinbal;

	public String getReportdate() {
		return reportdate;
	}

	public void setReportdate(String reportdate) {
		this.reportdate = reportdate;
	}

	public double getBasiceps() {
		return basiceps;
	}

	public void setBasiceps(double basiceps) {
		this.basiceps = basiceps;
	}

	public double getNaps() {
		return naps;
	}

	public void setNaps(double naps) {
		this.naps = naps;
	}

	public double getOpercashpershare() {
		return opercashpershare;
	}

	public void setOpercashpershare(double opercashpershare) {
		this.opercashpershare = opercashpershare;
	}

	public double getNetassgrowrate() {
		return netassgrowrate;
	}

	public void setNetassgrowrate(double netassgrowrate) {
		this.netassgrowrate = netassgrowrate;
	}

	public double getWeightedroe() {
		return weightedroe;
	}

	public void setWeightedroe(double weightedroe) {
		this.weightedroe = weightedroe;
	}

	public double getMainbusincgrowrate() {
		return mainbusincgrowrate;
	}

	public void setMainbusincgrowrate(double mainbusincgrowrate) {
		this.mainbusincgrowrate = mainbusincgrowrate;
	}

	public double getNetincgrowrate() {
		return netincgrowrate;
	}

	public void setNetincgrowrate(double netincgrowrate) {
		this.netincgrowrate = netincgrowrate;
	}

	public double getTotassgrowrate() {
		return totassgrowrate;
	}

	public void setTotassgrowrate(double totassgrowrate) {
		this.totassgrowrate = totassgrowrate;
	}

	public double getSalegrossprofitrto() {
		return salegrossprofitrto;
	}

	public void setSalegrossprofitrto(double salegrossprofitrto) {
		this.salegrossprofitrto = salegrossprofitrto;
	}

	public double getMainbusiincome() {
		return mainbusiincome;
	}

	public void setMainbusiincome(double mainbusiincome) {
		this.mainbusiincome = mainbusiincome;
	}

	public double getMainbusiprofit() {
		return mainbusiprofit;
	}

	public void setMainbusiprofit(double mainbusiprofit) {
		this.mainbusiprofit = mainbusiprofit;
	}

	public double getTotprofit() {
		return totprofit;
	}

	public void setTotprofit(double totprofit) {
		this.totprofit = totprofit;
	}

	public double getNetprofit() {
		return netprofit;
	}

	public void setNetprofit(double netprofit) {
		this.netprofit = netprofit;
	}

	public double getTotalassets() {
		return totalassets;
	}

	public void setTotalassets(double totalassets) {
		this.totalassets = totalassets;
	}

	public double getTotalliab() {
		return totalliab;
	}

	public void setTotalliab(double totalliab) {
		this.totalliab = totalliab;
	}

	public double getTotsharequi() {
		return totsharequi;
	}

	public void setTotsharequi(double totsharequi) {
		this.totsharequi = totsharequi;
	}

	public double getOperrevenue() {
		return operrevenue;
	}

	public void setOperrevenue(double operrevenue) {
		this.operrevenue = operrevenue;
	}

	public double getInvnetcashflow() {
		return invnetcashflow;
	}

	public void setInvnetcashflow(double invnetcashflow) {
		this.invnetcashflow = invnetcashflow;
	}

	public double getFinnetcflow() {
		return finnetcflow;
	}

	public void setFinnetcflow(double finnetcflow) {
		this.finnetcflow = finnetcflow;
	}

	public double getChgexchgchgs() {
		return chgexchgchgs;
	}

	public void setChgexchgchgs(double chgexchgchgs) {
		this.chgexchgchgs = chgexchgchgs;
	}

	public double getCashnetr() {
		return cashnetr;
	}

	public void setCashnetr(double cashnetr) {
		this.cashnetr = cashnetr;
	}

	public double getCashequfinbal() {
		return cashequfinbal;
	}

	public void setCashequfinbal(double cashequfinbal) {
		this.cashequfinbal = cashequfinbal;
	}

	@Override
	public String toString() {
		return "FinanceMainIndexVo [reportdate=" + reportdate + ", basiceps=" + basiceps + ", naps=" + naps
				+ ", opercashpershare=" + opercashpershare + ", netassgrowrate=" + netassgrowrate + ", weightedroe="
				+ weightedroe + ", mainbusincgrowrate=" + mainbusincgrowrate + ", netincgrowrate=" + netincgrowrate
				+ ", totassgrowrate=" + totassgrowrate + ", salegrossprofitrto=" + salegrossprofitrto
				+ ", mainbusiincome=" + mainbusiincome + ", mainbusiprofit=" + mainbusiprofit + ", totprofit="
				+ totprofit + ", netprofit=" + netprofit + ", totalassets=" + totalassets + ", totalliab=" + totalliab
				+ ", totsharequi=" + totsharequi + ", operrevenue=" + operrevenue + ", invnetcashflow=" + invnetcashflow
				+ ", finnetcflow=" + finnetcflow + ", chgexchgchgs=" + chgexchgchgs + ", cashnetr=" + cashnetr
				+ ", cashequfinbal=" + cashequfinbal + "]";
	}

}
