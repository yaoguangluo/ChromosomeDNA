/*
 * 作者， 著作权人： 罗瑶光， 浏阳
 * */
var am = angular.module("oncall", ['ngCookies']);
am.controller('oncall', ['$cookieStore', '$scope', '$http', function ($cookieStore, $scope, $http) {
//	const headers = new Headers();
//	headers.append('Access-Control-Allow-Headers', 'Content-Type');
//	headers.append('Access-Control-Allow-Origin', '*');
	//ip查找代码来自百度搜索如下4个链接。
	//1:http://stackoverflow.com/questions/391979/how-to-get-clients-ip-address-using-javascript-only
	//2:https://github.com/diafygi/webrtc-ips
	//3:http://www.yiichina.com/tutorial/459
	//4:http://www.html-js.com/article/Learn-JavaScript-every-day-to-understand-what-JavaScript-Promises
	function getUserIP(onNewIP) { //  onNewIp - your listener function for new IPs
		//compatibility for firefox and chrome
		var myPeerConnection = window.RTCPeerConnection || window.mozRTCPeerConnection || window.webkitRTCPeerConnection;
		var pc = new myPeerConnection({
			iceServers: []
		}),noop = function() {}, localIPs = {},
		ipRegex = /([0-9]{1,3}(\.[0-9]{1,3}){3}|[a-f0-9]{1,4}(:[a-f0-9]{1,4}){7})/g, key;
		function iterateIP(ip) {
			if (!localIPs[ip]) onNewIP(ip);
			localIPs[ip] = true;
		}
		pc.createDataChannel("");
		pc.createOffer().then(function(sdp) {
			sdp.sdp.split('\n').forEach(function(line) {
				if (line.indexOf('candidate') < 0) return;
				line.match(ipRegex).forEach(iterateIP);
			});
			pc.setLocalDescription(sdp, noop, noop);
		}).catch(function(reason) {
		});
		pc.onicecandidate = function(ice) {
			if (!ice || !ice.candidate || !ice.candidate.candidate || !ice.candidate.candidate.match(ipRegex)) return;
			ice.candidate.candidate.match(ipRegex).forEach(iterateIP);
		};
	}
	// Usage
	getUserIP(function(ip){
		$cookieStore.put("ip", ip);
//		headers.append('Access-ip', ip);
	});
	$scope.email = $cookieStore.get('email');
	$scope.token = $cookieStore.get('token');
	 
}]);