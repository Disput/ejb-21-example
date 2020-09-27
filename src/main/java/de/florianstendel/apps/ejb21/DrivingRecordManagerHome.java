package de.florianstendel.apps.ejb21;

import javax.ejb.*;

/**
 * A home interface is managed (resp. it's implementation, the tie)
 * by the server-side container to provide remote client a means
 * to create Enterprise Java Beans on the server.
 */
public interface DrivingRecordManagerHome extends EJBHome {

    public DrivingRecordManagerSessionBean create();
}
