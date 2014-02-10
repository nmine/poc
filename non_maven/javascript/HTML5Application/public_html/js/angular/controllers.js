'use strict';

var applicationControllers = angular.module('applicationControllers', []);
 
applicationControllers.controller('PresentationController', ['$scope', '$http',
  function ($scope, $http) {
      $scope.phones = 5;
      console.log($scope.phones);
//    $http.get('phones/phones.json').success(function(data) {
//      $scope.phones = data;
//    });
//    $scope.orderProp = 'age';
  }]);
 
applicationControllers.controller('ContactController', ['$scope', '$routeParams', '$http',
  function($scope, $routeParams, $http) {
    $http.get('phones/' + $routeParams.phoneId + '.json').success(function(data) {
      $scope.phone = data;
    });
  }]);
  
  applicationControllers.controller('ListingController', ['$scope', '$routeParams', '$http',
  function($scope, $routeParams, $http) {
    $http.get('phones/' + $routeParams.phoneId + '.json').success(function(data) {
      $scope.phone = data;
    });
  }]);