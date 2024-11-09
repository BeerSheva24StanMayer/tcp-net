package telran.net.exceptions;

public class ServerUnavailableException extends IllegalStateException{
    public ServerUnavailableException(String host, int port) {
        super(String.format("Server %s on port %d is unavailable at the moment, repeat later", host, port));
    }
}
