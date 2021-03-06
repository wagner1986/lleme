package uff.ic.letstalk.corbaObjects.scs;

/**
 * corbaObjects/scs/IComponentOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from scs.idl Sexta-feira, 9 de Dezembro de
 * 2005 18h26min27s BRST
 */
public interface IComponentOperations {

    org.omg.CORBA.Object getFacet(String facet_interface)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName;

    org.omg.CORBA.Object getFacetByName(String facet)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName;

    void startup() throws uff.ic.letstalk.corbaObjects.scs.StartupFailed;

    void shutdown() throws uff.ic.letstalk.corbaObjects.scs.ShutdownFailed;

    // Receptacle
    int connect(String receptacle, org.omg.CORBA.Object obj)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName,
            uff.ic.letstalk.corbaObjects.scs.InvalidConnection,
            uff.ic.letstalk.corbaObjects.scs.AlreadyConnected,
            uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimit;

    void disconnect(int id) throws uff.ic.letstalk.corbaObjects.scs.InvalidConnection,
            uff.ic.letstalk.corbaObjects.scs.NoConnection;

    uff.ic.letstalk.corbaObjects.scs.ConnectionDescription getConnection(int id)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidConnection;

    uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[] getConnections(String receptacle)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName;

    // MetaInterface
    uff.ic.letstalk.corbaObjects.scs.FacetDescription[] getFacets();

    uff.ic.letstalk.corbaObjects.scs.FacetDescription[] getFacetsByName(String[] names)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName;

    uff.ic.letstalk.corbaObjects.scs.ReceptacleDescription[] getReceptacles();

    uff.ic.letstalk.corbaObjects.scs.ConnectionDescription[] getReceptacleConnections(
            String receptacle_interface) throws uff.ic.letstalk.corbaObjects.scs.InvalidName,
            uff.ic.letstalk.corbaObjects.scs.InvalidConnection,
            uff.ic.letstalk.corbaObjects.scs.AlreadyConnected,
            uff.ic.letstalk.corbaObjects.scs.ExceededConnectionLimit,
            uff.ic.letstalk.corbaObjects.scs.InternalError;

    uff.ic.letstalk.corbaObjects.scs.ReceptacleDescription[] getReceptaclesByName(String[] names)
            throws uff.ic.letstalk.corbaObjects.scs.InvalidName;
} // interface IComponentOperations
