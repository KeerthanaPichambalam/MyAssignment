package Week3Day2Assignments;

public class AbstractionInterfaceJavaConnection implements AbsractionInterfaceDbConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbsractionInterfaceDbConnection con = new AbstractionInterfaceJavaConnection();
		con.connect();
		con.disconnect();
		System.out.println("Returned text is "+ con.executeUpdate());

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("connected");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnected");
	}

	@Override
	public String executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("update executed");
		return "Interface";
		
	}

}