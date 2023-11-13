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
 *     table="HIB_PLATFORM_STATE"
 * @hibernate.discriminator
 *     column="class"
 */
public abstract class PlatformState 
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
    public static void setInitialState (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException {
        PlatformStateAllocated state = PlatformStateAllocated.getObject(sess);
        object.setState(state);
    }
    // Control operations to check whether an event may occur.
    // By default an exception is thrown; it is taken away in
    // a subclass for all appropriate methods.
    public void check_mecrplatform() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.mecrplatform...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 287 with name MEcrPlatform for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_meendplatform() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.meendplatform...");
        throw new MerodeException ("[" + Instant.now() + "]" + " Can't execute event 288 with name MEendPlatform for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_mecrdeviceresult() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.mecrdeviceresult...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 283 with name MEcrDeviceResult for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_meenddeviceresult() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.meenddeviceresult...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 284 with name MEendDeviceResult for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_mecrdevice() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.mecrdevice...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 279 with name MEcrDevice for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_meenddevice() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.meenddevice...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 280 with name MEendDevice for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_mecroutcome() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.mecroutcome...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 281 with name MEcrOutcome for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_meendoutcome() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.meendoutcome...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 282 with name MEendOutcome for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_mecrpropertyoutcome() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.mecrpropertyoutcome...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 295 with name MEcrPropertyOutcome for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_meendpropertyoutcome() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.meendpropertyoutcome...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 296 with name MEendPropertyOutcome for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_mecrdeviceusage() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.mecrdeviceusage...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 291 with name MEcrDeviceUsage for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_meenddeviceusage() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.meenddeviceusage...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 292 with name MEendDeviceUsage for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_deviceundeployment() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.deviceundeployment...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 294 with name DeviceUndeployment for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }
    public void check_devicedeployment() throws MerodeException {
        MerodeLogger.logln ("Checking PlatformState.devicedeployment...");
        throw new MerodeException("[" + Instant.now() + "]" + " Can't execute event 293 with name DeviceDeployment for object type 143 named Platform in state " + getStateId() + " called " + getStateName());
    }

    // Put the object in the correct state.
    public void mecrplatform (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
	}
    public void meendplatform (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void mecrdeviceresult (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void meenddeviceresult (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void mecrdevice (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void meenddevice (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void mecroutcome (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void meendoutcome (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void mecrpropertyoutcome (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void meendpropertyoutcome (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void mecrdeviceusage (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void meenddeviceusage (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void deviceundeployment (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }
    public void devicedeployment (org.hibernate.Session sess, Platform object) throws org.hibernate.HibernateException{
    }


}