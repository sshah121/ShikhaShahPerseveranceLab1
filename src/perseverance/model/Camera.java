/**
 * 
 */
package perseverance.model;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author shikha
 *
 */
public class Camera implements SelfCheckCapable {

	private Long imageSize;

	private Integer resolution;

	public void captureImage() {
		System.out.println("captures image at specific intervals or when required or commanded to");
	}

	public void zoomIn() {
		System.out.println("Zooms in the lens to take a clear image");
	}

	public void zoomOut() {
		System.out.println("Zooms out the lens to have a proper view of the image");
	}

	public void tilt() {
		System.out.println("tilts the camera when required while taking an image ");
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
