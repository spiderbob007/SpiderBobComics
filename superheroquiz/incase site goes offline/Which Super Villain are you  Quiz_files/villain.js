var no = 0;
var yes = 1;
var maybe = 2;


function item(name, perc)
{
        this.name = name;
        this.perc = perc;
}

villain = new item(15);

villain[0] = new item('Venom', 0);
villain[1] = new item('The Joker', 0);
villain[2] = new item('Catwoman', 0);
villain[3] = new item('Magneto', 0);
villain[4] = new item('Lex Luthor', 0);
villain[5] = new item('Apocalypse', 0);
villain[6] = new item('Poison Ivy', 0);
villain[7] = new item('Juggernaut', 0);
villain[8] = new item('Dr. Doom', 0);
villain[9] = new item('Mystique', 0);
villain[10] = new item('Mr. Freeze', 0);
villain[11] = new item('Dark Phoenix', 0);
villain[12] = new item('Riddler', 0);
villain[13] = new item('Green Goblin', 0);
villain[14] = new item('Two-Face', 0);
villain[15] = new item('Kingpin', 0);

function change(who, n, perc, yesno)
{
	if (yesno == yes)
	{
		villain[who].perc = villain[who].perc + Math.round(n*perc);	
	}
	else if (yesno == no)
	{
		villain[who].perc = villain[who].perc + Math.round(4*perc) - Math.round(n*perc);
	}
	else // if yesno == maybe
	{
		// full no is 0 and full yes is 4
		// so if n is near middle then...
		if (n == 1)
			villain[who].perc = villain[who].perc + 2 * perc;
		if (n == 2)
			villain[who].perc = villain[who].perc + 4 * perc;
		if (n == 3)
			villain[who].perc = villain[who].perc + 2 * perc;
	}
} // end function change()



function update()
{
	var venom = 0;
	var venom100 = 3; // 100 / 8 = 12.5; 12 / 4 = 3 (96)
	var venom50 = 1; // (4) q8
	var joker = 1; 
	var joker100 = 2.5; // 100 / 10 = 10; 10 / 4 = 2.5 (100)
    var catwoman = 2;
    var catwoman100 = 2.75; // 100 / 9 = 11; 11 / 4 = 2.75 (99)
    var magneto = 3; 
    var magneto100 = 2.75; // 100 / 9 = 11; 11 / 4 = 2.75 (99)
    var lex = 4;
    var lex100 = 2.5; // 100 / 10 = 10; 10 / 4 = 2.5 (100)
    var apoc = 5;
    var apoc100 = 2.5; // 100 / 10 = 10; 10 / 4 = 2.5 (100)
    var ivy = 6;
    var ivy100 = 2.5; // 100 / 10 = 10; 10 / 4 = 2.5 (100)
    var jug = 7;
    var jug100 = 4; // 100 / 6 = 16.66; 16 / 4 = 4 (96)
    var jug50 = 1; // (4) q8
    var doom = 8;
    var doom100 = 2.5; // 100 / 10 = 10; 10 / 4 = 2.5 (100)
    var mystique = 9;
    var mystique100 = 4; // 100 / 6 = 16.66; 16 / 4 = 4 (96)
    var mystique50 = 1; // (4) q8
    var freeze = 10;
    var freeze100 = 3.5; // 100 / 7 = 14; 14 / 4 = 3.5 (98)
    var dark = 11;
    var dark100 = 2.75; // 100 / 9 = 11; 11 / 4 = 2.75 (99)
    var riddler = 12;
    var riddler100 = 3.5; // 100 / 7 = 14; 14 / 4 = 3.5 (98)
	var goblin = 13;
	var goblin100 = 4; // 100 / 6 = 16.66; 16 / 4 = 4 (96)
	var goblin50 = 1; // (4) q8
	var twoface = 14;
	var twoface100 = 4; // 100 / 6 = 16.66; 16 / 4 = 4 (96)
	var twoface50 = 1; // (4) q8
	var kingpin = 15;
	var kingpin100 = 2.25; // 100 / 11 = 9; 9 / 4 = 2.5 (99)
	
	for (var n = 0; n < 16; n++)
		villain[n].perc = 0;
			
	// Do you feel alienated or out of place?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q1[n].checked)
		{
			change(venom, n, venom100, yes);
			change(mystique, n, mystique100, yes);
			change(dark, n, dark100, yes);
		}
	}
	
	// Do you feed off of adrenaline?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q2[n].checked)
		{
			change(venom, n, venom100, yes);
		}
	}		
	
	// Have you been pushed over the edge by events in life?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q3[n].checked)
		{
			change(venom, n, venom100, yes);
			change(joker, n, joker100, yes);
			change(freeze, n, freeze100, yes);
		}
	}		
	
	// Do you often seek revenge?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q4[n].checked)
		{
			change(venom, n, venom100, yes);
			change(lex, n, lex100, yes);
			change(doom, n, doom100, yes);
			change(freeze, n, freeze100, yes);
			change(twoface, n, twoface100, yes);
		}
	}
	
	// Are you a master of camouflage?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q5[n].checked)
		{
			change(venom, n, venom100, yes);
			change(mystique, n, mystique100, yes);
		}
	}		
	
	// Have you worked hard to bulk up your body?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q6[n].checked)
		{
			change(venom, n, venom100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Are you very intelligent?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q7[n].checked)
		{
			change(joker, n, joker100, yes);
			change(magneto, n, magneto100, yes);
			change(lex, n, lex100, yes);
			change(apoc, n, apoc100, yes);
			change(jug, n, jug100, no);
			change(doom, n, doom100, yes);
			change(freeze, n, freeze100, yes);
		}
	}		
	
	// Do you often use violence to solve problems?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q8[n].checked)
		{
			change(joker, n, joker100, yes);
			change(dark, n, dark100, yes);
			change(venom, n, venom50, yes);
			change(jug, n, jug50, yes);
			change(mystique, n, mystique50, yes);
			change(goblin, n, goblin50, yes);
			change(twoface, n, twoface50, yes);
		}
	}		
	
	// Do people often call you "crazy"?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q9[n].checked)
		{
			change(joker, n, joker100, yes);
			change(goblin, n, goblin100, yes);
			change(twoface, n, twoface100, yes);
		}
	}		
	
	// Are you a practical joker?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q10[n].checked)
		{
			change(joker, n, joker100, yes);
			change(riddler, n, riddler100, yes);
		}
	}		
	
	// Do you often steal things?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q11[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
		}
	}		
	
	// Do you resent figures of authority?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q12[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(ivy, n, ivy100, yes);
		}
	}		
	
	// Did you have a traumatic childhood?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q13[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(magneto, n, magneto100, yes);
			change(apoc, n, apoc100, yes);
			change(goblin, n, goblin100, yes);
			change(twoface, n, twoface100, yes);
		}
	}		
	
	// Are you an orphan?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q14[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Are you street smart?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q15[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Do you enjoy wearing skintight clothes?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q16[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(riddler, n, riddler100, yes);
		}
	}		
	
	// Have you often been a victim of discrimination or prejudice?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q17[n].checked)
		{
			change(magneto, n, magneto100, yes);
			change(apoc, n, apoc100, yes);
			change(mystique, n, mystique100, yes);
		}
	}		
	
	// To accomplish your goal are you willing to injure bystanders?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q18[n].checked)
		{
			change(magneto, n, magneto100, yes);
			change(ivy, n, ivy100, yes);
		}
	}		
	
	// Are you bald?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q19[n].checked)
		{
			change(lex, n, lex100, yes);
			change(freeze, n, freeze100, yes);
		}
	}		
	
	// Are you a businessman?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q20[n].checked)
		{
			change(lex, n, lex100, yes);
			change(goblin, n, goblin100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Do you crave power?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q21[n].checked)
		{
			change(magneto, n, magneto100, yes);
			change(lex, n, lex100, yes);
			change(apoc, n, apoc100, yes);
			change(doom, n, doom100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Are you rich?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q22[n].checked)
		{
			change(joker, n, joker100, yes);
			change(lex, n, lex100, yes);
			change(doom, n, doom100, yes);
			change(goblin, n, goblin100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Do you usually have a close female assistant?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q23[n].checked)
		{
			change(joker, n, joker100, yes);
			change(magneto, n, magneto100, yes);
			change(lex, n, lex100, yes);
			change(riddler, n, riddler100, yes);
		}
	}		
	
	// Do you feel like you are invincible?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q24[n].checked)
		{
			change(apoc, n, apoc100, yes);
			change(jug, n, jug100, yes);
			change(dark, n, dark100, yes);
		}
	}		
	
	// Do you believe in "might is right"?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q25[n].checked)
		{
			change(magneto, n, magneto100, yes);
			change(apoc, n, apoc100, yes);
			
		}
	}
	
	// Do you like to be the leader?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q26[n].checked)
		{
			change(magneto, n, magneto100, yes);
			change(lex, n, lex100, yes);
			change(apoc, n, apoc100, yes);
			change(doom, n, doom100, yes);
		}
	}		
	
	// Are you part of the feminist movement?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q27[n].checked)
		{
			change(ivy, n, ivy100, yes);
		}
	}		
	
	// Are you an environmentalist?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q28[n].checked)
		{
			change(ivy, n, ivy100, yes);
		}
	}		
	
	// Do you love plants and gardening?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q29[n].checked)
		{
			change(ivy, n, ivy100, yes);
		}
	}		
	
	// Do you have long hair?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q30[n].checked)
		{
			change(ivy, n, ivy100, yes);
			change(dark, n, dark100, yes);
		}
	}		
	
	// Are you beautiful?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q31[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(ivy, n, ivy100, yes);
			change(mystique, n, mystique100, yes);
			change(dark, n, dark100, yes);
		}
	}		
	
	// Do you work with hazardous or poisonous materials?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q32[n].checked)
		{
			change(joker, n, joker100, yes);
			change(ivy, n, ivy100, yes);
			change(freeze, n, freeze100, yes);
		}
	}		
	
	// Are you a bully?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q33[n].checked)
		{
			//change(apoc, n, apoc100, yes);
			change(jug, n, jug100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Are you strong?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q34[n].checked)
		{
			change(venom, n, venom100, yes);
			change(apoc, n, apoc100, yes);
			change(jug, n, jug100, yes);
			change(dark, n, dark100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Do you strongly desire wealth?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q35[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(lex, n, lex100, yes);
			change(jug, n, jug100, yes);
			change(doom, n, doom100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}		
	
	// Do you think you are superior to everyone around you?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q36[n].checked)
		{
			change(magneto, n, magneto100, yes);
			change(apoc, n, apoc100, yes);
			change(jug, n, jug100, yes);
			change(doom, n, doom100, yes);
			change(dark, n, dark100, yes);
		}
	}		
	
	// Are you often accused of being conceited?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q37[n].checked)
		{
			change(lex, n, lex100, yes);
			change(apoc, n, apoc100, yes);
			change(ivy, n, ivy100, yes);
			change(doom, n, doom100, yes);
		}
	}		
	
	// Do you have a horrible scar?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q38[n].checked)
		{
			change(doom, n, doom100, yes);
			change(twoface, n, twoface100, yes);
		}
	}		
	
	// Are you motherly?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q39[n].checked)
		{
			change(mystique, n, mystique100, yes);
		}
	}		
	
	// Do you manipulate others with your looks?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q40[n].checked)
		{
			change(catwoman, n, catwoman100, yes);
			change(ivy, n, ivy100, yes);
			change(mystique, n, mystique100, yes);
		}
	}		
	
	// Are you scientifically minded?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q41[n].checked)
		{
			change(doom, n, doom100, yes);
			change(freeze, n, freeze100, yes);
			change(goblin, n, goblin100, yes);
		}
	}		
	
	// Do you enjoy cold temperatures?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q42[n].checked)
		{
			change(freeze, n, freeze100, yes);
		}
	}		
	
	// Do you have a hard time controlling yourself?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q43[n].checked)
		{
			change(joker, n, joker100, yes);
			change(dark, n, dark100, yes);
		}
	}		
	
	// Do you like solving or creating puzzles?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q44[n].checked)
		{
			change(joker, n, joker100, yes);
			change(riddler, n, riddler100, yes);
		}
	}		
	
	// Are you obsessive compulsive?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q45[n].checked)
		{
			change(riddler, n, riddler100, yes);
		}
	}		
	
	// Are you hyperactive?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q46[n].checked)
		{
			change(riddler, n, riddler100, yes);
		}
	}		
	
	// Do you take performance or strength enhancers?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q47[n].checked)
		{
			change(goblin, n, goblin100, yes);
		}
	}		
	
	// Do you have a split personality?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q48[n].checked)
		{
			change(venom, n, venom100, yes);
			change(dark, n, dark100, yes);
			change(twoface, n, twoface100, yes);
		}
	}		
	
	// Have you been trained as a lawyer?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q49[n].checked)
		{
			change(twoface, n, twoface100, yes);
		}
	}		
	
	// Do you walk with a cane?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q50[n].checked)
		{
			change(riddler, n, riddler100, yes);
			change(kingpin, n, kingpin100, yes);
		}
	}
	
	// Are you overweight?
	for (n = 0; n < 5; n++)
	{
		if (document.fm.q51[n].checked)
		{
			change(kingpin, n, kingpin100, yes);
		}
	}		
			
			
																	
	
	
	
	// The stuff below this line is for testing
	// to display the scores while answering:
	
	//document.fm.venom.value = villain[0].perc;
	//document.fm.joker.value = villain[1].perc;
	//document.fm.catwoman.value = villain[2].perc;
	//document.fm.magneto.value = villain[3].perc;
	//document.fm.lex.value = villain[4].perc;
	//document.fm.apoc.value = villain[5].perc;
	//document.fm.ivy.value = villain[6].perc;
	//document.fm.jug.value = villain[7].perc;
	//document.fm.doom.value = villain[8].perc;
	//document.fm.mystique.value = villain[9].perc;
	//document.fm.freeze.value = villain[10].perc;
	//document.fm.dark.value = villain[11].perc;
	//document.fm.riddler.value = villain[12].perc;
	//document.fm.goblin.value = villain[13].perc;
	//document.fm.twoface.value = villain[14].perc;
	//document.fm.kingpin.value = villain[15].perc;
}  // end function update





function copyForm()
{
	parent.location = 'result.htm?a='+villain[0].perc+
		'&b='+villain[1].perc+
		'&c='+villain[2].perc+
		'&d='+villain[3].perc+
		'&e='+villain[4].perc+
		'&f='+villain[5].perc+
		'&g='+villain[6].perc+
		'&h='+villain[7].perc+
		'&i='+villain[8].perc+
		'&j='+villain[9].perc+
		'&k='+villain[10].perc+
		'&l='+villain[11].perc+
		'&m='+villain[12].perc+
		'&n='+villain[13].perc+
		'&o='+villain[14].perc+
		'&p='+villain[15].perc;
		
} // end copyForm()

var n = 0;

//document.write('<TABLE><TR ALIGN="right"><TD>');
//document.write('<BR>Venom <INPUT TYPE=TEXT NAME="venom" VALUE="0" SIZE="5">');
//document.write('<BR>Joker <INPUT TYPE=TEXT NAME="joker" VALUE="0" SIZE="5">');
//document.write('<BR>Catwoman <INPUT TYPE=TEXT NAME="catwoman" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Magneto <INPUT TYPE=TEXT NAME="magneto" VALUE="0" SIZE="5">');
//document.write('<BR>Lex <INPUT TYPE=TEXT NAME="lex" VALUE="0" SIZE="5">');
//document.write('<BR>Apoc <INPUT TYPE=TEXT NAME="apoc" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Ivy <INPUT TYPE=TEXT NAME="ivy" VALUE="0" SIZE="5">');
//document.write('<BR>Jug <INPUT TYPE=TEXT NAME="jug" VALUE="0" SIZE="5">');
//document.write('<BR>Doom <INPUT TYPE=TEXT NAME="doom" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Mystique <INPUT TYPE=TEXT NAME="mystique" VALUE="0" SIZE="5">');
//document.write('<BR>Freeze <INPUT TYPE=TEXT NAME="freeze" VALUE="0" SIZE="5">');
//document.write('<BR>Dark Ph <INPUT TYPE=TEXT NAME="dark" VALUE="0" SIZE="5">');
//document.write('<TD>');
//document.write('<BR>Riddler <INPUT TYPE=TEXT NAME="riddler" VALUE="0" SIZE="5">');
//document.write('<BR>Goblin <INPUT TYPE=TEXT NAME="goblin" VALUE="0" SIZE="5">');
//document.write('<BR>Two-Face <INPUT TYPE=TEXT NAME="twoface" VALUE="0" SIZE="5">');
//document.write('<BR>Kingpin <INPUT TYPE=TEXT NAME="kingpin" VALUE="0" SIZE="5">');

//document.write('</TR></TABLE>');

waitMessage();  // make "wait for quiz" message disappear
