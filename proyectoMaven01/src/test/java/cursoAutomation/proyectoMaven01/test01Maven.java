package cursoAutomation.proyectoMaven01;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test01Maven {
	
	WebDriver driver;
	
	//Modificaciones 1
	
	//Nueva forma de medir el tiempo
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
}
