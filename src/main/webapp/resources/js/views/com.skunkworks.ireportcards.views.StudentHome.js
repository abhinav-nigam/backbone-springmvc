(function() {
    var StudentHomeView = Backbone.View.extend({
        el: $('#dashboard_sidebar'),
		utils: new com.skunkworks.ireportcards.Utils(),
		config: new com.skunkworks.ireportcards.Config(),
        render: function() {
	        var sg = this;
        	sg.utils.getTemplate(sg.config.templatesUrl+"student.jqt", "#studentTemplate",function(){
    			$.tmpl($("#studentTemplate"),sg.model).appendTo(sg.el);
    			return this;
        	});
        }
    });
    $.ns("com.skunkworks.ireportcards.views.StudentHome", StudentHomeView);
});
