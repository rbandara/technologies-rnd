var app = angular.module("MyApp", ["ngResource"]);

function MyCtrl($scope, $resource) {
    var TwitterAPI = $resource("http://prodnj.productdataservice.barnesandnoble.com:8080/ProductDataServices/rest/ProductData?ean=(EAN)",
        { callback: "JSON_CALLBACK" },
        { get: { method: "JSONP" }});

    $scope.search = function() {
        $scope.searchResult = TwitterAPI.get({ q: $scope.searchTerm });
    };
}