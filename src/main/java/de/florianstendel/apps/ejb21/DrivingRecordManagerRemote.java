package de.florianstendel.apps.ejb21;

import javax.ejb.EJBException;
import javax.ejb.EJBObject;

public interface DrivingRecordManagerRemote extends EJBObject {

    public String doSomethingOnServer(final String command) throws EJBException;
}


