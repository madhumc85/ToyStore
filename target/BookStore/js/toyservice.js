angular.module('toyApp.services', []).
    factory('toyService', function($http) {

        var toyQueryAPI = {};

        toyQueryAPI.getToys = function() {
            return $http({
                method: 'GET',
                url: 'http://localhost:7001/ToyStore/rest/toys'
            });
        }
        return toyQueryAPI;
    });