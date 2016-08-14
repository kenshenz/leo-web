package com.ksn.leo.web.vo.stock;

import java.io.Serializable;

public class QuoteVo implements Serializable{
	
	private static final long serialVersionUID = 7430010241616712052L;

	/**
	 * 股票代码
	 */
	private String symbol;
	
	/**
	 * 股票名称
	 */
	private String name;
	
	/**
	 * 当前价
	 */
	private double current;
	
	/**
	 * 成交量
	 */
	private double volume;
	
	/**
	 * 总市值
	 */
	private double marketCapital;
	
	/**
	 * 每股收益
	 */
	private double eps;
	
	/**
	 * 市盈率TTM
	 */
	private double pe_ttm;
	
	/**
	 * 市盈率LYR
	 */
	private double pe_lyr;
	
	/**
	 * 
	 */
	private double beta;
	
	/**
	 * 总股本
	 */
	private double totalShares;
	
	/**
	 * 每股股息
	 */
	private double dividend;
	
	/**
	 * 成交额
	 */
	private double amount;
	
	/**
	 * 每股净资产
	 */
	private double net_assets;
	
	/**
	 * 市净率TTM
	 */
	private double pb;
	
	/**
	 * 流通股本
	 */
	private double float_shares;
	
	/**
	 * 市销率TTM
	 */
	private double psr;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getMarketCapital() {
		return marketCapital;
	}

	public void setMarketCapital(double marketCapital) {
		this.marketCapital = marketCapital;
	}

	public double getEps() {
		return eps;
	}

	public void setEps(double eps) {
		this.eps = eps;
	}

	public double getPe_ttm() {
		return pe_ttm;
	}

	public void setPe_ttm(double pe_ttm) {
		this.pe_ttm = pe_ttm;
	}

	public double getPe_lyr() {
		return pe_lyr;
	}

	public void setPe_lyr(double pe_lyr) {
		this.pe_lyr = pe_lyr;
	}

	public double getBeta() {
		return beta;
	}

	public void setBeta(double beta) {
		this.beta = beta;
	}

	public double getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(double totalShares) {
		this.totalShares = totalShares;
	}

	public double getDividend() {
		return dividend;
	}

	public void setDividend(double dividend) {
		this.dividend = dividend;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getNet_assets() {
		return net_assets;
	}

	public void setNet_assets(double net_assets) {
		this.net_assets = net_assets;
	}

	public double getPb() {
		return pb;
	}

	public void setPb(double pb) {
		this.pb = pb;
	}

	public double getFloat_shares() {
		return float_shares;
	}

	public void setFloat_shares(double float_shares) {
		this.float_shares = float_shares;
	}

	public double getPsr() {
		return psr;
	}

	public void setPsr(double psr) {
		this.psr = psr;
	}

	@Override
	public String toString() {
		return "QuoteVo [symbol=" + symbol + ", name=" + name + ", current=" + current + ", volume=" + volume
				+ ", marketCapital=" + marketCapital + ", eps=" + eps + ", pe_ttm=" + pe_ttm + ", pe_lyr=" + pe_lyr
				+ ", beta=" + beta + ", totalShares=" + totalShares + ", dividend=" + dividend + ", amount=" + amount
				+ ", net_assets=" + net_assets + ", pb=" + pb + ", float_shares=" + float_shares + ", psr=" + psr + "]";
	}
	
}


















