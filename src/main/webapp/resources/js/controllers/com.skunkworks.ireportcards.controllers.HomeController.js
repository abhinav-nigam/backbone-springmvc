(function() {
	var HomeController = Backbone.Router.extend({
		utils: new com.skunkworks.ireportcards.Utils(),
		config: new com.skunkworks.ireportcards.Config(),
		routes : {
			"" : "studenthome"
		},
		initialize : function() {
			return this;
		},
		studenthome : function(){
			var sg = this;
			$.ajax({
				url : 'http://localhost:8080/ireportcards/data/student/teststudent1',
				dataType : 'json',
				success : function(data) {
						new com.skunkworks.ireportcards.views.StudentHome({
							model : data
						}).render();
				}
			});
		}
	});
	
	$.ns("com.skunkworks.ireportcards.controllers.HomeController", HomeController);				
});