package org.freakz.training;

import org.apache.wicket.Request;
import org.apache.wicket.Response;
import org.apache.wicket.Session;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.freakz.HomePage;

/**
 * Application object for your web application. If you want to run this
 * application without deploying, run the Start class.
 * 
 * @see org.freakz.StartTraining#main(String[])
 */
public class WicketApplication extends WebApplication
{
    /**
     * Constructor
     */
    public WicketApplication()
    {
    }

    @Override
    protected void init()
    {
	super.init();
	
	addComponentInstantiationListener(new SpringComponentInjector(this));
    }

    @Override
    public Session newSession(Request request, Response response)
    {
	// TODO Auto-generated method stub
	return super.newSession(request, response);
    }

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    public Class<HomePage> getHomePage()
    {
	return HomePage.class;
    }

}
