import com.jwebmp.plugins.radialsvgslider.implementations.RadialSliderInclusionModule;

module com.jwebmp.plugins.radialsvgslider {

	exports com.jwebmp.plugins.radialsvgslider;

	requires com.jwebmp.core;
	

	requires jakarta.validation;
	requires java.logging;
	requires com.guicedee.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.radialsvgslider.RadialSVGSliderGemPageConfigurator;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.radialsvgslider.implementations.RadialSliderExclusionsModule;
	provides com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions with RadialSliderInclusionModule;
	
	opens com.jwebmp.plugins.radialsvgslider to com.fasterxml.jackson.databind, com.jwebmp.core;
}
