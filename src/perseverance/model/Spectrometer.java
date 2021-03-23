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
	
//collects samples from the land for further study
	private void collectSamples() {

	}
//drills the surface land for a better land sample
	private void drill() {

	}
//rotates the arm of spectrometer
	private void rotate() {

	}
//analyzes elemental composition of the sample
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
