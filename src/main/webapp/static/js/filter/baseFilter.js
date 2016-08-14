/**
 * 
 */

/**
 * 百分比格式化
 */
myApp.filter('percentage', function() {
	return function(input) {
		if (isNaN(input)) {
			return input;
		}
		return Math.round(input * 100) + '%';
	};
});