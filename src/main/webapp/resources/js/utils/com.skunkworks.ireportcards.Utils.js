(function() {
    
   $.ns("com.skunkworks.ireportcards.Utils", Utils);
  
   /**
	 * Utils class, which will contain all the common util functions
	 * @class Utils functions
	 * @constructor
	 * @name com.skunkworks.ireportcards.Utils
	 */
   function Utils() {
	
   }
	
   /**
	 * Responsible for retrieving the template and calling the callback function
	 * @function
	 * @memberOf com.skunkworks.ireportcards.Utils
	 */
   Utils.prototype.getTemplate = function(path, id, fn) {
      if(!path) {
         throw new TypeError("com.skunkworks.ireportcards.Utils#getTemplate - path not defined");
      }

      if(!id) {
         throw new TypeError("com.skunkworks.ireportcards.Utils#getTemplate - id not defined");
      }

      if(!fn) {
         throw new TypeError("com.skunkworks.ireportcards.Utils#getTemplate - fn not defined");
      }
      
      var tmpl = $(id);
      if(tmpl.length) {
         fn.call(this, tmpl);
         return;
      }
      
     $.get(path, $.proxy(function(resp) {      
        $("body").append(resp);
         var tmpl = $(id);
         fn.call(this, tmpl);
      }, this),"html");
   };
   
   
   
   Utils.prototype.getTemplateInContext = function(path, id, fn, bindObj) {
	      if(!path) {
	         throw new TypeError("com.skunkworks.ireportcards.Utils#getTemplate - path not defined");
	      }

	      if(!id) {
	         throw new TypeError("com.skunkworks.ireportcards.Utils#getTemplate - id not defined");
	      }

	      if(!fn) {
	         throw new TypeError("com.skunkworks.ireportcards.Utils#getTemplate - fn not defined");
	      }
	      
	      var tmpl = $(id);
	      if(tmpl.length) {
	         fn.call(bindObj, tmpl);
	         return;
	      }
	      
	     $.get(path, $.proxy(function(resp) {      
	        $("body").append(resp);
	         var tmpl = $(id);
	         fn.call(bindObj, tmpl);
	      }, this),"html");
	   };
  
   /**
   * Update a component record
   * @param {Object} model The model, UI fields change listener is attached to.
   * @function
   * @memberOf com.skunkworks.ireportcards.Utils
   */  

	   Utils.prototype.commonChangeListener = function(model) {
		$('input').change(function() {
			var obj = {};
			obj[this.name] = this.value;
			model.set(obj);
		});
	};

	/***
	 * Gets the value of url parameter with param name
	 * @param keyid
	 * @returns
	 */
	Utils.prototype.getParameterByName = function(name) {
		 var param = (RegExp(name + '=' + '(.+?)(&|$)').exec(location.search)||[,null])[1];
		 if(!param){
			 return param;
		 }else{
			 return decodeURI(param);
		 }
	};	
})();

