/** 
 * This class was automatically generated  
 * using a Merode XML model and Apache Velocity
 * 
 * Merode Code Generator 2.0
 * @author MERODE Team-members
 */
package dao;
import java.time.*;


/**
 * @hibernate.subclass
 *    discriminator-value="PropertyStateExists"
 */
public class PropertyStateExists extends PropertyState {

    public static PropertyStateExists getObject (org.hibernate.Session sess) throws org.hibernate.HibernateException {
	    PropertyStateExists state = null;
	    // Search in database
	    java.util.Collection states = findStateByName (sess, "exists");
	    if ( states != null && !states.isEmpty() )
	        state = (PropertyStateExists)states.iterator().next();
	    if ( state == null ) {
	        state = new PropertyStateExists();
	        // Save in database
	        sess.save (state);
	    }
	    return state;
    }

    private static java.util.Collection findStateByName (org.hibernate.Session sess, java.lang.String statename)
        throws org.hibernate.HibernateException {
    
        org.hibernate.Query q = sess.createQuery("from dao.PropertyState as c where c.name = ?");
    	q.setString (0, statename);
        return q.list();
    }
    
    protected java.lang.String getStateName() {
    	return "exists";
    }

    protected java.lang.String getStateId() {
    	return "190";
    }

    public boolean isInitialState() {
    	return false;
    }

    public boolean isFinalState() {
    	return false;
    }


		
    public void check_meendproperty() {
        // No exception is thrown anymore...
        MerodeLogger.logln ("Checking PropertyState.meendproperty...passed");
    }

		
    public void check_mecrdeviceresult() {
        // No exception is thrown anymore...
        MerodeLogger.logln ("Checking PropertyState.mecrdeviceresult...passed");
    }

		
    public void check_mecrpropertyoutcome() {
        // No exception is thrown anymore...
        MerodeLogger.logln ("Checking PropertyState.mecrpropertyoutcome...passed");
    }

		
    public void check_meenddeviceresult() {
        // No exception is thrown anymore...
        MerodeLogger.logln ("Checking PropertyState.meenddeviceresult...passed");
    }

		
    public void check_meendpropertyoutcome() {
        // No exception is thrown anymore...
        MerodeLogger.logln ("Checking PropertyState.meendpropertyoutcome...passed");
    }

	
	
    public void meendproperty (org.hibernate.Session sess, Property object) throws org.hibernate.HibernateException {
        PropertyStateEnded state = PropertyStateEnded.getObject(sess);
        MerodeLogger.logln ("[" + Instant.now() + "]" + " Object " + object.getId() + " of object type 187 changed from state " + getStateId() + " to state " + state.getStateId() + " using method 197");
        object.setState(state);
    }

	
    public void mecrdeviceresult (org.hibernate.Session sess, Property object) throws org.hibernate.HibernateException {
        PropertyStateExists state = PropertyStateExists.getObject(sess);
        MerodeLogger.logln ("[" + Instant.now() + "]" + " Object " + object.getId() + " of object type 187 changed from state " + getStateId() + " to state " + state.getStateId() + " using method 200");
        object.setState(state);
    }

	
    public void mecrpropertyoutcome (org.hibernate.Session sess, Property object) throws org.hibernate.HibernateException {
        PropertyStateExists state = PropertyStateExists.getObject(sess);
        MerodeLogger.logln ("[" + Instant.now() + "]" + " Object " + object.getId() + " of object type 187 changed from state " + getStateId() + " to state " + state.getStateId() + " using method 202");
        object.setState(state);
    }

	
    public void meenddeviceresult (org.hibernate.Session sess, Property object) throws org.hibernate.HibernateException {
        PropertyStateExists state = PropertyStateExists.getObject(sess);
        MerodeLogger.logln ("[" + Instant.now() + "]" + " Object " + object.getId() + " of object type 187 changed from state " + getStateId() + " to state " + state.getStateId() + " using method 204");
        object.setState(state);
    }

	
    public void meendpropertyoutcome (org.hibernate.Session sess, Property object) throws org.hibernate.HibernateException {
        PropertyStateExists state = PropertyStateExists.getObject(sess);
        MerodeLogger.logln ("[" + Instant.now() + "]" + " Object " + object.getId() + " of object type 187 changed from state " + getStateId() + " to state " + state.getStateId() + " using method 206");
        object.setState(state);
    }

	
}
