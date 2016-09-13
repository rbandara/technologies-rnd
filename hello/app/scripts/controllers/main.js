'use strict';

angular.module('rbandara.Hello')

  .controller('MainCtrl', function($scope, $location, version) {

    $scope.$path = $location.path.bind($location);
    $scope.version = version;

  });
