package org.name.monaco;

/**
 * @author monish
 *
 */

public class PortfolioType {
	private double mean;
	private double stdDev;
	private double investment;
	
	public PortfolioType(double investment, double mean, double stdDev){
		this.investment = investment;
		this.mean = mean;
		this.stdDev = stdDev;
	}
	
	public double getInvesttment(){
		return investment;
	}
	
	public double getMean(){
		return mean;
	}
	
	public double getStandardDeviation(){
		return stdDev;
	}

}
