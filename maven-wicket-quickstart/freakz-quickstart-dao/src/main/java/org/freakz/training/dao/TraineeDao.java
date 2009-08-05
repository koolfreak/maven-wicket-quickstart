/**
 * 
 */
package org.freakz.training.dao;

import org.freakz.training.Trainee;
import org.springframework.dao.DataAccessException;

/**
 * @author Emmanuel Nollase - emanux
 * created 2009 8 2 - 19:53:34
 */
public interface TraineeDao
{

    void save(final Trainee trainee) throws DataAccessException;
    
    void delete(final Trainee trainee) throws DataAccessException;
    
    void update(final Trainee trainee) throws DataAccessException;
    
    Trainee load(final String id) throws DataAccessException;
}
