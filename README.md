# MonteCarloSimulation

Modern Portfolio Theory says that it is not enough to look at the expected risk and return of one particular stock. By investing in more than one stock, an investor can reap the benefits of diversification- chief among them, a reduction in the riskiness of the portfolio. 
A Real Time implementation of Modern Portfolio Theory is to build an optimal asset allocation of domestic stocks & bonds, international stock and bonds, alternatives and cash. Combining the risk & return of each asset class and correlations across them – we come up with the risk and return of the overall portfolio.  Two portfolios were created, one being extremely Conservative and one being Aggressive.

### Problem Statement
We would like to know that if a user with $100,000 invested their money in either of them, how would the returns compare over the next 20 years. We would like to test their performance by using forward-looking Monte Carlo Simulations.

### Assumptions
Assumptions
1.    We would like to use a random number generator to ensure Gaussian distribution of random numbers that are generated.
2.    20th Year future value should be inflation adjusted at the rate of 3.5% each year. Ie. Year 1 value of 103.5 is equivalent to 100 at Year 0.
3.    Description
      10% Best Case               	:   90th Percentile value among the 10,000 simulations
      10% Worst Case            	:  10th Percentile value among the 10,000 simulations.

### What is Monte Carlo Simulation
Monte Carlo Simulation:
This is a statistical technique that uses pseudo-random uniform variables for a given statistical distribution based on past risk (SD) and return (mean) to predict outcomes over future time periods. Based on iterative evaluation of each random future value, we project the portfolio future value over 20 years. We would like to run 10,000 simulations of projecting 20 year value

### Output 
Portfolio  *****Aggressive: ***********
Initial investment: 100000.0 Return: 9.4324 Risk: 15.675
Median:    246986.38612319104
Best 10%:  566779.7515457878
Worst 10%: 104496.8023950241

Portfolio  *****Conservative: ***********
Initial investment: 100000.0 Return: 6.189 Risk: 6.3438
Median:    160944.71546657526
Best 10%:  226774.66439247792
Worst 10%: 114388.5380410525


### References
  https://datashenanigan.wordpress.com/2015/09/23/simulating-backtests-of-stock-returns-using-monte-carlo-and-snowfall-in-parallel/
  
  http://blog.minitab.com/blog/adventures-in-statistics-2/understanding-monte-carlo-simulation-with-an-example
  
  https://www.riskamp.com/files/RiskAMP%20-%20Monte%20Carlo%20Simulation.pdf
  
