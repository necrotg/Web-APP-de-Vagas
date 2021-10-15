window.onload = getOption;
function getOption(op){
	var option = op.value;
	var x = document.getElementsByClassName("content");
		for(var i = 0; i< x.length;i++){
			x[i].style.display = "none";
		}
	document.getElementById(option).style.display = "block"; 
}

