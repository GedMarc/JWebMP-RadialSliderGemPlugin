package com.jwebmp.plugins.radialsvgslider.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleInclusions;
import jakarta.validation.constraints.NotNull;

import java.util.HashSet;
import java.util.Set;

public class RadialSliderInclusionModule implements IGuiceScanModuleInclusions<RadialSliderInclusionModule>
{
	@Override
	public @NotNull Set<String> includeModules()
	{
		Set<String> set = new HashSet<>();
		set.add("com.jwebmp.plugins.radialsvgslider");
		return set;
	}
}