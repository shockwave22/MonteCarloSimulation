/**
 * 
 */
package org.name.monaco;

import java.util.List;

/**
 * @author monish
 * Simulation List of Median, 10th Percentile and 90th Percentile
 */
public class Simulation {
	List<Double> values;
	
	public Simulation(List<Double> values){
		this.values = values;
	}
	
	public List<Double> getValues() {
        return values;
    }
	
	public Double getMedian(){
		return values.get(values.size()/2);
	}
	
	public Double get10thPercentileValue() {
		return values.get(values.size()/10); // 10% Worst case
	}
	
	public Double get90thPercentileValue(){
		return values.get(values.size()/10*9);  //10% Best case
	}
	
	@Override
	public String toString(){
		return "Median:    "+getMedian()+"\nBest 10%:  "+get90thPercentileValue()+"\nWorst 10%: "+ get10thPercentileValue();
	}
}
