/**
 * 
 */
var local = window.location;
var contextPath = local.pathname.split("/")[1];
var basePath = local.protocol + "//" + local.host + "/" + contextPath;
var myApp = angular.module('myApp', []);
