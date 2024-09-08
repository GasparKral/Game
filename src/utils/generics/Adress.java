package utils.generics;

public record Adress(String Ip, int Port) {

    public Adress(String Ip, int Port) {
        if (!isIp(Ip) || !isPort(Port)) {
            throw new IllegalArgumentException();
        }
        this.Ip = Ip;
        this.Port = Port;
    }

    private boolean isIpv4(String Ip) {
        return Ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
    }

    private boolean isIpv6(String Ip) {
        return Ip.matches("([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}");
    }

    private boolean isIp(String Ip) {
        return isIpv4(Ip) || isIpv6(Ip);
    }

    private boolean isPort(int Port) {
        return Port > 0 && Port < 65536;
    }

}
