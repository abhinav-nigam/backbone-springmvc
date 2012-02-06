(function() {
/* var StudentModel = Backbone.Model.extend({
      initialize: function() {
         this.bind("error", function(model, error){
            console.log(error,' in ',model);
         });
      }
   });
   $.ns("com.skunkworks.ireportcards.models.Student", StudentModel);*/
	
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
	
	var StudentHomeView = Backbone.View.extend({
        el: $('#student_div'),
		utils: new com.skunkworks.ireportcards.Utils(),
		config: new com.skunkworks.ireportcards.Config(),
        render: function() {
	        var sg = this;
        	sg.utils.getTemplate(sg.config.templatesUrl+"student.jqt", "#studentTemplate",function(){
        		sg.model.firstName = sg.model.studentName.split(" ")[0];
        		sg.model.lastName = sg.model.studentName.split(" ")[1];
    			$.tmpl($("#studentTemplate"),sg.model).appendTo($('#student_div'));
    		    var classTeacherTile = {    
    					over: classTeacherOpen,
    					timeout: 100,
    					out: classTeacherClose
				};
    			    
			    function classTeacherOpen() {
			        $('#class_teacher_tile').fadeIn('fast');
			    }
			 
			    function classTeacherClose() {
			        $('#class_teacher_tile').fadeOut('fast');
			    }
			    
				$('#student_info #classteacher').hoverIntent(classTeacherTile);
    			return this;
        	});
        }
    });
    $.ns("com.skunkworks.ireportcards.views.StudentHome", StudentHomeView);
})();