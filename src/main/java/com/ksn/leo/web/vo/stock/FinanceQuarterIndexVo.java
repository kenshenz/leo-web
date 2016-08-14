package com.ksn.leo.web.vo.stock;

import java.io.Serializable;

/**
 * 单季度财务指标
 * @author feng
 * @date 2016年8月2日
 */
public class FinanceQuarterIndexVo implements Serializable {

	private static final long serialVersionUID = 7118906902861708231L;
	
	/**
	 * 报告日期
	 */
	private String reportdate;
	/**
	 * 每股收益（摊薄）
	 */
	private double epsdiluted;
	public String getReportdate() {
		return reportdate;
	}
	public void setReportdate(String reportdate) {
		this.reportdate = reportdate;
	}
	public double getEpsdiluted() {
		return epsdiluted;
	}
	public void setEpsdiluted(double epsdiluted) {
		this.epsdiluted = epsdiluted;
	}
	@Override
	public String toString() {
		return "FinanceQuarterIndexVo [reportdate=" + reportdate + ", epsdiluted=" + epsdiluted + "]";
	}
	
}
