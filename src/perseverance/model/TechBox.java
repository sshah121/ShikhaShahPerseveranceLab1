/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class TechBox implements SelfCheckCapable {

	private String power;

	private int numOfInstruments;

	//checks instrumental stability
	public void checkStability() {

	}
//checks power levels of instruments 
	public void checkPowerLevel() {

	}
//applies full system check of all the components
	public void systemCheck() {

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
