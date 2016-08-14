// Cursor trail script for Marvel Comics

	if(document.all)
	{
		var ie = 1;
	}
	else
	{
		var ie = 0;
	}

	if(document.getElementById && !document.all)
	{
		var not_ie = 1;
	}
	else
	{
		var not_ie = 0;
	}

	for(var f = 1; f < 10; f++)
	{
		var fa = f * 45;
		var fb = f * 40;
		document.write("<img id = im" + f + " src='quiz" + f + ".png' style='position:absolute; left: " + fa + "px; top: " + fb + "px;' >");
	}

	var moving = 1;
	var onmove = false, imgw = 10, imgh = 12;
	var winW, winH;
	var nht = winH;
	var toppos = 0;	
	
	function getScrollXY() 
	{
	  var scrOfX = 10, scrOfY = 10;
	  
	  if(typeof(window.pageYOffset) == 'number')
	  {		
		scrOfY = window.pageYOffset;
		scrOfX = window.pageXOffset;
	  } 
	  else if(document.body && (document.body.scrollLeft || document.body.scrollTop)) 
	  {
		//DOM compliant
		scrOfY = document.body.scrollTop;
		scrOfX = document.body.scrollLeft;
	  } 
	  else if(document.documentElement && (document.documentElement.scrollLeft || document.documentElement.scrollTop))
	  {		
	   scrOfY = document.documentElement.scrollTop;
	   scrOfX = document.documentElement.scrollLeft;
	  }
	  return [scrOfX, scrOfY];
	}

	var timer;

	function ranrot()
	{
		var a = getScrollXY();

		if(timer)
		{
			clearTimeout(timer);
		}
		toppos = a[1];
		winH = nht + a[1];
		timer = setTimeout('ranrot()', 100);
	}
		
	ranrot();
	function mover(x,y,moving)
	{  
		if(moving < 10)
		{
			var ele = document.getElementById("im" + moving);
			   
			if(x < (winW) && y < (winH))
			{				
				var afa = (moving - 1) * 40;
				var afb = (moving - 1) * 45;
				var l = x + afa;
				var t = y + afb;
			
				if(l > (winW - 54) && t < (winH - 54))
				{
					ele.style.left = winW - (imgw + 11);
					ele.style.top = y + afb;
				}
				else if(l < (winW - 54) && t > (winH - 54))
				{
					ele.style.left = x + afa ;
					ele.style.top = winH - (imgh + 4);
				}
				else if(l > (winW - 54) && t > (winH - 54))
				{
					ele.style.left = winW - (imgw + 11);
					ele.style.top = winH - (imgh + 4);
				}
				else
				{
					ele.style.left = x + afa;
					ele.style.top = y + afb;
				}
					
				moving = moving	+ 1;
				setTimeout('mover(' + x + ',' + y + ',' + moving + ')', 40);
			}
		}
	}

	var timer = setTimeout('mover(100,100,1)', 40);

	function mouseMoveHandler (evt) 
	{
		var b = getScrollXY();

		var x1 = document.all ? event.clientX : document.layers ? evt.x : evt.clientX;
		var y1 = document.all ? event.clientY : document.layers ? evt.y : evt.clientY;
		var x = x1 + b[0];
		var y = y1 + b[1];
		setTimeout('mover(' + x + ',' + y + ',1)', 50);
	}


	function iecompattest()
	{
		if(document.compatMode && document.compatMode !="BackCompat")
		{
			return document.documentElement;
		}
		else
		{
			return document.body;
		}		
	}

	if (document.layers)
			document.captureEvents(Event.MOUSEMOVE);

	if (document.layers || document.all)
			document.onmousemove = mouseMoveHandler;

	if (document.addEventListener)
			document.addEventListener('mousemove', mouseMoveHandler, true);
	
	function iecompattest()
	{
		if(document.compatMode && document.compatMode!="BackCompat")
		{
			return document.documentElement;
		}
		else
		{
			return document.body;
		}		
	}
	
	if (not_ie)
	{
		winW = window.innerWidth;
		winH = window.innerHeight;
	}
	else if (ie) 
	{
		winW = iecompattest().clientWidth;
		winH = iecompattest().clientHeight;
	}
	nht = winH;