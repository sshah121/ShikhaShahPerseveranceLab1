/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Transmitter implements SelfCheckCapable {

	private String antennas;

	private String frequency;

	private String transmissionRate;

	//measures frequency of the signals transmitted
	public void measureFrequncy() {

	}
//send the required signal
	public void sendSignal() {

	}
//moves antenna for proper transmission when disrupted or commanded to
	public void moveAntenna() {

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
