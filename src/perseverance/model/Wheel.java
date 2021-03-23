/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Wheel implements SelfCheckCapable {

	private int size;

	private String durability;
//rotates the wheels
	public void rotate() {

	}
//gets power consumed by wheel functioning
	public void powerConsumed() {

	}
//checks friction produced due to speed
	public void checkFriction() {

	}
//moves the wheel in the direction needed
	public void move() {

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
