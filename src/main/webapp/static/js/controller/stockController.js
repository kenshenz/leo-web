/**
 * 
 */
myApp.controller('stockController', function($scope, $http) {
	$scope.stockList = [];
	$http.get(basePath + "/uc/stock/getStockList.json").then(function(resp) {
		$scope.stockList = resp.data;
	});
});

