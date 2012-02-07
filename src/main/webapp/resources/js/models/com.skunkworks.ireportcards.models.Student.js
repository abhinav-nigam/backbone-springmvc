(function() {
   var StudentModel = Backbone.Model.extend({
      initialize: function() {
         this.bind("error", function(model, error){
            console.log(error,' in ',model);
         });
      }
   });
   $.ns("com.skunkworks.ireportcards.models.Student", StudentModel);
})();