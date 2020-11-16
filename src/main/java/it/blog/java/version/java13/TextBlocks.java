package it.blog.java.version.java13;

public class TextBlocks {
	@SuppressWarnings("preview")
	public static void main(String[] args) {
		
		/*
		 * Text Blocks 
		 */
		String html = "<html>\n" +
	              "    <body>\n" +
	              "        <p>Hello, world</p>\n" +
	              "    </body>\n" +
	              "</html>\n";

		System.out.println(html);
		
		html = """
	              <html>
	                  <body>
	                      <p>Hello, world</p>
	                  </body>
	              </html>
	              """;
		
		System.out.println(html);
	}

	
}
