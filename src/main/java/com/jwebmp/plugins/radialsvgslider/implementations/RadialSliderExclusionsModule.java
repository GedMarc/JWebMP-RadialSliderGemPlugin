package com.jwebmp.plugins.radialsvgslider.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class RadialSliderExclusionsModule
		implements IGuiceScanModuleExclusions<RadialSliderExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.radialsvgslider");
		return strings;
	}
}
