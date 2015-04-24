angular.module('toyApp.controllers', [])
    .controller('toyListCtrl', function ($scope,toyService) {

    $scope.toyList = [];
    toyService.getToys().success(function (response) {
        //Dig into the responde to get the relevant data
        $scope.toyList = response;
    });

    $scope.gridOptions = {
        data: 'toyList',
        columnDefs: [{field:'id', displayName:'ID'}, {field:'name', displayName:'Name'}, {field:'title', displayName:'Title'}, {field:'gender', displayName:'Gender'}],
        showGroupPanel: true,
        jqueryUITheme: true
    };
});