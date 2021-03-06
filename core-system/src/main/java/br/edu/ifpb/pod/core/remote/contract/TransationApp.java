package br.edu.ifpb.pod.core.remote.contract;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 * Interface remota que define os serviços de transação das entidades do banco de dados
 * @author Emanuel Batista da Silva Filho - https://github.com/emanuelbatista
 */
public interface TransationApp extends Remote {

    public void begin() throws RemoteException;

    public void commit() throws RemoteException;

    public void rollback() throws RemoteException;
}
