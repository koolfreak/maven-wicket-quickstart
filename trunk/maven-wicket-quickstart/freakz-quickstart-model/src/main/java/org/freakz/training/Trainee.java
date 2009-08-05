/**
 * 
 */
package org.freakz.training;

import org.apache.commons.lang.builder.EqualsBuilder;

/**
 * @author Emmanuel Nollase - emanux
 * created 2009 8 2 - 19:52:14
 */
public class Trainee extends BaseModel
{

    private String firstName;
    private String lastName;
    private String school;
    
    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getSchool()
    {
        return school;
    }
    public void setSchool(String school)
    {
        this.school = school;
    }
    
    @Override
    public boolean equals(Object obj)
    {
	return EqualsBuilder.reflectionEquals(this, obj);
    }
    
}
