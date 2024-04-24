/** 
 * This class was automatically generated  
 * using a Merode XML model and Apache Velocity
 * 
 * Merode Code Generator 2.0
 * @author MERODE Team-members
 */

package dao;
import java.time.*;

import validation.ErrorValidator;
/**
 * @hibernate.class
 *     table="HIB_DEVICEUSAGE_STATE"
 * @hibernate.discriminator
 *     column="class"
 */
public abstract class DeviceusageState 
	implements java.io.Serializable {

    /**
     * @hibernate.id
     *     generator-class="uuid.hex"
     *     column="ID"
     *     type="java.lang.String"
     *
     * @hibernate.column
     *     name="ID"
     *     sql-type="VARCHAR(256)"
     */
    public java.lang.String getId()
    {
        return this.id;
    }

    public void setId(java.lang.String id)
    {
        this.id = id;
    }

    private java.lang.String id;

    /**
     * @hibernate.property
     *     column="NAME"
     *     type="java.lang.String"
     *
     * @hibernate.column
     *     name="NAME"
     *     sql-type="VARCHAR(256)"
     */
    public java.lang.String getName()
    {
        return getStateName();
    }

    protected abstract java.lang.String getStateId();

    public void setName(java.lang.String name)
    {
    // do nothing
    }

    protected abstract java.lang.String getStateName();
    
    public abstract boolean isInitialState();
    public abstract boolean isFinalState();

    // Put the object in the "allocated" state, i.e. the actual initial state
    public static void setInitialState (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException {
        DeviceusageStateAllocated state = DeviceusageStateAllocated.getObject(sess);
        object.setState(state);
    }
    // Control operations to check whether an event may occur.
    // By default an exception is thrown; it is taken away in
    // a subclass for all appropriate methods.
    public void check_mecrdeviceusage() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.mecrdeviceusage...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 381 with name MEcrDeviceUsage for object type 226 named Deviceusage in state " + getStateId() + " called " + getStateName());
    }
    public void check_devicedeployment() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.devicedeployment...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 383 with name DeviceDeployment for object type 226 named Deviceusage in state " + getStateId()  + " called " + getStateName());
    }
    public void check_mesetready() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.mesetready...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 385 with name MEsetReady for object type 226 named Deviceusage in state " + getStateId()  + " called " + getStateName());
    }
    public void check_meenddeviceusage() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.meenddeviceusage...");
        throw new MerodeException ("[" + Instant.now() + "]" + " Can't execute event 382 with name MEendDeviceUsage for object type 226 named Deviceusage in state " + getStateId() + " called " + getStateName());
    }
    public void check_deviceundeployment() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.deviceundeployment...");
        throw new MerodeException ("[" + Instant.now() + "]" + " Can't execute event 384 with name DeviceUndeployment for object type 226 named Deviceusage in state " + getStateId() + " called " + getStateName());
    }
    public void check_mecrdeviceresult() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.mecrdeviceresult...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 373 with name MEcrDeviceResult for object type 226 named Deviceusage in state " + getStateId() + " called " + getStateName());
    }
    public void check_meenddeviceresult() throws MerodeException {
        MerodeLogger.logln ("Checking DeviceusageState.meenddeviceresult...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 374 with name MEendDeviceResult for object type 226 named Deviceusage in state " + getStateId() + " called " + getStateName());
    }

    // Put the object in the correct state.
    public void mecrdeviceusage (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
	}
    public void devicedeployment (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
	}
    public void mesetready (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
	}
    public void meenddeviceusage (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
    }
    public void deviceundeployment (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
    }
    public void mecrdeviceresult (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
    }
    public void meenddeviceresult (org.hibernate.Session sess, Deviceusage object) throws org.hibernate.HibernateException{
    }


}
