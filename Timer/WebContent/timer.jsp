<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Start Exam</title>

<!--  <script type="text/javascript" src="timer.js"></script>-->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>



</head>

<%!int no=1;%>
<body bgcolor="#f1f1f1" onload="countdown();">
	

	


		
				<input id="minutes" type="text"
					style="width: 10px; border: none; font-size: 16px; font-weight: bold; color: black;"><font
					size="5"> : </font> <input id="seconds" type="text"
					style="width: 20px; border: none; font-size: 16px; font-weight: bold; color: black;">
			
			<br> <br>
			<br>
			
		
			
			<input type="submit" class="next_button" value="Next" name="butn"
				id="testbutton">
		</div>
		</div>
	</form>
	<%no++; %>
</body>
<script>
	//set minutes 
	var mins = 2;
	function selectedOption() {
		/*       var option = document.getElementById("ans");
		 var selectedOption = [];
		 for (var i = 0; i < option.length; i++) {
		 if (option[i].checked) {
		 selectedOption.push(vehicleTypes[i].value);
		 }
		 } */

		// Set the value of selectedVehicles to comma separated 
		// String of the selected vehicle types
		//  var hiddenSelectedVehicles = document.getElementById("selectedVehicles");
		//   hiddenSelectedVehicles.value = selectedVehicleTypes.join(",");
		// jQuery
		/* $("#selectedVehicles").value(selectedVehicleTypes.join(",")); */

		// Submit the form using javascript
		var form = document.getElementById("test");
		form.submit();

		//jQuery
		/* $("#vehicles").submit(); */
	}

	//calculate the seconds 
	var secs = mins * 60;

	//countdown function is evoked when page is loaded 
	function countdown() {
		setTimeout('Decrement()', 60);
	}

	//Decrement function decrement the value. 
	function Decrement() {
		if (document.getElementById) {
			minutes = document.getElementById("minutes");
			seconds = document.getElementById("seconds");

			//if less than a minute remaining 
			//Display only seconds value. 
			if (seconds < 59) {
				seconds.value = secs;
			}

			//Display both minutes and seconds 
			//getminutes and getseconds is used to 
			//get minutes and seconds 
			else {
				minutes.value = getminutes();
				seconds.value = getseconds();
			}
			//when less than a minute remaining 
			//colour of the minutes and seconds 
			//changes to red 
			if (mins < 1) {
				minutes.style.color = "red";
				seconds.style.color = "red";
			}
			//if seconds becomes zero, 
			//then page alert time up 
			if (mins < 0) {
				minutes.value = 0;
				seconds.value = 0;
				selectedOption();
			}
			//if seconds > 0 then seconds is decremented 
			else {
				secs--;
				setTimeout('Decrement()', 1000);
			}
		}
	}

	function getminutes() {
		//minutes is seconds divided by 60, rounded down 
		mins = Math.floor(secs / 60);
		return mins;
	}

	function getseconds() {
		//take minutes remaining (as seconds) away  
		//from total seconds remaining 
		return secs - Math.round(mins * 60);

	}
</script>
</html>