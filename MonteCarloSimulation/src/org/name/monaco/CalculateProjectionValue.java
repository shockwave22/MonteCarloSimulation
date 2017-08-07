package org.name.monaco;

/**
 * @author monish
 *
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class CalculateProjectionValue {
	
	private Random rand = new Random();
	double futureInvestmentValue;
	
	/**
	 * 
	 * @param portfolio
	 * @param inflation
	 * @param timePeriod
	 * @return future value based on 3.5% each year inflation i.e Year 1 value of 103.5 is equivalent to Year 0 value of 100
	 */
	public double portfolioValue(PortfolioType portfolio, double inflation, int timePeriod){
		double investmentValue = portfolio.getInvesttment();
		/* Predict the outcome for future time periods(every year) using pseudo-random uniform variables
		  using the risk(standard deviation) and return(mean). Projecting the portfolio value for 20 years and 10,000 simulations */
		
		if(portfolio != null){
			for(int i=0; i<timePeriod; i++){
				double rate = rand.nextGaussian()* portfolio.getStandardDeviation() + portfolio.getMean();
				investmentValue = investmentValue*(1+ rate/100);
			}
		} else
			throw new NullPointerException("Portfolio is empty");
		
		futureInvestmentValue = investmentValue/Math.pow(1+inflation/100,  timePeriod);
		return futureInvestmentValue;
	}
	/**
	 * Monte Carlo simulation
	 * @param portfolio
	 * @param simulations
	 * @param timePeriod
	 * @param inflation
	 * @return Simulation values with the adjusted inflation rate of 3.5%
	 */
	public Simulation iterations(PortfolioType portfolio, int simulations, int timePeriod, double inflation){
		List<Double> values = new ArrayList<>();
		//Iterate over the simulations to get future value
		IntStream.range(0, simulations).forEach(simulation -> values.add(portfolioValue(portfolio, inflation, timePeriod)));
		
		Collections.sort(values);
		return new Simulation(values);
	}
}
