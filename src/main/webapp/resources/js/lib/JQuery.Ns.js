(function( $ ){
  /*
    obj is completely optional and allows the following
  
    $.ns("my.whatever", function() {})
    
    or
    
    var myobj = {}
    $.ns("my.whatever", myobj);
  */
  
  $.ns = function(ns, obj) {
    var parts = ns.split(".");
    var root = window || {};
    
    for(var i=0;i<parts.length;i++) {
      
      if(typeof root[parts[i]] != "object") {
        root[parts[i]] = (i == parts.length - 1 && obj) ? obj : {};
      }
      
      // ensure the current root is now the current object       
      root = root[parts[i]];
    }
    return root;
  };
})( jQuery );