import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.radialsvgslider.RadialSVGSliderGemPageConfigurator;

module com.jwebmp.plugins.radialsvgslider {

	exports com.jwebmp.plugins.radialsvgslider;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;

	provides IPageConfigurator with RadialSVGSliderGemPageConfigurator;

}
