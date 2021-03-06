package fr.blueberry.studio.hermes.api.plugins;

public class PluginMeta {
    private final String name;
    private final String main;
    private final String version;
    private final String author;
    private final String description;

    public PluginMeta(String name, String main, String version, String author, String description) {
        this.name = name;
        this.main = main;
        this.version = version;
        this.author = author;
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}