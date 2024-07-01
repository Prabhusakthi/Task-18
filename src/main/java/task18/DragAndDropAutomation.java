package task18;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDropAutomation {
		public static void main(String[] args) {
	        // Set the path to the GeckoDriver executable if it's not in your system PATH
	        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\Downloads\\project\\task18\\src\\main\\java\\task18\\geckodriver.exe");

	        // Create a new instance of the Firefox driver
	        WebDriver driver = new FirefoxDriver();

	try {        // Navigate to the jQuery UI Droppable page
	        driver.get("https://jqueryui.com/droppable/");
	        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

	        // Find the source element with the text "Drag me to my target"
	        WebElement sourceElement = driver.findElement(By.id("draggable"));

	        // Find the target element with the text "Drop here"
	        WebElement targetElement = driver.findElement(By.id("droppable"));

	        // Perform drag and drop action
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(sourceElement, targetElement).perform();
	        Thread.sleep(2000); // Sleep for 2 seconds

	        // Verify the drag and drop is successful by checking the color property of the target element's CSS
	        String backgroundColor = targetElement.getCssValue("background-color");
	        System.out.println("Background color after drop: " + backgroundColor);

	        // The background color should change to rgba(255, 250, 144, 1) (or equivalent) indicating the drop was successful
	        String expectedColor = "rgba(255, 250, 144, 1)";
	        if (backgroundColor.equals(expectedColor)) {
	            System.out.println("Drag and drop operation was successful.");
	        } else {
	            System.out.println("Drag and drop operation failed.");
	        }
	        
	        String targetText = targetElement.getText();
	        System.out.println("Text of target element after drop: " + targetText);

	        if (targetText.equals("Dropped!")) {
	            System.out.println("Text change verification successful.");
	        } else {
	            System.out.println("Text change verification failed.");
	        }

	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        driver.quit();
	    }
	}


