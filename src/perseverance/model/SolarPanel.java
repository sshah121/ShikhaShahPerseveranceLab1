/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class SolarPanel implements SelfCheckCapable {

	private Integer size;

	private String watt;

	//gets the power generated in watts
	public String getPower() {
		return null;
	}
//gets the energy consumed by the devices and instruments in rover
	public String energyConsumed() {
		return null;
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
