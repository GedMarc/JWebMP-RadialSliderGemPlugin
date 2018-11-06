package com.jwebmp.plugins.radialsvgslider.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class RadialSliderExclusionsModule
		implements IGuiceScanModuleExclusions<RadialSliderExclusionsModule>,
				           IGuiceScanJarExclusions<RadialSliderExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-radial-slider-gem-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.radialsvgslider");
		return strings;
	}
}
