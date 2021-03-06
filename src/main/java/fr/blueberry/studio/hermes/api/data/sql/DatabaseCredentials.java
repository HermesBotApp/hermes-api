package fr.blueberry.studio.hermes.api.data.sql;

/**
 * 
 */
public class DatabaseCredentials {
    private final String url;
    private final String user;
    private final String pass;
    private final String databaseName;
    private final int port;

    public DatabaseCredentials(String url, String user, String pass, String databaseName) {
        this(url, user, pass, databaseName, 3306);
    }

    public DatabaseCredentials(String url, String user, String pass, String databaseName, int port) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        this.databaseName = databaseName;
        this.port = port;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getPass() {
        return pass;
    }

    public int getPort() {
        return port;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }
}