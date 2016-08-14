


function item(name, perc)
{
        this.name = name;
        this.perc = perc;
}

superhero = new item(10);

superhero[0] = new item('Superman', 0);
superhero[1] = new item('Spider-Man', 0);
superhero[2] = new item('Batman', 0);
superhero[3] = new item('Supergirl', 0);
superhero[4] = new item('Wonder Woman', 0);
superhero[5] = new item('Robin', 0);
superhero[6] = new item('Hulk', 0);
superhero[7] = new item('The Flash', 0);
superhero[8] = new item('Green Lantern', 0);
superhero[9] = new item('Catwoman', 0);
superhero[10] = new item('Iron Man', 0);

function update()
{
		
      for (var n = 0; n < 11; n++)
		superhero[n].perc = 0;
			
	// Do you like to fly?
	if (document.fm.superman0[1].checked)
	{
		superhero[0].perc = superhero[0].perc + 5;
		superhero[3].perc = superhero[3].perc + 5;
	}
	if (document.fm.superman0[2].checked)
	{
		superhero[0].perc = superhero[0].perc + 10;
		superhero[3].perc = superhero[3].perc + 10;
	}
	if (document.fm.superman0[3].checked)
	{
		superhero[0].perc = superhero[0].perc + 15;
		superhero[3].perc = superhero[3].perc + 15;
	}		
	if (document.fm.superman0[4].checked)
	{
		superhero[0].perc = superhero[0].perc + 20;
		superhero[3].perc = superhero[3].perc + 20;
	}
	
	// Do you like to wear a cape?
	if (document.fm.superman1[1].checked)
	{
		superhero[0].perc = superhero[0].perc + 5;
		superhero[2].perc = superhero[2].perc + 5;
		superhero[3].perc = superhero[3].perc + 3;
		superhero[4].perc = superhero[4].perc + 3;
		superhero[5].perc = superhero[5].perc + 3;
	}
	if (document.fm.superman1[2].checked)
	{
		superhero[0].perc = superhero[0].perc + 10;
		superhero[2].perc = superhero[2].perc + 10;
		superhero[3].perc = superhero[3].perc + 5;
		superhero[4].perc = superhero[4].perc + 5;
		superhero[5].perc = superhero[5].perc + 5;
	}
	if (document.fm.superman1[3].checked)
	{
		superhero[0].perc = superhero[0].perc + 15;
		superhero[2].perc = superhero[2].perc + 15;
		superhero[3].perc = superhero[3].perc + 7;
		superhero[4].perc = superhero[4].perc + 7;
		superhero[5].perc = superhero[5].perc + 7;
	}		
	if (document.fm.superman1[4].checked)
	{
		superhero[0].perc = superhero[0].perc + 20;
		superhero[2].perc = superhero[2].perc + 20;
		superhero[3].perc = superhero[3].perc + 10;
		superhero[4].perc = superhero[4].perc + 10;
		superhero[5].perc = superhero[5].perc + 10;
	}

	// Are you very virtuous?
	if (document.fm.superman2[1].checked)
	{
		superhero[0].perc = superhero[0].perc + 5;
		
	}
	if (document.fm.superman2[2].checked)
	{
		superhero[0].perc = superhero[0].perc + 10;
		
	}
	if (document.fm.superman2[3].checked)
	{
		superhero[0].perc = superhero[0].perc + 15;
		
	}		
	if (document.fm.superman2[4].checked)
	{
		superhero[0].perc = superhero[0].perc + 20;
		
	}
	// Are you a persistent do-gooder?
	if (document.fm.superman3[1].checked)
	{
		superhero[0].perc = superhero[0].perc + 5;
		
	}
	if (document.fm.superman3[2].checked)
	{
		superhero[0].perc = superhero[0].perc + 10;
		
	}
	if (document.fm.superman3[3].checked)
	{
		superhero[0].perc = superhero[0].perc + 15;
		
	}		
	if (document.fm.superman3[4].checked)
	{
		superhero[0].perc = superhero[0].perc + 20;
		
	}
	
	// Are you somewhat reserved and easy going?
	if (document.fm.superman4[1].checked)
	{
		superhero[0].perc = superhero[0].perc + 5;
		
	}
	if (document.fm.superman4[2].checked)
	{
		superhero[0].perc = superhero[0].perc + 10;
		
	}
	if (document.fm.superman4[3].checked)
	{
		superhero[0].perc = superhero[0].perc + 15;
		
	}		
	if (document.fm.superman4[4].checked)
	{
		superhero[0].perc = superhero[0].perc + 20;
		
	}
	
	// Are you an intelligent geek?
	if (document.fm.spiderman0[1].checked)
	{
		superhero[1].perc = superhero[1].perc + 5;
		
	}
	if (document.fm.spiderman0[2].checked)
	{
		superhero[1].perc = superhero[1].perc + 10;
		
	}
	if (document.fm.spiderman0[3].checked)
	{
		superhero[1].perc = superhero[1].perc + 15;
		
	}		
	if (document.fm.spiderman0[4].checked)
	{
		superhero[1].perc = superhero[1].perc + 20;
		
	}
	
	// Do you like redheads?
	if (document.fm.spiderman1[1].checked)
	{
		superhero[1].perc = superhero[1].perc + 5;	
	}
	if (document.fm.spiderman1[2].checked)
	{
		superhero[1].perc = superhero[1].perc + 10;	
	}
	if (document.fm.spiderman1[3].checked)
	{
		superhero[1].perc = superhero[1].perc + 15;	
	}		
	if (document.fm.spiderman1[4].checked)
	{
		superhero[1].perc = superhero[1].perc + 20;	
	}
	
	// Are you accident prone?
	if (document.fm.spiderman2[1].checked)
	{
		superhero[1].perc = superhero[1].perc + 5;	
	}
	if (document.fm.spiderman2[2].checked)
	{
		superhero[1].perc = superhero[1].perc + 10;	
	}
	if (document.fm.spiderman2[3].checked)
	{
		superhero[1].perc = superhero[1].perc + 15;	
	}		
	if (document.fm.spiderman2[4].checked)
	{
		superhero[1].perc = superhero[1].perc + 20;	
	}
	
	// Are you a hopeless romantic?
	if (document.fm.spiderman3[1].checked)
	{
		superhero[1].perc = superhero[1].perc + 5;	
	}
	if (document.fm.spiderman3[2].checked)
	{
		superhero[1].perc = superhero[1].perc + 10;	
	}
	if (document.fm.spiderman3[3].checked)
	{
		superhero[1].perc = superhero[1].perc + 15;	
	}		
	if (document.fm.spiderman3[4].checked)
	{
		superhero[1].perc = superhero[1].perc + 20;	
	}
	
	// Do you have a good sense of humor?
	if (document.fm.spiderman4[0].checked)
	{
		superhero[2].perc = superhero[2].perc + 20;
	}
	if (document.fm.spiderman4[1].checked)
	{
		superhero[1].perc = superhero[1].perc + 5;
		superhero[7].perc = superhero[7].perc + 5;
		superhero[5].perc = superhero[5].perc + 3;
		superhero[2].perc = superhero[2].perc + 15;
	}
	if (document.fm.spiderman4[2].checked)
	{
		superhero[1].perc = superhero[1].perc + 10;
		superhero[7].perc = superhero[7].perc + 10;	
		superhero[5].perc = superhero[5].perc + 5;
		superhero[2].perc = superhero[2].perc + 10;
	}
	if (document.fm.spiderman4[3].checked)
	{
		superhero[1].perc = superhero[1].perc + 15;
		superhero[7].perc = superhero[7].perc + 15;
		superhero[5].perc = superhero[5].perc + 7;	
		superhero[2].perc = superhero[2].perc + 5;
	}		
	if (document.fm.spiderman4[4].checked)
	{
		superhero[1].perc = superhero[1].perc + 20;
		superhero[7].perc = superhero[7].perc + 20;
		superhero[5].perc = superhero[5].perc + 10;	
	}
	
	// Do you like hi-tech gadgets?
	if (document.fm.batman0[1].checked)
	{
		superhero[2].perc = superhero[2].perc + 5;	
	}
	if (document.fm.batman0[2].checked)
	{
		superhero[2].perc = superhero[2].perc + 10;	
	}
	if (document.fm.batman0[3].checked)
	{
		superhero[2].perc = superhero[2].perc + 15;	
	}		
	if (document.fm.batman0[4].checked)
	{
		superhero[2].perc = superhero[2].perc + 20;	
	}
	
	// Did you have a bad childhood?
	if (document.fm.batman1[1].checked)
	{
		superhero[2].perc = superhero[2].perc + 5;	
	}
	if (document.fm.batman1[2].checked)
	{
		superhero[2].perc = superhero[2].perc + 10;	
	}
	if (document.fm.batman1[3].checked)
	{
		superhero[2].perc = superhero[2].perc + 15;	
	}		
	if (document.fm.batman1[4].checked)
	{
		superhero[2].perc = superhero[2].perc + 20;	
	}
	
	// Do you have a dark personality?
	if (document.fm.batman2[1].checked)
	{
		superhero[2].perc = superhero[2].perc + 5;	
	}
	if (document.fm.batman2[2].checked)
	{
		superhero[2].perc = superhero[2].perc + 10;	
	}
	if (document.fm.batman2[3].checked)
	{
		superhero[2].perc = superhero[2].perc + 15;	
	}		
	if (document.fm.batman2[4].checked)
	{
		superhero[2].perc = superhero[2].perc + 20;	
	}
	
	// Do you like to wear thongs?
	if (document.fm.supergirl0[1].checked)
	{
		superhero[3].perc = superhero[3].perc + 5;	
	}
	if (document.fm.supergirl0[2].checked)
	{
		superhero[3].perc = superhero[3].perc + 10;	
	}
	if (document.fm.supergirl0[3].checked)
	{
		superhero[3].perc = superhero[3].perc + 15;	
	}		
	if (document.fm.supergirl0[4].checked)
	{
		superhero[3].perc = superhero[3].perc + 20;	
	}
	
	// Do you have long hair?
	if (document.fm.supergirl1[1].checked)
	{
		superhero[3].perc = superhero[3].perc + 3;	
		superhero[4].perc = superhero[4].perc + 3;
	}
	if (document.fm.supergirl1[2].checked)
	{
		superhero[3].perc = superhero[3].perc + 5;
		superhero[4].perc = superhero[4].perc + 5;	
	}
	if (document.fm.supergirl1[3].checked)
	{
		superhero[3].perc = superhero[3].perc + 7;	
		superhero[4].perc = superhero[4].perc + 7;
	}		
	if (document.fm.supergirl1[4].checked)
	{
		superhero[3].perc = superhero[3].perc + 10;
		superhero[4].perc = superhero[4].perc + 10;	
	}
	
	// Are you VERY comfortable with your body?
	if (document.fm.supergirl2[1].checked)
	{
		superhero[3].perc = superhero[3].perc + 5;
		superhero[4].perc = superhero[4].perc + 5;	
	}
	if (document.fm.supergirl2[2].checked)
	{
		superhero[3].perc = superhero[3].perc + 10;
		superhero[4].perc = superhero[4].perc + 10;	
	}
	if (document.fm.supergirl2[3].checked)
	{
		superhero[3].perc = superhero[3].perc + 15;
		superhero[4].perc = superhero[4].perc + 15;	
	}		
	if (document.fm.supergirl2[4].checked)
	{
		superhero[3].perc = superhero[3].perc + 20;	
		superhero[4].perc = superhero[4].perc + 20;
	}
	
	// Do you value independence and privacy?
	if (document.fm.supergirl3[1].checked)
	{
		superhero[3].perc = superhero[3].perc + 5;	
	}
	if (document.fm.supergirl3[2].checked)
	{
		superhero[3].perc = superhero[3].perc + 10;	
	}
	if (document.fm.supergirl3[3].checked)
	{
		superhero[3].perc = superhero[3].perc + 15;	
	}		
	if (document.fm.supergirl3[4].checked)
	{
		superhero[3].perc = superhero[3].perc + 20;	
	}
	
	// Do ever wear a pushup bra?
	if (document.fm.wonderwoman0[1].checked)
	{
		superhero[4].perc = superhero[4].perc + 5;	
	}
	if (document.fm.wonderwoman0[2].checked)
	{
		superhero[4].perc = superhero[4].perc + 10;	
	}
	if (document.fm.wonderwoman0[3].checked)
	{
		superhero[4].perc = superhero[4].perc + 15;	
	}		
	if (document.fm.wonderwoman0[4].checked)
	{
		superhero[4].perc = superhero[4].perc + 20;	
	}
	
	// Are you beautiful?
	if (document.fm.wonderwoman1[1].checked)
	{
		superhero[4].perc = superhero[4].perc + 5;	
	}
	if (document.fm.wonderwoman1[2].checked)
	{
		superhero[4].perc = superhero[4].perc + 10;	
	}
	if (document.fm.wonderwoman1[3].checked)
	{
		superhero[4].perc = superhero[4].perc + 15;	
	}		
	if (document.fm.wonderwoman1[4].checked)
	{
		superhero[4].perc = superhero[4].perc + 20;	
	}
	
	// Are you good at reading people?
	if (document.fm.wonderwoman2[1].checked)
	{
		superhero[4].perc = superhero[4].perc + 5;	
		superhero[8].perc = superhero[8].perc + 5;
	}
	if (document.fm.wonderwoman2[2].checked)
	{
		superhero[4].perc = superhero[4].perc + 10;
		superhero[8].perc = superhero[8].perc + 10;	
	}
	if (document.fm.wonderwoman2[3].checked)
	{
		superhero[4].perc = superhero[4].perc + 15;
		superhero[8].perc = superhero[8].perc + 15;	
	}		
	if (document.fm.wonderwoman2[4].checked)
	{
		superhero[4].perc = superhero[4].perc + 20;
		superhero[8].perc = superhero[8].perc + 20;	
	}
	
	// Do you like to be in the limelight?
	if (document.fm.robin0[0].checked)
	{
		superhero[5].perc = superhero[5].perc + 20;	
	}
	if (document.fm.robin0[1].checked)
	{
		superhero[5].perc = superhero[5].perc + 15;	
	}
	if (document.fm.robin0[2].checked)
	{
		superhero[5].perc = superhero[5].perc + 10;	
	}
	if (document.fm.robin0[3].checked)
	{
		superhero[5].perc = superhero[5].perc + 5;	
	}		
	if (document.fm.robin0[4].checked)
	{
		superhero[5].perc = superhero[5].perc + 0;	
	}
	
	// Are you young at heart?
	if (document.fm.robin1[1].checked)
	{
		superhero[5].perc = superhero[5].perc + 5;	
	}
	if (document.fm.robin1[2].checked)
	{
		superhero[5].perc = superhero[5].perc + 10;	
	}
	if (document.fm.robin1[3].checked)
	{
		superhero[5].perc = superhero[5].perc + 15;	
	}		
	if (document.fm.robin1[4].checked)
	{
		superhero[5].perc = superhero[5].perc + 20;	
	}
	
	// Are you good at acrobatics?
	if (document.fm.robin2[1].checked)
	{
		superhero[5].perc = superhero[5].perc + 5;	
	}
	if (document.fm.robin2[2].checked)
	{
		superhero[5].perc = superhero[5].perc + 10;	
	}
	if (document.fm.robin2[3].checked)
	{
		superhero[5].perc = superhero[5].perc + 15;	
	}		
	if (document.fm.robin2[4].checked)
	{
		superhero[5].perc = superhero[5].perc + 20;	
	}
	
	// Are you a little naive?
	if (document.fm.robin3[1].checked)
	{
		superhero[5].perc = superhero[5].perc + 5;	
	}
	if (document.fm.robin3[2].checked)
	{
		superhero[5].perc = superhero[5].perc + 10;	
	}
	if (document.fm.robin3[3].checked)
	{
		superhero[5].perc = superhero[5].perc + 15;	
	}		
	if (document.fm.robin3[4].checked)
	{
		superhero[5].perc = superhero[5].perc + 20;	
	}
	
	// Are you easily angered?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.hulk0[n].checked)
			superhero[6].perc = superhero[6].perc + (n*5);
	}
	
	// Do you have hidden strength?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.hulk1[n].checked)
			superhero[6].perc = superhero[6].perc + (n*5);
	}
	
	// Are you a loner?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.hulk2[n].checked)
			superhero[6].perc = superhero[6].perc + (n*5);
	}
	
	// Do you often hurt people without realizing it?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.hulk3[n].checked)
			superhero[6].perc = superhero[6].perc + (n*5);
	}
	
	// Do you move a lot?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.hulk4[n].checked)
			superhero[6].perc = superhero[6].perc + (n*5);
	}
	
	// Are you athletic?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.flash0[n].checked)
			superhero[7].perc = superhero[7].perc + (n*5);
	}
	
	// Are you a fast runner?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.flash1[n].checked)
			superhero[7].perc = superhero[7].perc + (n*5);
	}
	
	// Are you a flirt?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.flash2[n].checked)
			superhero[7].perc = superhero[7].perc + (n*5);
	}
	
	// Are you extremely talented in only one area?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.flash3[n].checked)
			superhero[7].perc = superhero[7].perc + (n*5);
	}
	
	// Will you sometimes go too far to get your way?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.green0[n].checked)
			superhero[8].perc = superhero[8].perc + (n*5);
	}
	
	// Are you interested in space travel?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.green1[n].checked)
			superhero[8].perc = superhero[8].perc + (n*5);
	}
	
	// Do you have strong willpower?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.green2[n].checked)
			superhero[8].perc = superhero[8].perc + (n*5);
	}
	
	// Do you have one object that you highly value?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.green3[n].checked)
			superhero[8].perc = superhero[8].perc + (n*5);
	}
	
	// Have you ever stolen anything?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.catwoman0[n].checked)
			superhero[9].perc = superhero[9].perc + (n*5);
	}
	
	// Do you get in many physical fights with girls?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.catwoman1[n].checked)
			superhero[9].perc = superhero[9].perc + (n*5);
	}
	
	// Do you like animals?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.catwoman2[n].checked)
			superhero[9].perc = superhero[9].perc + (n*5);
	}
	
	// Do you use people to get your way?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.catwoman3[n].checked)
			superhero[9].perc = superhero[9].perc + (n*5);
	}
	
	// Do you like bad boys(or girls)?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.catwoman4[n].checked)
			superhero[9].perc = superhero[9].perc + (n*5);
	}
	
	// Are you much of a drinker?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.ironman0[n].checked)
			superhero[10].perc = superhero[10].perc + (n*5);
	}
	
	// Are you obviously powerful?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.ironman1[n].checked)
			superhero[10].perc = superhero[10].perc + (n*5);
	}
	
	// Are you a show off?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.ironman2[n].checked)
			superhero[10].perc = superhero[10].perc + (n*5);
	}
	
	// Do you like to build things?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.ironman3[n].checked)
			superhero[10].perc = superhero[10].perc + (n*5);
	}
	
	// Have you achieved a lot from hard work?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.ironman4[n].checked)
			superhero[10].perc = superhero[10].perc + (n*5);
	}
	
	// The stuff below this line is for testing
	// to display the scores while answering:
	
	//document.fm.superman.value = superhero[0].perc;
	//document.fm.spiderman.value = superhero[1].perc;
	//document.fm.batman.value = superhero[2].perc;
	//document.fm.supergirl.value = superhero[3].perc;
	//document.fm.wonderwoman.value = superhero[4].perc;
	//document.fm.robin.value = superhero[5].perc;
	//document.fm.hulk.value = superhero[6].perc;
	//document.fm.flash.value = superhero[7].perc;
	//document.fm.greenlantern.value = superhero[8].perc;
	//document.fm.catwoman.value = superhero[9].perc;
	//document.fm.ironman.value = superhero[10].perc;
	
}  // end function update





function copyForm()
{
	parent.location = 'http://www.thesuperheroquiz.com/' +
		'result.htm?a='+superhero[0].perc+
		'&b='+superhero[1].perc+
		'&c='+superhero[2].perc+
		'&d='+superhero[3].perc+
		'&e='+superhero[4].perc+
		'&f='+superhero[5].perc+
		'&g='+superhero[6].perc+
		'&h='+superhero[7].perc+
		'&i='+superhero[8].perc+
		'&j='+superhero[9].perc+
		'&k='+superhero[10].perc;
		
} // end copyForm()

var n = 0;

//document.write('<BR>Superman <INPUT TYPE=TEXT NAME="superman" VALUE="0" SIZE="5">');
//document.write('<BR>Spider-man <INPUT TYPE=TEXT NAME="spiderman" VALUE="0" SIZE="5">');
//document.write('<BR>Batman <INPUT TYPE=TEXT NAME="batman" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Supergirl <INPUT TYPE=TEXT NAME="supergirl" VALUE="0" SIZE="5">');
//document.write('<BR>Wonder Woman <INPUT TYPE=TEXT NAME="wonderwoman" VALUE="0" SIZE="5">');
//document.write('<BR>Robin <INPUT TYPE=TEXT NAME="robin" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Hulk <INPUT TYPE=TEXT NAME="hulk" VALUE="0" SIZE="5">');
//document.write('<BR>The Flash <INPUT TYPE=TEXT NAME="flash" VALUE="0" SIZE="5">');
//document.write('<BR>Green Lantern <INPUT TYPE=TEXT NAME="greenlantern" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Catwoman <INPUT TYPE=TEXT NAME="catwoman" VALUE="0" SIZE="5">');
//document.write('<BR>Iron Man <INPUT TYPE=TEXT NAME="ironman" VALUE="0" SIZE="5">');
//document.write('</TABLE>');

waitMessage();  // make "wait for quiz" message disappear
