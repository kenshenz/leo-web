/**
 * 
 */
myApp.controller('indexController', function($scope, $http) {
	
	var watch = $scope.$watch('iframeUrl', function(newVal, oldVal, scope) {
		if (newVal != oldVal) {
			$("#iframe").src = newVal;
		}
	});
	
	watch();
});

$(document).ready(function() {
	var myContent = $("#myContent");
	var iframe = $("#iframe");
	iframe.height(myContent.height());
});

