import java.applet.Applet;

public class ParamsSet {
	public final String NAME = "DEFAULT TEXT.";
	public final String SHAPE = "OVAL";
	public final String COLOR = "darkGray";
	public final String BGCOLOR = "gray";
	public final String FTSTYLE = "REGULAR";
	public final int X = 120;
	public final int Y = 80;
	public final int FTSIZE = 12;

	private String name = NAME;
	private String shape = SHAPE;
	private String color = COLOR;
	private String bgcolor = BGCOLOR;
	private int x = X;
	private int y = Y;
	private String ftstyle = FTSTYLE;
	private int ftsize = FTSIZE;
	private StringBuffer status = new StringBuffer();

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
			case "black":
				this.color = "black";
				break;
			case "blue":
				this.color = "blue";
				break;
			case "cyan":
				this.color = "cyan";
				break;
			case "darkGray":
				this.color = "darkGray";
				break;
			case "gray":
				this.color = "gray";
				break;
			case "green":
				this.color = "green";
				break;
			case "lightGray":
				this.color = "lightGray";
				break;
			case "magenta":
				this.color = "magenta";
				break;
			case "orange":
				this.color = "orange";
				break;
			case "pink":
				this.color = "pink";
				break;
			case "red":
				this.color = "red";
				break;
			case "white":
				this.color = "white";
				break;
			case "yellow":
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
				if(!bgcolor.equals(this.BGCOLOR)){
					this.bgcolor = this.BGCOLOR;
					System.out.println("  *ERROR: BGCOLOR equals to COLOR, default " + this.BGCOLOR + " will be applied.");
					status.append("  *ERROR: BGCOLOR equals to COLOR.");
				}
				else{
					this.bgcolor = this.COLOR;
					System.out.println("  *ERROR: BGCOLOR equals to COLOR, default " + this.COLOR + " will be applied.");
					status.append("  *ERROR: BGCOLOR equals to COLOR.");
				}
			}else
				switch (bgcolor) {
				case "black":
					this.bgcolor = "black";
					break;
				case "blue":
					this.bgcolor = "blue";
					break;
				case "cyan":
					this.bgcolor = "cyan";
					break;
				case "darkGray":
					this.bgcolor = "darkGray";
					break;
				case "gray":
					this.bgcolor = "gray";
					break;
				case "green":
					this.bgcolor = "green";
					break;
				case "lightGray":
					this.bgcolor = "lightGray";
					break;
				case "magenta":
					this.bgcolor = "magenta";
					break;
				case "orange":
					this.bgcolor = "orange";
					break;
				case "pink":
					this.bgcolor = "pink";
					break;
				case "red":
					this.bgcolor = "red";
					break;
				case "white":
					this.bgcolor = "white";
					break;
				case "yellow":
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

