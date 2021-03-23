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

	public void measurePressure() {

	}

	public void generateReport() {

	}

	public void measureHeat() {

	}

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
