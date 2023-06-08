package java11and17featuresdaythree.java17features.recordclasses.textblocks;

public class OldStyleDemo {

	public static void main(String[] args) {
		String sql =
			    "  SELECT id, firstName, lastName\n"
			        + "    FROM Employee\n"
			        + "   WHERE departmentId = \"IT\"\n"
			        + "ORDER BY lastName, firstName";

			String html =
			    "<html>\n"
			        + "  <body>\n"
			        + "    <p>Hello World!</p>\n"
			        + "  </body>\n"
			        + "</html>";

			
			System.out.println(sql);

	}

}
