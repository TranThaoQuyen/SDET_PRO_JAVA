package LAB6;

public class CheckStringURL {
    public static void main(String[] args) {
        String url = "https://google.com";
        String httpStr = url.substring(0,5);
        String https = "https";
        boolean isHttps = httpStr.equals(https);
        if (isHttps){
            System.out.println("URL has https");
        }else {
            System.out.println("URL has http");
        }

        String com = "com";
        String endURL = url.substring(15);
        boolean isCom = endURL.equals(com);
        if (isCom){
            System.out.println("URL has .com");
        }else {
            System.out.println("URL has .net");
        }

        String domainMane = url.substring(8);
        System.out.println("Domain name is: "+domainMane);

    }
}
