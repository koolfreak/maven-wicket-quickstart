/**
 * 
 */
package org.freakz.training.dao;

import org.freakz.training.Trainee;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Emmanuel Nollase - emanux
 * created 2009 8 2 - 19:54:19
 */
public class TraineeDaoImpl extends HibernateDaoSupport implements TraineeDao
{

    /* (non-Javadoc)
     * @see org.freakz.training.TraineeDao#save(org.freakz.training.Trainee)
     */
    public void save(Trainee trainee) throws DataAccessException
    {
	getHibernateTemplate().save(trainee);
    }

    public void delete(Trainee trainee) throws DataAccessException
    {
	getHibernateTemplate().delete(trainee);
    }

    public Trainee load(String id) throws DataAccessException
    {
	return  (Trainee) getHibernateTemplate().load(Trainee.class, id);
    }

    public void update(Trainee trainee) throws DataAccessException
    {
	getHibernateTemplate().update(trainee);
    }

}
