package org.name.monaco;
/**
 * @author monish
 *
 */
public class ModernPortfolioSimulator {
	static double investment=100000;
	static double aggressiveMean=9.4324;
	static double aggressiveStdDev=15.675;
	static double conservativeMean = 6.189;
	static double conservativeStdDev = 6.3438;
	
	
	public static void main(String[] args) {
			PortfolioType aggressive = new PortfolioType(investment, aggressiveMean, aggressiveStdDev);
			PortfolioType conservative = new PortfolioType(investment,conservativeMean, conservativeStdDev);
			
			CalculateProjectionValue sim = new CalculateProjectionValue();
			
			Simulation aggressiveResult = sim.iterations(aggressive, 10000, 20, 3.5);
			Simulation conservativeResult = sim.iterations(conservative, 10000, 20, 3.5);
			
			System.out.println("Portfolio  *****Aggressive: ***********\n"+"Initial investment: "+ investment+" Return: "+aggressiveMean+" Risk: "+aggressiveStdDev);;
			System.out.println(aggressiveResult);
			System.out.println();
			System.out.println("Portfolio  *****Conservative: ***********\n"+"Initial investment: "+ investment+" Return: "+conservativeMean+" Risk: "+conservativeStdDev);;
			System.out.println(conservativeResult);
			
	}
	
	

}
