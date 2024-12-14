package Week3Day2Assignments;

public class AbstractionInterfaceJavaConnect extends MySqlConnection{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionInterfaceJavaConnect con = new AbstractionInterfaceJavaConnect();
		con.connect();
		con.disconnect();
		System.out.println("string returned is "+con.executeUpdate());
		con.executeQuery();

	}

	private void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect method");
		
	}

	private String executeUpdate() {
		// TODO Auto-generated method stub
		return "TestLeaf";
	}

	private void connect() {
		// TODO Auto-generated method stub
		System.out.println("connect method");
		
	}

	@Override
	public void executeQuery() {
		// TODO Auto-generated method stub
		System.out.println("abstract method implemented");
		
	}
}

	