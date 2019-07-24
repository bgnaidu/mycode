package Sample.Citrus_Cucumber;

import java.util.Arrays;
import java.util.List;

public class Samplehtml {

	
	static String interviewTime1="8/20/2018:10pm,";
	static String interviewTime2="8/20/2018,11pm,";
	static String intervierwName="naidu,";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> interviewTimingToFrom1 = Arrays.asList(interviewTime1.split(","));
		List<String> interviewTimingToFrom2 = Arrays.asList(interviewTime2.split(","));
		List<String> listOfinterviewerName = Arrays.asList(intervierwName.split(","));

		StringBuilder buf = new StringBuilder();
		buf.append("<html>" +
		           "<body>" +
		           "<table>" +
		           "<tr>" +
		           "<th>Interviewe</th>" +
		           "<th>Timing1</th>" +
		           "<th>Timing2</th>" +
		           "</tr>");
		for (int i = 0; i < listOfinterviewerName.size(); i++) {
		    buf.append("<tr><td>")
		       .append(listOfinterviewerName.get(i))
		       .append("</td><td>")
		       .append(interviewTimingToFrom1.get(i))
		       .append("</td><td>")
		       .append(interviewTimingToFrom2.get(i))
		       .append("</td></tr>");
		}
		buf.append("</table>" +
		           "</body>" +
		           "</html>");
		String html = buf.toString();
		System.out.println(html);

	}

}
