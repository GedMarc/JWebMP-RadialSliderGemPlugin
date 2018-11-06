import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.radialsvgslider.RadialSVGSliderGemPageConfigurator;
import com.jwebmp.plugins.radialsvgslider.implementations.RadialSliderExclusionsModule;

module com.jwebmp.plugins.radialsvgslider {

	exports com.jwebmp.plugins.radialsvgslider;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;

	requires java.validation;
	requires java.logging;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with RadialSVGSliderGemPageConfigurator;
	provides IGuiceScanModuleExclusions with RadialSliderExclusionsModule;
	provides IGuiceScanJarExclusions with RadialSliderExclusionsModule;

	opens com.jwebmp.plugins.radialsvgslider to com.fasterxml.jackson.databind, com.jwebmp.core;
}
