/*
Spider-Bob's Comic Book History Timeline

Author: Bob Moser

Redirect page for users of older version of Internet Explorer */

var browser = navigator.appName
var ver = navigator.appVersion
var thestart = parseFloat(ver.indexOf("MSIE"))+1
var brow_ver = parseFloat(ver.substring(thestart+4,thestart+7))

if ((browser=="Microsoft Internet Explorer") && (brow_ver < 10))
{window.location="timeline_ie_redirect.php"}