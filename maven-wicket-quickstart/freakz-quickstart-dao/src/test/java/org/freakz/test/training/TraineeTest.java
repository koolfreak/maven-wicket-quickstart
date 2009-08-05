/**
 * 
 */
package org.freakz.test.training;

import org.freakz.training.Trainee;
import org.freakz.training.dao.TraineeDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import junit.framework.TestCase;

/**
 * @author Emmanuel Nollase - emanux
 * created 2009 8 2 - 20:01:05
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"/app-context-c3p0.xml","/app-quickstart-dao.xml"})
public class TraineeTest extends TestCase
{

    @Autowired private TraineeDao traineeDao;
    
   // @Test
   /* public void insertTraineeTest()
    {
	Trainee trainee = new Trainee();
	trainee.setFirstName("eman");
	trainee.setLastName("nollase");
	trainee.setSchool("ateneo");
	
	traineeDao.save(trainee);
	
    }*/
    
    @Test
    public void updateTraineeTest()
    {
	final Trainee trainee = traineeDao.load("ff80808222e149120122e149173d0001");
	
    }
}