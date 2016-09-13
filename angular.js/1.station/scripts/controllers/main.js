'use strict';

/**
 * @ngdoc function
 * @name webplayerApp.controller:TrendingAudioCtrl
 * @description
 * # MainCtrl
 * Controller of the webplayerApp
 */
angular.module('webplayerApp')
  .controller('TrendingAudioCtrl', function ($scope, $http) {
    $http.get('http://localhost:9000/webplayer/trending').
    	success(function(data)) {
    		$scope.audioSummaryList=data;
    	} 
  });
