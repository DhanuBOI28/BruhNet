public abstract class AbstractClient {
    protected String serverAddress;
    protected int serverPort;
    protected boolean connected;
    protected int timeout;
    protected int bufferSize;
    protected boolean autoReconnect;
    protected String clientName;

    public AbstractClient(String serverAddress, int serverPort, String clientName) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
        this.clientName = clientName;
        this.connected = false;
        this.timeout = 5000; // Default timeout
        this.bufferSize = 1024; // Default buffer size
        this.autoReconnect = false; // Default auto reconnect disabled
    }

    public abstract void connect() throws Exception;
    public abstract void disconnect();
    public abstract void sendObject(Serializable obj) throws Exception;
    public abstract Serializable receiveObject() throws Exception;
    public abstract void reconnect() throws Exception;
}
