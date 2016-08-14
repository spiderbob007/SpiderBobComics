			<script>
				jQuery(document).ready(function ($) {
					
					var _SlideshowTransitions = [
					//Fade in R
					{$Duration: 1200, x: -0.3, $During: { $Left: [0.3, 0.7] }, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 }
					//Fade out L
					, { $Duration: 1200, x: 0.3, $SlideOut: true, $Easing: { $Left: $JssorEasing$.$EaseInCubic, $Opacity: $JssorEasing$.$EaseLinear }, $Opacity: 2 }
					];

					var options = {
						$AutoPlay: true,	//[Optional] Whether to auto play, to enable slideshow, this option must be set to true, default value is false
						$AutoPlaySteps: 1,	//[Optional] Steps to go for each navigation request (this options applies only when slideshow disabled), the default value is 1
						$AutoPlayInterval: 6000,	//[Optional] Interval (in milliseconds) to go for next slide since the previous stopped if the slider is auto playing, default value is 3000
						$PauseOnHover: 1,	//[Optional] Whether to pause when mouse over if a slider is auto playing, 0 no pause, 1 pause for desktop, 2 pause for touch device, 3 pause for desktop and touch device, 4 freeze for desktop, 8 freeze for touch device, 12 freeze for desktop and touch device, default value is 1

						$ArrowKeyNavigation: true,	//[Optional] Allows keyboard (arrow key) navigation or not, default value is false
						$SlideDuration: 500,	//[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500
						$MinDragOffsetToSlide: 20,	//[Optional] Minimum drag offset to trigger slide , default value is 20
						$SlideWidth: 900,	//[Optional] Width of every slide in pixels, default value is width of 'slides' container
						$SlideHeight: 100,	//[Optional] Height of every slide in pixels, default value is height of 'slides' container
						$SlideSpacing: 0,	//[Optional] Space between each slide in pixels, default value is 0
						$DisplayPieces: 1,	//[Optional] Number of pieces to display (the slideshow would be disabled if the value is set to greater than 1), the default value is 1
						$ParkingPosition: 0,	//[Optional] The offset position to park slide (this options applies only when slideshow disabled), default value is 0.
						$UISearchMode: 1,	//[Optional] The way (0 parallel, 1 recursive, default value is 1) to search UI components (slides container, loading screen, navigator container, arrow navigator container, thumbnail navigator container etc).
						$PlayOrientation: 1,	//[Optional] Orientation to play slide (for auto play, navigation), 1 horizontal, 2 vertical, 5 horizontal reverse, 6 vertical reverse, default value is 1
						$DragOrientation: 3,	//[Optional] Orientation to drag slide, 0 no drag, 1 horizontal, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)

						$SlideshowOptions: {	//[Optional] Options to specify and enable slideshow or not
							$Class: $JssorSlideshowRunner$,	//[Required] Class to create instance of slideshow
							$Transitions: _SlideshowTransitions,	//[Required] An array of slideshow transitions to play slideshow
							$TransitionsOrder: 1,	//[Optional] The way to choose transition to play slide, 1 Sequence, 0 Random
							$ShowLink: true	//[Optional] Whether to bring slide link on top of the slider when slideshow is running, default value is false
						},

						$BulletNavigatorOptions: {	//[Optional] Options to specify and enable navigator or not
							$Class: $JssorBulletNavigator$,	//[Required] Class to create navigator instance
							$ChanceToShow: 2,	//[Required] 0 Never, 1 Mouse Over, 2 Always
							$Lanes: 1,	//[Optional] Specify lanes to arrange items, default value is 1
							$SpacingX: 10,	//[Optional] Horizontal space between each item in pixel, default value is 0
							$SpacingY: 10	//[Optional] Vertical space between each item in pixel, default value is 0
						},

						$ArrowNavigatorOptions: {
							$Class: $JssorArrowNavigator$,	//[Required] Class to create arrow navigator instance
							$ChanceToShow: 2,	//[Required] 0 Never, 1 Mouse Over, 2 Always
							$AutoCenter: 2	//[Optional] Auto center navigator in parent container, 0 None, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
						},

						$ThumbnailNavigatorOptions: {
							$Class: $JssorThumbnailNavigator$,	//[Required] Class to create thumbnail navigator instance
							$ChanceToShow: 2,	//[Required] 0 Never, 1 Mouse Over, 2 Always
							$ActionMode: 0,	//[Optional] 0 None, 1 act by click, 2 act by mouse hover, 3 both, default value is 1
							$DisableDrag: true	//[Optional] Disable drag or not, default value is false
						}
					};

					var jssor_sliderb = new $JssorSlider$("sliderb_container", options);
					//responsive code begin
					//you can remove responsive code if you don't want the slider scales while window resizes
					function ScaleSlider() {
						var parentWidth = jssor_sliderb.$Elmt.parentNode.clientWidth;
						if (parentWidth)
							jssor_sliderb.$ScaleWidth(Math.min(parentWidth, 900));
						else
							window.setTimeout(ScaleSlider, 30);
					}
					ScaleSlider();

					$(window).bind("load", ScaleSlider);
					$(window).bind("resize", ScaleSlider);
					$(window).bind("orientationchange", ScaleSlider);
					//responsive code end
				});
			</script>			
	
			<!-- Jssor Slider Begin -->   
			<div id="sliderb_container" style="position: relative; left: 2px; width: 904px; height: 150px; overflow: hidden;">
				<!-- Slides Container -->
				<div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 900px; height: 100px; overflow: hidden;">
					<div>
					   <img u=image src="images/banner/01.png" />
						<div u="thumb">An advice column for comic-book fans and collectors with...</div>
					</div>
					<div>
					   <img u=image src="images/banner/02.png" />
						<div u="thumb">a history of comic books through the ages,</div>
					</div>
					<div>
					   <img u=image src="images/banner/03.png" />
						<div u="thumb">tips on how to store, preserve and care for your collection,</div>
					</div>
					<div>
					   <img u=image src="images/banner/04.png" />
						<div u="thumb">a guide on grading and evaluating the value of your comics,</div>
					</div>					
					<div>
					   <img u=image src="images/banner/05.png" />
						<div u="thumb">advice on the best places to buy, sell and trade,</div>
					</div>
					<div>
					   <img u=image src="images/banner/06.png" />
						<div u="thumb">a guide to pop-culture conventions and proper etiquette,</div>
					</div>
					<div>
					   <img u=image src="images/banner/07.png" />
						<div u="thumb">and a few thoughts from your humble author and guide.</div>
					</div>
					<div>
					   <img u=image src="images/banner/08.png" />
						<div u="thumb">Friend me on Facebook and join the conversation.</div>
					</div>			
				</div>
				
				<!-- ThumbnailNavigator Skin Begin -->
				<div u="thumbnavigator" class="sliderb-T" style="position: absolute; bottom: 0px; left: 0px; height:45px; width:900px;">
					<div style="filter: alpha(opacity=40); opacity:1; position: absolute; display: block; background-color: navy; top: 0px; left: 0px; width: 100%; height: 100%;">
					</div>
					<!-- Thumbnail Item Skin Begin -->
					<div u="slides">
						<div u="prototype" style="position: absolute; width: 900px; height: 45px; top: 0; left: 0;">
							<div u="thumbnailtemplate" style="font-family: verdana; font-weight: normal; position: absolute; width: 100%; height: 100%; top: 0; left: 0; color:#fff; line-height: 45px; font-size:20px; padding-left:10px;"></div>
						</div>
					</div>
					<!-- Thumbnail Item Skin End -->
				</div>
				<!-- ThumbnailNavigator Skin End -->
				
				<!-- Bullet Navigator Skin Begin -->
				<!-- jssor slider bullet navigator skin 01 -->
				<style>
					/*
					.jssorb01 div           (normal)
					.jssorb01 div:hover     (normal mouseover)
					.jssorb01 .av           (active)
					.jssorb01 .av:hover     (active mouseover)
					.jssorb01 .dn           (mousedown)
					*/
					.jssorb01 div, .jssorb01 div:hover, .jssorb01 .av
					{
						filter: alpha(opacity=70);
						opacity: .7;
						overflow:hidden;
						cursor: pointer;
						border: #000 1px solid;
					}
					.jssorb01 div { background-color: gray; }
					.jssorb01 div:hover, .jssorb01 .av:hover { background-color: #d3d3d3; }
					.jssorb01 .av { background-color: red; }
					.jssorb01 .dn, .jssorb01 .dn:hover { background-color: #555555; }
				</style>
				<!-- bullet navigator container -->
				<div u="navigator" class="jssorb01" style="position: absolute; bottom: 16px; right: 15px;">
					<!-- bullet navigator item prototype -->
					<div u="prototype" style="position: absolute; width: 12px; height: 12px;"></div>
				</div>
				<!-- Bullet Navigator Skin End -->
				
				<!-- Arrow Navigator Skin Begin -->
				<style>
					/* jssor slider arrow navigator skin 05 css */
					/*
					.jssora05l              (normal)
					.jssora05r              (normal)
					.jssora05l:hover        (normal mouseover)
					.jssora05r:hover        (normal mouseover)
					.jssora05ldn            (mousedown)
					.jssora05rdn            (mousedown)
					*/
					.jssora05l, .jssora05r, .jssora05ldn, .jssora05rdn
					{
						position: absolute;
						cursor: pointer;
						display: block;
						background: url(images/banner/17.png) no-repeat;
						overflow:hidden;
					}
					.jssora05l { background-position: -10px -40px; }
					.jssora05r { background-position: -70px -40px; }
					.jssora05l:hover { background-position: -130px -40px; }
					.jssora05r:hover { background-position: -190px -40px; }
					.jssora05ldn { background-position: -250px -40px; }
					.jssora05rdn { background-position: -310px -40px; }
				</style>      
			</div>
