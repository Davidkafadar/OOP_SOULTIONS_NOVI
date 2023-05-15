package pckg_exceptions;
import java.util.ArrayList;
import java.util.List;

public class TestRobot {
	public static void main(String[] args) {
		List<Robot> robots = new ArrayList<>();
		robots.add(new IndustrialRobot("Pero"));
		robots.add(new HomeAssistantRobot("FFG11"));
		robots.add(new IndustrialRobot("WWWQ2"));
		robots.add(new SpecialRobot("NME1"));
		
	}

}
