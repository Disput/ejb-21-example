package de.florianstendel.apps.ejb21;

import javax.ejb.*;
import java.rmi.RemoteException;

public class DrivingRecordManagerSessionBean implements SessionBean{

    public String doSomethingOnServer(final String command) throws EJBException{
        return "Command: '"+command+"' accepted!";
    }



    public void ejbCreate() throws CreateException {
        System.out.println("Session bean created!");
    }

    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {

    }

    public void ejbRemove() throws EJBException, RemoteException {

    }

    public void ejbActivate() throws EJBException, RemoteException {

    }

    public void ejbPassivate() throws EJBException, RemoteException {

    }
}
