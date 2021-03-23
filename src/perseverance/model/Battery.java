/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Battery implements SelfCheckCapable {

	private String energy;

	private String power;

	private void recharge() {
System.out.println("Recharges the battery with the power in stock");
	}

	private void getWatts() {
System.out.println("returns power in watts used by the battery");
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
