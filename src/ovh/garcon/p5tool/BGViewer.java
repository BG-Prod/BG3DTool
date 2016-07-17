package ovh.garcon.p5tool;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import com.jogamp.opengl.*;
import com.jogamp.opengl.awt.*;

public class BGViewer extends JFrame implements GLEventListener {
	/**
	 * Serial number
	 */
	private static final long serialVersionUID = -3377154182423991469L;

	public BGViewer(String title, int width, int height) {
		super(title);
		this.setSize(width, height);
		
		// getting the capabilities object of GL2 profile
		final GLProfile profile = GLProfile.getDefault();
		GLCapabilities capabilities = new GLCapabilities(profile);

		// The canvas
		final GLCanvas glcanvas = new GLCanvas(capabilities);
		glcanvas.addGLEventListener(this);
		glcanvas.setSize(width, height);
		
		getContentPane().add(glcanvas);
	}

	public BGViewer(String title) {
		super(title);
		this.setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setVisibleIntern(boolean b) {
		super.setVisible(b);
	}

	@Override
	public void setVisible(boolean b) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				setVisibleIntern(b);
			}
		});
	}

	public static void main(String[] args) {
		BGViewer view = new BGViewer("Test", 800, 600);
		view.setVisible(true);
	}

	@Override
	public void display(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub

	}

}
