/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Light implements SelfCheckCapable	 {

	private String color;

	private String brightness;

	// get how much power is consumed
	public int powerConnsumption() {
		return 0;
	}
//gets the distance of the beam reflected for viewing a distant object
	public long beamDistance() {
		return 1;
	}
//dims the light when less required to save power
	public String dim() {
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
