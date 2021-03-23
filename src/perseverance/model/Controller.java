/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Controller implements SelfCheckCapable {

	private String speaker;

	private String microphone;

	private String processor;

	private String memory;

	public void takePicture() {
		System.out.println("takes picture when commanded by the team");
       Camera cam = new Camera();
       cam.captureImage();
	}

	public void operateInstruments() {
		System.out.println("Operates a specified instrument");
	}

	public void requestInformation() {
		System.out.println("Gets information of the instruments or atmospheric elements as requested");
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
