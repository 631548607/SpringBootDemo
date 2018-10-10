$(document).ready(function(){
	"use strict";
		$('.latest-videos a.fa.fa-play').on("click", function(){
			"use strict";
			$('.video-img > img, .video-img > .overlay, .video-img > .video-overlay ').css("opacity","0");
			$('.video-play').css("display","block");


		});
		$('.v-nav').on( "click" , function(){
			"use strict";
			$('.video-img > img, .video-img > .overlay, .video-img > .video-overlay ').css("opacity","1");
			$('.video-play').css("display","none");
			$("#biker").vimeo("play");

		});
		
});