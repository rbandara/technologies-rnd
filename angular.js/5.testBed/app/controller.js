function HelloController($scope, $location) {
    $scope.greeting = { text: 'Hello' };
// use $location for something good here...

    $scope.list = [
        {title: '1.mp3'},
        {title: '2.mp3'}
    ];

    $scope.play = function(e) {
        console.log(e);
        $scope.filename = e;
    }
}