/**
 * 
 */
package org.freakz.training.service;

import org.freakz.training.Trainee;
import org.freakz.training.dao.TraineeDao;

/**
 * @author Emmanuel Nollase - emanux
 * created 2009 8 2 - 20:26:07
 */
public class TraineeServiceImpl implements TraineeService
{

    private TraineeDao traineeDao;
    
    public void setTraineeDao(TraineeDao traineeDao)
    {
        this.traineeDao = traineeDao;
    }

    /* (non-Javadoc)
     * @see org.freakz.training.service.TraineeService#save(org.freakz.training.Trainee)
     */
    public void save(Trainee trainee)
    {
	
	traineeDao.save(trainee);
    }

}
