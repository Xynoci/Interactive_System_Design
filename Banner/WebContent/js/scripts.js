var defaultX = 400;
var defaultY = 430;

function resetAll() {
	$("#name").val('User is not like me.');
	$("#font-r").prop("checked", true);
	$("#font-b").prop("checked", false);
	$("#font-i").prop("checked", false);
	$("#font-bi").prop("checked", false);
	$("#shape-r").prop("checked", true);
	$("#shape-rr").prop("checked", false);
	$("#shape-o").prop("checked", false);
	$("#e-slider").slider({
		value : 15,
	});
	$('.ftsize').text($('.slider-value').val());
	$(".shape-label").text("Rectangle");
	$('.ftstyle').text("Plain");
	$('.Y').text(defaultY);
	$('.X').text(defaultX);
	$("input[name='Y']").val(defaultY);
	$("input[name='X']").val(defaultX);
	if ($('#COLOR').attr('value') != "")
		$('.ft #' + $('#COLOR').attr('value')).css('box-shadow', 'none');
	if ($('#BGCOLOR').attr('value') != "")
		$('.bg #' + $('#BGCOLOR').attr('value')).css('box-shadow', 'none');
	$('.ft #Blue').css('box-shadow', 'inset 0 0 10px #3F3F3F');
	$('.bg #Light_Gray').css('box-shadow', 'inset 0 0 10px #3F3F3F');
	$('#COLOR').attr('value', "Blue");
	$('#BGCOLOR').attr('value', "Light_Gray");
	$('#X').val(defaultX);
	$('#Y').val(defaultY);
	$('#FTSIZE').val('15');
};

$('input[type="radio"][name="FTSTYLE"]').change(function() {
	var text = $(".font:checked").val();
	console.log(text);
	if (text == "REGULAR")
		$('.ftstyle').text("Plain");
	else if (text == "BOLD")
		$('.ftstyle').text("Bold");
	else if (text == "ITALIC")
		$('.ftstyle').text("Italic");
	else
		$('.ftstyle').text("B/I");
});

$('input[type="radio"][name="SHAPE"]').change(function() {
	var text = $(".shape:checked").val();
	console.log(text);
	if (text == "OVAL")
		$(".shape-label").text("Oval");
	else if (text == "RECT")
		$(".shape-label").text("Rectangle");
	else
		$(".shape-label").text("Round Rect.");
});

$('#e-slider').slider({
	mode : 'h',
	showTip : 'true',
	value : 15,
	min : 5,
	max : 85,
	tipFormatter : function(value) {
		return value;
	},
	onChange : function() {
		console.log("change");
		$('.ftsize').text($('.slider-value').val());
	},
	onComplete : function() {
		$('#FTSIZE').attr("value", $('.slider-value').val());
	},
});

function setX() {
	var x = $("input[name='X']").val();
	if (isNaN(x) || x == '') {
		$('.X').text(defaultX);
		$("input[name='X']").val(defaultX);
	} else if (x > defaultX || x < 0)
		$("input[name='X']").val(defaultX);
	else {
		$('.X').text(x);
		$('#X').val(x);
	}

};

function setY() {
	var y = $("input[name='Y']").val();
	if (isNaN(y) || y == '') {
		$('.Y').text(defaultY);
		$("input[name='Y']").val(defaultY);
	} else if (y > defaultY || y < 0)
		$("input[name='Y']").val(defaultY);
	else {
		$('.Y').text(y);
		$('#Y').val(y);
	}
};

$('div.easyui-tooltip').click(function() {
	var colortype = $(this).attr('id');
	var colorInfo = $(this).closest('#color-panel').attr('class');
	if (colorInfo == 'ft') {
		if ($('#COLOR').attr('value') != "")
			$('.ft #' + $('#COLOR').attr('value')).css('box-shadow', 'none');
		setColor.call(this);
		$('#COLOR').attr('value', colortype);
		if ($('#BGCOLOR').attr('value') == colortype) {
			$('#BGCOLOR').attr('value', "");
			$('.bg #' + colortype).css('box-shadow', 'none');
		}
	} else {
		if ($('#BGCOLOR').attr('value') != "")
			$('.bg #' + $('#BGCOLOR').attr('value')).css('box-shadow', 'none');
		setColor.call(this);
		$('#BGCOLOR').attr('value', colortype);
		if ($('#COLOR').attr('value') == colortype) {
			$('#COLOR').attr('value', "");
			$('.ft #' + colortype).css('box-shadow', 'none');
		}
	}
});

function setColor() {
	if ($(this).attr('id') == 'Black')
		$(this).css('box-shadow', 'inset 0 0 10px #FFFFFF');
	else
		$(this).css('box-shadow', 'inset 0 0 10px #3F3F3F');
}
