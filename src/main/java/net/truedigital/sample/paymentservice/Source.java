package net.truedigital.sample.paymentservice;

public class Source {
    private String id;
    private String name;
    private String type;
    private String channel;

    public Source(String id) {
        this.id = id;
    }

    public Source(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Source(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public Source(String id, String name, String type, String channel) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.channel = channel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }
    
    public String getChannel() { return channel; }

    public void setChannel(String channel) { this.channel = channel; }
}
