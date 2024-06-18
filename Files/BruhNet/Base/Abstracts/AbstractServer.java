
import java.io.Serializable;

public abstract class AbstractServer {
    protected int port;
    protected int maxClients;
    protected int timeout;
    protected boolean running;

    public AbstractServer(int port, int maxClients, int timeout) {
        this.port = port;
        this.maxClients = maxClients;
        this.timeout = timeout;
        this.running = false;
    }

    public abstract void start();
    public abstract void stop();
    public abstract void acceptClient(Object clientInfo);
    public abstract void removeClient(Object clientInfo);
    public abstract void sendObject(Object clientInfo, Serializable obj) throws Exception;
    public abstract void broadcast(Serializable obj) throws Exception;
    public abstract boolean isClientConnected(Object clientInfo);
    public abstract int getClientCount();
}
