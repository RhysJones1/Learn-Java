public class Browser {
    public void navigate(String address){
        String ip = findIpAddress(address, true);
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "html></html>";
    }

    private String findIpAddress(String address, boolean cache) {
        return "192.123.0.1";
    }
}
