'use strict';

 var application = angular.module('application', [
    'ngRoute',
    'applicationControllers',
  ]);
 
application.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/presentation', {
        templateUrl: 'partial/presentation.html',
        controller: 'PresentationController'
      }).
      when('/contact', {
        templateUrl: 'partial/contact.html',
        controller: 'ContactController'
      }).
      otherwise({
        templateUrl: 'partial/listing.html',
        controller: 'ListingController'
      });
  }]);