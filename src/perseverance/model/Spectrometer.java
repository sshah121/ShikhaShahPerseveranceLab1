/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Spectrometer implements SelfCheckCapable {

	private String arm;

	private long sampleSize;

	private long focalLength;

	private void collectSamples() {

	}

	private void drill() {

	}

	private void rotate() {

	}

	private void analyzeElement() {

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
