/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Sensor implements SelfCheckCapable {

	private String filter;

	private String intensity;

	private String weatherInstruments;
//measures atmospheric pressure
	public void measurePressure() {

	}
//Generates reports of the instruments usage and failure if any
	public void generateReport() {

	}
//measures the heat and temperature for thermal stability
	public void measureHeat() {

	}
//identify obstacles before damage
	public void identifyObstacle() {

	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
