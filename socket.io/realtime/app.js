var express = require('express')
var sio = require('socket.io');
var app = express()

app.get('/', function (req, res) {
  res.send('Hello World!')
})

var server = app.listen(3000, function () {

  var host = server.address().address
  var port = server.address().port

  console.log('Example app listening at http://%s:%s', host, port);
  
});

io = sio.listen(server);     

io.sockets.on('connection', function (socket) {
    var data="my data from server.....";
    console.log("emitting event now from server..........."+data);
    io.sockets.emit('myEvent', data);
});


 