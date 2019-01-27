module com.jwebmp.plugins.radialsvgslider {

	exports com.jwebmp.plugins.radialsvgslider;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.radialsvgslider.RadialSVGSliderGemPageConfigurator;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.radialsvgslider.implementations.RadialSliderExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.radialsvgslider.implementations.RadialSliderExclusionsModule;

	opens com.jwebmp.plugins.radialsvgslider to com.fasterxml.jackson.databind, com.jwebmp.core;
}
