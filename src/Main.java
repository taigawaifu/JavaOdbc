public class Main {
    static String driverJDBC = "org.gjt.mm.mysql.Driver";
    static String url = "jdbc:mysql://localhost:3306/clinica";
    static String username = "root";
    static String password = "root";
    public static void main(String[] args) {
        try{
            System.out.println("");
            Connection conexao = DriverManager.getConnection(url,username,password);
            System.out.println("");
        }
        catch(Exception e){
            System.out.println("");


        }

    }
}