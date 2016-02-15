package edu.pitt.Bean;
import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

/**
 * @author Xynoci Assignment 03, Ingeractive System Design.
 *
 */
@SuppressWarnings("serial")
public class Banner extends Applet {

	private ParamsSet loadParams() {
		System.out.println("\n#########################");
		System.out.println("Loading parameters ...");
		ParamsSet ps = new ParamsSet();
		ps.setName(this.getParameter("NAME"));
		ps.setShape(this.getParameter("SHAPE"));
		ps.setColor(this.getParameter("COLOR"));
		ps.setBgcolor(this.getParameter("BGCOLOR"));
		ps.setX(this.getParameter("X"));
		ps.setY(this.getParameter("Y"));
		ps.setFtstyle(this.getParameter("FTSTYLE"));
		ps.setFtsize(this.getParameter("FTSIZE"));
		System.out.println("Loading process completed.");
		return ps;

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		ParamsSet ps = this.loadParams();
		System.out.print("\nPrinting the frame ... ");
		g.setColor(this.getColor(ps.getBgcolor()));
		this.shapeIt(g, ps, "fill");
		g.setColor(this.getColor(ps.getColor()));
		this.shapeIt(g, ps, "draw");
		System.out.println("Done.");
		
		System.out.print("Printing the text ... ");
		String nameString = ps.getName();
		g.setFont(new Font("Californian FB",this.getStyle(ps.getFtstyle()),ps.getFtsize()));
		FontMetrics fm = g.getFontMetrics();
		int stringWidth = fm.stringWidth(nameString);
		int stringAscent = fm.getAscent();
		int xCoordinate = this.getWidth()/2 - stringWidth/2;
        int yCoordinate = this.getHeight()/2 + stringAscent/2;
		g.drawString(nameString, xCoordinate, yCoordinate);
		System.out.println("Done.");

		System.out.println("\nChecking borders ... ");
		if(stringWidth>=ps.getX()){
			System.out.println("  *ERROR: Width exceeded.");
			ps.appendStatus("  *ERROR: Width exceeded.");
		}
		if(fm.getMaxAscent()+fm.getMaxDescent()>=ps.getY()){
			System.out.println("  *ERROR: Height exceeded.");
			ps.appendStatus("  *ERROR: Height exceeded.");
		}
		if(stringWidth<ps.getX()&&fm.getMaxAscent()+fm.getMaxDescent()<ps.getY())
			System.out.println("  *Notification: Borders clear.");
		System.out.println("Border checking completed.");
		g.setColor(Color.red);
		g.setFont(new Font("Californian FB", Font.PLAIN, 10));
		g.drawString(ps.getStatus().toString(), 0, g.getFontMetrics().getMaxAscent());
		System.out.println("Applet Status: " + (ps.getStatus().toString().length()==0?"Succeeded.":ps.getStatus().toString()));
		ps.showStatus(this);
	}


	private void shapeIt(Graphics g, ParamsSet ps, String type) {
		if(type == "fill")
		switch (ps.getShape()) {
		case "OVAL":
			g.fillOval(centralize(this.getWidth(), ps.getX()), centralize(this.getHeight(), ps.getY()), ps.getX(), ps.getY());
			break;
		case "RECT":
			g.fillRect(centralize(this.getWidth(), ps.getX()), centralize(this.getHeight(), ps.getY()), ps.getX(), ps.getY());
			break;
		case "ROUNDRECT":
			g.fillRoundRect(centralize(this.getWidth(), ps.getX()), centralize(this.getHeight(), ps.getY()), ps.getX(), ps.getY(), ps.getY() / 10, ps.getY() / 10);
			break;
		}
		else
			switch (ps.getShape()) {
			case "OVAL":
				g.drawOval(centralize(this.getWidth(), ps.getX()), centralize(this.getHeight(), ps.getY()), ps.getX(), ps.getY());
				break;
			case "RECT":
				g.drawRect(centralize(this.getWidth(), ps.getX()), centralize(this.getHeight(), ps.getY()), ps.getX(), ps.getY());
				break;
			case "ROUNDRECT":
				g.drawRoundRect(centralize(this.getWidth(), ps.getX()), centralize(this.getHeight(), ps.getY()), ps.getX(), ps.getY(), ps.getY() / 10, ps.getY() / 10);
				break;
			}
	}

	private int centralize(int length, int value) {
		return (length - value) / 2;
	}

	private Color getColor(String colorString){
		switch (colorString) {
			case "black":
				return Color.black;
			case "blue":
				return Color.blue;
			case "cyan":
				return Color.cyan;
			case "darkGray":
				return Color.darkGray;
			case "gray":
				return Color.gray;
			case "green":
				return Color.green;
			case "lightGray":
				return Color.lightGray;
			case "magenta":
				return Color.magenta;
			case "orange":
				return Color.orange;
			case "pink":
				return Color.pink;
			case "red":
				return Color.red;
			case "white":
				return Color.white;
			case "yellow":
				return Color.yellow;
		}
		return null;
	}

	private int getStyle(String typeString){
		switch(typeString){
			case "REGULAR":
				return Font.PLAIN;
			case "BOLD":
				return Font.BOLD;
			case "ITALIC":
				return Font.ITALIC;
			case "BOLD ITALIC":
				return Font.BOLD+Font.ITALIC;
		}
		return 0;
	}

}

