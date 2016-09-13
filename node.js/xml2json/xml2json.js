var parseString = require('xml2js').parseString;
var xml = "<root> Hello World </root>";
parseString(xml, function(err,result) {
	console.dir(result)
});