/**
 * 
 */
//leo-menu
myApp.directive('leoMenu', function() {
	return {
		restrict: 'E',
		template: '<ul class="sidebar-menu">'
			+ '<li class="header">HEADER</li>'
			+ ''
			+ '</ul>',
		scope: {
			
		},
		link: function(scope, element, attrs) {
			
		}
		
	};
});