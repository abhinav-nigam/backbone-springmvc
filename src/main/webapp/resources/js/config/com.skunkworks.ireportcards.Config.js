(function() {

	/**
	 * Config class, which will have application level variables.
	 * 
	 * @class Config class
	 * @constructor
	 * @name com.skunkworks.ireportcards.Config
	 */
	function Config() {
		this.templatesUrl = "resources/js/views/templates/";
		this.root = "/ireportcards/";
		this.baseUrl = this.root + "data/";
	}
	$.ns("com.skunkworks.ireportcards.Config", Config);
})();
