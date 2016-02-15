package edu.pitt.Bean;
import java.applet.Applet;

public class ParamsSet {
	public final String NAME = "User is not like me.";
	public final String SHAPE = "RECT";
	public final String COLOR = "blue";
	public final String BGCOLOR = "lightGray";
	public final String FTSTYLE = "REGULAR";
	public final int X = 400;
	public final int Y = 430;
	public final int FTSIZE = 15;

	private String name = NAME;
	private String shape = SHAPE;
	private String color = COLOR;
	private String bgcolor = BGCOLOR;
	private int x = X;
	private int y = Y;
	private String ftstyle = FTSTYLE;
	private int ftsize = FTSIZE;
	private StringBuffer status = new StringBuffer();
	private String colorName = "Blue";
	private String bgColorName="Light_Gray";
	

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public String getBgColorName() {
		return bgColorName;
	}

	public void setBgColorName(String bgColorName) {
		this.bgColorName = bgColorName;
	}

	public StringBuffer getStatus() {
		return status;
	}

	public void appendStatus(String status) {
		this.status.append(status);
	}

	public ParamsSet() {
		super();
	}
	
	public void showStatus(Applet a){
		a.showStatus(status.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null)
			this.name = name;
		else{
			this.name = NAME;
			System.out.println("  *ERROR: NAME missing, default " + this.NAME + " will be applied.");
			status.append("  *ERROR: NAME missing.");
		}
	}

	public void setShape(String shape) {
		if (shape != null)
			switch (shape) {
			case "OVAL":
				this.shape = shape;
				break;
			case "RECT":
				this.shape = shape;
				break;
			case "ROUNDRECT":
				this.shape = shape;
				break;
			default:
				System.out.println("  *ERROR: SHAPE cannot match, default " + this.SHAPE + " will be applied.");
				status.append("  *ERROR: SHAPE cannot match.");
				break;
			}
		else{
			System.out.println("  *ERROR: SHAPE missing, default " + this.SHAPE + " will be applied.");
			status.append("  *ERROR: SHAPE missing.");
		}
	}

	public String getShape() {
		return shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null)
			switch (color) {
			case "Black":
				this.colorName=color;
				this.color = "black";
				break;
			case "Blue":
				this.colorName=color;
				this.color = "blue";
				break;
			case "Cyan":
				this.colorName=color;
				this.color = "cyan";
				break;
			case "Dark_Gray":
				this.colorName=color;
				this.color = "darkGray";
				break;
			case "Gray":
				this.colorName=color;
				this.color = "gray";
				break;
			case "Green":
				this.colorName=color;
				this.color = "green";
				break;
			case "Light_Gray":
				this.colorName=color;
				this.color = "lightGray";
				break;
			case "Magenta":
				this.colorName=color;
				this.color = "magenta";
				break;
			case "Orange":
				this.colorName=color;
				this.color = "orange";
				break;
			case "Pink":
				this.colorName=color;
				this.color = "pink";
				break;
			case "Red":
				this.colorName=color;
				this.color = "red";
				break;
			case "White":
				this.colorName=color;
				this.color = "white";
				break;
			case "Yellow":
				this.colorName=color;
				this.color = "yellow";
				break;
			default:
				System.out.println("  *ERROR: COLOR cannot match, default " + this.COLOR + " will be applied.");
				status.append("  *ERROR: COLOR cannot match.");
				break;
			}
		else{
			System.out.println("  *ERROR: COLOR missing, default " + this.COLOR + " will be applied.");
			status.append("  *ERROR: COLOR missing.");
		}
	}

	public String getBgcolor() {
		return bgcolor;
	}

	public void setBgcolor(String bgcolor) {
		if (bgcolor != null){
			if(bgcolor.equals(this.color)){
//				if(!bgcolor.equals(this.BGCOLOR)){
//					this.bgcolor = this.BGCOLOR;
//					System.out.println("  *ERROR: BGCOLOR equals to COLOR, default " + this.BGCOLOR + " will be applied.");
//					status.append("  *ERROR: BGCOLOR equals to COLOR.");
//				}
//				else{
//					this.bgcolor = this.COLOR;
//					System.out.println("  *ERROR: BGCOLOR equals to COLOR, default " + this.COLOR + " will be applied.");
//					status.append("  *ERROR: BGCOLOR equals to COLOR.");
//				}
			}else
				switch (bgcolor) {
				case "Black":
					this.bgColorName=bgcolor;
					this.bgcolor = "black";
					break;
				case "Blue":
					this.bgColorName=bgcolor;
					this.bgcolor = "blue";
					break;
				case "Cyan":
					this.bgColorName=bgcolor;
					this.bgcolor = "cyan";
					break;
				case "Dark_Gray":
					this.bgColorName=bgcolor;
					this.bgcolor = "darkGray";
					break;
				case "Gray":
					this.bgColorName=bgcolor;
					this.bgcolor = "gray";
					break;
				case "Green":
					this.bgColorName=bgcolor;
					this.bgcolor = "green";
					break;
				case "Light_Gray":
					this.bgColorName=bgcolor;
					this.bgcolor = "lightGray";
					break;
				case "Magenta":
					this.bgColorName=bgcolor;
					this.bgcolor = "magenta";
					break;
				case "Orange":
					this.bgColorName=bgcolor;
					this.bgcolor = "orange";
					break;
				case "Pink":
					this.bgColorName=bgcolor;
					this.bgcolor = "pink";
					break;
				case "Red":
					this.bgColorName=bgcolor;
					this.bgcolor = "red";
					break;
				case "White":
					this.bgColorName=bgcolor;
					this.bgcolor = "white";
					break;
				case "Yellow":
					this.bgColorName=bgcolor;
					this.bgcolor = "yellow";
					break;
				default:
					System.out.println("  *ERROR: BGCOLOR cannot match, default " + this.BGCOLOR + " will be applied.");
					status.append("  *ERROR: BGCOLOR missing.");
					break;
			}
		}
			
		else{
			System.out.println("  *ERROR: BGCOLOR missing, default " + this.BGCOLOR + " will be applied.");
			status.append("  *ERROR: BGCOLOR missing.");
		}
	}

	public int getX() {
		return x;
	}

	public void setX(String x) {
		if (x != null)
			try {
				this.x = Integer.parseInt(x);
			} catch (Exception e) {
				System.err.println("  *ERROR: Incorrect type for X, default " + this.X + " will be applied.");
				status.append("  *ERROR: Incorrect type for X.");
			}
		else{
			System.out.println("  *ERROR: X missing, default " + this.X + " will be applied.");
			status.append("  *ERROR: X missing.");
		}
	}

	public int getY() {
		return y;
	}

	public void setY(String y) {
		if (y != null)
			try {
				this.y = Integer.parseInt(y);
			} catch (Exception e) {
				System.err.println("  *ERROR: Incorrect type for Y, default " + this.Y + " will be applied.");
				status.append("  *ERROR: Incorrect type for Y.");
			}
		else{
			System.out.println("  *ERROR: Y missing, default " + this.Y + " will be applied.");
			status.append("  *ERROR: Y missing.");
		}
	}

	public String getFtstyle() {
		return ftstyle;
	}

	public void setFtstyle(String ftstyle) {
		if (ftstyle != null)
			switch(ftstyle){
				case "REGULAR":
					this.ftstyle = ftstyle;
					break;
				case "BOLD":
					this.ftstyle = ftstyle;
					break;
				case "ITALIC":
					this.ftstyle = ftstyle;
					break;
				case "BOLD ITALIC":
					this.ftstyle = ftstyle;
					break;
				default:
					System.out.println("  *ERROR: FTSTYLE cannot match, default " + this.FTSTYLE + " will be applied.");
					status.append("  *ERROR: FTSTYLE cannot match.");
					break;
			}
		else{
			System.out.println("  *ERROR: FTSTYLE missing, default " + this.FTSTYLE + " will be applied.");
			status.append("  *ERROR: FTSTYLE missing.");
		}
	}

	public int getFtsize() {
		return ftsize;
	}

	public void setFtsize(String ftsize) {
		if (ftsize != null)
			try {
				this.ftsize = Integer.parseInt(ftsize);
			} catch (Exception e) {
				System.err.println("  *ERROR: Incorrect type for FTSIZE, default " + this.FTSIZE + " will be applied.");
				status.append("  *ERROR: Incorrect type for FTSIZE.");
			}
		else{
			System.out.println("  *ERROR: FTSIZE missing, default " + this.FTSIZE + " will be applied.");
			status.append("  *ERROR: FTSIZE missing.");
		}
	}
}

