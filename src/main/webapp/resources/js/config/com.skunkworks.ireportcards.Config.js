(function() {

	$.ns("com.skunkworks.ireportcards.Config", Config);

	/**
	 * Config class, which will have application level variables.
	 * 
	 * @class Config class
	 * @constructor
	 * @name com.skunkworks.ireportcards.Config
	 */
	function Config() {
		this.templatesUrl = "js/views/templates/";
		this.root = "/ireportcards/";
		this.baseUrl = this.root + "data/";
	}
})();
