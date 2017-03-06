/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.radialsvgslider;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;

/**
 *
 * @author GedMarc
 */
@PluginInformation(pluginName = "Radial SVG Slider Gem",
                   pluginUniqueName = "radial-svg-slider-gem",
                   pluginDescription = "Quickly implement beautiful slides with this gem",
                   pluginVersion = "0.1",
                   pluginDependancyUniqueIDs = "jquery",
                   pluginCategories = "carousel, slider, gem, radial",
                   pluginSubtitle = "A simple, responsive slider, with a radial transition effect powered by SVG clipPath and mask elements.",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-RadialSliderGemPlugin",
                   pluginSourceUrl = "https://github.com/GedMarc/JWebSwing-RadialSliderGemPlugin",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-RadialSliderGemPlugin/wiki",
                   pluginOriginalHomepage = "https://codyhouse.co/gem/radial-svg-slider/",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/RadialSliderGemPlugin.jar/download",
                   pluginIconUrl = "bower_components/radial-svg-slider-jwebswing/example.png",
                   pluginIconImageUrl = "bower_components/radial-svg-slider-jwebswing/example.png",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class RadialSVGSliderGemPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;

    @Override
    public Page configure(Page page)
    {
        return page;
    }

}
