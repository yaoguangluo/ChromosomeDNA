/*
 * 作者， 著作权人： 罗瑶光， 浏阳
 * */
var am = angular.module("data", ['ngCookies']);
am.controller('data', ['$cookieStore', '$scope', '$http', '$compile'
	, function ($cookieStore, $scope, $http, $compile, fileReader) {
	$scope.dataWS = function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataWS?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.ws,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	
	$scope.dataCX= function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataCX?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.cx,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	
	$scope.dataCY = function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataCY?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.cy,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	$scope.dataXL = function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataXL?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value
					= decodeURIComponent(response.data.xl,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	$scope.dataRN = function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataRN?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value
					= decodeURIComponent(response.data.rn,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	
	$scope.dataCG = function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataCG?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value
					= decodeURIComponent(response.data.cg,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	$scope.dataCJ = function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataCJ?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.cj,"UTF-8");
				}, function errorCallback(response) {
				});
	}
	$scope.dataCL = function () {
		window.location.href='http://tinos.qicp.vip/loginto.html';
//		var askMessage = document.getElementById("data-left-textarea").value;
//		$http.post('dataCL?message=' + encodeURIComponent(askMessage))
//				.then(function successCallback(response) {
//					document.getElementById("data-right-textarea").value 
//					= decodeURIComponent(response.data.cl,"UTF-8"); 
//				}, function errorCallback(response) {
//				});
	}
	
	$scope.dataXX= function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataXX?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.xx,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	
	$scope.dataHF= function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataHF?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.hf,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	
	$scope.dataCP= function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataCP?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.cp,"UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	
	$scope.dataZF= function () {
		var askMessage = document.getElementById("data-left-textarea").value;
		$http.post('dataZF?message=' + encodeURIComponent(askMessage))
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.zf, "UTF-8"); 
				}, function errorCallback(response) {
				});
	}
	//20220816 罗瑶光
	//准备加点后端发来的pds token，充10000点，进行计费模式 使用一次减1点。
	//准备加token和email 从cookie里面post后端。
	//PDStoken到后端pde计算与 email的pde计算相同就减点。
	$scope.dataYL= function () {
		var askMessage= document.getElementById("data-left-textarea").value;
		var tokenPDS= $cookieStore.get('token');
		var email= $cookieStore.get('email');
		alert("询问测试！" + tokenPDS + ' ' + email);
		$http.post(
				'dataYL?message=' + encodeURIComponent(askMessage)
				+'&token='+ encodeURIComponent(tokenPDS)
				+'&email='+ encodeURIComponent(email)
		)
				.then(function successCallback(response) {
					document.getElementById("data-right-textarea").value 
					= decodeURIComponent(response.data.yl,"UTF-8"); 
				}, function errorCallback(response) {
					window.location.href='http://tinos.qicp.vip/loginto.html';
				});
	}
}]);