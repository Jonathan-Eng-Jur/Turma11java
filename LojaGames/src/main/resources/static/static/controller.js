var app = angular.module('myApp', []);

app.controller('myCtrl', function($scope, $http) {

  $scope.manutencoes = new Object();


$scope.salvar = function() {
  $http.post("http://localhost:8080/categoria/categorias", {
    'id':$scope.id,
    'titulo':$scope.nome,
    'produto':$scope.data,
    'categoria':$scope.categoria
 
        
  })
  };   

});