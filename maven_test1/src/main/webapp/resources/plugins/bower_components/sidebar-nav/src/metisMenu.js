;(function($, window, document, undefined) {

    var pluginName = "metisMenu",
        defaults = {
            toggle: true,
            doubleTapToGo: false
        };

    function Plugin(element, options) {
        this.element = $(element);
        this.settings = $.extend({}, defaults, options);
        this._defaults = defaults;
        this._name = pluginName;
        this.init();
    }

    Plugin.prototype = {
        init: function() {

            var $this = this.element,
                $toggle = this.settings.toggle,
                obj = this;
            
            var wholeThis = this;
            
            if (this.isIE() <= 9) {
                $this.find("li.active").has("ul").children("ul").collapse("show");
                $this.find("li").not(".active").has("ul").children("ul").collapse("hide");
            } else {
                $this.find("li.active").has("ul").children("ul").addClass("collapse in");
                $this.find("li").not(".active").has("ul").children("ul").addClass("collapse");
            }

            //add the "doubleTapToGo" class to active items if needed
            if (obj.settings.doubleTapToGo) {
                $this.find("li.active").has("ul").children("a").addClass("doubleTapToGo");
            }

            $this.find("li").has("ul").children("a").on("click" + "." + pluginName, function(e) {
                e.preventDefault();
//                setTimeout(""+$(this)+".next('ul').css('display','block');",1000);
//                $(this).next('ul').css('display','block');
//                $(this).next('ul').slideDown(500);
                //只remove掉其下级的toggle
//            	$('a').not(this).removeAttr('toggle');
            	$(this).parent('li').parent('ul').find('a').not(this).removeAttr('toggle');
                var $toggle = $(this).attr('toggle');
                if ($toggle == 'up' || Utils.isEmpty($toggle)) {
//                  $(this).parent("li").siblings().removeClass("active").children("ul.in").collapse("hide");
                	if($(this).next('ul'))
                		$(this).next('ul').slideDown(500);
	            }else{
	            	if($(this).next('ul'))
	            		$(this).next('ul').slideUp(500);
	            }
                if($(this).next('ul')){
                	if(Utils.isEmpty($toggle) || $toggle == 'up'){
                		$(this).attr('toggle','down');
                	}else{
                		$(this).attr('toggle','up');
                	}
                }
                
                //Do we need to enable the double tap
                if (obj.settings.doubleTapToGo) {

                    //if we hit a second time on the link and the href is valid, navigate to that url
                    if (obj.doubleTapToGo($(this)) && $(this).attr("href") !== "#" && $(this).attr("href") !== "") {
                        e.stopPropagation();
                        document.location = $(this).attr("href");
                        return;
                    }
                }

                /*$(this).parent("li").toggleClass("active").children("ul").collapse("toggle");*/

                

            });
        },

        isIE: function() { //https://gist.github.com/padolsey/527683
            var undef,
                v = 3,
                div = document.createElement("div"),
                all = div.getElementsByTagName("i");

            while (
                div.innerHTML = "<!--[if gt IE " + (++v) + "]><i></i><![endif]-->",
                all[0]
            ) {
                return v > 4 ? v : undef;
            }
        },

        //Enable the link on the second click.
        doubleTapToGo: function(elem) {
            var $this = this.element;

            //if the class "doubleTapToGo" exists, remove it and return
            if (elem.hasClass("doubleTapToGo")) {
                elem.removeClass("doubleTapToGo");
                return true;
            }

            //does not exists, add a new class and return false
            if (elem.parent().children("ul").length) {
                 //first remove all other class
                $this.find(".doubleTapToGo").removeClass("doubleTapToGo");
                //add the class on the current element
                elem.addClass("doubleTapToGo");
                return false;
            }
        },

        remove: function() {/*
            this.element.off("." + pluginName);
            this.element.removeData(pluginName);
        */}

    };

    $.fn[pluginName] = function(options) {
        this.each(function () {
            var el = $(this);
            if (el.data(pluginName)) {
                el.data(pluginName).remove();
            }
            el.data(pluginName, new Plugin(this, options));
        });
        return this;
    };
    
    /*$.fn[ pluginName ] = function (options) {
        return this.each(function () {
            $.removeData(this);  ////此行为新增的
            if (!$.data(this, "plugin_" + pluginName)) {
                $.data(this, "plugin_" + pluginName, new Plugin(this, options));
            }
        });
    };*/

})(jQuery, window, document);

function toBlock(thiz){
	console.log(123123123123);
	$(thiz).next('ul').css('display','block');
}