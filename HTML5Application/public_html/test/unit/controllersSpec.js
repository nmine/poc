describe('PhoneCat controllers', function() {
 
  describe('PresentationController', function(){
 
    it('should create "phones" model with 3 phones', function() {
      var scope = {},
          ctrl = new PresentationController(scope);
 
      expect(scope.phones.length).toBe(3);
    });
  });
});