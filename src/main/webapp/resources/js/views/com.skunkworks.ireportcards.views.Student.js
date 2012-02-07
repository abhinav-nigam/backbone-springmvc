(function() {	
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