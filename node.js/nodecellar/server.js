var express = require('express'),
	products = require('./routes/products');

var app = express();

app.configure(function () {
    app.use(express.logger('dev'));     /* 'default', 'short', 'tiny', 'dev' */
    app.use(express.bodyParser());
});

app.get('/products/:id', products.findById);

app.listen(3000); 
console.log('Server is running at http://127.0.0.1:3000');
