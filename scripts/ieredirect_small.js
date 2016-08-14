/*
Spider-Bob's Comic Book History Timeline

Author: Bob Moser

Redirect page for IE users */

var browser = navigator.appName
var ver = navigator.appVersion
var thestart = parseFloat(ver.indexOf("MSIE"))+1
var brow_ver = parseFloat(ver.substring(thestart+4,thestart+7))

if ((browser=="Microsoft Internet Explorer") && (brow_ver < 9)) // Redirect for versions less than IE 9
{window.location="../../comicspage_ie8/small/index.htm"}