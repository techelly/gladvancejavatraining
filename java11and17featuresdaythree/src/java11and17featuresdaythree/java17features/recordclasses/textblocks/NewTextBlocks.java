package java11and17featuresdaythree.java17features.recordclasses.textblocks;

public class NewTextBlocks {

	public static void main(String[] args) {
		String sql = """
			      SELECT id, firstName, lastName
			        FROM Employee
			       WHERE departmentId = "'IT'"
			    ORDER BY lastName, firstName""";

			String html = """
			    <html>
			      <body>
			        <p>Hello World!</p>
			      </body>
			    </html>""";

			System.out.println(html);
			System.out.println("************************************************");
			System.out.println(sql);
	}

}
