package org.name.tests;

import org.junit.Test;
import org.name.monaco.*;
import static org.junit.Assert.assertEquals;

public class SimulationTest {
	double aggressiveMean = 9.4324;
	double aggressiveStdDev = 15.675;
	double dummyInvestment = 10;
	double growthRate = 5;
	Double INFLATION = 3.5;
    Double INVESTMENT = 100000.00;
    int SIMULATIONS = 10;
    int ITERATIONS = 10;
   
	@Test
	public void testAggressive() throws Exception{
		CalculateProjectionValue cpv = new CalculateProjectionValue();
		ModernPortfolioSimulator mps = new ModernPortfolioSimulator();
		PortfolioType aggressive = new PortfolioType(INVESTMENT, aggressiveMean, aggressiveStdDev);
	    Simulation results = cpv.iterations(aggressive, SIMULATIONS, ITERATIONS, INFLATION);
  
	        assertEquals(SIMULATIONS, results.getValues().size());

	}
	
	@Test
    public void testPortfolioValue() throws Exception {
        PortfolioType portfolio = new PortfolioType(dummyInvestment, 0, 0);
        CalculateProjectionValue cpv = new CalculateProjectionValue();
        double value = cpv.portfolioValue(portfolio, 0, 0);
        
        //No growth no Risk
        assertEquals(dummyInvestment, value, .000000000000001);
        
        PortfolioType portfolio1 = new PortfolioType(dummyInvestment, 5, 0);
        
        double actualValue = cpv.portfolioValue(portfolio, 0, 1);
        double expectedValue =  dummyInvestment*(1+ growthRate/100);//dummyInvestment * (1+growthRate/100);
        double futureInvestmentValue = expectedValue/Math.pow(1+growthRate/100,  1);
        
        //No Risk
        assertEquals(futureInvestmentValue, actualValue, .000000000000001);
    }
}
