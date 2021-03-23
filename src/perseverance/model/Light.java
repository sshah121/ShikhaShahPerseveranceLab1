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

	// get howmuch power is consumed
	public int powerConnsumption() {
		return 0;
	}

	public long beamDistance() {
		return 1;
	}

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
