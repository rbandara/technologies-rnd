
var user = 'product';

var password = 'productData1';

var mongo = require('mongodb');

var Server = mongo.Server,
	Db = mongo.Db,
	BSON = mongo.BSONPure;

var server = new Server('tqapdsmr02.bnqa.bn-dev.com', 27017, {auto_reconnect : true});

db = new Db('productData',server);


db.open(function(err, db) {
    if(!err) {
        console.log("Connected to database");
        db.authenticate(user, password, function(err, res) {
            if(!err) {
                console.log("Authenticated");
            } else {
                console.log("Error in authentication.");
                console.log(err);
            }
        });
    } else {
        console.log("Error in open().");
        console.log(err);
    };
});

exports.findById = function(req,res) {
	var eanId = req.params.id;
	console.log('Retreiving product data for ean ' + eanId);
	db.collection('products', function(err, collection) {
		collection.findOne({'_id' : Number(eanId)}, function(err, item) {
			res.send(item);
		});
	}); 	
};