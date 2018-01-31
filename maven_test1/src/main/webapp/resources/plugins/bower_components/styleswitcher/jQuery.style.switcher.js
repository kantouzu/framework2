// Theme color settings
var rootPath;
$(document).ready(function () {
	rootPath = Utils.getRootPath();
	if(rootPath.indexOf('StandingBookManage')+'StandingBookManage'.length < rootPath.length)
		rootPath = rootPath.substring(0, rootPath.lastIndexOf('/'));
    
    $("*[data-theme]").click(function (e) {
        e.preventDefault();
        var currentStyle = $(this).attr('data-theme');
        store('theme', currentStyle);
        $('#theme').attr({
            href: rootPath+'/resources/plugins/bower_components/otherCssAndJs/colors/' + currentStyle + '.css'
        })
    });

    var currentTheme = get('theme');
    if (currentTheme) {
        $('#theme').attr({
            href: rootPath+'/resources/plugins/bower_components/otherCssAndJs/colors/' + currentTheme + '.css'
        });
    }
    // color selector
    $('#themecolors').on('click', 'a', function () {
        $('#themecolors li a').removeClass('working');
        $(this).addClass('working')
    });

});

function store(name, val) {
    if (typeof (Storage) !== "undefined") {
        localStorage.setItem(name, val);
    } else {
        window.alert('Please use a modern browser to properly view this template!');
    }
}

function get(name) {
	return localStorage.getItem(name);
}

$(document).ready(function () {
    $("*[data-theme]").click(function (e) {
        e.preventDefault();
        var currentStyle = $(this).attr('data-theme');
        store('theme', currentStyle);
        $('#theme').attr({
            href: rootPath+'/resources/plugins/bower_components/otherCssAndJs/colors/' + currentStyle + '.css'
        })
    });

    var currentTheme = get('theme');
    if (currentTheme) {
        $('#theme').attr({
            href: rootPath+'/resources/plugins/bower_components/otherCssAndJs/colors/' + currentTheme + '.css'
        });
    }
    // color selector
    $('#themecolors').on('click', 'a', function () {
        $('#themecolors li a').removeClass('working');
        $(this).addClass('working')
    });
});
