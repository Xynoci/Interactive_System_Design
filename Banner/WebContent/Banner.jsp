<%@ page import="edu.pitt.Bean.ParamsSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Banner</title>
<link rel="stylesheet" href="style.css" type="text/css">
<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
</head>

<body>
	<div id="body">
		<form action="BannerServlet" method="post">
			<div id="header">
				<div id="title-head">
					<span>Banner.</span>
				</div>
			</div>
			<div id="main">
				<div id="section">
					<div id="text-input">
						<span style="line-height: 40px; font-size: 25px;">Your slogan:</span><br>
						<textarea rows="2" cols="53" id="name" name="NAME">User is not like me.</textarea>
					</div>
					<div id="upper">
						<div id="font">
							<div id="head-container">
								<span id="head-text">Font Style: </span>
								<div id="value-label">
									<span class="ftstyle">Plain</span>
								</div>
							</div>
							<div id="font-radio">
								<input type="radio" name="FTSTYLE" class="font" id="font-i" value="ITALIC"><label for="font-i" style="font-style: italic;">Italic</label><br> <input
									type="radio" name="FTSTYLE" class="font" id="font-b" value="BOLD"><label for="font-b" style="font-weight: bold;">Bold</label> <input type="radio" name="FTSTYLE"
									class="font" id="font-r" value="REGULAR" checked><label for="font-r">Plain</label><br> <input type="radio" name="FTSTYLE" class="font" id="font-bi"
									value="BOLD ITALIC"><label for="font-bi" style="font-style: italic; font-weight: bold;">Bold and Italic</label><br>
							</div>
							<div id="head-container">
								<span id="head-text">Font Size: </span>
								<div id="value-label">
									<span class="ftsize">15</span><span id="ftsize">px</span>
								</div>
							</div>
							<div id="font-slider">
								<div id="e-slider"></div>
							</div>
						</div>

						<div id="shape">
							<div id="head-container">
								<span id="head-text">Shape: </span>
								<div id="value-label">
									<span id="shape-label" class="shape-label">Rectangle</span>
								</div>
							</div>
							<div id="shape-radio">
								<input type="radio" name="SHAPE" class="shape" id="shape-o" value="OVAL"> <label for="shape-o">Oval</label><br> <input type="radio" name="SHAPE" class="shape"
									id="shape-r" value="RECT" checked> <label for="shape-r">Rectangle</label><br> <input type="radio" name="SHAPE" class="shape" id="shape-rr" value="ROUNDRECT">
								<label for="shape-rr">Round Rect.</label><br>
							</div>
							<div id="size">
								<div id="head-container">
									<span id="head-text">Shape Size: </span>
									<div id="value-label">
										<span id="X-label" class="X-label">W:</span> <span class="X">400</span> <span id="Y-label" class="Y-label">H:</span> <span class="Y">430</span>
									</div>
								</div>
								<div style="padding-left: 3px; padding-top: 18px; width: 100%;">
									<div style="height: 21.5px; float: left;">
										<div style="float: left;">
											<span id="width">Width:</span>
										</div>
										<div style="float: left; margin: 0px auto 0px 2px;">
											<input type="text" id="size" name="X" value="400" Onchange="setX()">px
										</div>
									</div>
									<div style="height: 21.5px; float: left; margin-left: 10px;">
										<div style="float: left;">
											<span id="height">Height:</span>
										</div>
										<div style="float: left; margin: 0px auto 0px 2px;">
											<input type="text" id="size" name="Y" value="430" Onchange="setY()">px
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div id="color-container">
						<div id="ft-color" style="float: left; height: 70px;">
							<div id="head-container">
								<span id="head-text">Color</span><br>
							</div>
							<div id="color-panel" class="ft">
								<div id="Red" title="Red" class="easyui-tooltip" style="background: red;"></div>
								<div id="Pink" title="Pink" class="easyui-tooltip" style="background: pink;"></div>
								<div id="Orange" title="Orange" class="easyui-tooltip" style="background: orange;"></div>
								<div id="Yellow" title="Yellow" class="easyui-tooltip" style="background: yellow;"></div>
								<div id="Green" title="Green" class="easyui-tooltip" style="background: Lime;"></div>
								<div id="Blue" title="Blue" class="easyui-tooltip" style="background: blue; box-shadow: inset 0 0 10px #3F3F3F;"></div>
								<div id="Cyan" title="Cyan" class="easyui-tooltip" style="background: cyan;"></div>
								<div id="Magenta" title="Magenta" class="easyui-tooltip" style="background: magenta;"></div>
								<div id="White" title="White" class="easyui-tooltip" style="background: white; border: 1px #808080 solid;"></div>
								<div id="Light_Gray" title="Light Gray" class="easyui-tooltip" style="background: Silver;"></div>
								<div id="Gray" title="Gray" class="easyui-tooltip" style="background: Gray;"></div>
								<div id="Dark_Gray" title="Dark Gray" class="easyui-tooltip" style="background: DimGray;"></div>
								<div id="Black" title="Black" class="easyui-tooltip" style="background: black;"></div>
							</div>
						</div>
						<div id="bg-color" style="float: left; height: 70px;">
							<div id="head-container">
								<span id="head-text">Background Color</span>
							</div>
							<div id="color-panel" class="bg">
								<div id="Red" title="Red" class="easyui-tooltip" style="background: red;"></div>
								<div id="Pink" title="Pink" class="easyui-tooltip" style="background: pink;"></div>
								<div id="Orange" title="Orange" class="easyui-tooltip" style="background: orange;"></div>
								<div id="Yellow" title="Yellow" class="easyui-tooltip" style="background: yellow;"></div>
								<div id="Green" title="Green" class="easyui-tooltip" style="background: Lime;"></div>
								<div id="Blue" title="Blue" class="easyui-tooltip" style="background: blue;"></div>
								<div id="Cyan" title="Cyan" class="easyui-tooltip" style="background: cyan;"></div>
								<div id="Magenta" title="Magenta" class="easyui-tooltip" style="background: magenta;"></div>
								<div id="White" title="White" class="easyui-tooltip" style="background: white; border: 1px #808080 solid;"></div>
								<div id="Light_Gray" title="Light Gray" class="easyui-tooltip" style="background: Silver; box-shadow: inset 0 0 10px #3F3F3F;"></div>
								<div id="Gray" title="Gray" class="easyui-tooltip" style="background: Gray;"></div>
								<div id="Dark_Gray" title="Dark Gray" class="easyui-tooltip" style="background: DimGray;"></div>
								<div id="Black" title="Black" class="easyui-tooltip" style="background: black;"></div>
							</div>
						</div>
						<input type="hidden" id="COLOR" name="COLOR" value="Blue"> <input type="hidden" id="BGCOLOR" name="BGCOLOR" value="Light_Gray"> <input type="hidden" id="FTSIZE"
							name="FTSIZE" value="15"> <input type="hidden" id="X" value="400"> <input type="hidden" id="Y" value="430">

					</div>
					<div id="button" style="float: left; margin-top: 5px; margin-left: 5px; border-left-style: solid; border-width: 6px; border-color: #E91E63; padding-left: 3px; width: 100%;">
						<input style="float: left; margin: 10px auto auto 10px; width: 100px;" type="Button" value="Reset" onclick="resetAll()"> <input
							style="float: right; margin: 10px 20px auto auto; width: 100px;" type="submit" value="Show Banner">
					</div>
				</div>
				<div id="aside">
					<%
						ParamsSet ps = (ParamsSet) request.getAttribute("ParamsSet");
						if (ps != null) {
					%>
					<applet code="Banner.class" archive="Banner.jar" width="400" height="440">
						<param name="NAME" value="<%=ps.getName()%>" />
						<param name="SHAPE" value="<%=ps.getShape()%>" />
						<param name="COLOR" value="<%=ps.getColorName()%>" />
						<param name="BGCOLOR" value="<%=ps.getBgColorName()%>" />
						<param name="X" value="<%=ps.getX()%>" />
						<param name="Y" value="<%=ps.getY()%>" />
						<param name="FTSTYLE" value="<%=ps.getFtstyle()%>" />
						<param name="FTSIZE" value="<%=ps.getFtsize()%>" />
					</applet>
					<%
						} else {
					%>
					<applet code="Banner.class" archive="Banner.jar" width="400" height="440">
						<param name="NAME" value="User is not like me." />
						<param name="SHAPE" value="RECT" />
						<param name="COLOR" value="Blue" />
						<param name="BGCOLOR" value="Light_Gray" />
						<param name="X" value="400" />
						<param name="Y" value="430" />
						<param name="FTSTYLE" value="REGULAR" />
						<param name="FTSIZE" value="15" />
					</applet>
					<%
						}
					%>
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="js/scripts.js"></script>
</body>
</html>