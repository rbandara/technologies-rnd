'use strict';

/**
 * @ngdoc function
 * @name webplayerApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the webplayerApp
 */
angular.module('webplayerApp')
  .controller('AboutCtrl', function ($scope) {
    $scope.awesomeThings = [
      'HTML5 Boilerplate',
      'AngularJS',
      'Karma'
    ];
  });
