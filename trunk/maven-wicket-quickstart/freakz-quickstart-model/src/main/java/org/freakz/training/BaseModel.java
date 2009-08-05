/**
 * 
 */
package org.freakz.training;

import java.io.Serializable;

/**
 * @author Emmanuel Nollase - emanux
 * created 2009 8 2 - 19:50:56
 */
public class BaseModel implements Serializable
{

    private String id;
    private int version;
    
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public int getVersion()
    {
        return version;
    }
    public void setVersion(int version)
    {
        this.version = version;
    }
    
    
}
