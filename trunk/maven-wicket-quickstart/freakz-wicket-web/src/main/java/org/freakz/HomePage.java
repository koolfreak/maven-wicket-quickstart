package org.freakz;

import org.apache.wicket.PageParameters;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.extensions.ajax.markup.html.IndicatingAjaxButton;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.freakz.training.Trainee;
import org.freakz.training.service.TraineeService;
import org.freakz.training.web.BasePage;

/**
 * Homepage
 */
public class HomePage extends BasePage {

	private static final long serialVersionUID = 1L;

	@SpringBean private TraineeService traineeService;
	
	private Trainee trainee = new Trainee();
	
	private String exception;

	/**
	 * Constructor that is invoked when page is invoked without a session.
	 * 
	 * @param parameters
	 *            Page parameters
	 */
    public HomePage(final PageParameters parameters) {

        // Add the simplest type of label
        add(new Label("message", "If you see this message wicket is properly configured and running"));

        final Form form = new Form("trform", new PropertyModel(this,"trainee"));
        add(form);
        
        form.add(new TextField("firstName",new PropertyModel(trainee,"firstName")));
        form.add(new TextField("lastName",new PropertyModel(trainee,"lastName")));
        form.add(new TextField("school",new PropertyModel(trainee,"school")));
        form.add(new TextField("exception",new PropertyModel(this,"exception")));
        
        add(new Link("link")
	{
	    @Override
	    public void onClick()
	    {
		setResponsePage(NavPage.class);
	    }
	});
        
        final IndicatingAjaxButton submit = new IndicatingAjaxButton("submit",form)
	{
	    
	    @Override
	    protected void onSubmit(AjaxRequestTarget target, Form form)
	    {
		final Trainee trainee = (Trainee) form.getModelObject();
		System.out.println(trainee.getFirstName());
		System.out.println(trainee.getLastName());
		System.out.println(trainee.getSchool());
		System.out.println(getException());
		//traineeService.save(trainee);
		//String s = trainee.getFirstName() +", "+ trainee.getLastName();
		//setResponsePage(new NavPage(s));
	    }
	};
	form.add(submit);
    }

	public Trainee getTrainee()
	{
	    return trainee;
	}

	public void setTrainee(Trainee trainee)
	{
	    this.trainee = trainee;
	}

	public String getException()
	{
	    return exception;
	}

	public void setException(String exception)
	{
	    this.exception = exception;
	}
    
	
    
}
