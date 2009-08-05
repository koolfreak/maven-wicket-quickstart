package org.freakz;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.freakz.training.web.BasePage;

/**
 * @author emanux
 */
public class NavPage extends BasePage
{

    public NavPage(String msg)
    {
	add(new Label("msg", msg));
    }
}

